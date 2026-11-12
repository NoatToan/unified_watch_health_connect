package rs2;

import java.io.Serializable;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.m0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.gfdi.GfdiDevice$Companion", f = "GfdiDevice.kt", l = {346, 370, 372}, m = "configure")
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f154404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dt2.g f154405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u f154406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Serializable f154407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Logger f154408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f154409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m0 f154410g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f154411h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i.a f154412i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f154413j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i.a aVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f154412i = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f154411h = obj;
        this.f154413j |= Integer.MIN_VALUE;
        return this.f154412i.a(null, null, null, null, null, null, null, this);
    }
}
