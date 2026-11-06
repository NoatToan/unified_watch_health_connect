# Garmin GFDI 5023 Battery Status – Inferred Layout

**Evidence grade:** [I] Inferred (string evidence + class name, no byte-level decompile)  
**Source:** `strings` search on `classes7.dex` / `classes11.dex` in `base.apk`.

## Strings found in DEX

```
com.garmin.device.batterystatus.BatteryStatusHandler
com.garmin.android.deviceinterface.capabilities.impl.battery.BatteryStatusDataHandler
BatteryStatusDataHandler$onMessageReceived$1
BatteryStatusDataHandler$startTimer$batteryStatusTask$1$onBatteryStatus$1
BatteryStatusOptions(isCharging=
batteryPercentage=
batteryStatus=
batteryStatusTimeStamp=
```

The `toString()` / data-class output `BatteryStatusOptions(isCharging=…, batteryPercentage=…)` confirms the data model fields. The timestamp field (`batteryStatusTimeStamp`) suggests the message carries a FIT-epoch timestamp.

## Inferred layout

```
offset  size  field
  0       1   batteryPercent  u8  (0–100; 0xFF = unknown)
  1       1   batteryStatus   u8  (enum: 0=unknown, 1=new, 2=good, 3=ok, 4=low, 5=critical, 6=charging, 7=unknown2)
  2       4   timestamp       u32 LE (FIT epoch: seconds since 1989-12-31; 0 = no timestamp)
```

Confidence: **low** — field order and size not confirmed from decompile; the class `BatteryStatusDataHandler` could not be located in `base.apk` by REA (may be in a split APK or the class name has been fully obfuscated).

## Fallback strategy (current driver behaviour)

`GarminSession` falls back to the standard SIG Battery Service (0x180F) for battery level when 5023 is not understood. This is correct and safe: **keep the SIG fallback** as primary until 5023 is confirmed on a real watch.

## Status

NEEDS-REAL-WATCH — capture a Bluetooth HCI snoop log during a Garmin Connect session and filter for GFDI message 5023 (hex `0x139A` → little-endian `9A 13` at bytes 2–3 of the GFDI frame) to confirm the byte layout.
