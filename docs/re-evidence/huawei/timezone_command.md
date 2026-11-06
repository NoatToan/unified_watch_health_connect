# RE Evidence – 0x0132 SetDeviceTimeZoneId

Source: `defpackage/ckw.java` (SetDeviceTimeZoneIdCommand, tag 0132),
Huawei Health v17.0.7.310. Evidence from `rea inspect-android-method` output.

## Request layout (`ckw.b(DeviceInfo)`) [V]

```
Frame body (passed to 0x5A framer):
  TLV type=0x01, len=50, value = cku.c() output (50 bytes)
  TLV type=0x03, len=N,  value = IANA timezone ID as UTF-8 string
                                 (e.g. "Asia/Ho_Chi_Minh", "Europe/London")
```

The TLV type=0x01 field: `cku.c()` with no arguments (overload index 3 of the `c` method in
`defpackage/cku.java`). The 50-byte payload is a device-specific time-related structure built by
`cku`; the exact internal layout of those 50 bytes was not decompiled in this RE pass. [I]
Likely contains packed: UTC epoch seconds (4 B), timezone offset minutes (2 B), and additional
regional preference fields to match the companion app's time sync format.

The TLV type=0x03 field: UTF-8 bytes of the IANA/Olson timezone ID. This is confirmed by the
`ckw.b` method reading `deviceInfo.getTimeZoneId()` (or equivalent) and writing it directly
as the value bytes. [V]

## Note on relation to 0x0105 SetDateAndTime

`ckz` (0x0105) sends time + zone offset (§5.3), while `ckw` (0x0132) sends a full IANA timezone
string. The watch receives both: 0x0105 for exact UTC epoch + raw offset, 0x0132 for DST-aware
region string. 0x0132 is step 6 in the handshake chain, following 0x0105 at step 5. [V §5.1]

## Reproduce in driver

```kotlin
// HuaweiSession.kt – after 0x0105 is acknowledged
val tzId = TimeZone.getDefault().id              // e.g. "Asia/Ho_Chi_Minh"
val tzBytes = tzId.toByteArray(Charsets.UTF_8)
val body = byteArrayOf(
    0x01, 50.toByte(), *cku_c_placeholder_50_bytes,  // TODO: cku.c() 50-byte layout
    0x03, tzBytes.size.toByte(), *tzBytes
)
sendCommand(serviceId = 0x01, commandId = 0x32, payload = body)
```

Until the 50-byte structure is clarified via HCI log, the driver cannot implement 0x0132 safely.
Mark as NEEDS-REAL-DEVICE.
