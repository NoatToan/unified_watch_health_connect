package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/* JADX INFO: loaded from: classes4.dex */
final class e extends i {
    private static final int f = 8;
    private static final int g = 20;
    private static final int h = 16;
    private final String d;
    private final String e;

    public e(BitArray bitArray, String str, String str2) {
        super(bitArray);
        this.d = str2;
        this.e = str;
    }

    private void g(StringBuilder sb, int i) {
        int iF = getGeneralDecoder().f(i, 16);
        if (iF == 38400) {
            return;
        }
        sb.append('(');
        sb.append(this.d);
        sb.append(')');
        int i2 = iF % 32;
        int i3 = iF / 32;
        int i4 = (i3 % 12) + 1;
        int i5 = i3 / 12;
        if (i5 / 10 == 0) {
            sb.append('0');
        }
        sb.append(i5);
        if (i4 / 10 == 0) {
            sb.append('0');
        }
        sb.append(i4);
        if (i2 / 10 == 0) {
            sb.append('0');
        }
        sb.append(i2);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.i
    public void d(StringBuilder sb, int i) {
        sb.append('(');
        sb.append(this.e);
        sb.append(i / 100000);
        sb.append(')');
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.i
    public int e(int i) {
        return i % 100000;
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder
    public String parseInformation() throws NotFoundException {
        if (getInformation().getSize() != 84) {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder sb = new StringBuilder();
        b(sb, 8);
        f(sb, 48, 20);
        g(sb, 68);
        return sb.toString();
    }
}
