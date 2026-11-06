# Kiến trúc BLE suy ra từ tên lớp còn đọc được trong `classes.dex`

Mọi dòng dưới đây là **tên lớp/gói tồn tại trực tiếp** trong `classes.dex` của `coros-4.11.8.apk`
(không decompile được method body — xem `00-methodology.md`). Trích bằng:
```bash
grep -oE "com/yf/lib/bluetooth/[A-Za-z0-9/_$]+" strings_classes.txt | sort -u | sed 's#/#.#g'
grep -oE "com/yf/coros/blecmd/[A-Za-z0-9/_$]+" strings_classes.txt | sort -u | sed 's#/#.#g'
```
Danh sách đầy đủ có hàng nghìn dòng (phần lớn là lớp Kotlin lambda `$1`, `$2`… và lớp bị rút gọn tên
`a`..`z2`, không mang thông tin); file này chỉ giữ các lớp có TÊN Ý NGHĨA.

## `com.yf.lib.bluetooth.connector` — quản lý kết nối GATT, khôi phục lỗi

```
YfBtConnectionError, YfBtConnectionState, YfBtConnector
connector.recovery.domain.model.{DeadlineKind, ExternalConnectionState, FailureClass, GattState,
  InternalGattFailureReason, ManualRebindReason, ProbeResult, RequestReason, SuspendReason}
```
→ có một state-machine "recovery" khá tinh vi để tự hồi phục kết nối GATT (phân loại lỗi, "manual
rebind", "suspend/resume", "probe" trước khi coi là mất kết nối) — phức tạp hơn các vendor khác đã
phân tích (Garmin/Zepp không có tầng recovery riêng tên rõ như vậy).

## `com.yf.lib.bluetooth.protocol` — khung giao thức, 3 thế hệ

```
protocol.version0.exception.ErrorParamException                      (gần như không còn dùng)
protocol.version1.exception.{DeviceTransactionException, ErrorParamException, GattException}
protocol.version2.{GattCallbackV2, GattCallbackV2$DeviceWriteScheduler, GattWriteCallbackAction,
  YfBtProtocolV2}
protocol.version2.exception.{ErrorParamException, NonMyCmdException, SendValueException}
protocol.version2.transaction.GattWriteRecoveryPolicy
protocol.version2.transaction.syncdata.{ForceOverrideState, HeaderSrc}
protocol.{YfBtDeviceContext, YfBtDeviceType, YfBtResource, DeviceFileCache}
protocol.cache.{BtCacheDatabase (Room), CacheType, PersistentCacheStorage}
```
→ `version2` là thế hệ hiện hành (áp đảo số lượng lớp). `NonMyCmdException`/`SendValueException` xác
nhận có kiểm tra "lệnh có đúng của tôi không" (khớp echo/correlation id) trước khi xử lý. `transaction.
syncdata.HeaderSrc`/`ForceOverrideState` xác nhận khái niệm "header nguồn" + "buộc ghi đè" khi đồng bộ —
khớp với giả thuyết đồng bộ có versioning/merge logic (giống Zepp "ACK xoá dữ liệu trên đồng hồ").

## `com.yf.lib.bluetooth.scanner` / `socket` — quét và framing mức cao

```
scanner.{BleAdvertisedData, ScannedDevice}
socket.{BLESocketCmd, BLESocketTransaction}
socket.client.BLEClientSocketProxy
```

## `com.yf.lib.bluetooth.request` — framework lệnh/tham số mức ứng dụng (rất lớn)

Một phần nhỏ, liên quan trực tiếp tới các loại dữ liệu mà `unified_health_app` cần đồng bộ:

```
request.{YfBtRequest, YfBtBaseRequest, YfBtSimpleRequest, YfBtCmd, YfBtTask, TransactionFactory,
  V2TransactionFactory, GenericMasterCommandRequest, HeartRateBroadcastRequest,
  YfBtGetCurrentTrainingRequest, YfBtGetFileRequest, YfBtSendFileRequest,
  OtaStorageSpaceCheckRequest, UsbStorageAuthorizationResponseRequest}

request.param.{YfBtParamAuth, YfBtParamTime, YfBtDeviceStorageFileHead, FileHeaderStruct, FileData,
  QueryDeviceFileParam, GetDeviceFileResult, RequestBatteryStatusInteractiveDataParam,
  YfBtParamStepKbValue, YfBtParamSetSportSum, YfBtParamTraining, YfBtSportTypeAdditionParam}

request.result.{OtaState, OtaType, WifiOtaReadyResult, YfBtResultOtaStatus, YfBtResultSportData,
  YfBtResultSportSum, YfBtResultTraining, YfBtResultCurrentTraining, YfBtResultSupportSportList}

request.type.{TimeVerify, TimeRange, TrainingStruct, YfBtSportType}
request.type.device.{YfBtAuth, YfBtAuthState, YfBtSystemBondAuth, YfBtFileHead, YfBtFitnessCfg,
  YfBtTimeHourMin, YfBtTimeRange, YfBtAlarmTime}
```

**Ghi chú quan trọng cho §5 (xác thực) của tài liệu protocol:** sự tồn tại riêng biệt của
`YfBtAuth` / `YfBtAuthState` / **`YfBtSystemBondAuth`** / `YfBtParamAuth` (4 lớp khác nhau, không phải
một lớp lặp tên) củng cố giả thuyết auth **gắn liền với OS bonding** (tên `YfBtSystemBondAuth` ghép rõ
"System Bond" + "Auth") — tức có khả năng cao là một bước xác nhận/đồng bộ trạng thái SAU khi OS bond
xong, chạy trên kênh `blecmd`, chứ không phải một handshake mã hoá độc lập kiểu Zepp ECDH. Vẫn [I]: tên
lớp không tiết lộ nó gửi/nhận byte gì.

`YfBtParamStepKbValue` (bước chân), `HeartRateBroadcastRequest` (phát/nhận HR), `YfBtResultSportData`/
`YfBtResultSportSum`/`YfBtResultTraining` (workout), `RequestBatteryStatusInteractiveDataParam` (pin),
`YfBtParamTime`/`TimeVerify` (đồng bộ giờ), `OtaState`/`OtaType`/`WifiOtaReadyResult` (OTA firmware, kể
cả qua WiFi không chỉ BLE) — xác nhận **framework có đủ loại lệnh cho mọi nhu cầu đồng bộ mà
`unified_health_app` cần** (bước, HR, pin, giờ, workout, OTA); KHÔNG tìm thấy lớp riêng tên rõ cho
"Sleep"/"SpO2"/"HRV" trong gói `com.yf.lib.bluetooth.request.*` — các chỉ số này nhiều khả năng đi qua
`GenericMasterCommandRequest` (lệnh chung, không có lớp `Param`/`Result` riêng từng loại) hoặc qua
protobuf `com.yf.coros.blecmd.BleCmdPayloadPb` (xem dưới), không lộ tên field cụ thể.

## `com.yf.coros.blecmd` — lệnh dạng Protobuf (framing thật, không đọc được)

```
BleCmdPb{MasterSend, MasterSendCmd, SlaveAck, SlaveAckCmd, SlaveNotify, SlaveNotifyCmd}
BleCmdDefPb$CMD_E                              (enum mã lệnh — KHÔNG đọc được giá trị số)
BleCmdPayloadPb{HrSample, HrmBroadcastSwitch}
BleSdkCommonPb{SdkErrorCode, ServerEnvironmentType}
```
`MasterSend` = điện thoại → đồng hồ ("Master"), `SlaveAck`/`SlaveNotify` = đồng hồ → điện thoại
("Slave") — quy ước đặt tên xác nhận mô hình Master(phone)/Slave(watch), khớp với
`PartnerBleBridgeRepo.sendMasterCommand`/`executeMasterCommand` ở tầng Partner SDK (§7 tài liệu
protocol) dùng đúng thuật ngữ "Master command".

## `com.yf.smart.weloopx.module.partnersdk` — API đối tác chính thức (AIDL)

```
com.coros.partner.ble.ICRSPartnerBleService          (AIDL interface, package KHÔNG rút gọn)
com.coros.partner.ble.ICRSPartnerBleCallback
com.yf.smart.weloopx.module.partnersdk.ui.service.CRSPartnerBleService   (Service export, manifest)
com.yf.smart.weloopx.module.partnersdk.ui.activity.CRSPartnerBleWakeActivity
com.yf.smart.weloopx.module.partnersdk.data.repo.PartnerBleBridgeRepo    (sendMasterCommand, executeMasterCommand)
com.yf.smart.weloopx.module.partnersdk.data.repo.PartnerAuthRepo
com.yf.smart.weloopx.module.partnersdk.data.model.{BizPublicKey, BizPublicKeys, BizCachePublicKeys,
  NetAuthRequest, NetAuthResponse, NetRevokeRequest}
com.yf.smart.weloopx.module.partnersdk.ui.vm.PartnerAuthViewModel
BizPartnerSdkGrantRecord(grantId=…), BizPartnerSdkAuthorizedDevice(deviceName=…)   (chuỗi toString() mẫu)
```

## Khác (ngoài phạm vi driver BLE hiện tại, chỉ ghi nhận)

```
com.yf.smart.weloopx.module.firmware.ui.runner.FirmwareUpgradeBleRunner   (OTA qua BLE; state machine
  riêng: preSync, startDownloadResource, startTransferFirmware, retrySendFirmware, markFailed…)
com.yf.smart.weloopx.module.livetrack.data.device.BleLiveTrackDeviceController  (gửi vị trí LiveTrack)
com.yf.smart.weloopx.module.sport.projection.data.ProjectionBleSource     (chiếu dữ liệu tập lên màn hình ngoài?)
```

## State machine "gửi dial/watchface qua BLE" (ví dụ cụ thể về mô hình chunked+ACK dùng chung)

Chuỗi hằng tên trạng thái (enum `toString()`/log, không phải tên lớp) tìm thấy liền kề nhau:
```
1. onStart
1.1 cmd = …
2. SEND_WATCH_PANEL_META
3. sendDialMeta meta = …
3. STATE_WAITING_RESPONSE =
3. STATE_WARTING_SEND_DATA =            ← lỗi chính tả gốc trong code ("WARTING"), giữ nguyên để đối chiếu bản build
4. STATE_AFTER_SENDING_FRAME_META …
4. STATE_SEND_DATA_RESPONSE =
4.1 STATE_AFTER_SENDING_FRAME_META code =
5. STATE_WAITING_SENDING_FRAME_DATA code =
5.1 TotalNumFrame =
6. STATE_AFTER_SENDING_ONE_FREME        ← lỗi chính tả gốc ("FREME" thay vì "FRAME")
7. STATE_SENDING_OVER
```
→ Đây là bằng chứng **gián tiếp nhưng cụ thể** về mô hình "chia khung + chờ phản hồi từng khung +
tổng số khung (`TotalNumFrame`)" dùng khi gửi dữ liệu lớn (ở đây là mặt đồng hồ tuỳ chỉnh) xuống đồng
hồ qua BLE. [I] Nhiều khả năng cùng một khuôn mẫu state machine được tái sử dụng cho truyền file lớn
khác (bản đồ, nhạc, firmware) vì kiến trúc `request.param.FileHeaderStruct`/`DeviceStorageFileData` có
cùng hình dạng (header + nhiều khung dữ liệu); **không có bằng chứng** nó cũng dùng cho luồng tải dữ
liệu NGƯỢC LẠI (đồng hồ → điện thoại, tức sync lịch sử) — hướng đó có thể khác.

## AES/mã hoá (xem thêm §5 tài liệu protocol — khả năng cao thuộc lớp bảo vệ ứng dụng, không phải giao thức BLE)

```
AES/GCM/NoPadding
AES128Decode, AES128Encode, AES128PaddingDecode, AESEncryptDecrypt
"aes error"
```
