package by1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import java.util.ArrayList;
import o72.r1;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class p implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f22203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f22204c;

    public /* synthetic */ p(Context context, p1 p1Var, int i14) {
        this.f22202a = i14;
        this.f22203b = context;
        this.f22204c = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f22202a;
        Context context = this.f22203b;
        p1 p1Var = this.f22204c;
        switch (i14) {
            case 0:
                r rVar = r.f22207a;
                HelpActivity.a aVar = HelpActivity.f36653a;
                ro0.l lVar = ro0.l.STP_BENCHMARK_EXERCISES;
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("EXTRA_BENCHMARKS", new ArrayList<>(((dy1.c) p1Var.getF182175a()).f61537c));
                Unit unit = Unit.INSTANCE;
                HelpActivity.a.e(aVar, this.f22203b, lVar, null, bundle, 4);
                break;
            case 1:
                int i15 = com.garmin.android.apps.connectmobile.devices.targetedselection.b.f34591c;
                p1Var.setValue(Boolean.FALSE);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("https://support.garmin.com/sas/gcapp/?productId=125677&contentId=fXDWMUWcuw5ACMmLqjjC59"));
                context.startActivity(intent);
                break;
            case 2:
                ht.a.f85464a.getClass();
                ht.a.a(null, "ChildSpectatorMessagingToggle");
                String string = context.getString(R.string.lbl_spectator_not_supported);
                p1Var.setValue(new lv0.a.b(string, p6.b.d(context, R.string.msg_spectator_not_supported, string)));
                break;
            case 3:
                Toast.makeText(context, "Close clicked", 0).show();
                p1Var.setValue(Boolean.FALSE);
                break;
            case 4:
                Toast.makeText(context, "Action clicked", 0).show();
                p1Var.setValue(Boolean.FALSE);
                break;
            case 5:
                r1.c(context, "Confirm");
                p1Var.setValue(Boolean.FALSE);
                break;
            case 6:
                r1.c(context, "Dismiss");
                p1Var.setValue(Boolean.FALSE);
                break;
            case 7:
                r1.c(context, "onConfirm");
                p1Var.setValue(Boolean.FALSE);
                break;
            case 8:
                r1.c(context, "Confirm");
                p1Var.setValue(Boolean.FALSE);
                break;
            case 9:
                r1.c(context, "Dismiss");
                p1Var.setValue(Boolean.FALSE);
                break;
            case 10:
                r1.c(context, "Delete");
                p1Var.setValue(Boolean.FALSE);
                break;
            case 11:
                r1.c(context, "Dismiss");
                p1Var.setValue(Boolean.FALSE);
                break;
            case 12:
                r1.c(context, "onDismiss");
                p1Var.setValue(Boolean.FALSE);
                break;
            case 13:
                r1.c(context, "Confirm Action 1");
                p1Var.setValue(Boolean.FALSE);
                break;
            case 14:
                r1.c(context, "Confirm Action 2");
                p1Var.setValue(Boolean.FALSE);
                break;
            case 15:
                r1.c(context, "Confirm Action 3");
                p1Var.setValue(Boolean.FALSE);
                break;
            case 16:
                r1.c(context, "Confirm");
                p1Var.setValue(Boolean.FALSE);
                break;
            case 17:
                r1.c(context, "Action2");
                p1Var.setValue(Boolean.FALSE);
                break;
            case 18:
                r1.c(context, "Action1");
                p1Var.setValue(Boolean.FALSE);
                break;
            case 19:
                r1.c(context, "Action2");
                p1Var.setValue(Boolean.FALSE);
                break;
            case 20:
                r1.c(context, "Action1");
                p1Var.setValue(Boolean.FALSE);
                break;
            case 21:
                r1.c(context, "Action2");
                p1Var.setValue(Boolean.FALSE);
                break;
            case 22:
                r1.c(context, "Action1");
                p1Var.setValue(Boolean.FALSE);
                break;
            case 23:
                r1.c(context, "Action2");
                p1Var.setValue(Boolean.FALSE);
                break;
            case 24:
                r1.c(context, "Action1");
                p1Var.setValue(Boolean.FALSE);
                break;
            case 25:
                r1.c(context, "Action2");
                p1Var.setValue(Boolean.FALSE);
                break;
            case 26:
                r1.c(context, "Action2");
                p1Var.setValue(Boolean.FALSE);
                break;
            case 27:
                r1.c(context, "Action2");
                p1Var.setValue(Boolean.FALSE);
                break;
            case 28:
                r1.c(context, "Action1");
                p1Var.setValue(Boolean.FALSE);
                break;
            default:
                r1.c(context, "Action2");
                p1Var.setValue(Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }
}
