package com.garmin.android.apps.connectmobile.segments.presentation;

import am.x0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.x1;
import androidx.lifecycle.z0;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import c22.b3;
import c22.l3;
import c22.p0;
import c22.s3;
import cg1.a0;
import cg1.b0;
import cg1.c0;
import cg1.j;
import cg1.k;
import cg1.o;
import cg1.s;
import cg1.u;
import cg1.v;
import cg1.x;
import cg1.y;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.r2;
import com.garmin.android.apps.connectmobile.segments.data.model.SegmentLeaderboardDTO;
import com.garmin.android.apps.connectmobile.segments.data.model.SegmentLeaderboardRowDTO;
import com.garmin.android.apps.connectmobile.segments.data.model.UserRankDTO;
import com.garmin.android.apps.connectmobile.segments.model.SegmentDetailsDTO;
import com.garmin.android.apps.connectmobile.segments.model.SegmentLeaderboardFilterDTO;
import com.garmin.android.apps.connectmobile.view.privacy.PrivacySelectionActivity;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import e23.l;
import fw.p;
import gg1.o0;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import o53.f0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s0;
import p13.j0;
import rt1.m;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/presentation/SegmentDetailsActivity;", "Lcom/garmin/android/apps/connectmobile/segments/presentation/a;", "Lcom/garmin/android/apps/connectmobile/r2;", "Lm10/b$b;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$f;", "<init>", "()V", "a", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SegmentDetailsActivity extends com.garmin.android.apps.connectmobile.segments.presentation.a implements r2, m10.b.InterfaceC2201b, SwipeRefreshLayout.f {
    public static final a Z = new a(null);
    public boolean A;
    public boolean B;
    public SwipeRefreshLayout C;
    public TextView D;
    public bg1.a P;
    public SegmentDetailsDTO T;
    public UserRankDTO X;
    public m10.b Y;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f.a f41397h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ViewGroup f41398i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public s f41399j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f41400k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MenuItem f41401l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public MenuItem f41402m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f41403n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f41404o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SegmentDetailsDTO f41405p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SegmentLeaderboardDTO f41406q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public UserRankDTO f41407r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public mo1.d f41408t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public PrivacyType f41409v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f41410w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f41412y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public c0 f41413z;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f41411x = -1;
    public final o E = new o(this, 0);
    public final o F = new o(this, 1);
    public final boolean I = s3.b();

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f41415b;

        static {
            int[] iArr = new int[PrivacyType.values().length];
            try {
                iArr[PrivacyType.ONLY_ME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrivacyType.MY_CONNECTIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrivacyType.MY_GROUPS_AND_CONNECTIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PrivacyType.EVERYONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f41414a = iArr;
            int[] iArr2 = new int[p.values().length];
            try {
                iArr2[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f41415b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f41416a;

        public c(l lVar) {
            lVar.getClass();
            this.f41416a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f41416a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f41416a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/segments/presentation/SegmentDetailsActivity$d", "Landroid/text/style/ClickableSpan;", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends ClickableSpan {
        public d() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view2) {
            view2.getClass();
            SegmentDetailsActivity segmentDetailsActivity = SegmentDetailsActivity.this;
            if (segmentDetailsActivity.I) {
                ht.a.f85464a.getClass();
                ht.a.a(null, "ChildActivityPrivacyTapped");
                new androidx.appcompat.app.e.a(segmentDetailsActivity).setTitle(R.string.lbl_activity_set_to_private).setMessage(R.string.msg_activity_set_to_private).setPositiveButton(R.string.lbl_ok, new ag0.e(26)).setCancelable(false).create().show();
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(R.string.segment_privacy_only_me));
            arrayList.add(Integer.valueOf(R.string.segment_privacy_my_connections));
            arrayList.add(Integer.valueOf(R.string.segment_privacy_groups));
            arrayList.add(Integer.valueOf(R.string.segment_privacy_everyone));
            if (segmentDetailsActivity.f41409v != null) {
                PrivacySelectionActivity.a aVar = PrivacySelectionActivity.f47684c;
                Context baseContext = segmentDetailsActivity.getBaseContext();
                baseContext.getClass();
                String string = segmentDetailsActivity.getString(R.string.edit_activity_privacy);
                string.getClass();
                PrivacyType privacyType = segmentDetailsActivity.f41409v;
                privacyType.getClass();
                segmentDetailsActivity.startActivityForResult(PrivacySelectionActivity.a.b(aVar, baseContext, string, privacyType, arrayList, -1L), 12);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            textPaint.getClass();
            textPaint.setUnderlineText(false);
            textPaint.setColor(SegmentDetailsActivity.this.getColor(R.color.gcm_text_primary_action_selector));
        }
    }

    @Override // m10.b.InterfaceC2201b
    public final void E5(int i14, String str, long j8) {
        if (i14 != 1) {
            if (i14 != 2) {
                return;
            }
            mo1.d dVar = this.f41408t;
            if (dVar == null) {
                this.f41408t = new mo1.d(null, 0L, null, null, false, 0, 0, null, null, null, null, null, null, 8191, null);
            } else {
                dVar.r(dVar.getNumberOfLikes() - 1);
                mo1.d dVar2 = this.f41408t;
                dVar2.getClass();
                dVar2.o(false);
            }
            qa();
            return;
        }
        if (this.f41408t == null) {
            this.f41408t = new mo1.d(null, 0L, null, null, false, 0, 0, null, null, null, null, null, null, 8191, null);
        }
        mo1.d dVar3 = this.f41408t;
        dVar3.getClass();
        dVar3.s(str);
        mo1.d dVar4 = this.f41408t;
        dVar4.getClass();
        dVar4.o(true);
        mo1.d dVar5 = this.f41408t;
        dVar5.getClass();
        mo1.d dVar6 = this.f41408t;
        dVar6.getClass();
        dVar5.r(dVar6.getNumberOfLikes() + 1);
        mo1.d dVar7 = this.f41408t;
        dVar7.getClass();
        dVar7.m(j8);
        qa();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void M7() {
        SwipeRefreshLayout swipeRefreshLayout = this.C;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(true);
        }
        this.T = null;
        this.X = null;
        this.f41406q = null;
        this.f41408t = null;
        this.A = false;
        this.B = false;
        pa();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.r2
    public final void U7() {
        int i14 = this.f41410w + 1;
        this.f41410w = i14;
        if (i14 < 0 || isProgressOverlayVisible()) {
            return;
        }
        showProgressOverlay();
    }

    @Override // android.app.Activity
    public final void finish() {
        String str;
        if (this.f41405p != null && this.f41412y) {
            HashMap map = new HashMap();
            SegmentDetailsDTO segmentDetailsDTO = this.f41405p;
            if (segmentDetailsDTO != null && (str = segmentDetailsDTO.f17841f) != null) {
                map.put(str, Boolean.valueOf(segmentDetailsDTO.f17840e));
            }
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putSerializable("GCM_extra_segment_is_favorite", map);
            intent.putExtras(bundle);
            setResult(-1, intent);
        }
        super.finish();
    }

    @Override // m10.b.InterfaceC2201b
    public final void o(int i14) {
        TextView textView;
        if (zy0.g.a(Integer.valueOf(i14))) {
            b3.c(this);
        } else if (!zy0.g.b(Integer.valueOf(i14))) {
            lj0.b bVar = lj0.b.f112956j;
            bVar.getClass();
            g22.a.b(this, bVar);
        }
        f.a aVar = this.f41397h;
        if (aVar == null || (textView = aVar.f41444d) == null) {
            return;
        }
        textView.setEnabled(true);
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        if (i15 == -1) {
            if (i14 == 11) {
                long jI = ((ag1.a) KoinJavaComponent.get$default(ag1.a.class, null, null, 6, null)).i();
                if (jI < 1) {
                    return;
                }
                if (((m) KoinJavaComponent.get$default(m.class, null, null, 6, null)).a(jI)) {
                    na(R.string.msg_segment_show_on_sync, jI);
                    return;
                }
                Toast toastMakeText = Toast.makeText(this, getText(R.string.connect_iq_device_not_connected_title), 1);
                toastMakeText.setGravity(49, 0, 150);
                toastMakeText.show();
                return;
            }
            if (i14 != 12) {
                super.onActivityResult(i14, i15, intent);
                return;
            }
            intent.getClass();
            String stringExtra = intent.getStringExtra("GCM_extra_privacy_type");
            am.l.f4047c.getClass();
            am.l lVarA = am.l.a.a(stringExtra, am.l.f4051g);
            UserRankDTO userRankDTO = this.f41407r;
            ArrayList arrayList = userRankDTO != null ? userRankDTO.f41269w : null;
            if (userRankDTO == null || arrayList == null) {
                return;
            }
            com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = new com.garmin.android.apps.connectmobile.activities.newmodel.h();
            hVar.f29448a = ((SegmentLeaderboardRowDTO) arrayList.get(0)).f41236l;
            hVar.Z(lVarA);
            ag1.a aVar = (ag1.a) KoinJavaComponent.get$default(ag1.a.class, null, null, 6, null);
            showProgressOverlay();
            aVar.n(hVar, new cg1.p(this, lVarA));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.segments.presentation.a, com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_segment_details);
        initActionBar(true, "");
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_refresh_layout);
        this.C = swipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener(this);
        }
        SwipeRefreshLayout swipeRefreshLayout2 = this.C;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setOnChildScrollUpCallback(new bd0.e(this, 5));
        }
        this.D = (TextView) findViewById(R.id.error_state_message);
        this.f41413z = (c0) new x1(this).b(s0.f105811a.b(c0.class));
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f41403n = extras.getString("GCM_extra_segment_id");
        }
        this.f41404o = getString(R.string.no_value);
        if (extras != null && extras.containsKey("GCM_extra_segment_data")) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras.getParcelable("GCM_extra_segment_data", bg1.a.class);
            } else {
                Parcelable parcelable2 = extras.getParcelable("GCM_extra_segment_data");
                if (!(parcelable2 instanceof bg1.a)) {
                    parcelable2 = null;
                }
                parcelable = (bg1.a) parcelable2;
            }
            bg1.a aVar = (bg1.a) parcelable;
            this.P = aVar;
            if (aVar != null) {
                this.f41403n = aVar.f17841f;
                aVar.getClass();
                initActionBar(true, aVar.f17838c);
            }
        }
        if (TextUtils.isEmpty(this.f41403n)) {
            i2.a.j(i2.f36769a, "SegmentDetailsActivity", "Missing segment id");
            finish();
            return;
        }
        this.Y = new m10.b(this, this, this);
        View viewFindViewById = findViewById(R.id.segment_detail_top_section_layout);
        viewFindViewById.getClass();
        f.a aVar2 = new f.a(viewFindViewById);
        this.f41397h = aVar2;
        aVar2.a();
        if (!this.I) {
            o oVar = new o(this, 2);
            o oVar2 = new o(this, 3);
            f.a aVar3 = this.f41397h;
            aVar3.getClass();
            int i14 = f.f41440a;
            do1.p pVar = aVar3.f41441a;
            pVar.f60610a.setOnClickListener(oVar);
            pVar.f60611b.setOnClickListener(oVar);
            aVar3.f41444d.setOnClickListener(oVar2);
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.segments_view_leaderboard_container);
        this.f41398i = viewGroup;
        viewGroup.getClass();
        this.f41399j = new s(viewGroup);
        findViewById(R.id.segments_view_view_leaderboard).setOnClickListener(this.E);
        this.f41400k = (TextView) findViewById(R.id.segments_no_leaderboard_available_label);
        pa();
        sa(this.T);
        ua(this.X);
        ta(this.f41406q, this.X);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.segment_details, menu);
        this.f41401l = menu.findItem(R.id.menu_item_favorite);
        this.f41402m = menu.findItem(R.id.menu_item_send_to_device);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        ArrayList arrayList;
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId != R.id.menu_item_favorite) {
            if (itemId != R.id.menu_item_send_to_device || (arrayList = this.f41420f) == null || arrayList.size() <= 0) {
                return super.onOptionsItemSelected(menuItem);
            }
            ((ag1.a) KoinJavaComponent.get$default(ag1.a.class, null, null, 6, null)).o(this, 11);
            return true;
        }
        SegmentDetailsDTO segmentDetailsDTO = this.T;
        if (segmentDetailsDTO != null) {
            String strValueOf = String.valueOf(segmentDetailsDTO.f17837b);
            SegmentDetailsDTO segmentDetailsDTO2 = this.T;
            segmentDetailsDTO2.getClass();
            boolean z14 = segmentDetailsDTO2.f17840e;
            c0 c0Var = this.f41413z;
            if (z14) {
                c0Var.getClass();
                strValueOf.getClass();
                f0.N(new a0(c0Var, strValueOf, null)).f(this, new c(new j(this, 2)));
            } else {
                c0Var.getClass();
                strValueOf.getClass();
                f0.N(new v(c0Var, strValueOf, null)).f(this, new c(new j(this, 3)));
            }
        }
        MenuItem menuItem2 = this.f41401l;
        menuItem2.getClass();
        menuItem2.setEnabled(false);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        List<SegmentLeaderboardRowDTO> list;
        menu.getClass();
        MenuItem menuItem = this.f41401l;
        menuItem.getClass();
        boolean z14 = false;
        menuItem.setVisible(this.f41405p != null);
        if (this.f41405p != null) {
            MenuItem menuItem2 = this.f41401l;
            menuItem2.getClass();
            SegmentDetailsDTO segmentDetailsDTO = this.f41405p;
            segmentDetailsDTO.getClass();
            menuItem2.setTitle(segmentDetailsDTO.f17840e ? R.string.activity_unfavorite_icon_title : R.string.activity_favorite_icon_title);
            MenuItem menuItem3 = this.f41401l;
            menuItem3.getClass();
            SegmentDetailsDTO segmentDetailsDTO2 = this.f41405p;
            segmentDetailsDTO2.getClass();
            menuItem3.setIcon(segmentDetailsDTO2.f17840e ? R.drawable.star_filled : R.drawable.star_outlined);
        }
        MenuItem menuItem4 = this.f41402m;
        menuItem4.getClass();
        SegmentLeaderboardDTO segmentLeaderboardDTO = this.f41406q;
        int size = (segmentLeaderboardDTO == null || (list = segmentLeaderboardDTO.f41223d) == null) ? 0 : list.size();
        if (com.garmin.android.apps.connectmobile.segments.presentation.a.ma(this.f41405p) && size > 0) {
            rd2.f.a().f152045a.getClass();
            ArrayList arrayListE = rd2.j.e();
            if (arrayListE != null && !arrayListE.isEmpty()) {
                int size2 = arrayListE.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    sd2.f fVar = (sd2.f) arrayListE.get(i14);
                    boolean zI = km2.a.i(fVar.getUnitID(), null, SupportedCapability.SEGMENTS.ordinal());
                    if (fVar.u3() || zI) {
                        z14 = true;
                        break;
                    }
                }
            }
        }
        menuItem4.setVisible(z14);
        return true;
    }

    public final void pa() {
        if (this.T == null) {
            c0 c0Var = this.f41413z;
            c0Var.getClass();
            String str = this.f41403n;
            str.getClass();
            f0.N(new x(c0Var, str, Boolean.TRUE, null)).f(this, new c(new j(this, 4)));
        }
        if (this.X == null) {
            c0 c0Var2 = this.f41413z;
            c0Var2.getClass();
            String str2 = this.f41403n;
            str2.getClass();
            String userDisplayName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName();
            userDisplayName.getClass();
            f0.N(new y(c0Var2, str2, userDisplayName, null)).f(this, new c(new j(this, 5)));
        }
        if (this.f41406q == null) {
            SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO = new SegmentLeaderboardFilterDTO(this.f41403n);
            segmentLeaderboardFilterDTO.f41292g = 1;
            segmentLeaderboardFilterDTO.f41293h = 3;
            c0 c0Var3 = this.f41413z;
            c0Var3.getClass();
            f0.N(new b0(c0Var3, segmentLeaderboardFilterDTO, null)).f(this, new c(new j(this, 0)));
        }
    }

    public final void qa() {
        if (isFinishing()) {
            return;
        }
        mo1.d dVar = this.f41408t;
        this.f41408t = dVar;
        if (this.I) {
            return;
        }
        f.a aVar = this.f41397h;
        aVar.getClass();
        int i14 = f.f41440a;
        TextView textView = aVar.f41444d;
        do1.p pVar = aVar.f41441a;
        if (dVar == null) {
            pVar.a(0, false);
            return;
        }
        boolean zF = dVar.getLikedByUser();
        pVar.a(dVar.getNumberOfLikes(), zF);
        textView.setVisibility(0);
        textView.setText(getString(zF ? R.string.lbl_unlike : R.string.lbl_like));
        textView.setEnabled(true);
    }

    public final void ra(boolean z14) {
        if (isFinishing()) {
            return;
        }
        MenuItem menuItem = this.f41401l;
        if (menuItem != null) {
            menuItem.setEnabled(true);
        }
        SegmentDetailsDTO segmentDetailsDTO = this.f41405p;
        if (segmentDetailsDTO != null) {
            this.f41412y = true;
            segmentDetailsDTO.f17840e = z14;
            invalidateOptionsMenu();
        }
    }

    public final void sa(SegmentDetailsDTO segmentDetailsDTO) {
        ArrayList arrayList;
        float f14;
        String strValueOf;
        UserRankDTO userRankDTO;
        SegmentDetailsActivity segmentDetailsActivity = this;
        segmentDetailsActivity.f41405p = segmentDetailsDTO;
        if (segmentDetailsDTO != null) {
            segmentDetailsActivity.initActionBar(true, segmentDetailsDTO.f17838c);
        }
        f.a aVar = segmentDetailsActivity.f41397h;
        aVar.getClass();
        f.a(segmentDetailsActivity, aVar, segmentDetailsDTO);
        f.a aVar2 = segmentDetailsActivity.f41397h;
        aVar2.getClass();
        if (segmentDetailsActivity.f41408t == null && ((userRankDTO = segmentDetailsActivity.f41407r) == null || userRankDTO.f41250b <= 0 || segmentDetailsActivity.I)) {
            aVar2.a();
        } else {
            aVar2.f41444d.setVisibility(0);
        }
        SegmentDetailsDTO segmentDetailsDTO2 = segmentDetailsActivity.f41405p;
        ComposeView composeView = (ComposeView) segmentDetailsActivity.findViewById(R.id.segment_details_stats);
        boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
        l3.f23124b.getClass();
        String strE1 = l3.a.E1(segmentDetailsActivity, zY, true);
        String strH1 = l3.a.H1(segmentDetailsActivity, zY);
        if (composeView != null) {
            composeView.setContent(new z3.e(-727652685, true, new k(segmentDetailsActivity, strE1, segmentDetailsDTO2, strH1, 0)));
        }
        SegmentDetailsDTO segmentDetailsDTO3 = segmentDetailsActivity.f41405p;
        View viewFindViewById = segmentDetailsActivity.findViewById(R.id.segmentActivityType);
        View viewFindViewById2 = segmentDetailsActivity.findViewById(R.id.segmentSegmentType);
        View viewFindViewById3 = segmentDetailsActivity.findViewById(R.id.segmentSurface);
        View viewFindViewById4 = segmentDetailsActivity.findViewById(R.id.segmentCrossedBy);
        View viewFindViewById5 = segmentDetailsActivity.findViewById(R.id.segmentActivities);
        viewFindViewById.getClass();
        String strA = segmentDetailsActivity.f41404o;
        strA.getClass();
        if (segmentDetailsDTO3 != null) {
            strA = dh.b.A(segmentDetailsActivity, am.z0.k(segmentDetailsDTO3.f17839d, x0.f4346x).f4360c);
        }
        a aVar3 = Z;
        a.a(aVar3, viewFindViewById, R.string.txt_activity_type, strA);
        viewFindViewById2.getClass();
        String string = segmentDetailsActivity.f41404o;
        string.getClass();
        if (segmentDetailsDTO3 != null) {
            xf1.e eVar = xf1.e.f190667d.get(segmentDetailsDTO3.f17845j);
            if (eVar == null) {
                eVar = xf1.e.TYPE_OTHER;
            }
            string = segmentDetailsActivity.getString(eVar.f190677b);
            string.getClass();
        }
        a.a(aVar3, viewFindViewById2, R.string.lbl_segment_segment_type, string);
        viewFindViewById3.getClass();
        String string2 = segmentDetailsActivity.f41404o;
        string2.getClass();
        if (segmentDetailsDTO3 != null) {
            xf1.o oVar = xf1.o.f190704c.get(segmentDetailsDTO3.f17844i);
            if (oVar == null) {
                oVar = xf1.o.TYPE_ALL;
            }
            string2 = segmentDetailsActivity.getString(oVar.f190713b);
            string2.getClass();
        }
        a.a(aVar3, viewFindViewById3, R.string.lbl_segment_surface, string2);
        viewFindViewById4.getClass();
        String string3 = segmentDetailsActivity.f41404o;
        string3.getClass();
        if (segmentDetailsDTO3 != null) {
            if (segmentDetailsDTO3.f41276o == 1) {
                segmentDetailsActivity.getString(R.string.lbl_segment_crossed_by_one_person);
            } else {
                string3 = segmentDetailsActivity.getString(R.string.lbl_segment_crossed_by_people, NumberFormat.getInstance().format(segmentDetailsDTO3.f41276o));
                string3.getClass();
            }
        }
        a.a(aVar3, viewFindViewById4, R.string.lbl_segment_crossed_by, string3);
        viewFindViewById5.getClass();
        String str = segmentDetailsActivity.f41404o;
        str.getClass();
        if (segmentDetailsDTO3 != null && (strValueOf = String.valueOf(segmentDetailsDTO3.f41275n)) != null) {
            str = strValueOf;
        }
        a.a(aVar3, viewFindViewById5, R.string.concept_activities, str);
        SegmentDetailsDTO segmentDetailsDTO4 = segmentDetailsActivity.f41405p;
        LinearLayout linearLayout = (LinearLayout) segmentDetailsActivity.findViewById(R.id.segmentChartLayout);
        if (segmentDetailsDTO4 == null || ((arrayList = segmentDetailsDTO4.f41283x) != null && arrayList.isEmpty())) {
            linearLayout.removeAllViews();
        } else {
            linearLayout.removeAllViews();
            boolean zY2 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
            List list = segmentDetailsDTO4.f41283x;
            Iterator it = (list != null ? p13.x.i(list) : j0.f134944a).iterator();
            double d14 = 0.0d;
            double d15 = 0.0d;
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                com.garmin.android.apps.connectmobile.segments.model.a aVar4 = list != null ? (com.garmin.android.apps.connectmobile.segments.model.a) list.get(iIntValue) : null;
                if (iIntValue == 0) {
                    d14 = aVar4 != null ? aVar4.f41343c : 0.0d;
                    d15 = d14;
                }
                if (d14 > (aVar4 != null ? aVar4.f41343c : 0.0d)) {
                    d14 = aVar4 != null ? aVar4.f41343c : 0.0d;
                }
                if (d15 < (aVar4 != null ? aVar4.f41343c : 0.0d)) {
                    d15 = aVar4 != null ? aVar4.f41343c : 0.0d;
                }
            }
            o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
            ComposeView composeView2 = (ComposeView) segmentDetailsActivity.findViewById(R.id.segments_elevation_stats);
            if (composeView2 != null) {
                segmentDetailsActivity = this;
                composeView2.setContent(new z3.e(1381820724, true, new cg1.l(o0VarG, d14, this, d15, 0)));
            }
            String string4 = segmentDetailsActivity.getString(zY2 ? R.string.lbl_km : R.string.lbl_mile);
            string4.getClass();
            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
            String str2 = String.format("%s (%s)", Arrays.copyOf(new Object[]{segmentDetailsActivity.getString(R.string.lbl_distance), string4}, 2));
            if (list == null) {
                list = j0.f134944a;
            }
            LineChart lineChart = new LineChart(segmentDetailsActivity);
            dg1.a aVar5 = new dg1.a(segmentDetailsActivity, lineChart);
            LineChart lineChart2 = aVar5.f59516a;
            lineChart2.getDescription().setEnabled(false);
            lineChart2.getF31342c().setEnabled(false);
            lineChart2.setTouchEnabled(false);
            lineChart2.setPinchZoom(false);
            lineChart2.setDrawGridBackground(false);
            lineChart2.setNoDataText("");
            lineChart2.setExtraBottomOffset(Utils.convertPixelsToDp(lineChart2.getContext().getResources().getDimension(R.dimen.gcm3_chart_margin_bottom)));
            lineChart2.setExtraLeftOffset(Utils.convertPixelsToDp(lineChart2.getContext().getResources().getDimension(R.dimen.gcm3_chart_margin_right)));
            XAxis xAxis = lineChart2.getXAxis();
            xAxis.setDrawGridLines(false);
            xAxis.setDrawAxisLine(false);
            xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
            int i14 = aVar5.f59517b;
            xAxis.setAxisLineColor(i14);
            xAxis.setTextColor(i14);
            float f15 = 10.0f;
            xAxis.setTextSize(10.0f);
            xAxis.setValueFormatter(new dg1.b(lineChart2));
            YAxis axisRight = lineChart2.getAxisRight();
            axisRight.setDrawAxisLine(false);
            axisRight.setDrawGridLines(false);
            axisRight.setDrawLabels(false);
            YAxis axisLeft = lineChart2.getAxisLeft();
            axisLeft.setDrawAxisLine(false);
            axisLeft.setDrawGridLines(false);
            axisLeft.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
            axisLeft.setAxisLineColor(i14);
            axisLeft.setTextColor(i14);
            axisLeft.setTextSize(10.0f);
            axisLeft.setLabelCount(6, false);
            axisLeft.setValueFormatter(new dg1.c(aVar5));
            ViewPortHandler viewPortHandler = lineChart2.getViewPortHandler();
            viewPortHandler.getClass();
            XAxis xAxis2 = lineChart2.getXAxis();
            xAxis2.getClass();
            Transformer transformer = lineChart2.getTransformer(YAxis.AxisDependency.LEFT);
            transformer.getClass();
            lineChart2.setXAxisRenderer(new h00.j(viewPortHandler, xAxis2, transformer, null, false, null, 56, null));
            list.getClass();
            if (list.isEmpty()) {
                f14 = 10.0f;
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (Iterator it3 = list.iterator(); it3.hasNext(); it3 = it3) {
                    com.garmin.android.apps.connectmobile.segments.model.a aVar6 = (com.garmin.android.apps.connectmobile.segments.model.a) it3.next();
                    arrayList2.add(new Entry((float) (aVar6.f41344d * ((double) 1000)), (float) aVar6.f41343c));
                    f15 = f15;
                }
                f14 = f15;
                LineDataSet lineDataSet = new LineDataSet(arrayList2, "SegmentElevationChart");
                lineDataSet.setDrawValues(false);
                lineDataSet.setDrawFilled(true);
                lineDataSet.setDrawCircles(false);
                lineDataSet.setAxisDependency(YAxis.AxisDependency.LEFT);
                int i15 = aVar5.f59519d;
                lineDataSet.setColor(i15);
                lineDataSet.setFillDrawable(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{aVar5.f59518c, i15}));
                lineChart2.setData(new LineData(lineDataSet));
                lineChart2.invalidate();
                float yMin = lineChart2.getLineData().getYMin() - f14;
                float yMax = lineChart2.getLineData().getYMax() + f14;
                lineChart2.getAxisLeft().setAxisMinimum(dg1.a.a(yMin, 10));
                lineChart2.getAxisLeft().setAxisMaximum(dg1.a.a(yMax, 10));
            }
            linearLayout.addView(lineChart, new ViewGroup.LayoutParams(-1, (int) segmentDetailsActivity.getResources().getDimension(R.dimen.chart_height)));
            TextView textView = new TextView(segmentDetailsActivity);
            textView.setTextSize(2, f14);
            textView.setTextColor(a7.b.getColor(segmentDetailsActivity, R.color.gcm_text_secondary));
            textView.setText(str2);
            textView.setFocusable(false);
            textView.setImportantForAccessibility(2);
            linearLayout.addView(textView, new ViewGroup.LayoutParams(-2, -2));
        }
        SegmentDetailsDTO segmentDetailsDTO5 = segmentDetailsActivity.f41405p;
        e.f41438f.getClass();
        Bundle bundle = new Bundle();
        e eVar2 = new e();
        bundle.putParcelable("segment_detail", segmentDetailsDTO5);
        l2.f37135b.getClass();
        l2.a.c(eVar2, bundle);
        androidx.fragment.app.v supportFragmentManager = segmentDetailsActivity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar7 = new androidx.fragment.app.a(supportFragmentManager);
        aVar7.l(R.id.frag_stats_map, eVar2, null);
        aVar7.e();
        SegmentDetailsDTO segmentDetailsDTO6 = segmentDetailsActivity.f41405p;
        if (segmentDetailsDTO6 != null && com.garmin.android.apps.connectmobile.segments.presentation.a.ma(segmentDetailsDTO6)) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(segmentDetailsDTO6);
            segmentDetailsActivity.oa(arrayList3, true);
        }
        segmentDetailsActivity.invalidateOptionsMenu();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.r2
    public final void t8() {
        int i14 = this.f41410w - 1;
        this.f41410w = i14;
        if (i14 == 0) {
            hideProgressOverlay();
        }
    }

    public final void ta(SegmentLeaderboardDTO segmentLeaderboardDTO, UserRankDTO userRankDTO) {
        List<SegmentLeaderboardRowDTO> list;
        TextView textView;
        int i14;
        String string;
        String string2;
        TextView textView2;
        List<SegmentLeaderboardRowDTO> list2;
        this.f41406q = segmentLeaderboardDTO;
        if ((segmentLeaderboardDTO == null || (list2 = segmentLeaderboardDTO.f41223d) == null) ? false : !list2.isEmpty()) {
            ViewGroup viewGroup = this.f41398i;
            viewGroup.getClass();
            viewGroup.setVisibility(0);
            s sVar = this.f41399j;
            sVar.getClass();
            TextView textView3 = sVar.f27198t;
            ViewGroup viewGroup2 = sVar.f27195q;
            TextView textView4 = sVar.f27182d;
            ViewGroup viewGroup3 = sVar.f27179a;
            TextView textView5 = sVar.f27188j;
            TextView textView6 = sVar.f27187i;
            ViewGroup viewGroup4 = sVar.f27184f;
            TextView textView7 = sVar.f27193o;
            TextView textView8 = sVar.f27192n;
            ViewGroup viewGroup5 = sVar.f27189k;
            TextView textView9 = sVar.f27183e;
            if (segmentLeaderboardDTO != null && (list = segmentLeaderboardDTO.f41223d) != null && !list.isEmpty()) {
                Collections.sort(list, new a61.c(new c50.a(19), 2));
                oi0.h hVar = new oi0.h(this);
                int size = list.size();
                int i15 = 0;
                boolean z14 = false;
                while (true) {
                    textView = textView9;
                    if (i15 >= size) {
                        break;
                    }
                    final SegmentLeaderboardRowDTO segmentLeaderboardRowDTO = list.get(i15);
                    l3.a aVar = l3.f23124b;
                    List<SegmentLeaderboardRowDTO> list3 = list;
                    int i16 = size;
                    long j8 = segmentLeaderboardRowDTO.f41245w;
                    aVar.getClass();
                    String strB1 = l3.a.b1(j8);
                    if (i15 != 0) {
                        if (i15 == 1) {
                            if (p005kotlin.jvm.internal.s.g(segmentLeaderboardRowDTO.f41241q, ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName())) {
                                z14 = true;
                            }
                            viewGroup4.setVisibility(0);
                            final int i17 = 1;
                            viewGroup4.setOnClickListener(new View.OnClickListener() { // from class: cg1.r
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i17) {
                                        case 0:
                                            SegmentLeaderboardRowDTO segmentLeaderboardRowDTO2 = segmentLeaderboardRowDTO;
                                            ((ag1.a) KoinJavaComponent.get$default(ag1.a.class, null, null, 6, null)).j(this, segmentLeaderboardRowDTO2.f41241q, segmentLeaderboardRowDTO2.f41242r, segmentLeaderboardRowDTO2.f41240p);
                                            break;
                                        case 1:
                                            SegmentLeaderboardRowDTO segmentLeaderboardRowDTO3 = segmentLeaderboardRowDTO;
                                            ((ag1.a) KoinJavaComponent.get$default(ag1.a.class, null, null, 6, null)).j(this, segmentLeaderboardRowDTO3.f41241q, segmentLeaderboardRowDTO3.f41242r, segmentLeaderboardRowDTO3.f41240p);
                                            break;
                                        default:
                                            SegmentLeaderboardRowDTO segmentLeaderboardRowDTO4 = segmentLeaderboardRowDTO;
                                            ((ag1.a) KoinJavaComponent.get$default(ag1.a.class, null, null, 6, null)).j(this, segmentLeaderboardRowDTO4.f41241q, segmentLeaderboardRowDTO4.f41242r, segmentLeaderboardRowDTO4.f41240p);
                                            break;
                                    }
                                }
                            });
                            sVar.f27185g.setProfileImageData(new b12.b(segmentLeaderboardRowDTO.f41240p, null, null, null, null, 30, null));
                            if (TextUtils.isEmpty(segmentLeaderboardRowDTO.f41242r)) {
                                textView6.setText(!TextUtils.isEmpty(segmentLeaderboardRowDTO.f41241q) ? segmentLeaderboardRowDTO.f41241q : "");
                            } else {
                                textView6.setText(segmentLeaderboardRowDTO.f41242r);
                                s.a(this, textView6);
                            }
                            TextView textView10 = sVar.f27186h;
                            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                            Locale locale = Locale.getDefault();
                            String string3 = getString(R.string.format_decimal_value);
                            string3.getClass();
                            textView10.setText(String.format(locale, string3, Arrays.copyOf(new Object[]{Integer.valueOf(segmentLeaderboardRowDTO.f41239o)}, 1)));
                            textView5.setText(segmentLeaderboardRowDTO.f41245w > 0 ? strB1 : getString(R.string.no_value));
                            textView5.setContentDescription(hVar.d((int) (segmentLeaderboardRowDTO.f41245w / ((double) 1000)), false));
                        } else if (i15 == 2) {
                            if (p005kotlin.jvm.internal.s.g(segmentLeaderboardRowDTO.f41241q, ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName())) {
                                z14 = true;
                            }
                            viewGroup5.setVisibility(0);
                            final int i18 = 2;
                            viewGroup5.setOnClickListener(new View.OnClickListener() { // from class: cg1.r
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i18) {
                                        case 0:
                                            SegmentLeaderboardRowDTO segmentLeaderboardRowDTO2 = segmentLeaderboardRowDTO;
                                            ((ag1.a) KoinJavaComponent.get$default(ag1.a.class, null, null, 6, null)).j(this, segmentLeaderboardRowDTO2.f41241q, segmentLeaderboardRowDTO2.f41242r, segmentLeaderboardRowDTO2.f41240p);
                                            break;
                                        case 1:
                                            SegmentLeaderboardRowDTO segmentLeaderboardRowDTO3 = segmentLeaderboardRowDTO;
                                            ((ag1.a) KoinJavaComponent.get$default(ag1.a.class, null, null, 6, null)).j(this, segmentLeaderboardRowDTO3.f41241q, segmentLeaderboardRowDTO3.f41242r, segmentLeaderboardRowDTO3.f41240p);
                                            break;
                                        default:
                                            SegmentLeaderboardRowDTO segmentLeaderboardRowDTO4 = segmentLeaderboardRowDTO;
                                            ((ag1.a) KoinJavaComponent.get$default(ag1.a.class, null, null, 6, null)).j(this, segmentLeaderboardRowDTO4.f41241q, segmentLeaderboardRowDTO4.f41242r, segmentLeaderboardRowDTO4.f41240p);
                                            break;
                                    }
                                }
                            });
                            sVar.f27190l.setProfileImageData(new b12.b(segmentLeaderboardRowDTO.f41240p, null, null, null, null, 30, null));
                            if (TextUtils.isEmpty(segmentLeaderboardRowDTO.f41242r)) {
                                textView8.setText(!TextUtils.isEmpty(segmentLeaderboardRowDTO.f41241q) ? segmentLeaderboardRowDTO.f41241q : "");
                            } else {
                                textView8.setText(segmentLeaderboardRowDTO.f41242r);
                                s.a(this, textView8);
                            }
                            TextView textView11 = sVar.f27191m;
                            p005kotlin.jvm.internal.x0 x0Var2 = p005kotlin.jvm.internal.x0.f105818a;
                            Locale locale2 = Locale.getDefault();
                            String string4 = getString(R.string.format_decimal_value);
                            string4.getClass();
                            textView11.setText(String.format(locale2, string4, Arrays.copyOf(new Object[]{Integer.valueOf(segmentLeaderboardRowDTO.f41239o)}, 1)));
                            textView7.setText(segmentLeaderboardRowDTO.f41245w > 0 ? strB1 : getString(R.string.no_value));
                            textView7.setContentDescription(hVar.d((int) (segmentLeaderboardRowDTO.f41245w / ((double) 1000)), false));
                        }
                        textView2 = textView;
                    } else {
                        viewGroup5 = viewGroup5;
                        i15 = i15;
                        final int i19 = 0;
                        if (p005kotlin.jvm.internal.s.g(segmentLeaderboardRowDTO.f41241q, ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName())) {
                            z14 = true;
                        }
                        viewGroup3.setVisibility(0);
                        viewGroup3.setOnClickListener(new View.OnClickListener() { // from class: cg1.r
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i19) {
                                    case 0:
                                        SegmentLeaderboardRowDTO segmentLeaderboardRowDTO2 = segmentLeaderboardRowDTO;
                                        ((ag1.a) KoinJavaComponent.get$default(ag1.a.class, null, null, 6, null)).j(this, segmentLeaderboardRowDTO2.f41241q, segmentLeaderboardRowDTO2.f41242r, segmentLeaderboardRowDTO2.f41240p);
                                        break;
                                    case 1:
                                        SegmentLeaderboardRowDTO segmentLeaderboardRowDTO3 = segmentLeaderboardRowDTO;
                                        ((ag1.a) KoinJavaComponent.get$default(ag1.a.class, null, null, 6, null)).j(this, segmentLeaderboardRowDTO3.f41241q, segmentLeaderboardRowDTO3.f41242r, segmentLeaderboardRowDTO3.f41240p);
                                        break;
                                    default:
                                        SegmentLeaderboardRowDTO segmentLeaderboardRowDTO4 = segmentLeaderboardRowDTO;
                                        ((ag1.a) KoinJavaComponent.get$default(ag1.a.class, null, null, 6, null)).j(this, segmentLeaderboardRowDTO4.f41241q, segmentLeaderboardRowDTO4.f41242r, segmentLeaderboardRowDTO4.f41240p);
                                        break;
                                }
                            }
                        });
                        sVar.f27180b.setProfileImageData(new b12.b(segmentLeaderboardRowDTO.f41240p, null, null, null, null, 30, null));
                        if (TextUtils.isEmpty(segmentLeaderboardRowDTO.f41242r)) {
                            textView4.setText(!TextUtils.isEmpty(segmentLeaderboardRowDTO.f41241q) ? segmentLeaderboardRowDTO.f41241q : "");
                        } else {
                            textView4.setText(segmentLeaderboardRowDTO.f41242r);
                            s.a(this, textView4);
                        }
                        TextView textView12 = sVar.f27181c;
                        p005kotlin.jvm.internal.x0 x0Var3 = p005kotlin.jvm.internal.x0.f105818a;
                        Locale locale3 = Locale.getDefault();
                        String string5 = getString(R.string.format_decimal_value);
                        string5.getClass();
                        textView12.setText(String.format(locale3, string5, Arrays.copyOf(new Object[]{Integer.valueOf(segmentLeaderboardRowDTO.f41239o)}, 1)));
                        textView2 = textView;
                        textView2.setText(segmentLeaderboardRowDTO.f41245w > 0 ? strB1 : getString(R.string.no_value));
                        textView2.setContentDescription(hVar.d((int) (segmentLeaderboardRowDTO.f41245w / ((double) 1000)), false));
                    }
                    i15++;
                    textView9 = textView2;
                    list = list3;
                    size = i16;
                    viewGroup5 = viewGroup5;
                }
                if (!z14 && userRankDTO != null && userRankDTO.f41249a > 0) {
                    String userDisplayName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName();
                    String userFullName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserFullName();
                    f12.l.f68084a.getClass();
                    String strQ4 = f12.l.a.a().q4();
                    sVar.f27194p.setVisibility(0);
                    viewGroup2.setVisibility(0);
                    viewGroup2.setOnClickListener(new bv2.c((ag1.a) KoinJavaComponent.get$default(ag1.a.class, null, null, 6, null), this, userDisplayName, userFullName, strQ4, 1));
                    sVar.f27196r.setProfileImageData(new b12.b(strQ4, null, null, null, null, 30, null));
                    textView3.setText(p0.a(userFullName, userDisplayName));
                    s.a(this, textView3);
                    TextView textView13 = sVar.f27197s;
                    int i24 = userRankDTO.f41249a;
                    if (i24 > 0) {
                        string = Integer.toString(i24);
                        i14 = R.string.no_value;
                    } else {
                        i14 = R.string.no_value;
                        string = getString(R.string.no_value);
                    }
                    textView13.setText(string);
                    TextView textView14 = sVar.f27199u;
                    long j14 = userRankDTO.f41250b;
                    if (j14 > 0) {
                        l3.f23124b.getClass();
                        string2 = l3.a.b1(j14);
                    } else {
                        string2 = getString(i14);
                    }
                    textView14.setText(string2);
                    l3.a aVar2 = l3.f23124b;
                    double d14 = userRankDTO.f41250b;
                    aVar2.getClass();
                    textView.setContentDescription(hVar.d((int) (d14 / ((double) 1000)), false));
                }
            }
            TextView textView15 = this.f41400k;
            textView15.getClass();
            textView15.setVisibility(8);
        } else {
            TextView textView16 = this.f41400k;
            textView16.getClass();
            textView16.setVisibility(0);
            ViewGroup viewGroup6 = this.f41398i;
            viewGroup6.getClass();
            viewGroup6.setVisibility(8);
        }
        invalidateOptionsMenu();
    }

    public final void ua(UserRankDTO userRankDTO) {
        this.f41407r = userRankDTO;
        ArrayList arrayList = userRankDTO != null ? userRankDTO.f41269w : null;
        if (userRankDTO != null && arrayList != null) {
            PrivacyType.Companion companion = PrivacyType.INSTANCE;
            String str = ((SegmentLeaderboardRowDTO) arrayList.get(0)).f41246x;
            PrivacyType privacyType = PrivacyType.ONLY_ME;
            companion.getClass();
            this.f41409v = PrivacyType.Companion.a(str, privacyType);
        }
        Z.getClass();
        ArrayList arrayList2 = userRankDTO != null ? userRankDTO.f41269w : null;
        this.f41411x = (userRankDTO == null || arrayList2 == null || arrayList2.isEmpty()) ? -1L : ((SegmentLeaderboardRowDTO) arrayList2.get(0)).f41236l;
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.segments_view_my_best_time_section_container);
        ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.segments_view_my_best_time_container);
        if (this.f41411x >= 0) {
            viewGroup.setVisibility(0);
            TextView textView = (TextView) findViewById(R.id.segments_view_my_best_time_value);
            String string = getString(R.string.no_value);
            string.getClass();
            if (userRankDTO != null && userRankDTO.f41250b != 0) {
                ArrayList arrayList3 = userRankDTO.f41269w;
                if (arrayList3 == null || arrayList3.isEmpty() || ((SegmentLeaderboardRowDTO) arrayList3.get(0)).f41228d == null) {
                    l3.a aVar = l3.f23124b;
                    long j8 = userRankDTO.f41250b;
                    aVar.getClass();
                    string = l3.a.b1(j8);
                } else {
                    l3.a aVar2 = l3.f23124b;
                    long j14 = userRankDTO.f41250b;
                    aVar2.getClass();
                    string = getString(R.string.string_space_bullet_string_pattern, l3.a.b1(j14), u.a(userRankDTO));
                    string.getClass();
                }
            }
            textView.setText(string);
            oi0.h hVar = new oi0.h(this);
            userRankDTO.getClass();
            String strD = hVar.d(Math.round(userRankDTO.f41250b / 1000), false);
            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
            textView.setContentDescription(String.format("%s %s", Arrays.copyOf(new Object[]{strD, u.a(userRankDTO)}, 2)));
            viewGroup2.setOnClickListener(this.F);
        } else {
            viewGroup.setVisibility(8);
        }
        wa(this.f41409v);
    }

    public final void va(boolean z14) {
        TextView textView = this.D;
        if (textView != null) {
            v22.e.v(textView, z14);
        }
        if (z14) {
            initActionBar(true, R.string.txt_untitle);
        }
        View viewFindViewById = findViewById(R.id.segment_details_container);
        if (viewFindViewById != null) {
            v22.e.v(viewFindViewById, !z14);
        }
    }

    public final void wa(PrivacyType privacyType) {
        if (privacyType != null) {
            TextView textView = (TextView) findViewById(R.id.segments_view_activity_privacy_info);
            ImageView imageView = (ImageView) findViewById(R.id.segments_privacy_icon);
            if (c22.b.e(this)) {
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                Resources resources = getResources();
                resources.getClass();
                layoutParams.width = (int) c22.b.c(this, xy2.b.n(resources, 12.0f), 1.8f);
                ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                Resources resources2 = getResources();
                resources2.getClass();
                layoutParams2.height = (int) c22.b.c(this, xy2.b.n(resources2, 16.0f), 1.8f);
            }
            String string = getString(R.string.privacy_message_best_time, getString(privacyType.getF28797a()));
            string.getClass();
            String string2 = getString(R.string.lbl_edit_privacy);
            string2.getClass();
            SpannableString spannableString = new SpannableString(string.concat(string2));
            spannableString.setSpan(new d(), string.length(), spannableString.length(), 33);
            textView.setText(spannableString);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            int i14 = b.f41414a[privacyType.ordinal()];
            if (i14 == 1) {
                imageView.setImageResource(R.drawable.gcm3_only_me_privacy);
                imageView.setVisibility(0);
                textView.setVisibility(0);
            } else if (i14 == 2) {
                imageView.setImageResource(R.drawable.gcm3_connections_only_privacy);
                imageView.setVisibility(0);
                textView.setVisibility(0);
            } else if (i14 == 3) {
                imageView.setImageResource(R.drawable.gcm3_connections_groups_privacy);
                imageView.setVisibility(0);
                textView.setVisibility(0);
            } else {
                if (i14 != 4) {
                    return;
                }
                textView.setVisibility(8);
                imageView.setVisibility(8);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/presentation/SegmentDetailsActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "REQUEST_CODE_TARGET_DEVICE_SELECTION", "I", "ACTIVITY_PRIVACY_REQUEST_CODE", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static final void a(a aVar, View view2, int i14, String str) {
            aVar.getClass();
            TextView textView = (TextView) view2.findViewById(R.id.stats_row_label);
            TextView textView2 = (TextView) view2.findViewById(R.id.stats_row_value);
            textView.setText(i14);
            textView2.setText(str);
        }

        public static void b(Activity activity, bg1.a aVar, int i14) {
            Intent intent = new Intent(activity, (Class<?>) SegmentDetailsActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable("GCM_extra_segment_data", aVar);
            com.airbnb.lottie.animation.keyframe.a.q(l2.f37135b, intent, bundle);
            activity.startActivityForResult(intent, i14);
        }

        private a() {
        }
    }
}
