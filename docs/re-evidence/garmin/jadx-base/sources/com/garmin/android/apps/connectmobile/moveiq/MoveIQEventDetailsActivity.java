package com.garmin.android.apps.connectmobile.moveiq;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import c2.l;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.devices.model.DeviceAppInfoDTO;
import com.garmin.android.apps.connectmobile.g1;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.moveiq.MoveIQEventDetailsActivity;
import com.garmin.android.apps.connectmobile.v2;
import gs1.f;
import h4.r;
import l72.x0;
import lc.u0;
import o13.m;
import o13.n;
import org.joda.time.DateTime;
import org.joda.time.IllegalInstantException;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p3.o0;
import p3.p2;
import p3.x1;
import z3.e;
import zo1.f0;
import zx0.d;
import zx0.i;
import zx0.j;
import zx0.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\nB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/moveiq/MoveIQEventDetailsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Landroid/view/View;", "view", "", "onClick", "(Landroid/view/View;)V", "a", "gcm-move-iq_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MoveIQEventDetailsActivity extends c implements View.OnClickListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f39211k = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f39212a = m.a(n.NONE, new b(this, null, null, null));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f39213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f39214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ComposeView f39215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f39216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f39217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f39218g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f39219h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d f39220i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f39221j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f39222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f39223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f39224c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f39225d;

        public b(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f39222a = gVar;
            this.f39223b = qualifier;
            this.f39224c = aVar;
            this.f39225d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, zx0.j] */
        @Override // e23.a
        public final j invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f39222a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f39224c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(j.class), f189591b, null, defaultViewModelCreationExtras, this.f39223b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f39225d, 4, null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [zx0.d] */
    /* JADX WARN: Type inference failed for: r0v3, types: [zx0.d] */
    public MoveIQEventDetailsActivity() {
        final int i14 = 0;
        this.f39220i = new z0(this) { // from class: zx0.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoveIQEventDetailsActivity f207342b;

            {
                this.f207342b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i15 = i14;
                MoveIQEventDetailsActivity moveIQEventDetailsActivity = this.f207342b;
                v2 v2Var = (v2) obj;
                switch (i15) {
                    case 0:
                        MoveIQEventDetailsActivity.a aVar = MoveIQEventDetailsActivity.f39211k;
                        v2Var.getClass();
                        moveIQEventDetailsActivity.hideProgressOverlay();
                        if (v2Var instanceof v2.b) {
                            DeviceAppInfoDTO deviceAppInfoDTO = (DeviceAppInfoDTO) ((v2.b) v2Var).f47386a;
                            moveIQEventDetailsActivity.da(deviceAppInfoDTO != null ? deviceAppInfoDTO.f33855c : null, deviceAppInfoDTO != null ? deviceAppInfoDTO.f33854b : null);
                            break;
                        } else if (!(v2Var instanceof v2.a)) {
                            u0.r();
                            break;
                        }
                        break;
                    default:
                        MoveIQEventDetailsActivity.a aVar2 = MoveIQEventDetailsActivity.f39211k;
                        v2Var.getClass();
                        moveIQEventDetailsActivity.hideProgressOverlay();
                        if (v2Var instanceof v2.b) {
                            moveIQEventDetailsActivity.setResult(-1);
                            moveIQEventDetailsActivity.finish();
                        } else if (!(v2Var instanceof v2.a)) {
                            u0.r();
                        } else {
                            g1.b(moveIQEventDetailsActivity, com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
                        }
                        break;
                }
            }
        };
        final int i15 = 1;
        this.f39221j = new z0(this) { // from class: zx0.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoveIQEventDetailsActivity f207342b;

            {
                this.f207342b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i16 = i15;
                MoveIQEventDetailsActivity moveIQEventDetailsActivity = this.f207342b;
                v2 v2Var = (v2) obj;
                switch (i16) {
                    case 0:
                        MoveIQEventDetailsActivity.a aVar = MoveIQEventDetailsActivity.f39211k;
                        v2Var.getClass();
                        moveIQEventDetailsActivity.hideProgressOverlay();
                        if (v2Var instanceof v2.b) {
                            DeviceAppInfoDTO deviceAppInfoDTO = (DeviceAppInfoDTO) ((v2.b) v2Var).f47386a;
                            moveIQEventDetailsActivity.da(deviceAppInfoDTO != null ? deviceAppInfoDTO.f33855c : null, deviceAppInfoDTO != null ? deviceAppInfoDTO.f33854b : null);
                            break;
                        } else if (!(v2Var instanceof v2.a)) {
                            u0.r();
                            break;
                        }
                        break;
                    default:
                        MoveIQEventDetailsActivity.a aVar2 = MoveIQEventDetailsActivity.f39211k;
                        v2Var.getClass();
                        moveIQEventDetailsActivity.hideProgressOverlay();
                        if (v2Var instanceof v2.b) {
                            moveIQEventDetailsActivity.setResult(-1);
                            moveIQEventDetailsActivity.finish();
                        } else if (!(v2Var instanceof v2.a)) {
                            u0.r();
                        } else {
                            g1.b(moveIQEventDetailsActivity, com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
                        }
                        break;
                }
            }
        };
    }

    public final void ca(Integer num, Integer num2, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(398200363);
        int i15 = (o0VarE.B(num) ? 4 : 2) | i14 | (o0VarE.B(num2) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            String strE = new x00.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b)).e();
            x0 x0Var = x0.f111346a;
            r.a aVar = r.S;
            float f14 = 16;
            g6.f.a aVar2 = g6.f.f75994b;
            r rVarC = l.C(aVar, f14, 0.0f, f14, f14, 2);
            e eVarC = z3.f.c(-499805006, new zx0.f(num, strE, num2), o0VarE);
            int i16 = (x0.f111348c << 6) | 54;
            x0Var.e(rVarC, eVarC, o0VarE, i16, 0);
            x0Var.e(l.C(aVar, f14, 0.0f, f14, f14, 2), z3.f.c(-1131492773, new zx0.f(num, num2, strE), o0VarE), o0VarE, i16, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f0(this, num, num2, i14, 5);
        }
    }

    public final void da(String str, String str2) {
        if ((str == null || TextUtils.isEmpty(str)) && (str2 == null || TextUtils.isEmpty(str2))) {
            ImageView imageView = this.f39216e;
            imageView.getClass();
            imageView.setVisibility(8);
            TextView textView = this.f39217f;
            textView.getClass();
            textView.setVisibility(8);
            return;
        }
        ImageView imageView2 = this.f39216e;
        imageView2.getClass();
        imageView2.setVisibility(0);
        zp0.c cVar = new zp0.c((androidx.fragment.app.m) this);
        cVar.f206565e = str;
        cVar.f206570j = 2131231969;
        ImageView imageView3 = this.f39216e;
        imageView3.getClass();
        cVar.h(imageView3);
        TextView textView2 = this.f39217f;
        textView2.getClass();
        textView2.setVisibility(0);
        TextView textView3 = this.f39217f;
        textView3.getClass();
        if (str2 == null) {
            str2 = getString(R.string.no_value);
            str2.getClass();
        }
        textView3.setText(str2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view2) {
        view2.getClass();
        if (view2.getId() == R.id.move_iq_what_is_this_text_view) {
            HelpActivity.a aVar = HelpActivity.f36653a;
            ro0.l lVar = ro0.l.MOVE_IQ;
            aVar.getClass();
            HelpActivity.a.d(this, lVar, null, null);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, o13.l] */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        DateTime dateTime;
        MoveIQEventDetailsActivity moveIQEventDetailsActivity;
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_moveiq_event_details_layout);
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("GCM_calendar_items")) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) intent.getParcelableExtra("GCM_calendar_items", f.class);
            } else {
                Parcelable parcelableExtra = intent.getParcelableExtra("GCM_calendar_items");
                if (!(parcelableExtra instanceof f)) {
                    parcelableExtra = null;
                }
                parcelable = (f) parcelableExtra;
            }
            this.f39219h = (f) parcelable;
        }
        super.initActionBar(true, R.string.lbl_event);
        this.f39213b = (ImageView) findViewById(R.id.android_activity_type_icon);
        this.f39214c = (TextView) findViewById(R.id.move_iq_activity_type_text_view);
        this.f39215d = (ComposeView) findViewById(R.id.gcm_stats_row_1);
        this.f39216e = (ImageView) findViewById(R.id.move_iq_device_image_view);
        this.f39217f = (TextView) findViewById(R.id.move_iq_device_name_text_view);
        this.f39218g = (TextView) findViewById(R.id.move_iq_what_is_this_text_view);
        f fVar = this.f39219h;
        if (fVar != null) {
            Long deviceId = fVar.getDeviceId();
            deviceId.getClass();
            long jLongValue = deviceId.longValue();
            rd2.f.a().f152045a.getClass();
            sd2.f fVarI = rd2.j.i(jLongValue, null);
            k kVar = (k) KoinJavaComponent.get$default(k.class, null, null, 6, null);
            ?? r14 = this.f39212a;
            if (fVarI == null) {
                showProgressOverlay();
                j jVar = (j) r14.getValue();
                jVar.getClass();
                ge1.b.T(v1.a(jVar), null, null, new i(jVar, jLongValue, null), 3);
            } else {
                da(kVar.f(fVarI), fVarI.getProductDisplayName());
            }
            f fVar2 = this.f39219h;
            fVar2.getClass();
            am.x0 x0VarB = fs1.b.b(fVar2);
            f fVar3 = this.f39219h;
            fVar3.getClass();
            LayerDrawable layerDrawableD = zx0.m.d(this, x0VarB, fVar3.getActivitySubType(), 1);
            ImageView imageView = this.f39213b;
            imageView.getClass();
            imageView.setImageDrawable(layerDrawableD);
            f fVar4 = this.f39219h;
            fVar4.getClass();
            if (zx0.m.i(fVar4.getActivitySubType())) {
                TextView textView = this.f39214c;
                textView.getClass();
                textView.setText(dh.b.A(this, am.x0.f4290i1.f4360c));
            } else {
                f fVar5 = this.f39219h;
                fVar5.getClass();
                am.x0 x0VarB2 = fs1.b.b(fVar5);
                if (x0VarB2 != null) {
                    TextView textView2 = this.f39214c;
                    textView2.getClass();
                    textView2.setText(dh.b.A(this, x0VarB2.f4360c));
                }
            }
            DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS");
            f fVar6 = this.f39219h;
            fVar6.getClass();
            LocalDateTime localDateTime = dateTimeFormatterForPattern.parseLocalDateTime(fVar6.getStartTimestampLocal());
            try {
                dateTime = localDateTime.toDateTime();
            } catch (IllegalInstantException unused) {
                dateTime = localDateTime.plusHours(1).toDateTime();
            }
            boolean zIs24HourFormat = DateFormat.is24HourFormat(this);
            String strPrint = DateTimeFormat.forPattern(zIs24HourFormat ? "HH:mm" : "hh:mm").print(dateTime);
            l3.a aVar = l3.f23124b;
            f fVar7 = this.f39219h;
            fVar7.getClass();
            Double duration = fVar7.getDuration();
            duration.getClass();
            long jRound = (int) Math.round(duration.doubleValue() * 60.0d);
            aVar.getClass();
            String strE1 = l3.a.e1(jRound);
            String strPrint2 = !zIs24HourFormat ? DateTimeFormat.forPattern("a").print(dateTime) : null;
            f fVar8 = this.f39219h;
            Integer moderateIntensityMinutes = fVar8 != null ? fVar8.getModerateIntensityMinutes() : null;
            f fVar9 = this.f39219h;
            Integer vigorousIntensityMinutes = fVar9 != null ? fVar9.getVigorousIntensityMinutes() : null;
            ComposeView composeView = this.f39215d;
            if (composeView != null) {
                moveIQEventDetailsActivity = this;
                composeView.setContent(new e(-1919971288, true, new zx0.e(moderateIntensityMinutes, vigorousIntensityMinutes, moveIQEventDetailsActivity, strPrint, strPrint2, strE1, 0)));
            } else {
                moveIQEventDetailsActivity = this;
            }
            TextView textView3 = moveIQEventDetailsActivity.f39218g;
            if (textView3 != null) {
                textView3.setOnClickListener(this);
            }
            ((j) r14.getValue()).f207367f.f(this, moveIQEventDetailsActivity.f39220i);
            ((j) r14.getValue()).f207365d.f(this, moveIQEventDetailsActivity.f39221j);
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.moveiq_delete_event, menu);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.move_iq_delete_btn) {
            return super.onOptionsItemSelected(menuItem);
        }
        new androidx.appcompat.app.e.a(this).setMessage(R.string.lbl_delete_move_iq).setPositiveButton(R.string.lbl_delete, new xg1.l(this, 23)).setNegativeButton(R.string.lbl_keep, new zo.g(4)).create().show();
        return true;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/moveiq/MoveIQEventDetailsActivity$a;", "", "<init>", "()V", "gcm-move-iq_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(Activity activity, f fVar, int i14) {
            Intent intent = new Intent(activity, (Class<?>) MoveIQEventDetailsActivity.class);
            intent.putExtra("GCM_calendar_items", fVar);
            if (i14 >= 0) {
                activity.startActivityForResult(intent, i14);
            } else {
                activity.startActivity(intent);
            }
        }

        private a() {
        }
    }
}
