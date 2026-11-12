package iz1;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.m;
import androidx.fragment.app.v;
import androidx.lifecycle.v1;
import androidx.lifecycle.w1;
import androidx.lifecycle.y0;
import com.airbnb.lottie.LottieAnimationView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connections.groups.details.GroupActivityFeedTypeMainFragment;
import com.garmin.android.apps.connectmobile.developer.tutorials.DevDeviceTutorialsActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.personalizedinsights.presentation.dev.PersonalizedInsightsDevMenuActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.PregnancyListActivity;
import com.garmin.android.apps.connectmobile.w;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.FitPayCardVerificationActivity;
import com.garmin.proto.generated.GDIAudioPromptsProto;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import ew1.h1;
import f20.d0;
import f20.e0;
import fw.p;
import g20.n;
import j0.q;
import j02.s;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kd0.n4;
import lc.u0;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p13.h0;
import p13.x;
import ps.x0;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f95872b;

    public /* synthetic */ f(GDIAudioPromptsProto.SupportedLanguagesResponse supportedLanguagesResponse, ju.a aVar) {
        this.f95871a = 12;
        this.f95872b = supportedLanguagesResponse;
    }

    /* JADX WARN: Code duplicated, block: B:158:0x044b  */
    /* JADX WARN: Code duplicated, block: B:161:0x0455  */
    /* JADX WARN: Code duplicated, block: B:165:0x0465  */
    /* JADX WARN: Code duplicated, block: B:166:0x0471  */
    /* JADX WARN: Code duplicated, block: B:168:0x0475  */
    /* JADX WARN: Code duplicated, block: B:171:0x047c  */
    /* JADX WARN: Code duplicated, block: B:174:0x0486  */
    /* JADX WARN: Code duplicated, block: B:178:0x0496  */
    /* JADX WARN: Code duplicated, block: B:179:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:181:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:183:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:186:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:189:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:193:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:194:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:196:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:198:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:200:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:201:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:203:0x0501  */
    /* JADX WARN: Code duplicated, block: B:326:0x07e8  */
    /* JADX WARN: Code duplicated, block: B:353:0x0461 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:354:? A[LOOP:3: B:159:0x044f->B:354:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:356:0x0492 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:? A[LOOP:4: B:172:0x0480->B:357:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:359:0x04cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:360:? A[LOOP:5: B:187:0x04bb->B:360:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // e23.l
    public final Object invoke(Object obj) {
        boolean z14;
        Object value;
        jl1.d dVarA;
        List<l20.c> listZ;
        ImageView imageView;
        LinearLayout linearLayout;
        ArrayList arrayListS;
        Iterator it;
        TextView textView;
        Iterator it3;
        TextView textView2;
        Iterator it4;
        TextView textView3;
        List<x0> listG;
        int i14 = this.f95871a;
        int i15 = 10;
        int i16 = 6;
        byte[] bArrCopyOfRange = null;
        hv.j jVar = null;
        int i17 = 1;
        Object obj2 = this.f95872b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b bVar = (com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b.f46192e;
                if (zBooleanValue) {
                    ((y0) bVar.v6().J0.getValue()).m("TrainingPriorityChangeEventConfirmationFragment");
                }
                return Unit.INSTANCE;
            case 1:
                i iVar = (i) obj2;
                g3 g3Var = (g3) obj;
                int i18 = i.N0;
                p pVar = g3Var.f35300a;
                o13.p pVar2 = (o13.p) g3Var.f35301b;
                fg0.k kVar = pVar2 != null ? (fg0.k) pVar2.f128594a : null;
                ww1.g gVar = pVar2 != null ? (ww1.g) pVar2.f128595b : null;
                boolean z15 = iVar.H0;
                fg0.j jVar2 = iVar.P;
                if ((jVar2 != null ? eg0.c.b(jVar2) : null) != dg0.a.PRIMARY_EVENT) {
                    if (kVar == null) {
                        fg0.j jVar3 = iVar.P;
                        z14 = (jVar3 != null ? eg0.c.b(jVar3) : null) == dg0.a.NO_PRIORITY;
                    }
                }
                return new g3(pVar, new jz1.b(null, z15, z14, kVar, iVar.I, gVar), null, null, null, 16, null);
            case 2:
                q qVar = (q) obj2;
                qVar.m(qVar.f95960n.mo330apply((I) obj));
                return Unit.INSTANCE;
            case 3:
                j02.g gVar2 = (j02.g) obj;
                int i19 = s.f96125v;
                gVar2.getClass();
                return Boolean.valueOf(gVar2.getIndex() != ((j02.g) obj2).getIndex());
            case 4:
                am.x0 x0Var = (am.x0) obj;
                int i24 = GroupActivityFeedTypeMainFragment.a.c.f31384f;
                x0Var.getClass();
                Context context = ((GroupActivityFeedTypeMainFragment.a.c) obj2).f31388d.getContext();
                context.getClass();
                return dh.b.A(context, x0Var.f4360c);
            case 5:
                com.garmin.android.apps.connectmobile.contacts.emergency.c cVar = (com.garmin.android.apps.connectmobile.contacts.emergency.c) obj2;
                g3 g3Var2 = (g3) obj;
                com.garmin.android.apps.connectmobile.contacts.emergency.c.a aVar2 = com.garmin.android.apps.connectmobile.contacts.emergency.c.f32628f;
                if (com.garmin.android.apps.connectmobile.contacts.emergency.c.b.f32635a[g3Var2.f35300a.ordinal()] == 1) {
                    cVar.v6();
                } else {
                    a2 a2Var = a2.SAFETY_FEATURES;
                    String str = "Status was " + g3Var2.f35300a + " while observing contactLiveData, not Status.SUCCESS";
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "EmergencyContactMethodPickerFragment", str);
                }
                return Unit.INSTANCE;
            case 6:
                l20.c cVar2 = (l20.c) obj;
                com.garmin.android.apps.connectmobile.contacts.emergency.f.a aVar3 = com.garmin.android.apps.connectmobile.contacts.emergency.f.f32689b;
                cVar2.getClass();
                ((com.garmin.android.apps.connectmobile.contacts.emergency.f) obj2).w6().I4(cVar2);
                return Unit.INSTANCE;
            case 7:
                String str2 = (String) obj;
                str2.getClass();
                return ((i62.g) obj2).a(str2);
            case 8:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                PersonalizedInsightsDevMenuActivity.a aVar4 = PersonalizedInsightsDevMenuActivity.f40322b;
                j91.f fVarCa = ((PersonalizedInsightsDevMenuActivity) obj2).ca();
                ge1.b.T(v1.a(fVarCa), null, null, new j91.g(fVarCa, zBooleanValue2, null), 3);
                return Unit.INSTANCE;
            case 9:
                jl1.g gVar3 = (jl1.g) obj2;
                zf2.d dVar = (zf2.d) obj;
                dVar.getClass();
                gVar3.getClass();
                p2 p2Var = gVar3.f99524g;
                do {
                    value = p2Var.getValue();
                    jl1.d dVar2 = (jl1.d) value;
                    nl1.a aVar5 = nl1.a.f126500a;
                    int size = dVar2.f99482e.size();
                    aVar5.getClass();
                    if (size < 10) {
                        i53.c cVarE = i53.a.e(h0.D0(dVar2.f99482e, dVar));
                        dVarA = jl1.d.a(dVar2, false, false, null, null, cVarE, null, jl1.g.x4(dVar2.f99483f, cVarE), 47);
                    } else {
                        dVarA = jl1.d.a(dVar2, false, true, null, null, null, null, null, 125);
                    }
                } while (!p2Var.b(value, dVarA));
                return Unit.INSTANCE;
            case 10:
                FitPayCardVerificationActivity fitPayCardVerificationActivity = (FitPayCardVerificationActivity) obj2;
                com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a.b bVar2 = (com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a.b) obj;
                FitPayCardVerificationActivity.b bVar3 = FitPayCardVerificationActivity.f51449m;
                fitPayCardVerificationActivity.ca().debug("onCreate: " + bVar2);
                int i25 = bVar2 == null ? -1 : FitPayCardVerificationActivity.c.f51464a[bVar2.ordinal()];
                if (i25 != 1) {
                    if (i25 == 2) {
                        String string = fitPayCardVerificationActivity.getString(R.string.dialog_title_error);
                        string.getClass();
                        String string2 = fitPayCardVerificationActivity.getString(R.string.provision_failed);
                        string2.getClass();
                        String string3 = fitPayCardVerificationActivity.getString(R.string.lbl_ok);
                        string3.getClass();
                        androidx.appcompat.app.e eVarQ = br2.c.q(br2.c.f19585a, fitPayCardVerificationActivity, string, string2, new o13.p(string3, new jp2.a(fitPayCardVerificationActivity, i16)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
                        if (eVarQ != null) {
                            eVarQ.show();
                        }
                    }
                } else if (fitPayCardVerificationActivity.f51453j && fitPayCardVerificationActivity.f51454k == gp2.e.CREDENTIAL_NOT_CREATED) {
                    br2.c cVar3 = br2.c.f19585a;
                    String string4 = fitPayCardVerificationActivity.getResources().getString(R.string.card_add_device_success_ecom_payments_fail);
                    string4.getClass();
                    cVar3.c(fitPayCardVerificationActivity, string4, new jp2.b(fitPayCardVerificationActivity, i17));
                } else {
                    fitPayCardVerificationActivity.da();
                }
                return Unit.INSTANCE;
            case 11:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) obj2;
                hv.b bVar4 = (hv.b) obj;
                com.garmin.android.apps.connectmobile.topoactivemaps.a.C0862a c0862a = com.garmin.android.apps.connectmobile.topoactivemaps.a.f45072e;
                bVar4.getClass();
                lottieAnimationView.setAnimationFromJson(bVar4.f85748a, "TopoActiveMapsScreenFragment");
                List list = (List) bVar4.f85754g.get(5);
                List listN0 = list != null ? h0.N0(list, new hv.c()) : null;
                if (listN0 != null) {
                    jVar = (hv.j) h0.e0(0, listN0);
                } else {
                    a2 a2Var2 = a2.BIC;
                    i2.f36769a.getClass();
                    i2.a.f(a2Var2, "DeviceAnimationHolder", "invalid group index 5");
                }
                if (jVar != null) {
                    lottieAnimationView.setMinAndMaxFrame(jVar.getComment());
                }
                Map<String, Bitmap> map = bVar4.f85752e;
                if (map != null) {
                    lottieAnimationView.setImageAssetDelegate(new hy.d(map, i15));
                }
                lottieAnimationView.playAnimation();
                return Unit.INSTANCE;
            case 12:
                GDIAudioPromptsProto.SupportedLanguagesResponse supportedLanguagesResponse = (GDIAudioPromptsProto.SupportedLanguagesResponse) obj2;
                Exception exc = (Exception) obj;
                int i26 = ju.a.f100865c;
                if (exc == null) {
                    StringBuilder sb3 = new StringBuilder("Send supported languages success. ");
                    if (supportedLanguagesResponse.getLanguagesList() == null || supportedLanguagesResponse.getLanguagesList().isEmpty()) {
                        sb3.append("No languages sent! Perhaps the TTS engine is not initialized? Check GCMAudioManager!");
                    } else {
                        for (GDIAudioPromptsProto.Language language : supportedLanguagesResponse.getLanguagesList()) {
                            sb3.append("\n   [");
                            String languageCode = "";
                            sb3.append(language.hasCountryCode() ? language.getCountryCode() : "");
                            sb3.append("]-[");
                            if (language.hasLanguageCode()) {
                                languageCode = language.getLanguageCode();
                            }
                            sb3.append(languageCode);
                            sb3.append("]");
                        }
                    }
                    String string5 = sb3.toString();
                    i2.a aVar6 = i2.f36769a;
                    a2 a2Var3 = a2.GENERAL;
                    aVar6.getClass();
                    i2.a.b(a2Var3, "AudioPromptsProtobufRequestHandler", string5);
                } else {
                    i2.a aVar7 = i2.f36769a;
                    a2 a2Var4 = a2.GENERAL;
                    aVar7.getClass();
                    i2.a.g(a2Var4, "AudioPromptsProtobufRequestHandler", exc);
                }
                return Unit.INSTANCE;
            case 13:
                k20.d dVar3 = (k20.d) obj2;
                n nVar = (n) obj;
                k20.d.a aVar8 = k20.d.f102434j;
                List<com.garmin.android.apps.connectmobile.contacts.a> list2 = nVar.f75360a;
                if (list2 != null) {
                    k20.a aVar9 = dVar3.f102435e;
                    if (aVar9 == null) {
                        p005kotlin.jvm.internal.s.m("contactInfoAdapter");
                        throw null;
                    }
                    ArrayList arrayList = aVar9.f102409c;
                    arrayList.clear();
                    arrayList.addAll(list2);
                    arrayList.add(d0.c.f68379a);
                    aVar9.notifyDataSetChanged();
                }
                Context contextRequireContext = dVar3.requireContext();
                contextRequireContext.getClass();
                e0 e0Var = new e0(contextRequireContext);
                l20.a aVar10 = nVar.f75368i;
                if (aVar10.b(e0Var)) {
                    LinearLayout linearLayout2 = dVar3.f102436f;
                    if (linearLayout2 == null) {
                        p005kotlin.jvm.internal.s.m("bannerLayout");
                        throw null;
                    }
                    linearLayout2.setVisibility(0);
                    ImageView imageView2 = dVar3.f102438h;
                    if (imageView2 == null) {
                        p005kotlin.jvm.internal.s.m("bannerCloseButton");
                        throw null;
                    }
                    imageView2.setVisibility(0);
                    ArrayList<l20.c> arrayListS2 = ge1.b.s(aVar10.k());
                    if (!arrayListS2.isEmpty()) {
                        for (l20.c cVar4 : arrayListS2) {
                            if (cVar4.M() && cVar4.f() && !cVar4.d()) {
                                TextView textView4 = dVar3.f102437g;
                                if (textView4 == null) {
                                    p005kotlin.jvm.internal.s.m("bannerTextView");
                                    throw null;
                                }
                                textView4.setText(dVar3.getString(R.string.contact_not_opted_in_banner_message));
                            }
                        }
                        if (arrayListS2.isEmpty()) {
                            it4 = arrayListS2.iterator();
                            while (it4.hasNext()) {
                                if (((l20.c) it4.next()).f()) {
                                    textView3 = dVar3.f102437g;
                                    if (textView3 != null) {
                                        p005kotlin.jvm.internal.s.m("bannerTextView");
                                        throw null;
                                    }
                                    textView3.setText(dVar3.getString(R.string.assistance_contact_opted_out_banner_message));
                                }
                            }
                            if (arrayListS2.isEmpty()) {
                                listZ = aVar10.z();
                                if (listZ != null) {
                                    arrayListS = ge1.b.s(listZ);
                                    if (arrayListS.isEmpty()) {
                                        a2 a2Var5 = a2.SAFETY_FEATURES;
                                        i2.f36769a.getClass();
                                        i2.a.p(a2Var5, "EmergencyContactDetailsFragment", "[listenForUiUpdates] Warning! Reached the point where we should display a warning banner but don't have any text for it.");
                                        imageView = dVar3.f102438h;
                                        if (imageView != null) {
                                            p005kotlin.jvm.internal.s.m("bannerCloseButton");
                                            throw null;
                                        }
                                        imageView.setVisibility(8);
                                        linearLayout = dVar3.f102436f;
                                        if (linearLayout != null) {
                                            p005kotlin.jvm.internal.s.m("bannerLayout");
                                            throw null;
                                        }
                                        linearLayout.setVisibility(8);
                                    } else {
                                        it = arrayListS.iterator();
                                        while (it.hasNext()) {
                                            if (!gl1.d.K((l20.c) it.next(), e0Var)) {
                                                textView = dVar3.f102437g;
                                                if (textView != null) {
                                                    p005kotlin.jvm.internal.s.m("bannerTextView");
                                                    throw null;
                                                }
                                                textView.setText(dVar3.getString(R.string.contact_has_invalid_phone_number_banner_message));
                                            }
                                        }
                                        a2 a2Var6 = a2.SAFETY_FEATURES;
                                        i2.f36769a.getClass();
                                        i2.a.p(a2Var6, "EmergencyContactDetailsFragment", "[listenForUiUpdates] Warning! Reached the point where we should display a warning banner but don't have any text for it.");
                                        imageView = dVar3.f102438h;
                                        if (imageView != null) {
                                            p005kotlin.jvm.internal.s.m("bannerCloseButton");
                                            throw null;
                                        }
                                        imageView.setVisibility(8);
                                        linearLayout = dVar3.f102436f;
                                        if (linearLayout != null) {
                                            p005kotlin.jvm.internal.s.m("bannerLayout");
                                            throw null;
                                        }
                                        linearLayout.setVisibility(8);
                                    }
                                } else {
                                    a2 a2Var7 = a2.SAFETY_FEATURES;
                                    i2.f36769a.getClass();
                                    i2.a.p(a2Var7, "EmergencyContactDetailsFragment", "[listenForUiUpdates] Warning! Reached the point where we should display a warning banner but don't have any text for it.");
                                    imageView = dVar3.f102438h;
                                    if (imageView != null) {
                                        p005kotlin.jvm.internal.s.m("bannerCloseButton");
                                        throw null;
                                    }
                                    imageView.setVisibility(8);
                                    linearLayout = dVar3.f102436f;
                                    if (linearLayout != null) {
                                        p005kotlin.jvm.internal.s.m("bannerLayout");
                                        throw null;
                                    }
                                    linearLayout.setVisibility(8);
                                }
                            } else {
                                it3 = arrayListS2.iterator();
                                while (it3.hasNext()) {
                                    if (((l20.c) it3.next()).I()) {
                                        textView2 = dVar3.f102437g;
                                        if (textView2 != null) {
                                            p005kotlin.jvm.internal.s.m("bannerTextView");
                                            throw null;
                                        }
                                        textView2.setText(dVar3.getString(R.string.assistance_contact_declined_banner_message));
                                    }
                                }
                                listZ = aVar10.z();
                                if (listZ != null) {
                                    arrayListS = ge1.b.s(listZ);
                                    if (arrayListS.isEmpty()) {
                                        a2 a2Var8 = a2.SAFETY_FEATURES;
                                        i2.f36769a.getClass();
                                        i2.a.p(a2Var8, "EmergencyContactDetailsFragment", "[listenForUiUpdates] Warning! Reached the point where we should display a warning banner but don't have any text for it.");
                                        imageView = dVar3.f102438h;
                                        if (imageView != null) {
                                            p005kotlin.jvm.internal.s.m("bannerCloseButton");
                                            throw null;
                                        }
                                        imageView.setVisibility(8);
                                        linearLayout = dVar3.f102436f;
                                        if (linearLayout != null) {
                                            p005kotlin.jvm.internal.s.m("bannerLayout");
                                            throw null;
                                        }
                                        linearLayout.setVisibility(8);
                                    } else {
                                        it = arrayListS.iterator();
                                        while (it.hasNext()) {
                                            if (!gl1.d.K((l20.c) it.next(), e0Var)) {
                                                textView = dVar3.f102437g;
                                                if (textView != null) {
                                                    p005kotlin.jvm.internal.s.m("bannerTextView");
                                                    throw null;
                                                }
                                                textView.setText(dVar3.getString(R.string.contact_has_invalid_phone_number_banner_message));
                                            }
                                        }
                                        a2 a2Var9 = a2.SAFETY_FEATURES;
                                        i2.f36769a.getClass();
                                        i2.a.p(a2Var9, "EmergencyContactDetailsFragment", "[listenForUiUpdates] Warning! Reached the point where we should display a warning banner but don't have any text for it.");
                                        imageView = dVar3.f102438h;
                                        if (imageView != null) {
                                            p005kotlin.jvm.internal.s.m("bannerCloseButton");
                                            throw null;
                                        }
                                        imageView.setVisibility(8);
                                        linearLayout = dVar3.f102436f;
                                        if (linearLayout != null) {
                                            p005kotlin.jvm.internal.s.m("bannerLayout");
                                            throw null;
                                        }
                                        linearLayout.setVisibility(8);
                                    }
                                } else {
                                    a2 a2Var10 = a2.SAFETY_FEATURES;
                                    i2.f36769a.getClass();
                                    i2.a.p(a2Var10, "EmergencyContactDetailsFragment", "[listenForUiUpdates] Warning! Reached the point where we should display a warning banner but don't have any text for it.");
                                    imageView = dVar3.f102438h;
                                    if (imageView != null) {
                                        p005kotlin.jvm.internal.s.m("bannerCloseButton");
                                        throw null;
                                    }
                                    imageView.setVisibility(8);
                                    linearLayout = dVar3.f102436f;
                                    if (linearLayout != null) {
                                        p005kotlin.jvm.internal.s.m("bannerLayout");
                                        throw null;
                                    }
                                    linearLayout.setVisibility(8);
                                }
                            }
                        } else if (arrayListS2.isEmpty()) {
                            listZ = aVar10.z();
                            if (listZ != null) {
                                arrayListS = ge1.b.s(listZ);
                                if (arrayListS.isEmpty()) {
                                    a2 a2Var11 = a2.SAFETY_FEATURES;
                                    i2.f36769a.getClass();
                                    i2.a.p(a2Var11, "EmergencyContactDetailsFragment", "[listenForUiUpdates] Warning! Reached the point where we should display a warning banner but don't have any text for it.");
                                    imageView = dVar3.f102438h;
                                    if (imageView != null) {
                                        p005kotlin.jvm.internal.s.m("bannerCloseButton");
                                        throw null;
                                    }
                                    imageView.setVisibility(8);
                                    linearLayout = dVar3.f102436f;
                                    if (linearLayout != null) {
                                        p005kotlin.jvm.internal.s.m("bannerLayout");
                                        throw null;
                                    }
                                    linearLayout.setVisibility(8);
                                } else {
                                    it = arrayListS.iterator();
                                    while (it.hasNext()) {
                                        if (!gl1.d.K((l20.c) it.next(), e0Var)) {
                                            textView = dVar3.f102437g;
                                            if (textView != null) {
                                                p005kotlin.jvm.internal.s.m("bannerTextView");
                                                throw null;
                                            }
                                            textView.setText(dVar3.getString(R.string.contact_has_invalid_phone_number_banner_message));
                                        }
                                    }
                                    a2 a2Var12 = a2.SAFETY_FEATURES;
                                    i2.f36769a.getClass();
                                    i2.a.p(a2Var12, "EmergencyContactDetailsFragment", "[listenForUiUpdates] Warning! Reached the point where we should display a warning banner but don't have any text for it.");
                                    imageView = dVar3.f102438h;
                                    if (imageView != null) {
                                        p005kotlin.jvm.internal.s.m("bannerCloseButton");
                                        throw null;
                                    }
                                    imageView.setVisibility(8);
                                    linearLayout = dVar3.f102436f;
                                    if (linearLayout != null) {
                                        p005kotlin.jvm.internal.s.m("bannerLayout");
                                        throw null;
                                    }
                                    linearLayout.setVisibility(8);
                                }
                            } else {
                                a2 a2Var13 = a2.SAFETY_FEATURES;
                                i2.f36769a.getClass();
                                i2.a.p(a2Var13, "EmergencyContactDetailsFragment", "[listenForUiUpdates] Warning! Reached the point where we should display a warning banner but don't have any text for it.");
                                imageView = dVar3.f102438h;
                                if (imageView != null) {
                                    p005kotlin.jvm.internal.s.m("bannerCloseButton");
                                    throw null;
                                }
                                imageView.setVisibility(8);
                                linearLayout = dVar3.f102436f;
                                if (linearLayout != null) {
                                    p005kotlin.jvm.internal.s.m("bannerLayout");
                                    throw null;
                                }
                                linearLayout.setVisibility(8);
                            }
                        } else {
                            it3 = arrayListS2.iterator();
                            while (it3.hasNext()) {
                                if (((l20.c) it3.next()).I()) {
                                    textView2 = dVar3.f102437g;
                                    if (textView2 != null) {
                                        p005kotlin.jvm.internal.s.m("bannerTextView");
                                        throw null;
                                    }
                                    textView2.setText(dVar3.getString(R.string.assistance_contact_declined_banner_message));
                                }
                            }
                            listZ = aVar10.z();
                            if (listZ != null) {
                                arrayListS = ge1.b.s(listZ);
                                if (arrayListS.isEmpty()) {
                                    a2 a2Var14 = a2.SAFETY_FEATURES;
                                    i2.f36769a.getClass();
                                    i2.a.p(a2Var14, "EmergencyContactDetailsFragment", "[listenForUiUpdates] Warning! Reached the point where we should display a warning banner but don't have any text for it.");
                                    imageView = dVar3.f102438h;
                                    if (imageView != null) {
                                        p005kotlin.jvm.internal.s.m("bannerCloseButton");
                                        throw null;
                                    }
                                    imageView.setVisibility(8);
                                    linearLayout = dVar3.f102436f;
                                    if (linearLayout != null) {
                                        p005kotlin.jvm.internal.s.m("bannerLayout");
                                        throw null;
                                    }
                                    linearLayout.setVisibility(8);
                                } else {
                                    it = arrayListS.iterator();
                                    while (it.hasNext()) {
                                        if (!gl1.d.K((l20.c) it.next(), e0Var)) {
                                            textView = dVar3.f102437g;
                                            if (textView != null) {
                                                p005kotlin.jvm.internal.s.m("bannerTextView");
                                                throw null;
                                            }
                                            textView.setText(dVar3.getString(R.string.contact_has_invalid_phone_number_banner_message));
                                        }
                                    }
                                    a2 a2Var15 = a2.SAFETY_FEATURES;
                                    i2.f36769a.getClass();
                                    i2.a.p(a2Var15, "EmergencyContactDetailsFragment", "[listenForUiUpdates] Warning! Reached the point where we should display a warning banner but don't have any text for it.");
                                    imageView = dVar3.f102438h;
                                    if (imageView != null) {
                                        p005kotlin.jvm.internal.s.m("bannerCloseButton");
                                        throw null;
                                    }
                                    imageView.setVisibility(8);
                                    linearLayout = dVar3.f102436f;
                                    if (linearLayout != null) {
                                        p005kotlin.jvm.internal.s.m("bannerLayout");
                                        throw null;
                                    }
                                    linearLayout.setVisibility(8);
                                }
                            } else {
                                a2 a2Var16 = a2.SAFETY_FEATURES;
                                i2.f36769a.getClass();
                                i2.a.p(a2Var16, "EmergencyContactDetailsFragment", "[listenForUiUpdates] Warning! Reached the point where we should display a warning banner but don't have any text for it.");
                                imageView = dVar3.f102438h;
                                if (imageView != null) {
                                    p005kotlin.jvm.internal.s.m("bannerCloseButton");
                                    throw null;
                                }
                                imageView.setVisibility(8);
                                linearLayout = dVar3.f102436f;
                                if (linearLayout != null) {
                                    p005kotlin.jvm.internal.s.m("bannerLayout");
                                    throw null;
                                }
                                linearLayout.setVisibility(8);
                            }
                        }
                    } else if (arrayListS2.isEmpty()) {
                        it4 = arrayListS2.iterator();
                        while (it4.hasNext()) {
                            if (((l20.c) it4.next()).f()) {
                                textView3 = dVar3.f102437g;
                                if (textView3 != null) {
                                    p005kotlin.jvm.internal.s.m("bannerTextView");
                                    throw null;
                                }
                                textView3.setText(dVar3.getString(R.string.assistance_contact_opted_out_banner_message));
                            }
                        }
                        if (arrayListS2.isEmpty()) {
                            listZ = aVar10.z();
                            if (listZ != null) {
                                arrayListS = ge1.b.s(listZ);
                                if (arrayListS.isEmpty()) {
                                    a2 a2Var17 = a2.SAFETY_FEATURES;
                                    i2.f36769a.getClass();
                                    i2.a.p(a2Var17, "EmergencyContactDetailsFragment", "[listenForUiUpdates] Warning! Reached the point where we should display a warning banner but don't have any text for it.");
                                    imageView = dVar3.f102438h;
                                    if (imageView != null) {
                                        p005kotlin.jvm.internal.s.m("bannerCloseButton");
                                        throw null;
                                    }
                                    imageView.setVisibility(8);
                                    linearLayout = dVar3.f102436f;
                                    if (linearLayout != null) {
                                        p005kotlin.jvm.internal.s.m("bannerLayout");
                                        throw null;
                                    }
                                    linearLayout.setVisibility(8);
                                } else {
                                    it = arrayListS.iterator();
                                    while (it.hasNext()) {
                                        if (!gl1.d.K((l20.c) it.next(), e0Var)) {
                                            textView = dVar3.f102437g;
                                            if (textView != null) {
                                                p005kotlin.jvm.internal.s.m("bannerTextView");
                                                throw null;
                                            }
                                            textView.setText(dVar3.getString(R.string.contact_has_invalid_phone_number_banner_message));
                                        }
                                    }
                                    a2 a2Var18 = a2.SAFETY_FEATURES;
                                    i2.f36769a.getClass();
                                    i2.a.p(a2Var18, "EmergencyContactDetailsFragment", "[listenForUiUpdates] Warning! Reached the point where we should display a warning banner but don't have any text for it.");
                                    imageView = dVar3.f102438h;
                                    if (imageView != null) {
                                        p005kotlin.jvm.internal.s.m("bannerCloseButton");
                                        throw null;
                                    }
                                    imageView.setVisibility(8);
                                    linearLayout = dVar3.f102436f;
                                    if (linearLayout != null) {
                                        p005kotlin.jvm.internal.s.m("bannerLayout");
                                        throw null;
                                    }
                                    linearLayout.setVisibility(8);
                                }
                            } else {
                                a2 a2Var19 = a2.SAFETY_FEATURES;
                                i2.f36769a.getClass();
                                i2.a.p(a2Var19, "EmergencyContactDetailsFragment", "[listenForUiUpdates] Warning! Reached the point where we should display a warning banner but don't have any text for it.");
                                imageView = dVar3.f102438h;
                                if (imageView != null) {
                                    p005kotlin.jvm.internal.s.m("bannerCloseButton");
                                    throw null;
                                }
                                imageView.setVisibility(8);
                                linearLayout = dVar3.f102436f;
                                if (linearLayout != null) {
                                    p005kotlin.jvm.internal.s.m("bannerLayout");
                                    throw null;
                                }
                                linearLayout.setVisibility(8);
                            }
                        } else {
                            it3 = arrayListS2.iterator();
                            while (it3.hasNext()) {
                                if (((l20.c) it3.next()).I()) {
                                    textView2 = dVar3.f102437g;
                                    if (textView2 != null) {
                                        p005kotlin.jvm.internal.s.m("bannerTextView");
                                        throw null;
                                    }
                                    textView2.setText(dVar3.getString(R.string.assistance_contact_declined_banner_message));
                                }
                            }
                            listZ = aVar10.z();
                            if (listZ != null) {
                                arrayListS = ge1.b.s(listZ);
                                if (arrayListS.isEmpty()) {
                                    a2 a2Var110 = a2.SAFETY_FEATURES;
                                    i2.f36769a.getClass();
                                    i2.a.p(a2Var110, "EmergencyContactDetailsFragment", "[listenForUiUpdates] Warning! Reached the point where we should display a warning banner but don't have any text for it.");
                                    imageView = dVar3.f102438h;
                                    if (imageView != null) {
                                        p005kotlin.jvm.internal.s.m("bannerCloseButton");
                                        throw null;
                                    }
                                    imageView.setVisibility(8);
                                    linearLayout = dVar3.f102436f;
                                    if (linearLayout != null) {
                                        p005kotlin.jvm.internal.s.m("bannerLayout");
                                        throw null;
                                    }
                                    linearLayout.setVisibility(8);
                                } else {
                                    it = arrayListS.iterator();
                                    while (it.hasNext()) {
                                        if (!gl1.d.K((l20.c) it.next(), e0Var)) {
                                            textView = dVar3.f102437g;
                                            if (textView != null) {
                                                p005kotlin.jvm.internal.s.m("bannerTextView");
                                                throw null;
                                            }
                                            textView.setText(dVar3.getString(R.string.contact_has_invalid_phone_number_banner_message));
                                        }
                                    }
                                    a2 a2Var111 = a2.SAFETY_FEATURES;
                                    i2.f36769a.getClass();
                                    i2.a.p(a2Var111, "EmergencyContactDetailsFragment", "[listenForUiUpdates] Warning! Reached the point where we should display a warning banner but don't have any text for it.");
                                    imageView = dVar3.f102438h;
                                    if (imageView != null) {
                                        p005kotlin.jvm.internal.s.m("bannerCloseButton");
                                        throw null;
                                    }
                                    imageView.setVisibility(8);
                                    linearLayout = dVar3.f102436f;
                                    if (linearLayout != null) {
                                        p005kotlin.jvm.internal.s.m("bannerLayout");
                                        throw null;
                                    }
                                    linearLayout.setVisibility(8);
                                }
                            } else {
                                a2 a2Var112 = a2.SAFETY_FEATURES;
                                i2.f36769a.getClass();
                                i2.a.p(a2Var112, "EmergencyContactDetailsFragment", "[listenForUiUpdates] Warning! Reached the point where we should display a warning banner but don't have any text for it.");
                                imageView = dVar3.f102438h;
                                if (imageView != null) {
                                    p005kotlin.jvm.internal.s.m("bannerCloseButton");
                                    throw null;
                                }
                                imageView.setVisibility(8);
                                linearLayout = dVar3.f102436f;
                                if (linearLayout != null) {
                                    p005kotlin.jvm.internal.s.m("bannerLayout");
                                    throw null;
                                }
                                linearLayout.setVisibility(8);
                            }
                        }
                    } else if (arrayListS2.isEmpty()) {
                        listZ = aVar10.z();
                        if (listZ != null) {
                            arrayListS = ge1.b.s(listZ);
                            if (arrayListS.isEmpty()) {
                                a2 a2Var113 = a2.SAFETY_FEATURES;
                                i2.f36769a.getClass();
                                i2.a.p(a2Var113, "EmergencyContactDetailsFragment", "[listenForUiUpdates] Warning! Reached the point where we should display a warning banner but don't have any text for it.");
                                imageView = dVar3.f102438h;
                                if (imageView != null) {
                                    p005kotlin.jvm.internal.s.m("bannerCloseButton");
                                    throw null;
                                }
                                imageView.setVisibility(8);
                                linearLayout = dVar3.f102436f;
                                if (linearLayout != null) {
                                    p005kotlin.jvm.internal.s.m("bannerLayout");
                                    throw null;
                                }
                                linearLayout.setVisibility(8);
                            } else {
                                it = arrayListS.iterator();
                                while (it.hasNext()) {
                                    if (!gl1.d.K((l20.c) it.next(), e0Var)) {
                                        textView = dVar3.f102437g;
                                        if (textView != null) {
                                            p005kotlin.jvm.internal.s.m("bannerTextView");
                                            throw null;
                                        }
                                        textView.setText(dVar3.getString(R.string.contact_has_invalid_phone_number_banner_message));
                                    }
                                }
                                a2 a2Var114 = a2.SAFETY_FEATURES;
                                i2.f36769a.getClass();
                                i2.a.p(a2Var114, "EmergencyContactDetailsFragment", "[listenForUiUpdates] Warning! Reached the point where we should display a warning banner but don't have any text for it.");
                                imageView = dVar3.f102438h;
                                if (imageView != null) {
                                    p005kotlin.jvm.internal.s.m("bannerCloseButton");
                                    throw null;
                                }
                                imageView.setVisibility(8);
                                linearLayout = dVar3.f102436f;
                                if (linearLayout != null) {
                                    p005kotlin.jvm.internal.s.m("bannerLayout");
                                    throw null;
                                }
                                linearLayout.setVisibility(8);
                            }
                        } else {
                            a2 a2Var115 = a2.SAFETY_FEATURES;
                            i2.f36769a.getClass();
                            i2.a.p(a2Var115, "EmergencyContactDetailsFragment", "[listenForUiUpdates] Warning! Reached the point where we should display a warning banner but don't have any text for it.");
                            imageView = dVar3.f102438h;
                            if (imageView != null) {
                                p005kotlin.jvm.internal.s.m("bannerCloseButton");
                                throw null;
                            }
                            imageView.setVisibility(8);
                            linearLayout = dVar3.f102436f;
                            if (linearLayout != null) {
                                p005kotlin.jvm.internal.s.m("bannerLayout");
                                throw null;
                            }
                            linearLayout.setVisibility(8);
                        }
                    } else {
                        it3 = arrayListS2.iterator();
                        while (it3.hasNext()) {
                            if (((l20.c) it3.next()).I()) {
                                textView2 = dVar3.f102437g;
                                if (textView2 != null) {
                                    p005kotlin.jvm.internal.s.m("bannerTextView");
                                    throw null;
                                }
                                textView2.setText(dVar3.getString(R.string.assistance_contact_declined_banner_message));
                            }
                        }
                        listZ = aVar10.z();
                        if (listZ != null) {
                            arrayListS = ge1.b.s(listZ);
                            if (arrayListS.isEmpty()) {
                                a2 a2Var116 = a2.SAFETY_FEATURES;
                                i2.f36769a.getClass();
                                i2.a.p(a2Var116, "EmergencyContactDetailsFragment", "[listenForUiUpdates] Warning! Reached the point where we should display a warning banner but don't have any text for it.");
                                imageView = dVar3.f102438h;
                                if (imageView != null) {
                                    p005kotlin.jvm.internal.s.m("bannerCloseButton");
                                    throw null;
                                }
                                imageView.setVisibility(8);
                                linearLayout = dVar3.f102436f;
                                if (linearLayout != null) {
                                    p005kotlin.jvm.internal.s.m("bannerLayout");
                                    throw null;
                                }
                                linearLayout.setVisibility(8);
                            } else {
                                it = arrayListS.iterator();
                                while (it.hasNext()) {
                                    if (!gl1.d.K((l20.c) it.next(), e0Var)) {
                                        textView = dVar3.f102437g;
                                        if (textView != null) {
                                            p005kotlin.jvm.internal.s.m("bannerTextView");
                                            throw null;
                                        }
                                        textView.setText(dVar3.getString(R.string.contact_has_invalid_phone_number_banner_message));
                                    }
                                }
                                a2 a2Var117 = a2.SAFETY_FEATURES;
                                i2.f36769a.getClass();
                                i2.a.p(a2Var117, "EmergencyContactDetailsFragment", "[listenForUiUpdates] Warning! Reached the point where we should display a warning banner but don't have any text for it.");
                                imageView = dVar3.f102438h;
                                if (imageView != null) {
                                    p005kotlin.jvm.internal.s.m("bannerCloseButton");
                                    throw null;
                                }
                                imageView.setVisibility(8);
                                linearLayout = dVar3.f102436f;
                                if (linearLayout != null) {
                                    p005kotlin.jvm.internal.s.m("bannerLayout");
                                    throw null;
                                }
                                linearLayout.setVisibility(8);
                            }
                        } else {
                            a2 a2Var118 = a2.SAFETY_FEATURES;
                            i2.f36769a.getClass();
                            i2.a.p(a2Var118, "EmergencyContactDetailsFragment", "[listenForUiUpdates] Warning! Reached the point where we should display a warning banner but don't have any text for it.");
                            imageView = dVar3.f102438h;
                            if (imageView != null) {
                                p005kotlin.jvm.internal.s.m("bannerCloseButton");
                                throw null;
                            }
                            imageView.setVisibility(8);
                            linearLayout = dVar3.f102436f;
                            if (linearLayout != null) {
                                p005kotlin.jvm.internal.s.m("bannerLayout");
                                throw null;
                            }
                            linearLayout.setVisibility(8);
                        }
                    }
                } else {
                    ImageView imageView3 = dVar3.f102438h;
                    if (imageView3 == null) {
                        p005kotlin.jvm.internal.s.m("bannerCloseButton");
                        throw null;
                    }
                    imageView3.setVisibility(8);
                    LinearLayout linearLayout3 = dVar3.f102436f;
                    if (linearLayout3 == null) {
                        p005kotlin.jvm.internal.s.m("bannerLayout");
                        throw null;
                    }
                    linearLayout3.setVisibility(8);
                }
                return Unit.INSTANCE;
            case 14:
                ((View) obj).getClass();
                ((com.garmin.android.apps.connectmobile.e) obj2).invoke();
                return Unit.INSTANCE;
            case 15:
                ((View) obj).getClass();
                ((com.garmin.android.apps.connectmobile.e) obj2).invoke();
                return Unit.INSTANCE;
            case 16:
                int i27 = k32.b.f102666g;
                ((View) obj).getClass();
                ((w) obj2).invoke();
                return Unit.INSTANCE;
            case 17:
                int i28 = k32.b.f102666g;
                ((View) obj).getClass();
                ((w) obj2).invoke();
                return Unit.INSTANCE;
            case 18:
                int i29 = k32.b.f102666g;
                ((View) obj).getClass();
                ((w) obj2).invoke();
                return Unit.INSTANCE;
            case 19:
                com.garmin.android.apps.connectmobile.developer.tutorials.a aVar11 = (com.garmin.android.apps.connectmobile.developer.tutorials.a) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                com.garmin.android.apps.connectmobile.developer.tutorials.a.C0558a c0558a = com.garmin.android.apps.connectmobile.developer.tutorials.a.f33708e;
                try {
                    int i30 = o13.q.f128596b;
                    if (aVar11.requireActivity() instanceof com.garmin.android.apps.connectmobile.bic.a) {
                        m mVarRequireActivity = aVar11.requireActivity();
                        mVarRequireActivity.getClass();
                        com.garmin.android.apps.connectmobile.bic.a aVar12 = (com.garmin.android.apps.connectmobile.bic.a) mVarRequireActivity;
                        aVar12.f30725b.i(fFloatValue);
                        ComposeView composeView = aVar12.f30724a;
                        if (composeView == null) {
                            p005kotlin.jvm.internal.s.m("setupBackground");
                            throw null;
                        }
                        composeView.setContent(new z3.e(1260181056, true, new dv.h(aVar12, i17)));
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th3) {
                    int i34 = o13.q.f128596b;
                    new o13.q.b(th3);
                }
                return Unit.INSTANCE;
            case 20:
                DevDeviceTutorialsActivity devDeviceTutorialsActivity = (DevDeviceTutorialsActivity) obj2;
                w1 w1Var = devDeviceTutorialsActivity.f33701a;
                k80.m mVar = (k80.m) obj;
                DevDeviceTutorialsActivity.a aVar13 = DevDeviceTutorialsActivity.f33700b;
                if (mVar != null) {
                    int i35 = DevDeviceTutorialsActivity.b.f33702a[mVar.ordinal()];
                    if (i35 == 1) {
                        com.garmin.android.apps.connectmobile.developer.tutorials.b.a aVar14 = com.garmin.android.apps.connectmobile.developer.tutorials.b.f33722b;
                        Uri uri = (Uri) ((k80.a) w1Var.getValue()).f103335e.d();
                        if (uri != null) {
                            com.garmin.android.apps.connectmobile.developer.tutorials.b.AbstractC0563b.C0565b c0565b = new com.garmin.android.apps.connectmobile.developer.tutorials.b.AbstractC0563b.C0565b(uri);
                            aVar14.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("zip_tutorial_data", c0565b);
                            com.garmin.android.apps.connectmobile.developer.tutorials.b bVar5 = new com.garmin.android.apps.connectmobile.developer.tutorials.b();
                            bVar5.setArguments(bundle);
                            v supportFragmentManager = devDeviceTutorialsActivity.getSupportFragmentManager();
                            supportFragmentManager.getClass();
                            androidx.fragment.app.a aVar15 = new androidx.fragment.app.a(supportFragmentManager);
                            aVar15.l(R.id.content_frame, bVar5, null);
                            aVar15.d(null);
                            aVar15.e();
                        }
                    } else if (i35 == 2) {
                        com.garmin.android.apps.connectmobile.developer.tutorials.b.a aVar16 = com.garmin.android.apps.connectmobile.developer.tutorials.b.f33722b;
                        Uri uri2 = (Uri) ((k80.a) w1Var.getValue()).f103335e.d();
                        if (uri2 != null) {
                            com.garmin.android.apps.connectmobile.developer.tutorials.b.AbstractC0563b.a aVar17 = new com.garmin.android.apps.connectmobile.developer.tutorials.b.AbstractC0563b.a(uri2);
                            aVar16.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("zip_tutorial_data", aVar17);
                            com.garmin.android.apps.connectmobile.developer.tutorials.b bVar6 = new com.garmin.android.apps.connectmobile.developer.tutorials.b();
                            bVar6.setArguments(bundle2);
                            v supportFragmentManager2 = devDeviceTutorialsActivity.getSupportFragmentManager();
                            supportFragmentManager2.getClass();
                            androidx.fragment.app.a aVar18 = new androidx.fragment.app.a(supportFragmentManager2);
                            aVar18.l(R.id.content_frame, bVar6, null);
                            aVar18.d(null);
                            aVar18.e();
                        }
                    } else if (i35 != 3) {
                        if (i35 == 4) {
                            devDeviceTutorialsActivity.getSupportFragmentManager().Z();
                        } else {
                            if (i35 != 5) {
                                u0.r();
                                return null;
                            }
                            v supportFragmentManager3 = devDeviceTutorialsActivity.getSupportFragmentManager();
                            androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager3, supportFragmentManager3);
                            aVarB.l(R.id.content_frame, new k80.l(), null);
                            aVarB.d(null);
                            aVarB.e();
                        }
                    }
                }
                return Unit.INSTANCE;
            case 21:
                String str3 = (String) obj;
                TextView textView5 = ((com.garmin.android.apps.connectmobile.developer.tutorials.c) obj2).f33729b;
                if (textView5 != null) {
                    textView5.setText(str3);
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("errorTextView");
                throw null;
            case 22:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b bVar7 = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b) obj2;
                cx0.a aVar19 = (cx0.a) obj;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b.a aVar20 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b.f40906o;
                aVar19.getClass();
                g22.e.f(bVar7);
                if (aVar19.f56599a != 0) {
                    PregnancyListActivity.a aVar21 = PregnancyListActivity.f40524f;
                    m mVarRequireActivity2 = bVar7.requireActivity();
                    tb1.e.f163745a.getClass();
                    PregnancyListActivity.a.b(aVar21, mVarRequireActivity2, tb1.e.a.h());
                    m activity = bVar7.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                } else if (aVar19.f56602d) {
                    PregnancyListActivity.a aVar22 = PregnancyListActivity.f40524f;
                    m mVarRequireActivity3 = bVar7.requireActivity();
                    tb1.e.f163745a.getClass();
                    PregnancyListActivity.a.b(aVar22, mVarRequireActivity3, tb1.e.a.h());
                    m activity2 = bVar7.getActivity();
                    if (activity2 != null) {
                        activity2.finish();
                    }
                } else {
                    Integer num = aVar19.f56601c;
                    if (num != null && num.intValue() == 409) {
                        androidx.appcompat.app.e.a aVar23 = new androidx.appcompat.app.e.a(bVar7.requireContext());
                        aVar23.setTitle(R.string.pregnancy_error_saving_title);
                        aVar23.setMessage(bVar7.getString(R.string.pregnancy_error_saving_message));
                        aVar23.setPositiveButton(R.string.lbl_ok, new h1(bVar7, 27));
                        androidx.appcompat.app.e eVarCreate = aVar23.create();
                        eVarCreate.getClass();
                        eVarCreate.show();
                    } else {
                        o13.p pVar3 = new o13.p(bVar7.getString(R.string.lbl_retry), new kb1.g(bVar7, i17));
                        o13.p pVar4 = new o13.p(bVar7.getString(R.string.lbl_cancel), new kb0.f(12));
                        c22.f fVar = c22.f.f23050a;
                        Context contextRequireContext2 = bVar7.requireContext();
                        contextRequireContext2.getClass();
                        fVar.getClass();
                        c22.f.a(contextRequireContext2, R.string.pregnancy_something_went_wrong, R.string.pregnancy_save_again, pVar3, pVar4).show();
                    }
                    aVar19.f56602d = true;
                }
                return Unit.INSTANCE;
            case 23:
                List list3 = (List) obj;
                list3.getClass();
                ((nw0.f) obj2).invoke(Boolean.valueOf(!list3.isEmpty()));
                return Unit.INSTANCE;
            case 24:
                cn1.d dVar4 = (cn1.d) obj2;
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue3 = bool.booleanValue();
                int i36 = n4.f104243a;
                if (zBooleanValue3) {
                    com.garmin.android.apps.connectmobile.newsfeed.a.f39473a.getClass();
                    com.garmin.android.apps.connectmobile.newsfeed.a.f39474b.f148604g = true;
                }
                dVar4.invoke(bool);
                return Unit.INSTANCE;
            case 25:
                ((kk1.g) obj2).f105151e = (List) obj;
                return Unit.INSTANCE;
            case 26:
                kk2.a.c cVar5 = (kk2.a.c) obj;
                int i37 = kk2.a.f105171h;
                cVar5.getClass();
                return Boolean.valueOf(cVar5.f105178a.equals((kk2.a.b) obj2));
            case 27:
                kn2.a aVar24 = (kn2.a) obj2;
                kn2.b bVar8 = (kn2.b) obj;
                Logger logger = kn2.a.f105681g;
                bVar8.getClass();
                byte[] bArr = bVar8.f105690c;
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
                    messageDigest.update(bArr);
                    bArrCopyOfRange = Arrays.copyOfRange(messageDigest.digest(), 0, 8);
                    break;
                } catch (NoSuchAlgorithmException e4) {
                    kn2.a.f105681g.error("computeImageHash: " + aVar24.f105686e, (Throwable) e4);
                }
                if (bArrCopyOfRange == null) {
                    bArrCopyOfRange = new byte[]{0, 1, 2, 3, 4, 5, 6, 7};
                }
                return new com.garmin.device.nfc.h[]{new com.garmin.device.nfc.h(com.garmin.device.nfc.h.c.TAG_CARD_IMAGE, bArr), com.garmin.device.nfc.h.g(bVar8.f105689b), new com.garmin.device.nfc.h(com.garmin.device.nfc.h.c.TAG_CARD_IMAGE_HASH, bArrCopyOfRange)};
            case 28:
                com.garmin.android.apps.connectmobile.activities.intensityintervalsediting.a aVar25 = (com.garmin.android.apps.connectmobile.activities.intensityintervalsediting.a) obj2;
                String str4 = (String) obj;
                com.garmin.android.apps.connectmobile.activities.intensityintervalsediting.a.C0447a c0447a = com.garmin.android.apps.connectmobile.activities.intensityintervalsediting.a.f29122c;
                str4.getClass();
                ko.j jVar4 = aVar25.f29124b;
                if (jVar4 != null) {
                    ps.p pVar5 = jVar4.f105731b;
                    HashMap<Integer, String> map2 = jVar4.f105739j;
                    LinkedHashSet linkedHashSet = jVar4.f105741l;
                    if (!str4.equals("CANCEL")) {
                        Iterator it5 = linkedHashSet.iterator();
                        while (it5.hasNext()) {
                            int iIntValue = ((Number) it5.next()).intValue();
                            map2.put(Integer.valueOf(iIntValue), str4);
                            List<x0> listG2 = pVar5.g();
                            if (listG2 != null) {
                                int i38 = 0;
                                for (Object obj3 : listG2) {
                                    int i39 = i38 + 1;
                                    if (i38 < 0) {
                                        x.q();
                                        throw null;
                                    }
                                    x0 x0Var2 = (x0) obj3;
                                    if (x0Var2.getLapIndex() == iIntValue && (listG = pVar5.g()) != null) {
                                        listG.set(i38, x0.b(x0Var2, str4, null, -65, 524287));
                                    }
                                    i38 = i39;
                                }
                            }
                        }
                        y0<Boolean> y0Var = jVar4.f105736g;
                        Boolean bool2 = Boolean.TRUE;
                        y0Var.m(bool2);
                        jVar4.f105737h.m(jVar4.f105732c.a(jVar4.f105730a, pVar5, map2, jVar4.f105738i));
                        linkedHashSet.clear();
                        jVar4.f105735f.m(bool2);
                    }
                }
                aVar25.dismiss();
                return Unit.INSTANCE;
            default:
                ((ko.j) obj2).f105733d.m((fw.m) obj);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ f(Object obj, int i14) {
        this.f95871a = i14;
        this.f95872b = obj;
    }
}
