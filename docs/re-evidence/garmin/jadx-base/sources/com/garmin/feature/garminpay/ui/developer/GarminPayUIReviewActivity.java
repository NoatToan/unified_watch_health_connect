package com.garmin.feature.garminpay.ui.developer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.ui.devicesettings.DeviceSettingsActivity;
import com.garmin.feature.garminpay.ui.devicesettings.LostWatchActivity;
import com.garmin.feature.garminpay.ui.devicesettings.RapidPassSettingActivity;
import com.garmin.feature.garminpay.ui.devicesettings.RapidPassThresholdSettingActivity;
import com.garmin.feature.garminpay.ui.userwallet.UserWalletActivity;
import java.util.ArrayList;
import jr2.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/ui/developer/GarminPayUIReviewActivity;", "Li/c;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GarminPayUIReviewActivity extends i.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f51972a = 0;

    @Override // androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.simple_list);
        View viewFindViewById = findViewById(R.id.list);
        viewFindViewById.getClass();
        ListView listView = (ListView) viewFindViewById;
        a[] aVarArrValues = a.values();
        ArrayList arrayList = new ArrayList(aVarArrValues.length);
        for (a aVar : aVarArrValues) {
            arrayList.add(aVar.getF51980b());
        }
        listView.setAdapter((ListAdapter) new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList));
        listView.setOnItemClickListener(new n(this, aVarArrValues, 0));
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/developer/GarminPayUIReviewActivity$a;", "", "<init>", "(Ljava/lang/String;I)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a[] f51973a = {new d("DEVICE_SETTINGS", 0), new e("LOST_WATCH", 1), new f("RAPID_PASS_SETTING", 2), new c("CARD_CATEGORY_SELECTION", 3), new b("BUSINESS_OPERATOR_SELECTION", 4), new C1086a("BALANCE_NOTIFICATION_SETTING", 5), new g("USER_WALLET", 6)};

        /* JADX INFO: Fake field, exist only in values array */
        a EF5;

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.ui.developer.GarminPayUIReviewActivity$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/ui/developer/GarminPayUIReviewActivity.CommonPage.BALANCE_NOTIFICATION_SETTING", "Lcom/garmin/feature/garminpay/ui/developer/GarminPayUIReviewActivity$a;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C1086a extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f51974b;

            public C1086a(String str, int i14) {
                super(str, i14, null);
                this.f51974b = "Balance Notification Setting";
            }

            @Override // com.garmin.feature.garminpay.ui.developer.GarminPayUIReviewActivity.a
            public final Intent a(Context context) {
                qy2.c cVar = qy2.c.f148593a;
                Intent intent = new Intent(context, (Class<?>) RapidPassThresholdSettingActivity.class);
                cVar.getClass();
                qy2.c.a(intent);
                return intent;
            }

            @Override // com.garmin.feature.garminpay.ui.developer.GarminPayUIReviewActivity.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getF51980b() {
                return this.f51974b;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/ui/developer/GarminPayUIReviewActivity.CommonPage.BUSINESS_OPERATOR_SELECTION", "Lcom/garmin/feature/garminpay/ui/developer/GarminPayUIReviewActivity$a;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f51975b;

            public b(String str, int i14) {
                super(str, i14, null);
                this.f51975b = "Business Operator Selection";
            }

            @Override // com.garmin.feature.garminpay.ui.developer.GarminPayUIReviewActivity.a
            public final Intent a(Context context) {
                qy2.c cVar = qy2.c.f148593a;
                throw new IllegalStateException("TODO add UI review function to SelectOperatorActivity");
            }

            @Override // com.garmin.feature.garminpay.ui.developer.GarminPayUIReviewActivity.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getF51980b() {
                return this.f51975b;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/ui/developer/GarminPayUIReviewActivity.CommonPage.CARD_CATEGORY_SELECTION", "Lcom/garmin/feature/garminpay/ui/developer/GarminPayUIReviewActivity$a;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class c extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f51976b;

            public c(String str, int i14) {
                super(str, i14, null);
                this.f51976b = "Card Category Selection";
            }

            @Override // com.garmin.feature.garminpay.ui.developer.GarminPayUIReviewActivity.a
            public final Intent a(Context context) {
                qy2.c cVar = qy2.c.f148593a;
                throw new IllegalStateException("TODO add UI review function to SelectCategoryActivity");
            }

            @Override // com.garmin.feature.garminpay.ui.developer.GarminPayUIReviewActivity.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getF51980b() {
                return this.f51976b;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/ui/developer/GarminPayUIReviewActivity.CommonPage.DEVICE_SETTINGS", "Lcom/garmin/feature/garminpay/ui/developer/GarminPayUIReviewActivity$a;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class d extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f51977b;

            public d(String str, int i14) {
                super(str, i14, null);
                this.f51977b = "Device Settings";
            }

            @Override // com.garmin.feature.garminpay.ui.developer.GarminPayUIReviewActivity.a
            public final Intent a(Context context) {
                qy2.c cVar = qy2.c.f148593a;
                Intent intent = new Intent(context, (Class<?>) DeviceSettingsActivity.class);
                cVar.getClass();
                qy2.c.a(intent);
                return intent;
            }

            @Override // com.garmin.feature.garminpay.ui.developer.GarminPayUIReviewActivity.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getF51980b() {
                return this.f51977b;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/ui/developer/GarminPayUIReviewActivity.CommonPage.LOST_WATCH", "Lcom/garmin/feature/garminpay/ui/developer/GarminPayUIReviewActivity$a;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class e extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f51978b;

            public e(String str, int i14) {
                super(str, i14, null);
                this.f51978b = "Lost Watch";
            }

            @Override // com.garmin.feature.garminpay.ui.developer.GarminPayUIReviewActivity.a
            public final Intent a(Context context) {
                qy2.c cVar = qy2.c.f148593a;
                Intent intent = new Intent(context, (Class<?>) LostWatchActivity.class);
                cVar.getClass();
                qy2.c.a(intent);
                return intent;
            }

            @Override // com.garmin.feature.garminpay.ui.developer.GarminPayUIReviewActivity.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getF51980b() {
                return this.f51978b;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/ui/developer/GarminPayUIReviewActivity.CommonPage.RAPID_PASS_SETTING", "Lcom/garmin/feature/garminpay/ui/developer/GarminPayUIReviewActivity$a;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class f extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f51979b;

            public f(String str, int i14) {
                super(str, i14, null);
                this.f51979b = "Rapid Pass Setting";
            }

            @Override // com.garmin.feature.garminpay.ui.developer.GarminPayUIReviewActivity.a
            public final Intent a(Context context) {
                qy2.c cVar = qy2.c.f148593a;
                Intent intent = new Intent(context, (Class<?>) RapidPassSettingActivity.class);
                cVar.getClass();
                qy2.c.a(intent);
                return intent;
            }

            @Override // com.garmin.feature.garminpay.ui.developer.GarminPayUIReviewActivity.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getF51980b() {
                return this.f51979b;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/ui/developer/GarminPayUIReviewActivity.CommonPage.USER_WALLET", "Lcom/garmin/feature/garminpay/ui/developer/GarminPayUIReviewActivity$a;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class g extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f51980b;

            public g(String str, int i14) {
                super(str, i14, null);
                this.f51980b = "User Wallet";
            }

            @Override // com.garmin.feature.garminpay.ui.developer.GarminPayUIReviewActivity.a
            public final Intent a(Context context) {
                qy2.c cVar = qy2.c.f148593a;
                Intent intent = new Intent(context, (Class<?>) UserWalletActivity.class);
                cVar.getClass();
                qy2.c.a(intent);
                return intent;
            }

            @Override // com.garmin.feature.garminpay.ui.developer.GarminPayUIReviewActivity.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getF51980b() {
                return this.f51980b;
            }
        }

        public /* synthetic */ a(String str, int i14, j jVar) {
            this(str, i14);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f51973a.clone();
        }

        public abstract Intent a(Context context);

        /* JADX INFO: renamed from: b */
        public abstract String getF51980b();

        private a(String str, int i14) {
            super(str, i14);
        }
    }
}
