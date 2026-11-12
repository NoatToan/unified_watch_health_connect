package ot;

import android.content.Context;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.annual_report.chapter.AnnualReportChapter", f = "AnnualReportChapter.kt", l = {72}, m = "saveSharedImage", v = 2)
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f133620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f133621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f133622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f133623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f133624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f133625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f133626g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l lVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f133625f = lVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f133624e = obj;
        this.f133626g |= Integer.MIN_VALUE;
        return this.f133625f.o(null, null, this);
    }
}
