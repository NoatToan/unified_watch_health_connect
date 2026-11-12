package wv0;

import com.garmin.android.apps.connectmobile.R;
import i3.e9;
import i3.mc;
import lc.u0;
import p3.o0;
import p3.p2;
import p3.x1;
import w2.a0;
import w51.n0;

/* JADX INFO: loaded from: classes9.dex */
public final class w {
    /* JADX WARN: Code duplicated, block: B:81:0x04a6  */
    public static final void a(pv0.w wVar, mc mcVar, e23.l lVar, e23.a aVar, p3.m mVar, int i14) {
        pv0.w wVar2;
        mc mcVarF;
        int i15;
        zv0.b bVar;
        aVar.getClass();
        o0 o0VarE = mVar.E(-2001261192);
        int i16 = i14 | (o0VarE.k(wVar.ordinal()) ? 4 : 2) | 16 | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                i15 = i16 & (-113);
                mcVarF = e9.f(true, null, o0VarE, 6, 2);
            } else {
                o0VarE.e();
                i15 = i16 & (-113);
                mcVarF = mcVar;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            zv0.c cVar = zv0.c.f207167a;
            l22.a aVarS = a0.s(o0VarE);
            cVar.getClass();
            switch (zv0.c.a.f207168a[wVar.ordinal()]) {
                case 1:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_alcohol), aVarS.getString(R.string.msg_behavior_alcohol), "Mayo Clinic", "https://www.mayoclinic.org/healthy-lifestyle/nutrition-and-healthy-eating/in-depth/alcohol/art-20044551");
                    break;
                case 2:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_caffeine), aVarS.getString(R.string.msg_behavior_morning_caffeine), "Sleep Foundation", "https://www.sleepfoundation.org/nutrition/caffeine-and-sleep");
                    break;
                case 3:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_caffeine), aVarS.getString(R.string.msg_behavior_late_caffeine), "Sleep Foundation", "https://www.sleepfoundation.org/nutrition/caffeine-and-sleep");
                    break;
                case 4:
                case 5:
                case 6:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_the_health_benefits_of_exercise), aVarS.getString(R.string.msg_the_health_benefits_of_exercise), "National Library of Medicine", "https://pubmed.ncbi.nlm.nih.gov/38366550/");
                    break;
                case 7:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_healthy_meals), aVarS.getString(R.string.msg_behavior_healthy_meals), "American Medical Association", "https://www.ama-assn.org/delivering-care/public-health/what-doctors-wish-patients-knew-about-healthy-eating");
                    break;
                case 8:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_heavy_meals), aVarS.getString(R.string.msg_behavior_heavy_meals), "MD Anderson Center", "https://www.mdanderson.org/publications/focused-on-health/What-happens-when-you-overeat.h23Z1592202.html");
                    break;
                case 9:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_late_meals), aVarS.getString(R.string.msg_behavior_late_meals), "Cleveland Clinic", "https://health.clevelandclinic.org/is-eating-before-bed-bad-for-you");
                    break;
                case 10:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_cold_showers_baths), aVarS.getString(R.string.msg_behavior_cold_showers_baths), "Cleveland Clinic", "https://newsroom.clevelandclinic.org/2024/02/26/does-taking-cold-showers-benefit-your-health");
                    break;
                case 11:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_intermittent_fasting), aVarS.getString(R.string.msg_behavior_intermittent_fasting), "Mayo Clinic", "https://www.mayoclinic.org/healthy-lifestyle/nutrition-and-healthy-eating/expert-answers/intermittent-fasting/faq-20441303");
                    break;
                case 12:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_journaling), aVarS.getString(R.string.msg_behavior_journaling), "Kaiser Permanente", "https://healthy.kaiserpermanente.org/health-wellness/healtharticle.7-benefits-of-keeping-a-journal");
                    break;
                case 13:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_sauna_steam_room), aVarS.getString(R.string.msg_behavior_sauna_steam_room), "Cleveland Clinic", "https://health.clevelandclinic.org/infrared-sauna-benefits");
                    break;
                case 14:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_stretching), aVarS.getString(R.string.msg_behavior_stretching), "Mayo Clinic", "https://www.mayoclinic.org/healthy-lifestyle/fitness/in-depth/stretching/art-20047931");
                    break;
                case 15:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_sunlight), aVarS.getString(R.string.msg_behavior_sunlight), "Johns Hopkins Medicine", "https://www.hopkinsmedicine.org/health/wellness-and-prevention/sun-safety");
                    break;
                case 16:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_acupuncture), aVarS.getString(R.string.msg_behavior_acupuncture), "Cleveland Clinic", "https://my.clevelandclinic.org/health/treatments/4767-acupuncture");
                    break;
                case 17:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_chiropractor), aVarS.getString(R.string.msg_behavior_chiropractor), "Mayo Clinic", "https://www.mayoclinic.org/tests-procedures/chiropractic-adjustment/about/pac-20393513");
                    break;
                case 18:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_compression_therapy), aVarS.getString(R.string.msg_behavior_compression_therapy), "NASM", "https://blog.nasm.org/compression-recovery");
                    break;
                case 19:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_cupping), aVarS.getString(R.string.msg_behavior_cupping), "Cleveland Clinic", "https://my.clevelandclinic.org/health/treatments/16554-cupping");
                    break;
                case 20:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_light_therapy), aVarS.getString(R.string.msg_behavior_light_therapy), "Cleveland Clinic", "https://www.sleepfoundation.org/light-therapy");
                    break;
                case 21:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_massage_therapy), aVarS.getString(R.string.msg_behavior_massage_therapy), "Mayo Clinic", "https://www.mayoclinic.org/tests-procedures/massage-therapy/about/pac-20384595");
                    break;
                case 22:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_physical_therapy), aVarS.getString(R.string.msg_behavior_physical_therapy), "Cleveland Clinic", "https://my.clevelandclinic.org/health/treatments/physical-therapy");
                    break;
                case 23:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_cpap_machine), aVarS.getString(R.string.msg_behavior_cpap_machine), "Sleep Foundation", "https://www.sleepfoundation.org/cpap/what-is-a-cpap-machine");
                    break;
                case 24:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_ear_plugs_headphones), aVarS.getString(R.string.msg_behavior_ear_plugs_headphones), "Consumer Reports", "https://www.consumerreports.org/health/sleeping/how-to-use-earplugs-a6127155936/");
                    break;
                case 25:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_eye_mask), aVarS.getString(R.string.msg_behavior_eye_mask), "Sleep Foundation", "https://www.sleepfoundation.org/sleep-news/sleep-masks-improve-brain-function");
                    break;
                case 26:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_humidifier_use), aVarS.getString(R.string.msg_behavior_humidifier_use), "Sleep Foundation", "https://www.sleepfoundation.org/bedroom-environment/benefits-of-a-humidifier-while-sleeping");
                    break;
                case 27:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_nasal_strips), aVarS.getString(R.string.msg_behavior_nasal_strips), "Sleep Foundation", "https://www.sleepfoundation.org/snoring/how-do-nasal-strips-work");
                    break;
                case 28:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_oversleeping), aVarS.getString(R.string.msg_behavior_oversleeping), "Cleveland Clinic", "https://health.clevelandclinic.org/oversleeping");
                    break;
                case 29:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_pet_in_bedroom), aVarS.getString(R.string.msg_behavior_pet_in_bedroom), "AARP", "https://www.aarp.org/home-family/friends-family/info-2023/reasons-your-pet-shouldnt-sleep-in-your-bed.html");
                    break;
                case 30:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_reading_in_bed), aVarS.getString(R.string.msg_behavior_reading_in_bed), "Sleep Foundation", "https://www.sleepfoundation.org/sleep-hygiene/reading-before-bed");
                    break;
                case 31:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_screens_before_bed), aVarS.getString(R.string.msg_behavior_screens_before_bed), "Society of Behavioral Medicine", "https://www.sbm.org/healthy-living/blue-in-the-face-the-effects-of-blue-light-on-sleep?gad_source=1&gclid=Cj0KCQjws560BhCuARIsAHMqE0G_mqeDsHKI_vYBCPtomrKgQU8nxWJg-33qJt5tx-EmNoXVhGzsgzoaAgP0EALw_wcB");
                    break;
                case 32:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_shared_bed), aVarS.getString(R.string.msg_behavior_shared_bed), "UnityPoint Health", "https://www.unitypoint.org/news-and-articles/how-to-sleep-better-when-sharing-a-bed");
                    break;
                case 33:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_sleep_sounds), aVarS.getString(R.string.msg_behavior_sleep_sounds), "Sleep Foundation", "https://www.sleepfoundation.org/noise-and-sleep/pink-noise-sleep");
                    break;
                case 34:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_allergy_symptoms), aVarS.getString(R.string.msg_behavior_allergy_symptoms), "AAFA", "https://aafa.org/allergies/prevent-allergies/");
                    break;
                case 35:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_breastfeeding), aVarS.getString(R.string.msg_behavior_breastfeeding), "Johns Hopkins Medicine", "https://www.hopkinsmedicine.org/health/wellness-and-prevention/5-breastfeeding-diet-myths");
                    break;
                case 36:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_caregiving), aVarS.getString(R.string.msg_behavior_caregiving), "Mayo Clinic", "https://www.mayoclinic.org/healthy-lifestyle/stress-management/in-depth/caregiver-stress/art-20044784");
                    break;
                case 37:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_high_altitude), aVarS.getString(R.string.msg_behavior_high_altitude), "Cleveland Clinic", "https://my.clevelandclinic.org/health/diseases/15111-altitude-sickness");
                    break;
                case 38:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_illness), aVarS.getString(R.string.msg_behavior_illness), "American Heart Association", "https://www.heart.org/en/news/2023/12/19/the-dos-and-donts-to-help-you-get-better-and-protect-others-when-you-have-a-virus");
                    break;
                case 39:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_infant_at_home), aVarS.getString(R.string.msg_behavior_infant_at_home), "Unicef", "https://www.unicef.org/blog/caregiver-mental-health-well-being-key-thriving-families");
                    break;
                case 40:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_injured), aVarS.getString(R.string.msg_behavior_injured), "Mayo Clinic", "https://sportsmedicine.mayoclinic.org/news/recovering-from-sports-injuries-like-a-pro/");
                    break;
                case 41:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_migraines), aVarS.getString(R.string.msg_behavior_migraines), "Cleveland Clinic", "https://my.clevelandclinic.org/health/diseases/5005-migraine-headaches");
                    break;
                case 42:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_period_day), aVarS.getString(R.string.msg_behavior_period_day), "Mayo Clinic", "https://www.mayoclinic.org/diseases-conditions/premenstrual-syndrome/symptoms-causes/syc-20376780");
                    break;
                case 43:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_traveling_vacation), aVarS.getString(R.string.msg_behavior_traveling_vacation), "American Heart Association", "https://www.heart.org/en/healthy-living/healthy-lifestyle/mental-health-and-wellbeing/healthy-travel");
                    break;
                case 44:
                case 45:
                case 46:
                    bVar = new zv0.b(aVarS.getString(R.string.lbl_behavior_intro_exercise_before_bed), aVarS.getString(R.string.msg_behavior_exercise_before_bed), "Sleep Doctor", "https://sleepdoctor.com/pages/health/exercise");
                    break;
                default:
                    u0.r();
                    return;
            }
            zv0.a aVar2 = zv0.a.f207158a;
            l22.a aVarS2 = a0.s(o0VarE);
            aVar2.getClass();
            wVar2 = wVar;
            String strB = zv0.a.b(wVar2, aVarS2);
            l72.w wVar3 = l72.w.f111301a;
            String strP = gl1.y.P(R.string.lbl_about_behavior, new Object[]{strB}, o0VarE);
            z3.e eVarC = z3.f.c(-1190070087, new n0(aVar, 11), o0VarE);
            boolean z14 = (i15 & 7168) == 2048;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new v(aVar, 0);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new v(aVar, 0);
                    o0VarE.K(objQ);
                }
            }
            wVar3.f(strP, null, null, eVarC, (e23.a) objQ, mcVarF, false, null, z3.f.c(1810208591, new vv0.e(15, bVar, lVar), o0VarE), o0VarE, 805309440, 454);
        } else {
            wVar2 = wVar;
            o0VarE.e();
            mcVarF = mcVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w21.d(wVar2, mcVarF, lVar, aVar, i14, 12);
        }
    }
}
