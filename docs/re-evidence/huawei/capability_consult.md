# RE Evidence – 0x0102 ServiceCapabilityConsult + 0x0103 CommandCapabilityConsult

Source: `defpackage/ckn.java` (ServiceCapabilityConsultCommand, tag 0102) and
`defpackage/cki.java` (CommandCapabilityConsultCommand, tag 0103),
Huawei Health v17.0.7.310. Evidence from `rea inspect-android-method` output.

---

## 0x0102 – ServiceCapabilityConsult

### Request layout (`ckn.b(DeviceInfo)`) [V]

```
Outer TLV frame body (passed to 0x5A framer as payload):
  TLV type=0x01, len=N, value = serviceIdList:
    byte[0]  = count - 1   (number of service IDs minus one)
    byte[1]  = serviceId_1
    byte[2]  = serviceId_2
    ...
    byte[N-1]= serviceId_N

  Optional TLV type=0x03, len=1, value = deviceType byte
```

Service ID list comes from `cor.e()` which returns `List<Integer>` of all service IDs the phone
claims to support (e.g. 1,2,3,7,8,9,10,22,23,24,27,28,29,32,35,37,39,40,44,50...).
The optional type=0x03 field sends the phone's device type identifier. [V]

### Response layout (`ckn.d(DeviceInfo, byte[], List<Integer>)`) [V]

```
Response payload (after 0x5A unframe):
  Outer TLV container parsed by cku.e(bArr)
    child[0]: hex bitmap string (ASCII hex, big-endian)
              each byte at position i (i = serviceId - 1) encodes a bitmask:
              if byte[i] & 0x01 == 1  → service i+1 is supported by the watch
```

`ckn.e(hexStr, allServicesList, supportedServicesList)` iterates:
```java
for (int i = 0; i < allServicesList.size(); i++) {
    byte b = ckn.c(hexStr, i); // extracts hexStr[i*2 .. i*2+1] as byte
    if ((b & 0x01) == 1) supportedServicesList.add(allServicesList.get(i));
}
```

After response, `ckn.processReceivedData` creates `new cki(supportedServicesList)` as the
next command in the handshake chain, passing supported service IDs to 0x0103. [V]

---

## 0x0103 – CommandCapabilityConsult

### Request layout (`cki.a(DeviceInfo)`) [V]

```
Outer TLV frame body:
  Header: {0x01, 0x03, cph.f(129), cku.b(totalSize)}
  Per supported service:
    TLV type=0x02, len=1,  value=serviceId
    TLV type=0x03, len=N,  value = {cmdCount, cmdId_1, cmdId_2, ..., cmdId_N}
```

`cph.f(129)` = varint encoding of 0x81 (a "nested TLV container" tag).
`cku.b(size)` = varint length of the nested content.

Command ID lists per service come from `cor.d(flag)` which returns
`Map<Integer, List<Integer>>` mapping serviceId → list of command IDs.

### Response handling (`cki.processReceivedData`) [V]

Three sequential calls:
1. `d(bArrD, deviceCapability)` – parse response TLV, populate DeviceCapability map
   with which commands each service supports on the device side.
2. `b(map, deviceCapability)` – merge/intersect phone-supported vs device-supported commands.
3. `a(deviceCapability, cmhVar)` – store final capability into session context (cmh),
   mark handshake step complete, trigger next command.

The response TLV structure mirrors the request: nested per-service capability bitmaps.
Exact byte layout of the response body has not been traced to byte level [I].
