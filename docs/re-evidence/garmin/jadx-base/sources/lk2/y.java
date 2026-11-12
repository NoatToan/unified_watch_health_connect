package lk2;

import com.garmin.proto.generated.GDIDataTypes;
import com.garmin.proto.generated.GDIFileAccess;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import lc.u0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes11.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f113311a = LoggerFactory.getLogger("FT#Protos");

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f113312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f113313b;

        static {
            int[] iArr = new int[GDIFileAccess.DataType.SpecialCase.values().length];
            try {
                iArr[GDIFileAccess.DataType.SpecialCase.COUNTER_BYTE_TEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f113312a = iArr;
            int[] iArr2 = new int[GDIFileAccess.DataType.Format.values().length];
            try {
                iArr2[GDIFileAccess.DataType.Format.GDXML_DATA_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[GDIFileAccess.DataType.Format.GDXML_FULL_FILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[GDIFileAccess.DataType.Format.SOFTWARE_UPDATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[GDIFileAccess.DataType.Format.SPECIAL_CASE.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[GDIFileAccess.DataType.Format.DATA_XFER.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[GDIFileAccess.DataType.Format.GDXML_UPDATE_FILE.ordinal()] = 6;
            } catch (NoSuchFieldError unused7) {
            }
            f113313b = iArr2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0107  */
    /* JADX WARN: Code duplicated, block: B:56:0x011d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0128 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x012a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0140  */
    /* JADX WARN: Code duplicated, block: B:64:0x014b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0153  */
    /* JADX WARN: Code duplicated, block: B:68:0x015e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0167  */
    /* JADX WARN: Code duplicated, block: B:73:0x0169  */
    /* JADX WARN: Code duplicated, block: B:79:0x017b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0185  */
    /* JADX WARN: Code duplicated, block: B:83:0x018c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:54:0x0107, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:59:0x012a, please report this as an issue */
    public static final lk2.a a(GDIFileAccess.ItemReference itemReference, Map<Integer, String> map, List<UUID> list) {
        String gdxmlString;
        LinkedHashSet linkedHashSet;
        Integer numValueOf;
        int i14;
        int i15;
        UUID uuid;
        int i16;
        map.getClass();
        boolean zHasUid = itemReference.hasUid();
        Logger logger = f113311a;
        if (!zHasUid || !itemReference.hasDataType() || !itemReference.hasDataSize()) {
            logger.warn("Item is missing fields: " + itemReference);
            return null;
        }
        GDIDataTypes.UUID uid = itemReference.getUid();
        uid.getClass();
        UUID uuidC = c(uid);
        if (uuidC == null) {
            logger.warn("Failed to convert item uid to UUID: " + itemReference.getUid());
            return null;
        }
        GDIFileAccess.DataType dataType = itemReference.getDataType();
        dataType.getClass();
        if (dataType.hasFormat()) {
            GDIFileAccess.DataType.Format format = dataType.getFormat();
            switch (format == null ? -1 : a.f113313b[format.ordinal()]) {
                case -1:
                    logger.warn("format is null");
                    break;
                case 0:
                default:
                    u0.r();
                    return null;
                case 1:
                    if (!dataType.hasGdxmlString()) {
                        if (!dataType.hasGdxmlStringKey()) {
                            logger.error("Item declared GDXML format without gdxml string value");
                        } else {
                            gdxmlString = map.get(Integer.valueOf(dataType.getGdxmlStringKey()));
                            if (gdxmlString == null) {
                                logger.warn("Missing gdxml string value for key [" + dataType.getGdxmlStringKey() + "]");
                            }
                        }
                        break;
                    } else {
                        if (dataType.hasGdxmlStringKey()) {
                            map.put(Integer.valueOf(dataType.getGdxmlStringKey()), dataType.getGdxmlString());
                        }
                        gdxmlString = dataType.getGdxmlString();
                    }
                    if (gdxmlString == null) {
                        logger.warn("Failed to create data type: " + itemReference.getDataType());
                        return null;
                    }
                    linkedHashSet = new LinkedHashSet();
                    if (itemReference.hasRequestedFlags()) {
                        if (list == null) {
                            logger.warn("Missing flags lookup table: " + itemReference.getRequestedFlags());
                            return null;
                        }
                        i14 = 0;
                        for (Object obj : list) {
                            i15 = i14 + 1;
                            if (i14 < 0) {
                                p13.x.q();
                                throw null;
                            }
                            uuid = (UUID) obj;
                            i16 = 1 << i14;
                            if ((itemReference.getRequestedFlags() & i16) == i16) {
                                linkedHashSet.add(uuid);
                            }
                            i14 = i15;
                        }
                    } else if (list != null && !list.isEmpty()) {
                        logger.warn("Expected flags, but device did not provide any");
                        return null;
                    }
                    if (itemReference.hasTransactionId()) {
                        numValueOf = Integer.valueOf(itemReference.getTransactionId());
                    } else {
                        numValueOf = null;
                    }
                    return new lk2.a(uuidC, gdxmlString, itemReference.getDataSize(), linkedHashSet, numValueOf, itemReference.hasUrgency() ? itemReference.getUrgency() : null);
                case 2:
                    gdxmlString = "GDXml";
                    if (gdxmlString == null) {
                        logger.warn("Failed to create data type: " + itemReference.getDataType());
                        return null;
                    }
                    linkedHashSet = new LinkedHashSet();
                    if (itemReference.hasRequestedFlags()) {
                        if (list == null) {
                            logger.warn("Missing flags lookup table: " + itemReference.getRequestedFlags());
                            return null;
                        }
                        i14 = 0;
                        while (r13.hasNext()) {
                            i15 = i14 + 1;
                            if (i14 < 0) {
                                p13.x.q();
                                throw null;
                            }
                            uuid = (UUID) obj;
                            i16 = 1 << i14;
                            if ((itemReference.getRequestedFlags() & i16) == i16) {
                                linkedHashSet.add(uuid);
                            }
                            i14 = i15;
                        }
                    } else if (list != null) {
                        logger.warn("Expected flags, but device did not provide any");
                        return null;
                    }
                    if (itemReference.hasTransactionId()) {
                        numValueOf = Integer.valueOf(itemReference.getTransactionId());
                    } else {
                        numValueOf = null;
                    }
                    return new lk2.a(uuidC, gdxmlString, itemReference.getDataSize(), linkedHashSet, numValueOf, itemReference.hasUrgency() ? itemReference.getUrgency() : null);
                case 3:
                    logger.warn("Reading file with software update path is not supported");
                    break;
                case 4:
                    if (dataType.hasSpecialCase()) {
                        GDIFileAccess.DataType.SpecialCase specialCase = dataType.getSpecialCase();
                        int i17 = specialCase == null ? -1 : a.f113312a[specialCase.ordinal()];
                        if (i17 != -1) {
                            if (i17 != 1) {
                                u0.r();
                                return null;
                            }
                            gdxmlString = "CounterByteTest";
                        }
                        if (gdxmlString == null) {
                            logger.warn("Failed to create data type: " + itemReference.getDataType());
                            return null;
                        }
                        linkedHashSet = new LinkedHashSet();
                        if (itemReference.hasRequestedFlags()) {
                            if (list == null) {
                                logger.warn("Missing flags lookup table: " + itemReference.getRequestedFlags());
                                return null;
                            }
                            i14 = 0;
                            while (r13.hasNext()) {
                                i15 = i14 + 1;
                                if (i14 < 0) {
                                    p13.x.q();
                                    throw null;
                                }
                                uuid = (UUID) obj;
                                i16 = 1 << i14;
                                if ((itemReference.getRequestedFlags() & i16) == i16) {
                                    linkedHashSet.add(uuid);
                                }
                                i14 = i15;
                            }
                        } else if (list != null) {
                            logger.warn("Expected flags, but device did not provide any");
                            return null;
                        }
                        if (itemReference.hasTransactionId()) {
                            numValueOf = Integer.valueOf(itemReference.getTransactionId());
                        } else {
                            numValueOf = null;
                        }
                        return new lk2.a(uuidC, gdxmlString, itemReference.getDataSize(), linkedHashSet, numValueOf, itemReference.hasUrgency() ? itemReference.getUrgency() : null);
                    }
                    logger.error("Item declared special case type without detail");
                    break;
                    break;
                case 5:
                    gdxmlString = "AD_HOC_XFER";
                    if (gdxmlString == null) {
                        logger.warn("Failed to create data type: " + itemReference.getDataType());
                        return null;
                    }
                    linkedHashSet = new LinkedHashSet();
                    if (itemReference.hasRequestedFlags()) {
                        if (list == null) {
                            logger.warn("Missing flags lookup table: " + itemReference.getRequestedFlags());
                            return null;
                        }
                        i14 = 0;
                        while (r13.hasNext()) {
                            i15 = i14 + 1;
                            if (i14 < 0) {
                                p13.x.q();
                                throw null;
                            }
                            uuid = (UUID) obj;
                            i16 = 1 << i14;
                            if ((itemReference.getRequestedFlags() & i16) == i16) {
                                linkedHashSet.add(uuid);
                            }
                            i14 = i15;
                        }
                    } else if (list != null) {
                        logger.warn("Expected flags, but device did not provide any");
                        return null;
                    }
                    if (itemReference.hasTransactionId()) {
                        numValueOf = Integer.valueOf(itemReference.getTransactionId());
                    } else {
                        numValueOf = null;
                    }
                    return new lk2.a(uuidC, gdxmlString, itemReference.getDataSize(), linkedHashSet, numValueOf, itemReference.hasUrgency() ? itemReference.getUrgency() : null);
                case 6:
                    logger.warn("Reading file with GDXML update file is not supported");
                    break;
            }
        } else {
            logger.error("Item data type is missing format");
        }
        gdxmlString = null;
        if (gdxmlString == null) {
            logger.warn("Failed to create data type: " + itemReference.getDataType());
            return null;
        }
        linkedHashSet = new LinkedHashSet();
        if (itemReference.hasRequestedFlags()) {
            if (list == null) {
                logger.warn("Missing flags lookup table: " + itemReference.getRequestedFlags());
                return null;
            }
            i14 = 0;
            while (r13.hasNext()) {
                i15 = i14 + 1;
                if (i14 < 0) {
                    p13.x.q();
                    throw null;
                }
                uuid = (UUID) obj;
                i16 = 1 << i14;
                if ((itemReference.getRequestedFlags() & i16) == i16) {
                    linkedHashSet.add(uuid);
                }
                i14 = i15;
            }
        } else if (list != null) {
            logger.warn("Expected flags, but device did not provide any");
            return null;
        }
        if (itemReference.hasTransactionId()) {
            numValueOf = Integer.valueOf(itemReference.getTransactionId());
        } else {
            numValueOf = null;
        }
        return new lk2.a(uuidC, gdxmlString, itemReference.getDataSize(), linkedHashSet, numValueOf, itemReference.hasUrgency() ? itemReference.getUrgency() : null);
    }

    public static final GDIDataTypes.UUID.Builder b(UUID uuid) {
        uuid.getClass();
        GDIDataTypes.UUID.Builder mostSignificant = GDIDataTypes.UUID.newBuilder().setLeastSignificant(uuid.getLeastSignificantBits()).setMostSignificant(uuid.getMostSignificantBits());
        mostSignificant.getClass();
        return mostSignificant;
    }

    public static final UUID c(GDIDataTypes.UUID uuid) {
        uuid.getClass();
        if (uuid.hasLeastSignificant() && uuid.hasMostSignificant()) {
            return new UUID(uuid.getMostSignificant(), uuid.getLeastSignificant());
        }
        return null;
    }
}
