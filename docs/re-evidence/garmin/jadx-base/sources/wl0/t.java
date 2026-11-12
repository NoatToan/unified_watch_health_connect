package wl0;

import bs2.zw;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f185996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f185997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f185998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public zw f185999d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public zw f186001f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f186000e = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f186002g = new ArrayList();

    public final long a() {
        zw zwVar = this.f185999d;
        if (zwVar == null || zwVar.getTimestamp() == null) {
            return 0L;
        }
        return this.f185999d.getTimestamp().a().longValue();
    }
}
