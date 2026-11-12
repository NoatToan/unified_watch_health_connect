package com.garmin.android.apps.connectmobile.view.privacy;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import b.s;
import b.u;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.garmin.android.apps.connectmobile.c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/privacy/PrivacySelectionActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PrivacySelectionActivity extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f47684c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a32.c<PrivacyType> f47685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f47686b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/view/privacy/PrivacySelectionActivity$b", "Lb/s;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends s {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ PrivacyType f47688e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PrivacyType privacyType) {
            super(true);
            this.f47688e = privacyType;
        }

        @Override // b.s
        public final void b() {
            PrivacySelectionActivity privacySelectionActivity = PrivacySelectionActivity.this;
            a32.c<PrivacyType> cVar = privacySelectionActivity.f47685a;
            if (cVar == null) {
                p005kotlin.jvm.internal.s.m("listAdapter");
                throw null;
            }
            PrivacyType privacyType = (PrivacyType) cVar.getItem(cVar.f929b);
            if (privacyType != this.f47688e) {
                Intent intent = new Intent();
                long longExtra = privacySelectionActivity.getIntent().getLongExtra("argActivityId", -1L);
                if (longExtra != -1) {
                    intent.putExtra("GCM_extra_activity_id", longExtra);
                }
                intent.putExtra("GCM_extra_privacy_type", privacyType.getCategoryAccessRule());
                privacySelectionActivity.setResult(-1, intent);
            } else {
                privacySelectionActivity.setResult(0, null);
            }
            b bVar = privacySelectionActivity.f47686b;
            if (bVar == null) {
                p005kotlin.jvm.internal.s.m("onBackPressedCallback");
                throw null;
            }
            bVar.f(false);
            privacySelectionActivity.getOnBackPressedDispatcher().d();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        List<PrivacyType> listD;
        Object serializableExtra;
        PrivacyType next;
        super.onCreate(bundle);
        setContentView(R.layout.gcm_list_view_generic);
        String stringExtra = getIntent().getStringExtra("argTitle");
        if (stringExtra == null) {
            stringExtra = "";
        }
        initActionBar(true, stringExtra);
        ListView listView = (ListView) findViewById(R.id.gcm_list);
        a32.c<PrivacyType> cVar = new a32.c<>(this);
        this.f47685a = cVar;
        listView.setAdapter((ListAdapter) cVar);
        listView.setDividerHeight(0);
        String stringExtra2 = getIntent().getStringExtra("argHeader");
        if (stringExtra2 != null) {
            TextView textView = (TextView) LayoutInflater.from(this).inflate(R.layout.privacy_type_description_row, (ViewGroup) listView, false).findViewById(R.id.description);
            textView.setText(stringExtra2);
            listView.addHeaderView(textView, null, false);
        }
        int[] intArrayExtra = getIntent().getIntArrayExtra("argPrivacyOptions");
        if (intArrayExtra != null) {
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i14 : intArrayExtra) {
                PrivacyType.INSTANCE.getClass();
                Iterator<PrivacyType> it = PrivacyType.getEntries().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (i14 != next.getId());
                arrayList.add(next);
            }
            listD = h0.Z(arrayList);
        } else {
            PrivacyType.INSTANCE.getClass();
            listD = PrivacyType.Companion.d();
        }
        Intent intent = getIntent();
        if (Build.VERSION.SDK_INT >= 33) {
            serializableExtra = intent != null ? intent.getSerializableExtra("argPrivacyValue", PrivacyType.class) : null;
        } else {
            Serializable serializableExtra2 = intent != null ? intent.getSerializableExtra("argPrivacyValue") : null;
            if (!(serializableExtra2 instanceof PrivacyType)) {
                serializableExtra2 = null;
            }
            serializableExtra = (PrivacyType) serializableExtra2;
        }
        serializableExtra.getClass();
        PrivacyType privacyType = (PrivacyType) serializableExtra;
        ArrayList<Integer> integerArrayListExtra = getIntent().getIntegerArrayListExtra("argHintsValue");
        if (integerArrayListExtra == null) {
            integerArrayListExtra = new ArrayList<>(y.r(listD, 10));
            Iterator<T> it3 = listD.iterator();
            while (it3.hasNext()) {
                integerArrayListExtra.add(Integer.valueOf(((PrivacyType) it3.next()).getF28798b()));
            }
        }
        a32.c<PrivacyType> cVar2 = this.f47685a;
        if (cVar2 == null) {
            p005kotlin.jvm.internal.s.m("listAdapter");
            throw null;
        }
        ArrayList arrayList2 = new ArrayList(y.r(listD, 10));
        Iterator<T> it4 = listD.iterator();
        while (it4.hasNext()) {
            arrayList2.add(Integer.valueOf(((PrivacyType) it4.next()).getF28797a()));
        }
        cVar2.a(listD, arrayList2, integerArrayListExtra, privacyType);
        this.f47686b = new b(privacyType);
        u onBackPressedDispatcher = getOnBackPressedDispatcher();
        b bVar = this.f47686b;
        if (bVar == null) {
            p005kotlin.jvm.internal.s.m("onBackPressedCallback");
            throw null;
        }
        onBackPressedDispatcher.b(bVar, this);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        getOnBackPressedDispatcher().d();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/privacy/PrivacySelectionActivity$a;", "", "<init>", "()V", "", "ARG_TITLE", "Ljava/lang/String;", "ARG_HEADER", "ARG_PRIVACY_VALUE", "ARG_HINTS", "ARG_ACTIVITY_ID", "ARG_PRIVACY_OPTIONS_ID", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, String str, String str2, PrivacyType privacyType, List list) {
            context.getClass();
            privacyType.getClass();
            list.getClass();
            Intent intent = new Intent(context, (Class<?>) PrivacySelectionActivity.class);
            intent.putExtra("argTitle", str);
            intent.putExtra("argHeader", str2);
            intent.putExtra("argPrivacyValue", privacyType);
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((PrivacyType) it.next()).getId()));
            }
            intent.putExtra("argPrivacyOptions", h0.a1(arrayList));
            return intent;
        }

        public static Intent b(a aVar, Context context, String str, PrivacyType privacyType, ArrayList arrayList, long j8) {
            PrivacyType.INSTANCE.getClass();
            List listD = PrivacyType.Companion.d();
            aVar.getClass();
            privacyType.getClass();
            listD.getClass();
            Intent intent = new Intent(context, (Class<?>) PrivacySelectionActivity.class);
            intent.putExtra("argTitle", str);
            intent.putExtra("argHeader", "");
            intent.putExtra("argPrivacyValue", privacyType);
            intent.putIntegerArrayListExtra("argHintsValue", arrayList);
            intent.putExtra("argActivityId", j8);
            ArrayList arrayList2 = new ArrayList(y.r(listD, 10));
            Iterator it = listD.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(((PrivacyType) it.next()).getId()));
            }
            intent.putExtra("argPrivacyOptions", h0.a1(arrayList2));
            return intent;
        }

        private a() {
        }
    }
}
