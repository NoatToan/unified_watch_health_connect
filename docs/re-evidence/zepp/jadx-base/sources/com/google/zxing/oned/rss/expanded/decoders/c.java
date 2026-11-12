package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/* JADX INFO: loaded from: classes4.dex */
final class c extends h {
    private static final int d = 8;
    private static final int e = 2;

    public c(BitArray bitArray) {
        super(bitArray);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder
    public String parseInformation() throws NotFoundException, FormatException {
        if (getInformation().getSize() < 48) {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder sb = new StringBuilder();
        b(sb, 8);
        int iF = getGeneralDecoder().f(48, 2);
        sb.append("(392");
        sb.append(iF);
        sb.append(')');
        sb.append(getGeneralDecoder().c(50, null).b());
        return sb.toString();
    }
}
