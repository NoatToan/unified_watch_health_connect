package com.huami.nfc.base;

import com.google.common.net.HttpHeaders;
import com.huami.sleep.daysleep.daydetail.ui.SleepDetailFragment;
import com.xiaomi.hm.health.bt.model.HMDeviceState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt___StringsKt;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¨\u0006\u0002"}, d2 = {"", "statusWordsToMessage", "nfc-base_release"}, k = 2, mv = {1, 5, 1})
public final class ApduStatusWordsKt {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public static final String statusWordsToMessage(@NotNull String str) {
        if (str.length() != 4) {
            return "APDU Status Words are invalid";
        }
        String strSlice = StringsKt___StringsKt.slice(str, new IntRange(0, 1));
        String strSlice2 = StringsKt___StringsKt.slice(str, new IntRange(2, 3));
        int iHashCode = strSlice.hashCode();
        if (iHashCode != 1727) {
            if (iHashCode != 1819) {
                if (iHashCode != 1823) {
                    if (iHashCode != 1837) {
                        switch (iHashCode) {
                            case 1723:
                                if (strSlice.equals("61")) {
                                    return Intrinsics.stringPlus(strSlice2, " indicates the number of response bytes still available");
                                }
                                break;
                            case 1724:
                                if (strSlice.equals("62")) {
                                    int iHashCode2 = strSlice2.hashCode();
                                    if (iHashCode2 == 1536) {
                                        return !strSlice2.equals("00") ? "unknown status word2" : "No information given";
                                    }
                                    switch (iHashCode2) {
                                        case 1785:
                                            return !strSlice2.equals("81") ? "unknown status word2" : "Returned data may be corrupted";
                                        case 1786:
                                            return !strSlice2.equals("82") ? "unknown status word2" : "The end of the file has been reached before the end of reading";
                                        case 1787:
                                            return !strSlice2.equals("83") ? "unknown status word2" : "Invalid DF";
                                        case 1788:
                                            return !strSlice2.equals("84") ? "unknown status word2" : "Selected file is not valid. File descriptor error";
                                        default:
                                            return "unknown status word2";
                                    }
                                }
                                break;
                            case 1725:
                                if (strSlice.equals("63")) {
                                    if (Intrinsics.areEqual(strSlice2, "00")) {
                                        return "Authentication failed. Invalid secret code or forbidden value";
                                    }
                                    if (Intrinsics.areEqual(strSlice2, "81")) {
                                        return "File filled up by the last write";
                                    }
                                    return m.startsWith$default(strSlice2, "C", false, 2, null) ? "Counter provided (valued from C0 to CF) (exact meaning depending on the command)" : "unknown status word2";
                                }
                                break;
                            default:
                                switch (iHashCode) {
                                    case 1729:
                                        if (strSlice.equals("67")) {
                                            return Intrinsics.areEqual(strSlice2, "00") ? "Incorrect length or address range error" : "Error, incorrect parameter P3 (ISO code)";
                                        }
                                        break;
                                    case 1730:
                                        if (strSlice.equals("68")) {
                                            int iHashCode3 = strSlice2.hashCode();
                                            if (iHashCode3 == 1536) {
                                                return !strSlice2.equals("00") ? "unknown status word2" : "The request function is not supported by the card.";
                                            }
                                            if (iHashCode3 != 1785) {
                                                return (iHashCode3 == 1786 && strSlice2.equals("82")) ? "Secure messaging not supported" : "unknown status word2";
                                            }
                                            return !strSlice2.equals("81") ? "unknown status word2" : "Logical channel not supported";
                                        }
                                        break;
                                    case 1731:
                                        if (strSlice.equals("69")) {
                                            int iHashCode4 = strSlice2.hashCode();
                                            if (iHashCode4 == 1536) {
                                                return !strSlice2.equals("00") ? "unknown status word2" : "Bytes P1 and/or P2 are incorrect.";
                                            }
                                            switch (iHashCode4) {
                                                case 1785:
                                                    return !strSlice2.equals("81") ? "unknown status word2" : "Cannot select indicated file, command not compatible with file organization";
                                                case 1786:
                                                    return !strSlice2.equals("82") ? "unknown status word2" : "Access conditions not fulfilled";
                                                case 1787:
                                                    return !strSlice2.equals("83") ? "unknown status word2" : "Secret code locked";
                                                case 1788:
                                                    return !strSlice2.equals("84") ? "unknown status word2" : "Referenced data invalidated";
                                                case 1789:
                                                    return !strSlice2.equals("85") ? "unknown status word2" : "No currently selected EF, no command to monitor / no Transaction Manager File";
                                                case 1790:
                                                    return !strSlice2.equals("86") ? "unknown status word2" : "Command not allowed (no current EF)";
                                                case 1791:
                                                    return !strSlice2.equals("87") ? "unknown status word2" : "Expected SM data objects missing";
                                                case HMDeviceState.DEVICE_STATE_SELFTEST /* 1792 */:
                                                    return !strSlice2.equals("88") ? "unknown status word2" : "SM data objects incorrect";
                                                default:
                                                    return "unknown status word2";
                                            }
                                        }
                                        break;
                                    default:
                                        switch (iHashCode) {
                                            case 1739:
                                                if (strSlice.equals("6A")) {
                                                    int iHashCode5 = strSlice2.hashCode();
                                                    if (iHashCode5 == 1536) {
                                                        return !strSlice2.equals("00") ? "unknown status word2" : "No successful transaction executed during session";
                                                    }
                                                    switch (iHashCode5) {
                                                        case 1784:
                                                            return !strSlice2.equals("80") ? "unknown status word2" : "The parameters in the data field are incorrect";
                                                        case 1785:
                                                            return !strSlice2.equals("81") ? "unknown status word2" : "Card is blocked or command not supported";
                                                        case 1786:
                                                            return !strSlice2.equals("82") ? "unknown status word2" : "File not found";
                                                        case 1787:
                                                            return !strSlice2.equals("83") ? "unknown status word2" : "Record not found";
                                                        case 1788:
                                                            return !strSlice2.equals("84") ? "unknown status word2" : "There is insufficient memory space in record or file";
                                                        case 1789:
                                                            return !strSlice2.equals("85") ? "unknown status word2" : "Lc inconsistent with TLV structure";
                                                        case 1790:
                                                            return !strSlice2.equals("86") ? "unknown status word2" : "Incorrect parameters P1-P2";
                                                        case 1791:
                                                            return !strSlice2.equals("87") ? "unknown status word2" : "The P3 value is not consistent with the P1 and P2 values.";
                                                        case HMDeviceState.DEVICE_STATE_SELFTEST /* 1792 */:
                                                            return !strSlice2.equals("88") ? "unknown status word2" : "Referenced data not found.";
                                                        default:
                                                            return "unknown status word2";
                                                    }
                                                }
                                                break;
                                            case SleepDetailFragment.END_VALID_LABEL_TIME /* 1740 */:
                                                if (strSlice.equals("6B")) {
                                                    return Intrinsics.areEqual(strSlice2, "00") ? "Incorrect reference; illegal address; Invalid P1 or P2 parameter" : "unknown status word2";
                                                }
                                                break;
                                            case 1741:
                                                if (strSlice.equals("6C")) {
                                                    return "Incorrect P3 length.";
                                                }
                                                break;
                                            case 1742:
                                                if (strSlice.equals("6D")) {
                                                    return "Command not allowed. Invalid instruction byte (INS)";
                                                }
                                                break;
                                            case 1743:
                                                if (strSlice.equals("6E")) {
                                                    return "Incorrect application (CLA parameter of a command)";
                                                }
                                                break;
                                            case 1744:
                                                if (strSlice.equals("6F")) {
                                                    return "Checking error";
                                                }
                                                break;
                                            default:
                                                switch (iHashCode) {
                                                    case 1815:
                                                        if (strSlice.equals("90")) {
                                                            return Intrinsics.areEqual(strSlice2, "00") ? "Command executed without error" : "unknown status word2";
                                                        }
                                                        break;
                                                    case 1816:
                                                        if (strSlice.equals("91")) {
                                                            if (Intrinsics.areEqual(strSlice2, "00")) {
                                                                return "Purse Balance error cannot perform transaction";
                                                            }
                                                            return Intrinsics.areEqual(strSlice2, "02") ? "Purse Balance error" : "unknown status word2";
                                                        }
                                                        break;
                                                    case 1817:
                                                        if (strSlice.equals("92")) {
                                                            if (Intrinsics.areEqual(strSlice2, "02")) {
                                                                return "Write problem / Memory failure";
                                                            }
                                                            return Intrinsics.areEqual(strSlice2, "40") ? "Error, memory problem" : "Memory error";
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                    } else if (strSlice.equals("9F")) {
                        return "Success, sw2 bytes of data available to be read via \"Get_Response\" task.";
                    }
                } else if (strSlice.equals("98")) {
                    int iHashCode6 = strSlice2.hashCode();
                    if (iHashCode6 != 1536) {
                        if (iHashCode6 != 1540) {
                            if (iHashCode6 != 1542) {
                                if (iHashCode6 != 1598) {
                                    if (iHashCode6 == 1633 && strSlice2.equals("34")) {
                                        return "Error, Update SSD order sequence not respected (should be used if  SSD Update commands are received out of sequence).";
                                    }
                                } else if (strSlice2.equals("20")) {
                                    return "No temporary transaction key established";
                                }
                            } else if (strSlice2.equals("06")) {
                                return "Access authorization in Debit not fulfilled for the replacement debit step";
                            }
                        } else if (strSlice2.equals("04")) {
                            return "Access authorization not fulfilled";
                        }
                    } else if (strSlice2.equals("00")) {
                        return HttpHeaders.WARNING;
                    }
                    return "Security error";
                }
            } else if (strSlice.equals("94")) {
                int iHashCode7 = strSlice2.hashCode();
                if (iHashCode7 != 1540) {
                    if (iHashCode7 != 1542) {
                        if (iHashCode7 == 1544 && strSlice2.equals("08")) {
                            return "Key file selection error";
                        }
                    } else if (strSlice2.equals("06")) {
                        return "Invalid purse detected during the replacement debit step";
                    }
                } else if (strSlice2.equals("04")) {
                    return "Purse selection error or invalid purse";
                }
                return "File error";
            }
        } else if (strSlice.equals("65")) {
            if (Intrinsics.areEqual(strSlice2, "01")) {
                return "Memory failure. There have been problems in writing or reading the EEPROM. Other hardware problems may also bring this error.";
            }
            return Intrinsics.areEqual(strSlice2, "81") ? "Write problem / Memory failure / Unknown mode" : "unknown status word2";
        }
        return "unknown code";
    }
}
