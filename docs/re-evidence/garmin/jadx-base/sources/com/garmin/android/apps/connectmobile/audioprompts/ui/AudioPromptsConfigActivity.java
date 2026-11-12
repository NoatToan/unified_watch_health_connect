package com.garmin.android.apps.connectmobile.audioprompts.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.SwitchCompat;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.audioprompts.ui.AudioPromptsConfigActivity;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import ig1.l0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import k32.l;
import lu.e;
import oi0.d;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.i;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/audioprompts/ui/AudioPromptsConfigActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lcom/garmin/android/apps/connectmobile/audioprompts/ui/a$b;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AudioPromptsConfigActivity extends c implements com.garmin.android.apps.connectmobile.audioprompts.ui.a.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f30253i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GCMComplexTwoLineButton f30254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SwitchCompat f30255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinearLayout f30256c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f30258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public lu.a f30259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public gu.b f30260g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f30257d = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.google.android.material.chip.a f30261h = new com.google.android.material.chip.a(this, 10);

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30262a;

        static {
            int[] iArr = new int[lu.a.values().length];
            try {
                iArr[lu.a.POWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[lu.a.PACE_SPEED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[lu.a.HEART_RATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f30262a = iArr;
        }
    }

    static {
        new a(null);
    }

    public static void ca(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((l) it.next()).f(false);
        }
    }

    public final void da(LinearLayout linearLayout, List<? extends lu.c> list, lu.c cVar) {
        LayoutInflater layoutInflater = getLayoutInflater();
        layoutInflater.getClass();
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        linearLayout.addView(layoutInflater.inflate(R.layout.gcm_divider_line_thin, (ViewGroup) linearLayout, false));
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            View viewInflate = layoutInflater.inflate(R.layout.gcm_row_item, (ViewGroup) linearLayout, false);
            View viewInflate2 = layoutInflater.inflate(R.layout.gcm_divider_line_thin, (ViewGroup) linearLayout, false);
            viewInflate.getClass();
            l lVar = new l(viewInflate);
            lu.c cVar2 = list.get(i14);
            lVar.a(cVar2.f114933a, null);
            lVar.c(2131232298, null, null, null);
            lVar.f(cVar2 == cVar);
            arrayList.add(viewInflate);
            arrayList2.add(lVar);
            linearLayout.addView(viewInflate);
            linearLayout.addView(viewInflate2);
        }
        List<? extends lu.c> list2 = list;
        int size2 = list2.size();
        int i15 = 0;
        while (i15 < size2) {
            ((View) arrayList.get(i15)).setOnClickListener(new ou.b(this, arrayList2, list2, i15, 1));
            i15++;
            list2 = list;
        }
    }

    public final void ea(boolean z14) {
        SwitchCompat switchCompat = this.f30255b;
        if (z14) {
            switchCompat.getClass();
            switchCompat.setChecked(true);
            LinearLayout linearLayout = this.f30256c;
            linearLayout.getClass();
            linearLayout.setVisibility(0);
            return;
        }
        switchCompat.getClass();
        switchCompat.setChecked(false);
        LinearLayout linearLayout2 = this.f30256c;
        linearLayout2.getClass();
        linearLayout2.setVisibility(8);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        final AudioPromptsConfigActivity audioPromptsConfigActivity = this;
        super.onCreate(bundle);
        Bundle extras = audioPromptsConfigActivity.getIntent().getExtras();
        if (extras != null) {
            audioPromptsConfigActivity.f30257d = extras.getLong("GCM_deviceUnitID", -1L);
            audioPromptsConfigActivity.f30258e = extras.getString("extra.type.enum.name", "HEART_RATE");
        }
        boolean z14 = false;
        if (audioPromptsConfigActivity.f30257d == -1) {
            Toast.makeText(audioPromptsConfigActivity, audioPromptsConfigActivity.getString(R.string.txt_something_went_wrong_try_again), 0).show();
            audioPromptsConfigActivity.finish();
        }
        audioPromptsConfigActivity.setContentView(R.layout.gcm_audio_prompts_config);
        audioPromptsConfigActivity.f30260g = (gu.b) KoinJavaComponent.get$default(gu.b.class, null, null, 6, null);
        View viewFindViewById = audioPromptsConfigActivity.findViewById(R.id.alert_switch_layout);
        TextView textView = (TextView) audioPromptsConfigActivity.findViewById(R.id.alert_type_switch_description);
        audioPromptsConfigActivity.f30256c = (LinearLayout) audioPromptsConfigActivity.findViewById(R.id.alert_body_layout);
        SwitchCompat switchCompat = (SwitchCompat) audioPromptsConfigActivity.findViewById(R.id.alertSwitch);
        audioPromptsConfigActivity.f30255b = switchCompat;
        if (switchCompat != null) {
            switchCompat.setOnCheckedChangeListener(audioPromptsConfigActivity.f30261h);
        }
        final int i14 = 0;
        viewFindViewById.setOnClickListener(new View.OnClickListener(audioPromptsConfigActivity) { // from class: ou.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AudioPromptsConfigActivity f133948b;

            {
                this.f133948b = audioPromptsConfigActivity;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i15 = i14;
                AudioPromptsConfigActivity audioPromptsConfigActivity2 = this.f133948b;
                switch (i15) {
                    case 0:
                        SwitchCompat switchCompat2 = audioPromptsConfigActivity2.f30255b;
                        if (switchCompat2 != null) {
                            switchCompat2.performClick();
                        }
                        break;
                    default:
                        int i16 = AudioPromptsConfigActivity.f30253i;
                        com.garmin.android.apps.connectmobile.audioprompts.ui.a.C0474a c0474a = com.garmin.android.apps.connectmobile.audioprompts.ui.a.f30275e;
                        long j8 = audioPromptsConfigActivity2.f30257d;
                        String str = audioPromptsConfigActivity2.f30258e;
                        str.getClass();
                        c0474a.getClass();
                        com.garmin.android.apps.connectmobile.audioprompts.ui.a aVar = new com.garmin.android.apps.connectmobile.audioprompts.ui.a();
                        Bundle bundle2 = new Bundle(2);
                        bundle2.putLong("GCM_deviceUnitID", j8);
                        bundle2.putString("extra.type.enum.name", str);
                        aVar.setArguments(bundle2);
                        aVar.show(audioPromptsConfigActivity2.getSupportFragmentManager(), (String) null);
                        break;
                }
            }
        });
        TextView textView2 = (TextView) audioPromptsConfigActivity.findViewById(R.id.alertTextViewLabel);
        TextView textView3 = (TextView) audioPromptsConfigActivity.findViewById(R.id.list_view_description);
        GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) audioPromptsConfigActivity.findViewById(R.id.alert_frequency);
        audioPromptsConfigActivity.f30254a = gCMComplexTwoLineButton;
        if (gCMComplexTwoLineButton != null) {
            final int i15 = 1;
            gCMComplexTwoLineButton.setOnClickListener(new View.OnClickListener(audioPromptsConfigActivity) { // from class: ou.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AudioPromptsConfigActivity f133948b;

                {
                    this.f133948b = audioPromptsConfigActivity;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i16 = i15;
                    AudioPromptsConfigActivity audioPromptsConfigActivity2 = this.f133948b;
                    switch (i16) {
                        case 0:
                            SwitchCompat switchCompat2 = audioPromptsConfigActivity2.f30255b;
                            if (switchCompat2 != null) {
                                switchCompat2.performClick();
                            }
                            break;
                        default:
                            int i17 = AudioPromptsConfigActivity.f30253i;
                            com.garmin.android.apps.connectmobile.audioprompts.ui.a.C0474a c0474a = com.garmin.android.apps.connectmobile.audioprompts.ui.a.f30275e;
                            long j8 = audioPromptsConfigActivity2.f30257d;
                            String str = audioPromptsConfigActivity2.f30258e;
                            str.getClass();
                            c0474a.getClass();
                            com.garmin.android.apps.connectmobile.audioprompts.ui.a aVar = new com.garmin.android.apps.connectmobile.audioprompts.ui.a();
                            Bundle bundle2 = new Bundle(2);
                            bundle2.putLong("GCM_deviceUnitID", j8);
                            bundle2.putString("extra.type.enum.name", str);
                            aVar.setArguments(bundle2);
                            aVar.show(audioPromptsConfigActivity2.getSupportFragmentManager(), (String) null);
                            break;
                    }
                }
            });
        }
        LinearLayout linearLayout = (LinearLayout) audioPromptsConfigActivity.findViewById(android.R.id.list);
        gu.b bVar = audioPromptsConfigActivity.f30260g;
        bVar.getClass();
        audioPromptsConfigActivity.f30259f = bVar.o(audioPromptsConfigActivity.f30258e);
        gu.b bVar2 = audioPromptsConfigActivity.f30260g;
        bVar2.getClass();
        String strF = bVar2.f(audioPromptsConfigActivity.f30257d, audioPromptsConfigActivity.f30259f);
        String strA = d.a(audioPromptsConfigActivity, strF, new l0(2));
        lu.a aVar = audioPromptsConfigActivity.f30259f;
        int i16 = aVar == null ? -1 : b.f30262a[aVar.ordinal()];
        int i17 = R.layout.gcm_divider_line_thin;
        if (i16 == 1) {
            audioPromptsConfigActivity.initActionBar(true, R.string.audio_prompts_power_alerts_title);
            gu.b bVar3 = audioPromptsConfigActivity.f30260g;
            bVar3.getClass();
            audioPromptsConfigActivity.ea(bVar3.m(audioPromptsConfigActivity.f30257d, audioPromptsConfigActivity.f30259f));
            textView.setVisibility(0);
            textView3.setVisibility(8);
            textView2.setText(audioPromptsConfigActivity.getString(R.string.audio_prompts_power_alerts_title));
            GCMComplexTwoLineButton gCMComplexTwoLineButton2 = audioPromptsConfigActivity.f30254a;
            if (gCMComplexTwoLineButton2 != null) {
                gCMComplexTwoLineButton2.b(strF, strA);
            }
            gu.b bVar4 = audioPromptsConfigActivity.f30260g;
            bVar4.getClass();
            e eVarK = bVar4.k(audioPromptsConfigActivity.f30257d);
            linearLayout.getClass();
            e.f114944d.getClass();
            e[] eVarArr = (e[]) e.f114949i.toArray(new e[0]);
            List listAsList = Arrays.asList(Arrays.copyOf(eVarArr, eVarArr.length));
            listAsList.getClass();
            LayoutInflater layoutInflater = audioPromptsConfigActivity.getLayoutInflater();
            layoutInflater.getClass();
            ArrayList arrayList = new ArrayList(org.apache.commons.lang3.e.c(2, 1, listAsList));
            ArrayList arrayList2 = new ArrayList(listAsList.size());
            boolean z15 = false;
            int i18 = R.layout.gcm_divider_line_thin;
            linearLayout.addView(layoutInflater.inflate(R.layout.gcm_divider_line_thin, (ViewGroup) linearLayout, false));
            int size = listAsList.size();
            int i19 = 0;
            while (i19 < size) {
                View viewInflate = layoutInflater.inflate(R.layout.gcm_row_item, linearLayout, z15);
                View viewInflate2 = layoutInflater.inflate(i18, linearLayout, z15);
                viewInflate.getClass();
                l lVar = new l(viewInflate);
                e eVar = (e) listAsList.get(i19);
                lVar.a(eVar.f114950a, Integer.valueOf(eVar.f114951b));
                lVar.c(2131232298, null, null, null);
                lVar.f(eVar == eVarK);
                arrayList.add(viewInflate);
                arrayList2.add(lVar);
                linearLayout.addView(viewInflate);
                linearLayout.addView(viewInflate2);
                i19++;
                z15 = false;
                i18 = R.layout.gcm_divider_line_thin;
            }
            int size2 = listAsList.size();
            int i24 = 0;
            while (i24 < size2) {
                ArrayList arrayList3 = arrayList2;
                ((View) arrayList.get(i24)).setOnClickListener(new ou.b(audioPromptsConfigActivity, arrayList3, listAsList, i24, 0));
                i24++;
                audioPromptsConfigActivity = this;
                arrayList2 = arrayList3;
            }
            return;
        }
        if (i16 != 2) {
            if (i16 != 3) {
                audioPromptsConfigActivity.initActionBar(true, R.string.hr_alerts_setting_title);
                gu.b bVar5 = audioPromptsConfigActivity.f30260g;
                bVar5.getClass();
                audioPromptsConfigActivity.ea(bVar5.m(audioPromptsConfigActivity.f30257d, audioPromptsConfigActivity.f30259f));
                textView2.setText(audioPromptsConfigActivity.getString(R.string.hr_alerts_setting_title));
                GCMComplexTwoLineButton gCMComplexTwoLineButton3 = audioPromptsConfigActivity.f30254a;
                if (gCMComplexTwoLineButton3 != null) {
                    gCMComplexTwoLineButton3.b(strF, strA);
                }
                gu.b bVar6 = audioPromptsConfigActivity.f30260g;
                bVar6.getClass();
                lu.c cVarE = bVar6.e(audioPromptsConfigActivity.f30257d);
                linearLayout.getClass();
                lu.c.f114926c.getClass();
                w13.c cVar = lu.c.f114932i;
                cVar.getClass();
                lu.c[] cVarArr = (lu.c[]) i.d(cVar, new lu.c[0]);
                List<? extends lu.c> listAsList2 = Arrays.asList(Arrays.copyOf(cVarArr, cVarArr.length));
                listAsList2.getClass();
                audioPromptsConfigActivity.da(linearLayout, listAsList2, cVarE);
                return;
            }
            audioPromptsConfigActivity.initActionBar(true, R.string.hr_alerts_setting_title);
            gu.b bVar7 = audioPromptsConfigActivity.f30260g;
            bVar7.getClass();
            audioPromptsConfigActivity.ea(bVar7.m(audioPromptsConfigActivity.f30257d, audioPromptsConfigActivity.f30259f));
            textView2.setText(audioPromptsConfigActivity.getString(R.string.hr_alerts_setting_title));
            GCMComplexTwoLineButton gCMComplexTwoLineButton4 = audioPromptsConfigActivity.f30254a;
            if (gCMComplexTwoLineButton4 != null) {
                gCMComplexTwoLineButton4.b(strF, strA);
            }
            gu.b bVar8 = audioPromptsConfigActivity.f30260g;
            bVar8.getClass();
            lu.c cVarE2 = bVar8.e(audioPromptsConfigActivity.f30257d);
            linearLayout.getClass();
            lu.c.f114926c.getClass();
            w13.c cVar2 = lu.c.f114932i;
            cVar2.getClass();
            lu.c[] cVarArr2 = (lu.c[]) i.d(cVar2, new lu.c[0]);
            List<? extends lu.c> listAsList3 = Arrays.asList(Arrays.copyOf(cVarArr2, cVarArr2.length));
            listAsList3.getClass();
            audioPromptsConfigActivity.da(linearLayout, listAsList3, cVarE2);
            return;
        }
        audioPromptsConfigActivity.initActionBar(true, R.string.audio_prompts_pace_speed_alerts_title);
        gu.b bVar9 = audioPromptsConfigActivity.f30260g;
        bVar9.getClass();
        audioPromptsConfigActivity.ea(bVar9.m(audioPromptsConfigActivity.f30257d, audioPromptsConfigActivity.f30259f));
        textView3.setVisibility(8);
        textView2.setText(audioPromptsConfigActivity.getString(R.string.audio_prompts_pace_speed_alerts_title));
        GCMComplexTwoLineButton gCMComplexTwoLineButton5 = audioPromptsConfigActivity.f30254a;
        if (gCMComplexTwoLineButton5 != null) {
            gCMComplexTwoLineButton5.b(strF, strA);
        }
        gu.b bVar10 = audioPromptsConfigActivity.f30260g;
        bVar10.getClass();
        lu.d dVarD = bVar10.d(audioPromptsConfigActivity.f30257d);
        linearLayout.getClass();
        lu.d.f114935d.getClass();
        lu.d[] dVarArr = (lu.d[]) lu.d.f114940i.toArray(new lu.d[0]);
        List listAsList4 = Arrays.asList(Arrays.copyOf(dVarArr, dVarArr.length));
        listAsList4.getClass();
        LayoutInflater layoutInflater2 = audioPromptsConfigActivity.getLayoutInflater();
        layoutInflater2.getClass();
        ArrayList arrayList4 = new ArrayList(listAsList4.size());
        ArrayList arrayList5 = new ArrayList(listAsList4.size());
        linearLayout.addView(layoutInflater2.inflate(R.layout.gcm_divider_line_thin, (ViewGroup) linearLayout, false));
        int size3 = listAsList4.size();
        int i25 = 0;
        while (i25 < size3) {
            View viewInflate3 = layoutInflater2.inflate(R.layout.gcm_row_item, linearLayout, z14);
            View viewInflate4 = layoutInflater2.inflate(i17, linearLayout, z14);
            viewInflate3.getClass();
            l lVar2 = new l(viewInflate3);
            lu.d dVar = (lu.d) listAsList4.get(i25);
            lVar2.a(dVar.f114941a, Integer.valueOf(dVar.f114942b));
            lVar2.c(2131232298, null, null, null);
            lVar2.f(dVar == dVarD);
            arrayList4.add(viewInflate3);
            arrayList5.add(lVar2);
            linearLayout.addView(viewInflate3);
            linearLayout.addView(viewInflate4);
            i25++;
            z14 = false;
            i17 = R.layout.gcm_divider_line_thin;
        }
        int size4 = listAsList4.size();
        for (int i26 = 0; i26 < size4; i26++) {
            ((View) arrayList4.get(i26)).setOnClickListener(new ou.b(audioPromptsConfigActivity, arrayList5, listAsList4, i26, 2));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.audioprompts.ui.a.b
    public final void q6() {
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f30254a;
        if (gCMComplexTwoLineButton != null) {
            gu.b bVar = this.f30260g;
            bVar.getClass();
            gCMComplexTwoLineButton.setButtonBottomLeftLabel(bVar.f(this.f30257d, this.f30259f));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/audioprompts/ui/AudioPromptsConfigActivity$a;", "", "<init>", "()V", "", "EXTRA_TYPE_ENUM_NAME", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
