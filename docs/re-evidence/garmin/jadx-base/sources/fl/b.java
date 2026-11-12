package fl;

import android.content.Context;
import androidx.work.d;
import com.garmin.analytics.omt.eventValidators.OmtEventValidator;
import com.garmin.net.omtanalytics.impl.upload.Uploader;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import d53.w;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.x0;
import p13.j0;
import ue.c0;
import ue.i0;
import ue.k;
import ue.v;
import yt2.c;
import yt2.e;
import zk.f;
import zk.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000bB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lfl/b;", "Lzk/f;", "Lyt2/a;", "delegate", "Lyt2/c;", "config", "", "", "validEventTypes", "<init>", "(Lyt2/a;Lyt2/c;Ljava/util/List;)V", "a", "analytics-omt_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f71952c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Gson f71953d = new GsonBuilder().enableComplexMapKeySerialization().create();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<g> f71955b;

    public b(yt2.a aVar, c cVar, List<String> list) {
        aVar.getClass();
        Context context = aVar.f199650a;
        cVar.getClass();
        list.getClass();
        this.f71954a = "OMT";
        if (yt2.f.f199671c != null) {
            LoggerFactory.getLogger("OMT#OmtAnalytics").warn("already initialized");
        } else {
            yt2.f.f199670b = aVar;
            yt2.f.f199672d = cVar;
            yt2.f.f199671c = new au2.a(cVar, aVar);
            Uploader.f52481e.getClass();
            boolean z14 = cVar.f199658b;
            i0.f170088a.getClass();
            i0.a.a(context).e("omt_uploader");
            androidx.work.c.a aVar2 = new androidx.work.c.a();
            yt2.g gVarD = aVar.d();
            String str = gVarD.f199675a;
            String str2 = gVarD.f199677c;
            String str3 = gVarD.f199676b;
            if (w.J(str)) {
                Uploader.b.a().error("schedule: missing client name");
            } else {
                LinkedHashMap linkedHashMap = aVar2.f11467a;
                linkedHashMap.put("key_client_name", str);
                if (w.J(str3)) {
                    Uploader.b.a().error("schedule: missing client version");
                } else {
                    linkedHashMap.put("key_client_version", str3);
                    if (w.J(str2)) {
                        Uploader.b.a().error("schedule: missing client GUID");
                    } else {
                        linkedHashMap.put("key_client_guid", str2);
                        linkedHashMap.put("key_base_url", aVar.b().f2788a);
                        androidx.work.c cVarA = aVar2.a();
                        long j8 = cVar.f199659c;
                        ue.f.a aVar3 = new ue.f.a();
                        aVar3.b(z14 ? v.UNMETERED : v.CONNECTED);
                        ue.f fVarA = aVar3.a();
                        androidx.work.c.a aVar4 = new androidx.work.c.a();
                        aVar4.c(cVarA.f11466a);
                        Integer numValueOf = Integer.valueOf(cVar.f199662f);
                        LinkedHashMap linkedHashMap2 = aVar4.f11467a;
                        linkedHashMap2.put("key_max_events_per_batch", numValueOf);
                        linkedHashMap2.put("key_call_timeout_millis", Long.valueOf(cVar.f199663g));
                        androidx.work.c cVarA2 = aVar4.a();
                        c0.a aVar5 = new c0.a((Class<? extends d>) Uploader.class, j8, TimeUnit.MILLISECONDS);
                        aVar5.f170098c.f26950j = fVarA;
                        i0.a.a(context).f("omt_uploader", k.CANCEL_AND_REENQUEUE, aVar5.f(cVarA2).a());
                        long j14 = j8 / 3600000;
                        long j15 = 60;
                        long j16 = (j8 / 60000) % j15;
                        long j17 = (j8 / 1000) % j15;
                        x0 x0Var = x0.f105818a;
                        String str4 = String.format("%02dhrs:%02dmins:%02dsecs", Arrays.copyOf(new Object[]{Long.valueOf(j14), Long.valueOf(j16), Long.valueOf(j17)}, 3));
                        Logger loggerA = Uploader.b.a();
                        String strE = cVarA.e("key_base_url");
                        String strE2 = cVarA.e("key_client_name");
                        String strE3 = cVarA.e("key_client_version");
                        StringBuilder sbI = p6.b.i("scheduled to run every ", str4, " to ", strE, " with max upload size 1 MB over WiFi only [");
                        fb1.c.w("], clientName [", strE2, "], clientVersion [", sbI, z14);
                        sbI.append(strE3);
                        sbI.append("]");
                        loggerA.debug(sbI.toString());
                    }
                }
            }
        }
        this.f71955b = p13.w.c(new OmtEventValidator(list));
    }

    @Override // zk.f
    public final List<g> a() {
        return this.f71955b;
    }

    @Override // zk.f
    public final void b(zk.a aVar) {
        aVar.getClass();
        yt2.f fVar = yt2.f.f199669a;
        e eVar = new e(aVar);
        boolean z14 = aVar.f205031c;
        fVar.getClass();
        yt2.f.a(eVar, z14);
    }

    @Override // zk.f
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF3713c() {
        return this.f71954a;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lfl/b$a;", "", "<init>", "()V", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "gson", "Lcom/google/gson/Gson;", "analytics-omt_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public b(yt2.a aVar, c cVar, List list, int i14, j jVar) {
        this(aVar, (i14 & 2) != 0 ? new c(false, false, 0L, 0, 0L, 0, 0L, 127, null) : cVar, (i14 & 4) != 0 ? j0.f134944a : list);
    }
}
