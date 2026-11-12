package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.xiaomi.onetrack.OneTrack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes5.dex */
public final class eks {
    public static final pbt g = new pbt("ExtractorSessionStoreView");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tbs f16750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihs f16751b;
    public final Map c = new HashMap();
    public final ReentrantLock d = new ReentrantLock();
    public final i7s e;
    public final i7s f;

    public eks(tbs tbsVar, i7s i7sVar, ihs ihsVar, i7s i7sVar2) {
        this.f16750a = tbsVar;
        this.e = i7sVar;
        this.f16751b = ihsVar;
        this.f = i7sVar2;
    }

    public static String q(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            throw new ugs("Session without pack received.");
        }
        return stringArrayList.get(0);
    }

    public static List r(List list) {
        return list == null ? Collections.emptyList() : list;
    }

    public final /* synthetic */ Boolean a(Bundle bundle) {
        int i = bundle.getInt(OneTrack.Param.SESSION_ID);
        if (i == 0) {
            return Boolean.TRUE;
        }
        Map map = this.c;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            return Boolean.TRUE;
        }
        sjs sjsVar = (sjs) this.c.get(numValueOf);
        if (sjsVar.c.d == 6) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!rbs.c(sjsVar.c.d, bundle.getInt(o9s.a("status", q(bundle)))));
    }

    public final /* synthetic */ Boolean b(Bundle bundle) {
        int i = bundle.getInt(OneTrack.Param.SESSION_ID);
        if (i == 0) {
            return Boolean.FALSE;
        }
        Map map = this.c;
        Integer numValueOf = Integer.valueOf(i);
        boolean z = true;
        if (map.containsKey(numValueOf)) {
            sjs sjsVarO = o(i);
            int i2 = bundle.getInt(o9s.a("status", sjsVarO.c.f31580a));
            qjs qjsVar = sjsVarO.c;
            int i3 = qjsVar.d;
            if (rbs.c(i3, i2)) {
                g.a("Found stale update for session %s with status %d.", numValueOf, Integer.valueOf(i3));
                qjs qjsVar2 = sjsVarO.c;
                int i4 = qjsVar2.d;
                String str = qjsVar2.f31580a;
                if (i4 == 4) {
                    ((vgt) this.e.a()).b(i, str);
                } else if (i4 == 5) {
                    ((vgt) this.e.a()).a(i);
                } else if (i4 == 6) {
                    ((vgt) this.e.a()).e(Arrays.asList(str));
                }
            } else {
                qjsVar.d = i2;
                if (rbs.d(i2)) {
                    l(i);
                    this.f16751b.c(sjsVarO.c.f31580a);
                } else {
                    for (vjs vjsVar : qjsVar.f) {
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList(o9s.b("chunk_intents", sjsVarO.c.f31580a, vjsVar.f36964a));
                        if (parcelableArrayList != null) {
                            for (int i5 = 0; i5 < parcelableArrayList.size(); i5++) {
                                if (parcelableArrayList.get(i5) != null && ((Intent) parcelableArrayList.get(i5)).getData() != null) {
                                    ((ois) vjsVar.d.get(i5)).f29210a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String strQ = q(bundle);
            long j = bundle.getLong(o9s.a("pack_version", strQ));
            String string = bundle.getString(o9s.a("pack_version_tag", strQ), "");
            int i6 = bundle.getInt(o9s.a("status", strQ));
            long j2 = bundle.getLong(o9s.a("total_bytes_to_download", strQ));
            ArrayList<String> stringArrayList = bundle.getStringArrayList(o9s.a("slice_ids", strQ));
            ArrayList arrayList = new ArrayList();
            for (String str2 : r(stringArrayList)) {
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(o9s.b("chunk_intents", strQ, str2));
                ArrayList arrayList2 = new ArrayList();
                Iterator it = r(parcelableArrayList2).iterator();
                while (it.hasNext()) {
                    if (((Intent) it.next()) == null) {
                        z = false;
                    }
                    arrayList2.add(new ois(z));
                    z = true;
                }
                String string2 = bundle.getString(o9s.b("uncompressed_hash_sha256", strQ, str2));
                long j3 = bundle.getLong(o9s.b("uncompressed_size", strQ, str2));
                int i7 = bundle.getInt(o9s.b("patch_format", strQ, str2), 0);
                arrayList.add(i7 != 0 ? new vjs(str2, string2, j3, arrayList2, 0, i7) : new vjs(str2, string2, j3, arrayList2, bundle.getInt(o9s.b("compression_format", strQ, str2), 0), 0));
                z = true;
            }
            this.c.put(Integer.valueOf(i), new sjs(i, bundle.getInt("app_version_code"), new qjs(strQ, j, i6, j2, arrayList, string)));
        }
        return Boolean.TRUE;
    }

    public final /* synthetic */ Object c(String str, int i, long j) {
        sjs sjsVar = (sjs) s(Arrays.asList(str)).get(str);
        if (sjsVar == null || rbs.d(sjsVar.c.d)) {
            g.b(String.format("Could not find pack %s while trying to complete it", str), new Object[0]);
        }
        this.f16750a.d(str, i, j);
        sjsVar.c.d = 4;
        return null;
    }

    public final /* synthetic */ Object d(int i, int i2) {
        o(i).c.d = 5;
        return null;
    }

    public final /* synthetic */ Object e(int i) {
        sjs sjsVarO = o(i);
        qjs qjsVar = sjsVarO.c;
        if (!rbs.d(qjsVar.d)) {
            throw new ugs(String.format("Could not safely delete session %d because it is not in a terminal state.", Integer.valueOf(i)), i);
        }
        this.f16750a.d(qjsVar.f31580a, sjsVarO.f33719b, qjsVar.f31581b);
        qjs qjsVar2 = sjsVarO.c;
        int i2 = qjsVar2.d;
        if (i2 != 5 && i2 != 6) {
            return null;
        }
        this.f16750a.e(qjsVar2.f31580a, sjsVarO.f33719b, qjsVar2.f31581b);
        return null;
    }

    public final Map f() {
        return this.c;
    }

    public final /* synthetic */ Map g(List list) {
        HashMap map = new HashMap();
        for (sjs sjsVar : this.c.values()) {
            String str = sjsVar.c.f31580a;
            if (list.contains(str)) {
                sjs sjsVar2 = (sjs) map.get(str);
                if ((sjsVar2 == null ? -1 : sjsVar2.f33718a) < sjsVar.f33718a) {
                    map.put(str, sjsVar);
                }
            }
        }
        return map;
    }

    public final void h() {
        this.d.lock();
    }

    public final void i(final String str, final int i, final long j) {
        p(new bks() { // from class: ais
            @Override // defpackage.bks
            public final Object a() {
                this.f1078a.c(str, i, j);
                return null;
            }
        });
    }

    public final void j() {
        this.d.unlock();
    }

    public final void k(final int i, int i2) {
        final int i3 = 5;
        p(new bks(i, i3) { // from class: cis

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f5390b;

            @Override // defpackage.bks
            public final Object a() {
                this.f5389a.d(this.f5390b, 5);
                return null;
            }
        });
    }

    public final void l(final int i) {
        p(new bks() { // from class: whs
            @Override // defpackage.bks
            public final Object a() {
                this.f37991a.e(i);
                return null;
            }
        });
    }

    public final boolean m(final Bundle bundle) {
        return ((Boolean) p(new bks() { // from class: nis
            @Override // defpackage.bks
            public final Object a() {
                return this.f27970a.a(bundle);
            }
        })).booleanValue();
    }

    public final boolean n(final Bundle bundle) {
        return ((Boolean) p(new bks() { // from class: his
            @Override // defpackage.bks
            public final Object a() {
                return this.f20116a.b(bundle);
            }
        })).booleanValue();
    }

    public final sjs o(int i) {
        Map map = this.c;
        Integer numValueOf = Integer.valueOf(i);
        sjs sjsVar = (sjs) map.get(numValueOf);
        if (sjsVar != null) {
            return sjsVar;
        }
        throw new ugs(String.format("Could not find session %d while trying to get it", numValueOf), i);
    }

    public final Object p(bks bksVar) {
        try {
            this.d.lock();
            return bksVar.a();
        } finally {
            this.d.unlock();
        }
    }

    public final Map s(final List list) {
        return (Map) p(new bks() { // from class: fis
            @Override // defpackage.bks
            public final Object a() {
                return this.f17826a.g(list);
            }
        });
    }
}
