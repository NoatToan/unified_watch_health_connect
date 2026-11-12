package z12;

import am.c2;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.lifecycle.ViewModelStoreOwner;
import c22.b3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.social.conversation.ConversationActivity;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lz12/m0;", "Ldo1/r;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m0 extends do1.r {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f201438j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ActivityListItemDTO f201439k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c2 f201440l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f201441m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m10.b f201442n;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"z12/m0$a", "Lm10/b$b;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements m10.b.InterfaceC2201b {
        public a() {
        }

        @Override // m10.b.InterfaceC2201b
        public final void E5(int i14, String str, long j8) {
            String str2;
            m0 m0Var = m0.this;
            m0Var.f60613b.setClickable(true);
            if (i14 == 1) {
                ActivityListItemDTO activityListItemDTO = m0Var.f201439k;
                if (activityListItemDTO != null) {
                    activityListItemDTO.f29263f1 = str;
                }
                if (activityListItemDTO != null) {
                    activityListItemDTO.f29266g1 = j8;
                }
            } else if (i14 == 2) {
                ActivityListItemDTO activityListItemDTO2 = m0Var.f201439k;
                if (activityListItemDTO2 != null) {
                    activityListItemDTO2.f29263f1 = null;
                }
                if (activityListItemDTO2 != null) {
                    activityListItemDTO2.f29266g1 = 0L;
                }
            }
            Context context = m0Var.f201438j;
            i.c cVar = context instanceof i.c ? (i.c) context : null;
            if (cVar == null || (str2 = m0Var.f201441m) == null) {
                return;
            }
            ((iz0.a) KoinJavaComponent.get$default(iz0.a.class, null, null, 6, null)).o(cVar, Long.parseLong(str2), false);
        }

        @Override // m10.b.InterfaceC2201b
        public final void o(int i14) {
            m0 m0Var = m0.this;
            ActivityListItemDTO activityListItemDTO = m0Var.f201439k;
            Context context = m0Var.f201438j;
            if (activityListItemDTO == null) {
                return;
            }
            m0Var.c(!activityListItemDTO.V0);
            if (zy0.g.a(Integer.valueOf(i14))) {
                b3.c(context);
            } else if (!zy0.g.b(Integer.valueOf(i14))) {
                Toast.makeText(context, R.string.txt_error_occurred, 0).show();
            }
            m0Var.f60613b.setClickable(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m0(View view2) {
        super(view2);
        view2.getClass();
        Context context = view2.getContext();
        context.getClass();
        this.f201438j = context;
        final int i14 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: z12.l0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m0 f201436b;

            {
                this.f201436b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                DateTime dateTime;
                DateTime dateTime2;
                m10.b bVar;
                switch (i14) {
                    case 0:
                        m0 m0Var = this.f201436b;
                        ActivityListItemDTO activityListItemDTO = m0Var.f201439k;
                        if (activityListItemDTO != null) {
                            String str = activityListItemDTO.f29262f;
                            if (str == null || (dateTime = DateTime.parse(str, c22.j0.f23105g)) == null) {
                                dateTime = new DateTime(0L);
                            }
                            boolean zIsBefore = dateTime.isBefore(DateTime.now().minusDays(90));
                            ConversationActivity.a aVar = ConversationActivity.f44530c;
                            Context context2 = m0Var.f201438j;
                            String strValueOf = String.valueOf(activityListItemDTO.f29250b);
                            aVar.getClass();
                            Intent intentA = ConversationActivity.a.a(context2, strValueOf, true, "", zIsBefore, false);
                            Context context3 = m0Var.f201438j;
                            Activity activity = context3 instanceof Activity ? (Activity) context3 : null;
                            if (activity != null) {
                                activity.startActivityForResult(intentA, 1002);
                            }
                            break;
                        }
                        break;
                    case 1:
                        m0 m0Var2 = this.f201436b;
                        ActivityListItemDTO activityListItemDTO2 = m0Var2.f201439k;
                        if (activityListItemDTO2 != null) {
                            String str2 = activityListItemDTO2.f29262f;
                            if (str2 == null || (dateTime2 = DateTime.parse(str2, c22.j0.f23105g)) == null) {
                                dateTime2 = new DateTime(0L);
                            }
                            boolean zIsBefore2 = dateTime2.isBefore(DateTime.now().minusDays(90));
                            ConversationActivity.a aVar2 = ConversationActivity.f44530c;
                            Context context4 = m0Var2.f201438j;
                            String strValueOf2 = String.valueOf(activityListItemDTO2.f29250b);
                            aVar2.getClass();
                            Intent intentA2 = ConversationActivity.a.a(context4, strValueOf2, true, "", zIsBefore2, true);
                            Context context5 = m0Var2.f201438j;
                            Activity activity2 = context5 instanceof Activity ? (Activity) context5 : null;
                            if (activity2 != null) {
                                activity2.startActivityForResult(intentA2, 1002);
                            }
                            break;
                        }
                        break;
                    case 2:
                        m0 m0Var3 = this.f201436b;
                        if (m0Var3.f201439k != null) {
                            c2 c2Var = m0Var3.f201440l;
                            String str3 = m0Var3.f201441m;
                            if (c2Var != null && str3 != null) {
                                Context context6 = m0Var3.f201438j;
                                Activity activity3 = context6 instanceof Activity ? (Activity) context6 : null;
                                if (activity3 != null) {
                                    ConversationActivity.f44530c.getClass();
                                    activity3.startActivity(ConversationActivity.a.h(activity3, c2Var, str3));
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        m0 m0Var4 = this.f201436b;
                        ActivityListItemDTO activityListItemDTO3 = m0Var4.f201439k;
                        if (activityListItemDTO3 != null && (bVar = m0Var4.f201442n) != null) {
                            if (activityListItemDTO3.V0) {
                                bVar.b(activityListItemDTO3.f29266g1, activityListItemDTO3.f29263f1);
                            } else {
                                bVar.a(m0Var4.f201441m, m0Var4.f201440l);
                            }
                            m0Var4.c(!activityListItemDTO3.V0);
                            m0Var4.f60613b.setClickable(false);
                        }
                        break;
                }
            }
        };
        final int i15 = 1;
        View.OnClickListener onClickListener2 = new View.OnClickListener(this) { // from class: z12.l0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m0 f201436b;

            {
                this.f201436b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                DateTime dateTime;
                DateTime dateTime2;
                m10.b bVar;
                switch (i15) {
                    case 0:
                        m0 m0Var = this.f201436b;
                        ActivityListItemDTO activityListItemDTO = m0Var.f201439k;
                        if (activityListItemDTO != null) {
                            String str = activityListItemDTO.f29262f;
                            if (str == null || (dateTime = DateTime.parse(str, c22.j0.f23105g)) == null) {
                                dateTime = new DateTime(0L);
                            }
                            boolean zIsBefore = dateTime.isBefore(DateTime.now().minusDays(90));
                            ConversationActivity.a aVar = ConversationActivity.f44530c;
                            Context context2 = m0Var.f201438j;
                            String strValueOf = String.valueOf(activityListItemDTO.f29250b);
                            aVar.getClass();
                            Intent intentA = ConversationActivity.a.a(context2, strValueOf, true, "", zIsBefore, false);
                            Context context3 = m0Var.f201438j;
                            Activity activity = context3 instanceof Activity ? (Activity) context3 : null;
                            if (activity != null) {
                                activity.startActivityForResult(intentA, 1002);
                            }
                            break;
                        }
                        break;
                    case 1:
                        m0 m0Var2 = this.f201436b;
                        ActivityListItemDTO activityListItemDTO2 = m0Var2.f201439k;
                        if (activityListItemDTO2 != null) {
                            String str2 = activityListItemDTO2.f29262f;
                            if (str2 == null || (dateTime2 = DateTime.parse(str2, c22.j0.f23105g)) == null) {
                                dateTime2 = new DateTime(0L);
                            }
                            boolean zIsBefore2 = dateTime2.isBefore(DateTime.now().minusDays(90));
                            ConversationActivity.a aVar2 = ConversationActivity.f44530c;
                            Context context4 = m0Var2.f201438j;
                            String strValueOf2 = String.valueOf(activityListItemDTO2.f29250b);
                            aVar2.getClass();
                            Intent intentA2 = ConversationActivity.a.a(context4, strValueOf2, true, "", zIsBefore2, true);
                            Context context5 = m0Var2.f201438j;
                            Activity activity2 = context5 instanceof Activity ? (Activity) context5 : null;
                            if (activity2 != null) {
                                activity2.startActivityForResult(intentA2, 1002);
                            }
                            break;
                        }
                        break;
                    case 2:
                        m0 m0Var3 = this.f201436b;
                        if (m0Var3.f201439k != null) {
                            c2 c2Var = m0Var3.f201440l;
                            String str3 = m0Var3.f201441m;
                            if (c2Var != null && str3 != null) {
                                Context context6 = m0Var3.f201438j;
                                Activity activity3 = context6 instanceof Activity ? (Activity) context6 : null;
                                if (activity3 != null) {
                                    ConversationActivity.f44530c.getClass();
                                    activity3.startActivity(ConversationActivity.a.h(activity3, c2Var, str3));
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        m0 m0Var4 = this.f201436b;
                        ActivityListItemDTO activityListItemDTO3 = m0Var4.f201439k;
                        if (activityListItemDTO3 != null && (bVar = m0Var4.f201442n) != null) {
                            if (activityListItemDTO3.V0) {
                                bVar.b(activityListItemDTO3.f29266g1, activityListItemDTO3.f29263f1);
                            } else {
                                bVar.a(m0Var4.f201441m, m0Var4.f201440l);
                            }
                            m0Var4.c(!activityListItemDTO3.V0);
                            m0Var4.f60613b.setClickable(false);
                        }
                        break;
                }
            }
        };
        final int i16 = 2;
        View.OnClickListener onClickListener3 = new View.OnClickListener(this) { // from class: z12.l0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m0 f201436b;

            {
                this.f201436b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                DateTime dateTime;
                DateTime dateTime2;
                m10.b bVar;
                switch (i16) {
                    case 0:
                        m0 m0Var = this.f201436b;
                        ActivityListItemDTO activityListItemDTO = m0Var.f201439k;
                        if (activityListItemDTO != null) {
                            String str = activityListItemDTO.f29262f;
                            if (str == null || (dateTime = DateTime.parse(str, c22.j0.f23105g)) == null) {
                                dateTime = new DateTime(0L);
                            }
                            boolean zIsBefore = dateTime.isBefore(DateTime.now().minusDays(90));
                            ConversationActivity.a aVar = ConversationActivity.f44530c;
                            Context context2 = m0Var.f201438j;
                            String strValueOf = String.valueOf(activityListItemDTO.f29250b);
                            aVar.getClass();
                            Intent intentA = ConversationActivity.a.a(context2, strValueOf, true, "", zIsBefore, false);
                            Context context3 = m0Var.f201438j;
                            Activity activity = context3 instanceof Activity ? (Activity) context3 : null;
                            if (activity != null) {
                                activity.startActivityForResult(intentA, 1002);
                            }
                            break;
                        }
                        break;
                    case 1:
                        m0 m0Var2 = this.f201436b;
                        ActivityListItemDTO activityListItemDTO2 = m0Var2.f201439k;
                        if (activityListItemDTO2 != null) {
                            String str2 = activityListItemDTO2.f29262f;
                            if (str2 == null || (dateTime2 = DateTime.parse(str2, c22.j0.f23105g)) == null) {
                                dateTime2 = new DateTime(0L);
                            }
                            boolean zIsBefore2 = dateTime2.isBefore(DateTime.now().minusDays(90));
                            ConversationActivity.a aVar2 = ConversationActivity.f44530c;
                            Context context4 = m0Var2.f201438j;
                            String strValueOf2 = String.valueOf(activityListItemDTO2.f29250b);
                            aVar2.getClass();
                            Intent intentA2 = ConversationActivity.a.a(context4, strValueOf2, true, "", zIsBefore2, true);
                            Context context5 = m0Var2.f201438j;
                            Activity activity2 = context5 instanceof Activity ? (Activity) context5 : null;
                            if (activity2 != null) {
                                activity2.startActivityForResult(intentA2, 1002);
                            }
                            break;
                        }
                        break;
                    case 2:
                        m0 m0Var3 = this.f201436b;
                        if (m0Var3.f201439k != null) {
                            c2 c2Var = m0Var3.f201440l;
                            String str3 = m0Var3.f201441m;
                            if (c2Var != null && str3 != null) {
                                Context context6 = m0Var3.f201438j;
                                Activity activity3 = context6 instanceof Activity ? (Activity) context6 : null;
                                if (activity3 != null) {
                                    ConversationActivity.f44530c.getClass();
                                    activity3.startActivity(ConversationActivity.a.h(activity3, c2Var, str3));
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        m0 m0Var4 = this.f201436b;
                        ActivityListItemDTO activityListItemDTO3 = m0Var4.f201439k;
                        if (activityListItemDTO3 != null && (bVar = m0Var4.f201442n) != null) {
                            if (activityListItemDTO3.V0) {
                                bVar.b(activityListItemDTO3.f29266g1, activityListItemDTO3.f29263f1);
                            } else {
                                bVar.a(m0Var4.f201441m, m0Var4.f201440l);
                            }
                            m0Var4.c(!activityListItemDTO3.V0);
                            m0Var4.f60613b.setClickable(false);
                        }
                        break;
                }
            }
        };
        final int i17 = 3;
        View.OnClickListener onClickListener4 = new View.OnClickListener(this) { // from class: z12.l0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m0 f201436b;

            {
                this.f201436b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                DateTime dateTime;
                DateTime dateTime2;
                m10.b bVar;
                switch (i17) {
                    case 0:
                        m0 m0Var = this.f201436b;
                        ActivityListItemDTO activityListItemDTO = m0Var.f201439k;
                        if (activityListItemDTO != null) {
                            String str = activityListItemDTO.f29262f;
                            if (str == null || (dateTime = DateTime.parse(str, c22.j0.f23105g)) == null) {
                                dateTime = new DateTime(0L);
                            }
                            boolean zIsBefore = dateTime.isBefore(DateTime.now().minusDays(90));
                            ConversationActivity.a aVar = ConversationActivity.f44530c;
                            Context context2 = m0Var.f201438j;
                            String strValueOf = String.valueOf(activityListItemDTO.f29250b);
                            aVar.getClass();
                            Intent intentA = ConversationActivity.a.a(context2, strValueOf, true, "", zIsBefore, false);
                            Context context3 = m0Var.f201438j;
                            Activity activity = context3 instanceof Activity ? (Activity) context3 : null;
                            if (activity != null) {
                                activity.startActivityForResult(intentA, 1002);
                            }
                            break;
                        }
                        break;
                    case 1:
                        m0 m0Var2 = this.f201436b;
                        ActivityListItemDTO activityListItemDTO2 = m0Var2.f201439k;
                        if (activityListItemDTO2 != null) {
                            String str2 = activityListItemDTO2.f29262f;
                            if (str2 == null || (dateTime2 = DateTime.parse(str2, c22.j0.f23105g)) == null) {
                                dateTime2 = new DateTime(0L);
                            }
                            boolean zIsBefore2 = dateTime2.isBefore(DateTime.now().minusDays(90));
                            ConversationActivity.a aVar2 = ConversationActivity.f44530c;
                            Context context4 = m0Var2.f201438j;
                            String strValueOf2 = String.valueOf(activityListItemDTO2.f29250b);
                            aVar2.getClass();
                            Intent intentA2 = ConversationActivity.a.a(context4, strValueOf2, true, "", zIsBefore2, true);
                            Context context5 = m0Var2.f201438j;
                            Activity activity2 = context5 instanceof Activity ? (Activity) context5 : null;
                            if (activity2 != null) {
                                activity2.startActivityForResult(intentA2, 1002);
                            }
                            break;
                        }
                        break;
                    case 2:
                        m0 m0Var3 = this.f201436b;
                        if (m0Var3.f201439k != null) {
                            c2 c2Var = m0Var3.f201440l;
                            String str3 = m0Var3.f201441m;
                            if (c2Var != null && str3 != null) {
                                Context context6 = m0Var3.f201438j;
                                Activity activity3 = context6 instanceof Activity ? (Activity) context6 : null;
                                if (activity3 != null) {
                                    ConversationActivity.f44530c.getClass();
                                    activity3.startActivity(ConversationActivity.a.h(activity3, c2Var, str3));
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        m0 m0Var4 = this.f201436b;
                        ActivityListItemDTO activityListItemDTO3 = m0Var4.f201439k;
                        if (activityListItemDTO3 != null && (bVar = m0Var4.f201442n) != null) {
                            if (activityListItemDTO3.V0) {
                                bVar.b(activityListItemDTO3.f29266g1, activityListItemDTO3.f29263f1);
                            } else {
                                bVar.a(m0Var4.f201441m, m0Var4.f201440l);
                            }
                            m0Var4.c(!activityListItemDTO3.V0);
                            m0Var4.f60613b.setClickable(false);
                        }
                        break;
                }
            }
        };
        a aVar = new a();
        m10.b bVar = null;
        androidx.lifecycle.n0 n0Var = context instanceof androidx.lifecycle.n0 ? (androidx.lifecycle.n0) context : null;
        ViewModelStoreOwner viewModelStoreOwner = context instanceof ViewModelStoreOwner ? (ViewModelStoreOwner) context : null;
        if (n0Var != null && viewModelStoreOwner != null) {
            bVar = new m10.b(n0Var, viewModelStoreOwner, aVar);
        }
        this.f201442n = bVar;
        this.f60613b.setOnClickListener(onClickListener4);
        this.f60617f.setOnClickListener(onClickListener3);
        this.f60614c.setOnClickListener(onClickListener2);
        this.f60619h.setOnClickListener(onClickListener);
        if (c22.b.a(context) >= 1.5f) {
            ViewGroup.LayoutParams layoutParams = this.f60613b.getLayoutParams();
            Resources resources = context.getResources();
            resources.getClass();
            layoutParams.width = (int) c22.b.c(context, xy2.b.n(resources, 32.0f), 1.5f);
            ViewGroup.LayoutParams layoutParams2 = this.f60613b.getLayoutParams();
            Resources resources2 = context.getResources();
            resources2.getClass();
            layoutParams2.height = (int) c22.b.c(context, xy2.b.n(resources2, 40.0f), 1.5f);
            int iC = (int) c22.b.c(context, context.getResources().getDimensionPixelSize(R.dimen.icon_medium), 1.5f);
            this.f60614c.getLayoutParams().width = iC;
            this.f60614c.getLayoutParams().height = iC;
            this.f60615d.getLayoutParams().width = iC;
            this.f60615d.getLayoutParams().height = iC;
            this.f60616e.getLayoutParams().width = iC;
            this.f60616e.getLayoutParams().height = iC;
        }
        v22.e.j(this.f60616e);
    }

    public final void c(boolean z14) {
        ActivityListItemDTO activityListItemDTO = this.f201439k;
        if (activityListItemDTO == null || activityListItemDTO.V0 == z14) {
            return;
        }
        if (z14) {
            activityListItemDTO.V0 = true;
            activityListItemDTO.S0++;
        } else {
            activityListItemDTO.V0 = false;
            activityListItemDTO.S0--;
        }
        a(this.f201438j, activityListItemDTO.S0, activityListItemDTO.V0);
    }
}
