package com.garmin.android.apps.connectmobile.calendar.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.m;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import fw.p;
import o13.h;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\nB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/presentation/CalendarToDeviceSummaryActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Landroid/view/View;", "v", "", "onClick", "(Landroid/view/View;)V", "a", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CalendarToDeviceSummaryActivity extends com.garmin.android.apps.connectmobile.c implements View.OnClickListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f31052g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f31053a = new w1(s0.f105811a.b(ey.e.class), new e(this), new d(this), new f(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f31054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f31055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f31057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f31058f;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31059a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f31059a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f31060a;

        public c(l lVar) {
            lVar.getClass();
            this.f31060a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f31060a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f31060a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f31061a;

        public d(g gVar) {
            this.f31061a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f31061a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f31062a;

        public e(g gVar) {
            this.f31062a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f31062a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f31063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f31064b;

        public f(e23.a aVar, g gVar) {
            this.f31063a = aVar;
            this.f31064b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f31063a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f31064b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v14) {
        v14.getClass();
        m.a(null, new ey.d((ey.e) this.f31053a.getValue(), this.f31055c, null), 3).f(this, new c(new ds0.g(this, 27)));
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.calendar_send_to_device_summary);
        initActionBar(true, R.string.lbl_send_to_device);
        Intent intent = getIntent();
        intent.getClass();
        this.f31054b = intent.getStringExtra("extras.image.url");
        this.f31055c = intent.getLongExtra("extras.device.id", 0L);
        this.f31056d = intent.getIntExtra("extras.workout.count", 0);
        this.f31057e = intent.getStringExtra("extras.start.date");
        this.f31058f = intent.getStringExtra("extras.end.date");
        ImageView imageView = (ImageView) findViewById(R.id.device_image);
        zp0.c cVar = new zp0.c((androidx.fragment.app.m) this);
        cVar.f206565e = this.f31054b;
        cVar.f206570j = 2131231969;
        imageView.getClass();
        cVar.h(imageView);
        View viewFindViewById = findViewById(R.id.workout_number);
        viewFindViewById.getClass();
        String string = getString(R.string.workout_number_to_device);
        string.getClass();
        x0 x0Var = x0.f105818a;
        q6.f.y(new Object[]{String.valueOf(this.f31056d)}, 1, string, (TextView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.start_date);
        viewFindViewById2.getClass();
        String str = this.f31057e;
        DateTimeZone dateTimeZone = DateTimeZone.UTC;
        DateTime dateTimeL = j0.L(str, "yyyy-MM-dd", dateTimeZone);
        String string2 = getString(R.string.common_from_timestamp_with_first_letter_capital);
        string2.getClass();
        q6.f.y(new Object[]{j0.a(dateTimeL, 'M')}, 1, string2, (TextView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.end_date);
        viewFindViewById3.getClass();
        DateTime dateTimeL2 = j0.L(this.f31058f, "yyyy-MM-dd", dateTimeZone);
        String string3 = getString(R.string.common_to_timestamp_with_first_letter_capital);
        string3.getClass();
        q6.f.y(new Object[]{j0.a(dateTimeL2, 'M')}, 1, string3, (TextView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.send_now);
        viewFindViewById4.getClass();
        ((Button) viewFindViewById4).setOnClickListener(this);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() == 16908332) {
            setResult(0);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/presentation/CalendarToDeviceSummaryActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_IMAGE_URL", "EXTRA_DEVICE_ID", "EXTRA_WORKOUT_COUNT", "EXTRA_START_DATE", "EXTRA_END_DATE", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
