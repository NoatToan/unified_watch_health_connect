package cj2;

import android.content.Context;
import android.content.Intent;
import com.garmin.customermanagementlib.ui.CustomerManagementLibMainActivity;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcj2/c;", "", "<init>", "()V", "a", "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f27758a = new a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcj2/c$a;", "", "<init>", "()V", "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static void a(a aVar, Context context, String str, String str2, String str3, int i14) {
            if ((i14 & 4) != 0) {
                str2 = null;
            }
            if ((i14 & 8) != 0) {
                str3 = null;
            }
            aVar.getClass();
            context.getClass();
            CustomerManagementLibMainActivity.f50711h.getClass();
            Intent intent = new Intent(((ij2.a) KoinJavaComponent.get$default(ij2.a.class, null, null, 6, null)).b(), (Class<?>) CustomerManagementLibMainActivity.class);
            intent.putExtra("EXTRA_ROUTE", str);
            intent.putExtra("EXTRA_ADDRESS_ID", str2);
            intent.putExtra("EXTRA_APP_BAR_TITLE", str3);
            intent.putExtra("EXTRA_IS_IN_RETRY_FLOW", false);
            intent.setFlags(268435456);
            context.startActivity(intent);
        }

        private a() {
        }
    }
}
