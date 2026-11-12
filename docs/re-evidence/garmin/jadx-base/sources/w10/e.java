package w10;

import androidx.room.b0;
import com.google.gson.Gson;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lw10/e;", "Lw10/d;", "Landroidx/room/b0;", "__db", "<init>", "(Landroidx/room/b0;)V", "b", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f181186d = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f181187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f181188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.a f181189c;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"w10/e$a", "Landroidx/room/g;", "Lw10/c;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends androidx.room.g<c> {
        public a() {
        }

        @Override // androidx.room.g
        public final void a(ud.c cVar, c cVar2) {
            c cVar3 = cVar2;
            cVar.getClass();
            cVar3.getClass();
            cVar.q3(1, cVar3.getUrl());
            c.a aVar = e.this.f181189c;
            Map<String, String> mapF = cVar3.f();
            aVar.getClass();
            mapF.getClass();
            String json = new Gson().toJson(mapF);
            json.getClass();
            cVar.q3(2, json);
            String appName = cVar3.getAppName();
            if (appName == null) {
                cVar.u(3);
            } else {
                cVar.q3(3, appName);
            }
            cVar.h(4, cVar3.getDateReceived());
        }

        @Override // androidx.room.g
        public final String b() {
            return "INSERT OR REPLACE INTO `open_web_page_requests` (`url`,`params`,`appName`,`dateReceived`) VALUES (?,?,?,?)";
        }
    }

    public e(b0 b0Var) {
        b0Var.getClass();
        this.f181189c = new c.a();
        this.f181187a = b0Var;
        this.f181188b = new a();
    }

    @Override // w10.d
    public final void a(long j8) {
        gl1.d.O(this.f181187a, false, true, new j82.d(j8, 23));
    }

    @Override // w10.d
    public final void b(c cVar) {
        gl1.d.O(this.f181187a, false, true, new w02.b(3, this, cVar));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw10/e$b;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }
}
