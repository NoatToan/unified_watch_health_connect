# RE Evidence – Watch-initiated command routing

Source: `defpackage/coa.java` (DataParserInitial5A), `defpackage/mqj.java`,
Huawei Health v17.0.7.310. Evidence from `rea inspect-android-method` and jadx dump.

## Dispatcher method [V]

```java
// coa.java – called when a notify arrives for a serviceId/commandId that has no pending request
coa.d(DeviceInfo deviceInfo, String tag, cml linkParam,
      List<cmi> pendingCommands, MessageReceiveCallback callback)
```

`tag` = 4-hex string = serviceId(2) + commandId(2), matching what `getTag()` returns
in every command class. `cmi` = command interface. `MessageReceiveCallback` = callback to signal
the calling layer that an unsolicited message was received and handled. [V]

The watch sends unsolicited frames for:
- real-time HR/SpO2 alerts (service 7, cmd varies by firmware)
- file transfer requests (service 44 CommonFile watch→phone)
- notification confirmations (service 2)
- exercise start/stop events (service 23)
- battery low alerts (service 1, cmd 0x08 or 0x09) [I from service 1 usage strings]

## Driver gap (HuaweiTransport.kt:174)

Current `onPayload()` matches responses to pending requests via tag lookup; unmatched frames are
only logged. The fix requires:

```kotlin
// HuaweiTransport.kt – in onPayload(), after failing to match a pending request:
val serviceId = (tag ushr 16) and 0xFF
val commandId = tag and 0xFF
unsolicitedDispatcher?.onWatchInitiated(serviceId, commandId, payload)
```

Where `unsolicitedDispatcher` is a `WatchInitiatedHandler` interface registered by `HuaweiSession`
to handle HR alerts, file transfer requests, and battery events. This avoids coupling the
transport layer to business logic. [I – design, not RE-confirmed]

## `mqj.java` – FitnessDataContainer [V]

Found in jadx output at `defpackage/mqj.java`. Holds one "sample data batch" response:
- `f108761d` (int) = frame count / record count
- `f108760b` (List<DataTotalMotion>) = fitness records
- `f108762e` (HeartRateDetect) = heart rate data

`DataTotalMotion` fields (`com/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion.java`):
`motion_type`, `step`, `calorie`, `distance`, `height`, `sleep_time`, `pushes`.

The TLV type IDs used to populate these fields from service 7 response frames are NOT visible
in jadx output (the response-side parser class `lxp` or similar was not decompiled in this pass).
This is the remaining NEEDS-REAL-WATCH gap.
