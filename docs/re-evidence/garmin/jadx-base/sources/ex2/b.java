package ex2;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.m0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "com.garmin.realtimesettings.networkwrapper.networking.ImageHelper", f = "ImageHelper.kt", l = {108, 111, 114, 124, 127, 132, 143}, m = "downloadImagesZipFile", v = 1)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f66933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f66934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f66935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f66936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m0 f66937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Iterator f66938f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f66939g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Iterator f66940h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f66941i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f66942j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f66943k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f66944l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f66945m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f66946n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i iVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f66945m = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f66944l = obj;
        this.f66946n |= Integer.MIN_VALUE;
        return this.f66945m.a(null, null, null, null, this);
    }
}
