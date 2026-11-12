package pa2;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.exportablereports.views.ReportsFetchActivity;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lpa2/b;", "", "<init>", "()V", "a", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f136781a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wa2.b f136782b = new wa2.b("ExportableReportsInitializer", null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static pa2.a f136783c;

    public static void a(Context context, pa2.a aVar) {
        context.getClass();
        wa2.b bVar = f136782b;
        bVar.getClass();
        wa2.b.f183801c.debug(e0.g("ExportableReports:Group=", bVar.f183803b, ":Class=", bVar.f183802a, ":Message=Initializing Exportable Reports...."));
        f136783c = aVar;
        ReportsFetchActivity.f49843f.getClass();
        ReportsFetchActivity.f49844g.getClass();
        context.startActivity(new Intent(context, (Class<?>) ReportsFetchActivity.class));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpa2/b$a;", "", "<init>", "()V", "Lwa2/b;", "logger", "Lwa2/b;", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static pa2.a a() {
            pa2.a aVar = b.f136783c;
            if (aVar != null) {
                return aVar;
            }
            s.m("options");
            throw null;
        }

        private a() {
        }
    }
}
