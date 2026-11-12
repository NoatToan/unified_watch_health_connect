package rk2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import o13.l;
import org.json.JSONArray;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.core.agent.omt.OmtFirmwareDownloadAgent", f = "OmtFirmwareDownloadAgent.kt", l = {218, 229, 241}, m = "listFiles$suspendImpl")
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f153370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rs2.c f153371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f153372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public JSONArray f153373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f153374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l f153375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l f153376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Iterator f153377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public jy2.a f153378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public HashMap f153379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f153380k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f153381l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f153382m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f153383n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f153382m = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f153381l = obj;
        this.f153383n |= Integer.MIN_VALUE;
        return c.a(this.f153382m, null, this);
    }
}
