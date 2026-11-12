package lz1;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.o1;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"lz1/e$a", "Lcom/garmin/android/apps/connectmobile/o1$a;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements o1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<Boolean, Unit> f115403a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super Boolean, Unit> lVar) {
            this.f115403a = lVar;
        }

        @Override // com.garmin.android.apps.connectmobile.o1.a
        public final void a(boolean z14) {
            this.f115403a.invoke(Boolean.valueOf(z14));
        }
    }

    public static final void a(v vVar, Fragment fragment, String str, boolean z14) {
        str.getClass();
        if (!z14) {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(vVar);
            aVar.l(R.id.content_frame, fragment, str);
            aVar.e();
        } else {
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(vVar);
            aVar2.l(R.id.content_frame, fragment, str);
            aVar2.d(str);
            aVar2.e();
        }
    }

    public static final void b(m mVar, v vVar, String str, boolean z14, l lVar) {
        String string = z14 ? mVar.getString(R.string.keep_created_event_question, str) : mVar.getString(R.string.keep_event_on_calendar_question, str);
        string.getClass();
        o1.b.a(o1.f39651c, R.string.keep_event_question, string, R.string.keep_my_event, z14 ? R.string.delete_event : R.string.workout_remove_from_calendar, new d(lVar), null, null, null, 448).show(vVar, "GCMFragTwoBtnVerticalAlertDialog");
    }

    public static final void c(m mVar, l lVar) {
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(mVar);
        aVar.setTitle(mVar.getString(R.string.make_event_primary_question));
        aVar.setMessage(mVar.getString(R.string.make_event_primary_message_v2));
        aVar.setCancelable(false);
        aVar.setPositiveButton(R.string.set_as_primary, new com.garmin.android.apps.connectmobile.gfdi.protobuf.e(lVar, 5));
        aVar.setNegativeButton(R.string.lbl_cancel, new com.garmin.android.apps.connectmobile.gfdi.protobuf.e(lVar, 6));
        aVar.create().show();
    }

    public static final void d(Context context, String str, boolean z14, l<? super Boolean, Unit> lVar) {
        int i14 = z14 ? R.string.event_deleted_from_plan : R.string.event_removed_from_plan;
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(context);
        aVar.setTitle(i14);
        aVar.setMessage(context.getString(R.string.linked_event_find_new_or_quit_plan, str));
        aVar.setCancelable(false);
        aVar.setPositiveButton(R.string.find_new_event, new com.garmin.android.apps.connectmobile.gfdi.protobuf.e(lVar, 3));
        aVar.setNegativeButton(R.string.atp_quit_plan, new com.garmin.android.apps.connectmobile.gfdi.protobuf.e(lVar, 4));
        aVar.create().show();
    }

    public static final void e(Context context, v vVar, String str, boolean z14, l<? super Boolean, Unit> lVar) {
        str.getClass();
        o1.b.a(o1.f39651c, z14 ? R.string.event_deleted_from_plan : R.string.event_removed_from_plan, context.getString(R.string.linked_event_quit_plan_question, str), R.string.atp_quit_plan, R.string.lbl_cancel, new a(lVar), null, null, null, 448).show(vVar, "GCMFragTwoBtnVerticalAlertDialog");
    }

    public static final void f(Context context, String str, String str2, int i14, l lVar) {
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(context);
        aVar.setTitle(str);
        if (str2 != null) {
            aVar.setMessage(str2);
        }
        aVar.setPositiveButton(i14, new com.garmin.android.apps.connectmobile.gfdi.protobuf.e(lVar, 7));
        aVar.setNegativeButton(R.string.lbl_cancel, new com.garmin.android.apps.connectmobile.gfdi.protobuf.e(lVar, 8));
        aVar.setCancelable(false);
        aVar.show();
    }
}
