package okio.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.hms.network.embedded.g4;
import defpackage.yzc;
import defpackage.yzk;
import defpackage.zcp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import okio.Buffer;
import okio.ByteString;
import okio.C0453SegmentedByteString;
import okio.Segment;

/* JADX INFO: renamed from: okio.internal.-SegmentedByteString, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a-\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0080\b\u001a\u0017\u0010\u000e\u001a\u00020\u000f*\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0080\b\u001a\r\u0010\u0012\u001a\u00020\u0001*\u00020\bH\u0080\b\u001a\r\u0010\u0013\u001a\u00020\u0001*\u00020\bH\u0080\b\u001a\u0015\u0010\u0014\u001a\u00020\u0015*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0001H\u0080\b\u001a-\u0010\u0017\u001a\u00020\u000f*\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0080\b\u001a-\u0010\u0017\u001a\u00020\u000f*\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0080\b\u001a\u001d\u0010\u001a\u001a\u00020\u0019*\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0001H\u0080\b\u001a\r\u0010\u001d\u001a\u00020\u000b*\u00020\bH\u0080\b\u001a%\u0010\u001e\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0080\b\u001a]\u0010!\u001a\u00020\u0007*\u00020\b2K\u0010\"\u001aG\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00070#H\u0080\bø\u0001\u0000\u001aj\u0010!\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00012K\u0010\"\u001aG\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00070#H\u0082\b\u001a\u0014\u0010'\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0001H\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006("}, d2 = {"binarySearch", "", "", "value", "fromIndex", "toIndex", "commonCopyInto", "", "Lokio/SegmentedByteString;", TypedValues.CycleType.S_WAVE_OFFSET, "target", "", "targetOffset", "byteCount", "commonEquals", "", "other", "", "commonGetSize", "commonHashCode", "commonInternalGet", "", "pos", "commonRangeEquals", "otherOffset", "Lokio/ByteString;", "commonSubstring", "beginIndex", "endIndex", "commonToByteArray", "commonWrite", "buffer", "Lokio/Buffer;", "forEachSegment", "action", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "data", "segment", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SegmentedByteString {
    public static final int binarySearch(int[] iArr, int i, int i2, int i3) {
        zcp.c(iArr, "");
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i) {
                i2 = i5 + 1;
            } else {
                if (i6 <= i) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return (-i2) - 1;
    }

    public static final int segment(C0453SegmentedByteString c0453SegmentedByteString, int i) {
        zcp.c(c0453SegmentedByteString, "");
        int iBinarySearch = binarySearch(c0453SegmentedByteString.getDirectory(), i + 1, 0, c0453SegmentedByteString.getSegments().length);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    public static final void forEachSegment(C0453SegmentedByteString c0453SegmentedByteString, Function3<? super byte[], ? super Integer, ? super Integer, yzc> function3) {
        zcp.c(c0453SegmentedByteString, "");
        zcp.c(function3, "");
        int length = c0453SegmentedByteString.getSegments().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = c0453SegmentedByteString.getDirectory()[length + i];
            int i4 = c0453SegmentedByteString.getDirectory()[i];
            function3.invoke(c0453SegmentedByteString.getSegments()[i], Integer.valueOf(i3), Integer.valueOf(i4 - i2));
            i++;
            i2 = i4;
        }
    }

    private static final void forEachSegment(C0453SegmentedByteString c0453SegmentedByteString, int i, int i2, Function3<? super byte[], ? super Integer, ? super Integer, yzc> function3) {
        int iSegment = segment(c0453SegmentedByteString, i);
        while (i < i2) {
            int i3 = iSegment == 0 ? 0 : c0453SegmentedByteString.getDirectory()[iSegment - 1];
            int i4 = c0453SegmentedByteString.getDirectory()[iSegment];
            int i5 = c0453SegmentedByteString.getDirectory()[c0453SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i2, (i4 - i3) + i3) - i;
            function3.invoke(c0453SegmentedByteString.getSegments()[iSegment], Integer.valueOf(i5 + (i - i3)), Integer.valueOf(iMin));
            i += iMin;
            iSegment++;
        }
    }

    public static final ByteString commonSubstring(C0453SegmentedByteString c0453SegmentedByteString, int i, int i2) {
        zcp.c(c0453SegmentedByteString, "");
        C0453SegmentedByteString c0453SegmentedByteString2 = c0453SegmentedByteString;
        int iResolveDefaultParameter = okio.SegmentedByteString.resolveDefaultParameter(c0453SegmentedByteString2, i2);
        if (i < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i + " < 0").toString());
        }
        if (iResolveDefaultParameter > c0453SegmentedByteString.size()) {
            throw new IllegalArgumentException(("endIndex=" + iResolveDefaultParameter + " > length(" + c0453SegmentedByteString.size() + g4.l).toString());
        }
        int i3 = iResolveDefaultParameter - i;
        if (i3 < 0) {
            throw new IllegalArgumentException(("endIndex=" + iResolveDefaultParameter + " < beginIndex=" + i).toString());
        }
        if (i == 0 && iResolveDefaultParameter == c0453SegmentedByteString.size()) {
            return c0453SegmentedByteString2;
        }
        if (i == iResolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int iSegment = segment(c0453SegmentedByteString, i);
        int iSegment2 = segment(c0453SegmentedByteString, iResolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) yzk.d(c0453SegmentedByteString.getSegments(), iSegment, iSegment2 + 1);
        byte[][] bArr2 = bArr;
        int[] iArr = new int[bArr2.length * 2];
        if (iSegment <= iSegment2) {
            int i4 = iSegment;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(c0453SegmentedByteString.getDirectory()[i4] - i, i3);
                iArr[bArr2.length + i5] = c0453SegmentedByteString.getDirectory()[c0453SegmentedByteString.getSegments().length + i4];
                if (i4 == iSegment2) {
                    break;
                }
                i4++;
                i5++;
            }
        }
        int i6 = iSegment != 0 ? c0453SegmentedByteString.getDirectory()[iSegment - 1] : 0;
        int length = bArr2.length;
        iArr[length] = iArr[length] + (i - i6);
        return new C0453SegmentedByteString(bArr, iArr);
    }

    public static final byte commonInternalGet(C0453SegmentedByteString c0453SegmentedByteString, int i) {
        zcp.c(c0453SegmentedByteString, "");
        okio.SegmentedByteString.checkOffsetAndCount(c0453SegmentedByteString.getDirectory()[c0453SegmentedByteString.getSegments().length - 1], i, 1L);
        int iSegment = segment(c0453SegmentedByteString, i);
        return c0453SegmentedByteString.getSegments()[iSegment][(i - (iSegment == 0 ? 0 : c0453SegmentedByteString.getDirectory()[iSegment - 1])) + c0453SegmentedByteString.getDirectory()[c0453SegmentedByteString.getSegments().length + iSegment]];
    }

    public static final int commonGetSize(C0453SegmentedByteString c0453SegmentedByteString) {
        zcp.c(c0453SegmentedByteString, "");
        return c0453SegmentedByteString.getDirectory()[c0453SegmentedByteString.getSegments().length - 1];
    }

    public static final byte[] commonToByteArray(C0453SegmentedByteString c0453SegmentedByteString) {
        zcp.c(c0453SegmentedByteString, "");
        byte[] bArr = new byte[c0453SegmentedByteString.size()];
        int length = c0453SegmentedByteString.getSegments().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = c0453SegmentedByteString.getDirectory()[length + i];
            int i5 = c0453SegmentedByteString.getDirectory()[i];
            int i6 = i5 - i2;
            yzk.e(c0453SegmentedByteString.getSegments()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public static final boolean commonRangeEquals(C0453SegmentedByteString c0453SegmentedByteString, int i, ByteString byteString, int i2, int i3) {
        zcp.c(c0453SegmentedByteString, "");
        zcp.c(byteString, "");
        if (i < 0 || i > c0453SegmentedByteString.size() - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iSegment = segment(c0453SegmentedByteString, i);
        while (i < i4) {
            int i5 = iSegment == 0 ? 0 : c0453SegmentedByteString.getDirectory()[iSegment - 1];
            int i6 = c0453SegmentedByteString.getDirectory()[iSegment];
            int i7 = c0453SegmentedByteString.getDirectory()[c0453SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i4, (i6 - i5) + i5) - i;
            if (!byteString.rangeEquals(i2, c0453SegmentedByteString.getSegments()[iSegment], i7 + (i - i5), iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iSegment++;
        }
        return true;
    }

    public static final boolean commonRangeEquals(C0453SegmentedByteString c0453SegmentedByteString, int i, byte[] bArr, int i2, int i3) {
        zcp.c(c0453SegmentedByteString, "");
        zcp.c(bArr, "");
        if (i < 0 || i > c0453SegmentedByteString.size() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iSegment = segment(c0453SegmentedByteString, i);
        while (i < i4) {
            int i5 = iSegment == 0 ? 0 : c0453SegmentedByteString.getDirectory()[iSegment - 1];
            int i6 = c0453SegmentedByteString.getDirectory()[iSegment];
            int i7 = c0453SegmentedByteString.getDirectory()[c0453SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i4, (i6 - i5) + i5) - i;
            if (!okio.SegmentedByteString.arrayRangeEquals(c0453SegmentedByteString.getSegments()[iSegment], i7 + (i - i5), bArr, i2, iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iSegment++;
        }
        return true;
    }

    public static final void commonCopyInto(C0453SegmentedByteString c0453SegmentedByteString, int i, byte[] bArr, int i2, int i3) {
        zcp.c(c0453SegmentedByteString, "");
        zcp.c(bArr, "");
        long j = i3;
        okio.SegmentedByteString.checkOffsetAndCount(c0453SegmentedByteString.size(), i, j);
        okio.SegmentedByteString.checkOffsetAndCount(bArr.length, i2, j);
        int i4 = i3 + i;
        int iSegment = segment(c0453SegmentedByteString, i);
        while (i < i4) {
            int i5 = iSegment == 0 ? 0 : c0453SegmentedByteString.getDirectory()[iSegment - 1];
            int i6 = c0453SegmentedByteString.getDirectory()[iSegment];
            int i7 = c0453SegmentedByteString.getDirectory()[c0453SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i4, (i6 - i5) + i5) - i;
            int i8 = i7 + (i - i5);
            yzk.e(c0453SegmentedByteString.getSegments()[iSegment], bArr, i2, i8, i8 + iMin);
            i2 += iMin;
            i += iMin;
            iSegment++;
        }
    }

    public static final boolean commonEquals(C0453SegmentedByteString c0453SegmentedByteString, Object obj) {
        zcp.c(c0453SegmentedByteString, "");
        if (obj == c0453SegmentedByteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == c0453SegmentedByteString.size() && c0453SegmentedByteString.rangeEquals(0, byteString, 0, c0453SegmentedByteString.size())) {
                return true;
            }
        }
        return false;
    }

    public static final int commonHashCode(C0453SegmentedByteString c0453SegmentedByteString) {
        zcp.c(c0453SegmentedByteString, "");
        int hashCode$okio = c0453SegmentedByteString.getHashCode();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = c0453SegmentedByteString.getSegments().length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int i4 = c0453SegmentedByteString.getDirectory()[length + i];
            int i5 = c0453SegmentedByteString.getDirectory()[i];
            byte[] bArr = c0453SegmentedByteString.getSegments()[i];
            for (int i6 = i4; i6 < (i5 - i3) + i4; i6++) {
                i2 = (i2 * 31) + bArr[i6];
            }
            i++;
            i3 = i5;
        }
        c0453SegmentedByteString.setHashCode$okio(i2);
        return i2;
    }

    public static final void commonWrite(C0453SegmentedByteString c0453SegmentedByteString, Buffer buffer, int i, int i2) {
        zcp.c(c0453SegmentedByteString, "");
        zcp.c(buffer, "");
        int i3 = i + i2;
        int iSegment = segment(c0453SegmentedByteString, i);
        while (i < i3) {
            int i4 = iSegment == 0 ? 0 : c0453SegmentedByteString.getDirectory()[iSegment - 1];
            int i5 = c0453SegmentedByteString.getDirectory()[iSegment];
            int i6 = c0453SegmentedByteString.getDirectory()[c0453SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i3, (i5 - i4) + i4) - i;
            int i7 = i6 + (i - i4);
            Segment segment = new Segment(c0453SegmentedByteString.getSegments()[iSegment], i7, i7 + iMin, true, false);
            if (buffer.head == null) {
                segment.prev = segment;
                segment.next = segment.prev;
                buffer.head = segment.next;
            } else {
                Segment segment2 = buffer.head;
                zcp.e(segment2);
                Segment segment3 = segment2.prev;
                zcp.e(segment3);
                segment3.push(segment);
            }
            i += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + ((long) i2));
    }
}
