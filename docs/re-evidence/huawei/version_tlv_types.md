# RE Evidence – 0x0107 GetDeviceVersion TLV type IDs

Source: `defpackage/ckq.java` (GetDeviceVersionCommand), Huawei Health v17.0.7.310.
Method `ckq.a(byte[], DeviceInfo)` calls `cku.e(bArr)` to parse TLV container then dispatches
each child TLV by type to one of three sub-dispatchers: `d(int,str,DeviceInfo)`, `b(int,str,DeviceInfo)`,
or `c(int,str,DeviceInfo)`. Evidence class: `ckq`, source lines cited by block reference from
`rea inspect-android-method` output.

## Sub-dispatcher `ckq.d` – types handled [V]

```
switch(type) { case 1 → d(1,...); case 3 → d(3,...); case 7 → d(7,...);
 case 25 → d(25,...); case 36 → d(36,...); case 37 → d(37,...);
 case 38 → d(38,...); case 39 → d(39,...); case 40 → d(40,...); case 41 → d(41,...) }
```

Semantic meanings from DeviceInfo field names (all [I]):
- 1  → firmwareVersion (main firmware string)
- 3  → productModel / deviceType
- 7  → healthFirmwareVersion
- 25 → bleVersion / secondaryFirmware
- 36-41 → extended device metadata (watchFaceInfo, appMarket, SKU, etc.)

## Sub-dispatcher `ckq.b` – types handled [V]

```
switch(type) { case 2 → b(2,...); case 10 → b(10,...); case 14 → b(14,...);
 case 17 → b(17,...); case 18 → b(18,...); case 22 → b(22,...); case 26 → b(26,...) }
```

Semantic meanings [I]:
- 2  → hardwareVersion
- 10 → sdkVersion / healthSdkVersion
- 14 → systemVersion
- 17 → bootloaderVersion
- 18 → modemVersion / patchVersion
- 22 → capabilityBitmap (crucial for feature negotiation)
- 26 → configVersion / productionDate

## Sub-dispatcher `ckq.c` – types handled [V]

```
switch(type) { case 9 → c(9,...); case 12 → c(12,...); case 15 → c(15,...);
 case 20 → c(20,...); case 21 → c(21,...); case 27 → c(27,...);
 case 29 → c(29,...); case 30 → c(30,...); case 31 → c(31,...);
 case 32 → c(32,...); case 33 → c(33,...); case 34 → c(34,...); case 35 → c(35,...) }
```

Semantic meanings [I]:
- 9  → serialNumber
- 12 → batteryLevel (int, 0-100)
- 15 → deviceAlias / deviceName
- 20 → productModel (string)
- 21 → deviceTypeName
- 27 → screenResolution / displayInfo
- 29 → countryCode
- 30 → language
- 31 → region
- 32-35 → factoryInfo (factorySN, productionBatch, factoryCode, testModeFlag)

## Request payload (what phone sends, `ckq.getDeviceCommand`) [V]

Sends a list of requested type IDs in the frame body:
```
{0x01, 0x07, type1, 0x00, type2, 0x00, ...}
```
Each type ID is a 2-byte little-endian uint16; the app requests a subset of the 29 types above.

## Response frame parsing [V]

`cku.e(bArr)` extracts the outer TLV container from the response payload (after 0x5A frame
stripping + CRC16 check), then iterates child TLVs calling the appropriate `d/b/c` dispatcher.
TLV encoding: varint base-128 big-endian for tag + length.
