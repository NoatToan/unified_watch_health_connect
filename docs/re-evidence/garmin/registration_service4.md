# Garmin Multi-Link Registration Service (service 4) – Info Pages Flow

**Evidence grade:** [V] Verified  
**Source:** `rea inspect-android-method base.apk ... eh2.f initialize` → `normalized_result.source.text`  
Decompiled class is `eh2.f` (original: `MultiLinkServiceAgentImpl`).

## Flow

```
1. CLOSE_ALL  (ML cmd 0x05, clientId, 0x0000)
       ↓
2. REGISTER service 4 (REGISTRATION), flags=0
       ↓  receives handle H4
3. For each infoPage in [o.g, o.a, o.d, o.e, o.c, o.f(NFC)]:
     write [H4][pageType] on the ML write characteristic
     receive response listing which ML services device supports
       ↓
4. REGISTER service 1 (GFDI), flags=reliableFlag
   (if o.g was requested and no GFDI services found → fail "No supported services.")
```

The page type constants map to `ml2/o.java`:
- `o.g` = GFDI service list (service 1 entries)  
- `o.a` = general service list  
- `o.d`, `o.e`, `o.c` = other capability pages  
- `o.f(q.NFC)` = NFC availability

## Decompiled evidence (key fragment)

```java
// eh2/f.java (MultiLinkServiceAgentImpl)
// ML_version comes from the REGISTER response to service 4
if (ML_version >= 1) {
    // Use REGISTRATION service (handle H4) for all info queries
    cVar = new h0(link, notifyChar, writeChar, version, infoPageList);
} else {
    // Legacy: use a fixed characteristic (6A4E2803) for queries
    cVar = new c(link, infoPageList);
}

// After all info pages received:
ArrayList<ServiceEntry> gfdiServices = ...;
if (arrayList.contains(o.g) && gfdiServices.isEmpty()) {
    return Futures.immediateFailedFuture(
        new MultiLinkException("No supported services."));
}
// Then REGISTER service 1 (GFDI)
```

## Driver implication

`MultiLink.openGfdi()` currently skips service 4 and directly registers service 1.  
**Risk:** Firmware may require the info-page query before it will accept a GFDI REGISTER (the official app always does it). If the REGISTER response status is 4 (REJECTED) or times out on a real watch, adding the service-4 info-page sequence is the fix.  
**Status:** NEEDS-REAL-WATCH — the driver skips this deliberately to reduce complexity; a real Garmin watch test will confirm whether firmware enforces it.
