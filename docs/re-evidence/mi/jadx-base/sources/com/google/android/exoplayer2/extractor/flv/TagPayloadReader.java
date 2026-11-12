package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import defpackage.okh;
import defpackage.snp;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TagPayloadReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final snp f7913a;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str);
        }
    }

    public TagPayloadReader(snp snpVar) {
        this.f7913a = snpVar;
    }

    public final boolean a(okh okhVar, long j) throws ParserException {
        return b(okhVar) && c(okhVar, j);
    }

    public abstract boolean b(okh okhVar) throws ParserException;

    public abstract boolean c(okh okhVar, long j) throws ParserException;
}
