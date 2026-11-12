package ae1;

import android.content.Context;
import android.content.pm.PackageManager;
import c22.c2;
import c22.g2;
import c22.x0;
import com.garmin.android.apps.connectmobile.gcm_on_demand_resources.R;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lae1/a;", "Lc22/c2;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "gcm_on_demand_resources_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements c2 {
    public final Context b;

    public a(Context context) {
        context.getClass();
        this.b = context;
    }

    public final String a(String str) {
        str.getClass();
        x0.a.getClass();
        boolean zD = g2.d(str, x0.W7);
        Context context = this.b;
        if (zD) {
            String string = context.getString(R.string.add_new_dog);
            string.getClass();
            return string;
        }
        if (g2.d(str, x0.X7)) {
            String string2 = context.getString(R.string.add_new_dog_alert_message);
            string2.getClass();
            return string2;
        }
        if (g2.d(str, x0.Y7)) {
            String string3 = context.getString(R.string.lbl_activities_with_dogs);
            string3.getClass();
            return string3;
        }
        if (g2.d(str, x0.Z7)) {
            String string4 = context.getString(R.string.lbl_activity_stats_with_dogs);
            string4.getClass();
            return string4;
        }
        if (g2.d(str, x0.a8)) {
            String string5 = context.getString(R.string.lbl_add_a_dog);
            string5.getClass();
            return string5;
        }
        if (g2.d(str, x0.b8)) {
            String string6 = context.getString(R.string.lbl_all_activities_with_dogs);
            string6.getClass();
            return string6;
        }
        if (g2.d(str, x0.c8)) {
            String string7 = context.getString(R.string.lbl_canicross);
            string7.getClass();
            return string7;
        }
        if (g2.d(str, x0.d8)) {
            String string8 = context.getString(R.string.lbl_create_profile_for_dog);
            string8.getClass();
            return string8;
        }
        if (g2.d(str, x0.e8)) {
            String string9 = context.getString(R.string.lbl_dog);
            string9.getClass();
            return string9;
        }
        if (g2.d(str, x0.f8)) {
            String string10 = context.getString(R.string.lbl_dog_breed_concatentation);
            string10.getClass();
            return string10;
        }
        if (g2.d(str, x0.g8)) {
            String string11 = context.getString(R.string.lbl_dog_limit_reached);
            string11.getClass();
            return string11;
        }
        if (g2.d(str, x0.h8)) {
            String string12 = context.getString(R.string.lbl_dogs);
            string12.getClass();
            return string12;
        }
        if (g2.d(str, x0.i8)) {
            String string13 = context.getString(R.string.lbl_dogs_create_profile_message);
            string13.getClass();
            return string13;
        }
        if (g2.d(str, x0.j8)) {
            String string14 = context.getString(R.string.lbl_dogs_fixed);
            string14.getClass();
            return string14;
        }
        if (g2.d(str, x0.k8)) {
            String string15 = context.getString(R.string.lbl_dogs_genesis_message);
            string15.getClass();
            return string15;
        }
        if (g2.d(str, x0.l8)) {
            String string16 = context.getString(R.string.lbl_dogs_genesis_message_child_account);
            string16.getClass();
            return string16;
        }
        if (g2.d(str, x0.m8)) {
            String string17 = context.getString(R.string.lbl_dogs_genesis_title);
            string17.getClass();
            return string17;
        }
        if (g2.d(str, x0.n8)) {
            String string18 = context.getString(R.string.lbl_dogs_help_p1);
            string18.getClass();
            return string18;
        }
        if (g2.d(str, x0.o8)) {
            String string19 = context.getString(R.string.lbl_dogs_help_p2);
            string19.getClass();
            return string19;
        }
        if (g2.d(str, x0.p8)) {
            String string20 = context.getString(R.string.lbl_dogs_help_p3);
            string20.getClass();
            return string20;
        }
        if (g2.d(str, x0.q8)) {
            String string21 = context.getString(R.string.lbl_dogs_help_p4);
            string21.getClass();
            return string21;
        }
        if (g2.d(str, x0.r8)) {
            String string22 = context.getString(R.string.lbl_dogs_no_dogs_added);
            string22.getClass();
            return string22;
        }
        if (g2.d(str, x0.s8)) {
            String string23 = context.getString(R.string.lbl_dogs_original_image);
            string23.getClass();
            return string23;
        }
        if (g2.d(str, x0.t8)) {
            String string24 = context.getString(R.string.lbl_dogs_previous_image);
            string24.getClass();
            return string24;
        }
        if (g2.d(str, x0.u8)) {
            String string25 = context.getString(R.string.lbl_dogs_primary_breed_required);
            string25.getClass();
            return string25;
        }
        if (g2.d(str, x0.v8)) {
            String string26 = context.getString(R.string.lbl_dogs_remove_alert_message);
            string26.getClass();
            return string26;
        }
        if (g2.d(str, x0.w8)) {
            String string27 = context.getString(R.string.lbl_dogs_remove_alert_title);
            string27.getClass();
            return string27;
        }
        if (g2.d(str, x0.x8)) {
            String string28 = context.getString(R.string.lbl_dogs_retire_alert_message);
            string28.getClass();
            return string28;
        }
        if (g2.d(str, x0.y8)) {
            String string29 = context.getString(R.string.lbl_dogs_retire_alert_title);
            string29.getClass();
            return string29;
        }
        if (g2.d(str, x0.z8)) {
            String string30 = context.getString(R.string.lbl_dogs_toggle_physio_metrics_description);
            string30.getClass();
            return string30;
        }
        if (g2.d(str, x0.A8)) {
            String string31 = context.getString(R.string.lbl_dogs_your_activities_with);
            string31.getClass();
            return string31;
        }
        if (g2.d(str, x0.B8)) {
            String string32 = context.getString(R.string.lbl_edit_dog);
            string32.getClass();
            return string32;
        }
        if (g2.d(str, x0.C8)) {
            String string33 = context.getString(R.string.lbl_include_a_dog);
            string33.getClass();
            return string33;
        }
        if (g2.d(str, x0.D8)) {
            String string34 = context.getString(R.string.lbl_least_recent);
            string34.getClass();
            return string34;
        }
        if (g2.d(str, x0.E8)) {
            String string35 = context.getString(R.string.lbl_no_active_dogs);
            string35.getClass();
            return string35;
        }
        if (g2.d(str, x0.F8)) {
            String string36 = context.getString(R.string.lbl_no_retired_dogs);
            string36.getClass();
            return string36;
        }
        if (g2.d(str, x0.G8)) {
            String string37 = context.getString(R.string.lbl_physio_metrics);
            string37.getClass();
            return string37;
        }
        if (g2.d(str, x0.H8)) {
            String string38 = context.getString(R.string.lbl_physio_metrics_off);
            string38.getClass();
            return string38;
        }
        if (g2.d(str, x0.I8)) {
            String string39 = context.getString(R.string.lbl_physio_metrics_on);
            string39.getClass();
            return string39;
        }
        if (g2.d(str, x0.J8)) {
            String string40 = context.getString(R.string.lbl_primary_breed);
            string40.getClass();
            return string40;
        }
        if (g2.d(str, x0.K8)) {
            String string41 = context.getString(R.string.lbl_reached_dog_limit_message);
            string41.getClass();
            return string41;
        }
        if (g2.d(str, x0.L8)) {
            String string42 = context.getString(R.string.lbl_secondary_breed);
            string42.getClass();
            return string42;
        }
        if (g2.d(str, x0.M8)) {
            String string43 = context.getString(R.string.lbl_secondary_breeds);
            string43.getClass();
            return string43;
        }
        if (g2.d(str, x0.N8)) {
            String string44 = context.getString(R.string.lbl_select_count);
            string44.getClass();
            return string44;
        }
        if (g2.d(str, x0.O8)) {
            String string45 = context.getString(R.string.lbl_select_secondary_breeds);
            string45.getClass();
            return string45;
        }
        if (g2.d(str, x0.P8)) {
            String string46 = context.getString(R.string.lbl_sex);
            string46.getClass();
            return string46;
        }
        if (g2.d(str, x0.Q8)) {
            String string47 = context.getString(R.string.lbl_skijoring);
            string47.getClass();
            return string47;
        }
        if (g2.d(str, x0.R8)) {
            String string48 = context.getString(R.string.lbl_unable_to_add_dog);
            string48.getClass();
            return string48;
        }
        if (g2.d(str, x0.S8)) {
            String string49 = context.getString(R.string.lbl_unable_to_add_dog_message);
            string49.getClass();
            return string49;
        }
        if (g2.d(str, x0.T8)) {
            String string50 = context.getString(R.string.lbl_unretire_dog);
            string50.getClass();
            return string50;
        }
        if (g2.d(str, x0.U8)) {
            String string51 = context.getString(R.string.lbl_unretire_dog_to_edit_message);
            string51.getClass();
            return string51;
        }
        if (g2.d(str, x0.V8)) {
            String string52 = context.getString(R.string.lbl_view_activities_with_dogs);
            string52.getClass();
            return string52;
        }
        if (g2.d(str, x0.W8)) {
            String string53 = context.getString(R.string.lbl_you_have_no_retired_dogs);
            string53.getClass();
            return string53;
        }
        if (g2.d(str, x0.b)) {
            String string54 = context.getString(R.string.DOG_BREED_AFFENPINSCHER);
            string54.getClass();
            return string54;
        }
        if (g2.d(str, x0.c)) {
            String string55 = context.getString(R.string.DOG_BREED_AFGHAN_HOUND);
            string55.getClass();
            return string55;
        }
        if (g2.d(str, x0.d)) {
            String string56 = context.getString(R.string.DOG_BREED_AIREDALE_TERRIER);
            string56.getClass();
            return string56;
        }
        if (g2.d(str, x0.e)) {
            String string57 = context.getString(R.string.DOG_BREED_AKITA);
            string57.getClass();
            return string57;
        }
        if (g2.d(str, x0.f)) {
            String string58 = context.getString(R.string.DOG_BREED_ALASKAN_MALAMUTE);
            string58.getClass();
            return string58;
        }
        if (g2.d(str, x0.g)) {
            String string59 = context.getString(R.string.DOG_BREED_ALPINE_DACHSBRACKE);
            string59.getClass();
            return string59;
        }
        if (g2.d(str, x0.h)) {
            String string60 = context.getString(R.string.DOG_BREED_AMERICAN_AKITA);
            string60.getClass();
            return string60;
        }
        if (g2.d(str, x0.i)) {
            String string61 = context.getString(R.string.DOG_BREED_AMERICAN_COCKER_SPANIEL);
            string61.getClass();
            return string61;
        }
        if (g2.d(str, x0.j)) {
            String string62 = context.getString(R.string.DOG_BREED_AMERICAN_FOXHOUND);
            string62.getClass();
            return string62;
        }
        if (g2.d(str, x0.k)) {
            String string63 = context.getString(R.string.DOG_BREED_AMERICAN_STAFFORDSHIRE_TERRIER);
            string63.getClass();
            return string63;
        }
        if (g2.d(str, x0.l)) {
            String string64 = context.getString(R.string.DOG_BREED_AMERICAN_WATER_SPANIEL);
            string64.getClass();
            return string64;
        }
        if (g2.d(str, x0.m)) {
            String string65 = context.getString(R.string.DOG_BREED_APPENZELL_CATTLE_DOG);
            string65.getClass();
            return string65;
        }
        if (g2.d(str, x0.n)) {
            String string66 = context.getString(R.string.DOG_BREED_ARIEGEOIS);
            string66.getClass();
            return string66;
        }
        if (g2.d(str, x0.o)) {
            String string67 = context.getString(R.string.DOG_BREED_ARIEGE_POINTING_DOG);
            string67.getClass();
            return string67;
        }
        if (g2.d(str, x0.p)) {
            String string68 = context.getString(R.string.DOG_BREED_ARTOIS_HOUND);
            string68.getClass();
            return string68;
        }
        if (g2.d(str, x0.q)) {
            String string69 = context.getString(R.string.DOG_BREED_ATLAS_MOUNTAIN_DOG_AIDI);
            string69.getClass();
            return string69;
        }
        if (g2.d(str, x0.r)) {
            String string70 = context.getString(R.string.DOG_BREED_AUSSIEDOODLE);
            string70.getClass();
            return string70;
        }
        if (g2.d(str, x0.s)) {
            String string71 = context.getString(R.string.DOG_BREED_AUSSIE_LAB);
            string71.getClass();
            return string71;
        }
        if (g2.d(str, x0.t)) {
            String string72 = context.getString(R.string.DOG_BREED_AUSTRALIAN_CATTLE_DOG);
            string72.getClass();
            return string72;
        }
        if (g2.d(str, x0.u)) {
            String string73 = context.getString(R.string.DOG_BREED_AUSTRALIAN_KELPIE);
            string73.getClass();
            return string73;
        }
        if (g2.d(str, x0.v)) {
            String string74 = context.getString(R.string.DOG_BREED_AUSTRALIAN_SHEPHERD);
            string74.getClass();
            return string74;
        }
        if (g2.d(str, x0.w)) {
            String string75 = context.getString(R.string.DOG_BREED_AUSTRALIAN_SILKY_TERRIER);
            string75.getClass();
            return string75;
        }
        if (g2.d(str, x0.x)) {
            String string76 = context.getString(R.string.DOG_BREED_AUSTRALIAN_STUMPY_TAIL_CATTLE_DOG);
            string76.getClass();
            return string76;
        }
        if (g2.d(str, x0.y)) {
            String string77 = context.getString(R.string.DOG_BREED_AUSTRALIAN_TERRIER);
            string77.getClass();
            return string77;
        }
        if (g2.d(str, x0.z)) {
            String string78 = context.getString(R.string.DOG_BREED_AUSTRIAN_BLACK_AND_TAN_HOUND);
            string78.getClass();
            return string78;
        }
        if (g2.d(str, x0.A)) {
            String string79 = context.getString(R.string.DOG_BREED_AUSTRIAN_PINSCHER);
            string79.getClass();
            return string79;
        }
        if (g2.d(str, x0.B)) {
            String string80 = context.getString(R.string.DOG_BREED_AUVERGNE_POINTER);
            string80.getClass();
            return string80;
        }
        if (g2.d(str, x0.C)) {
            String string81 = context.getString(R.string.DOG_BREED_AZAWAKH);
            string81.getClass();
            return string81;
        }
        if (g2.d(str, x0.D)) {
            String string82 = context.getString(R.string.DOG_BREED_BASENJI);
            string82.getClass();
            return string82;
        }
        if (g2.d(str, x0.E)) {
            String string83 = context.getString(R.string.DOG_BREED_BASSETOODLE);
            string83.getClass();
            return string83;
        }
        if (g2.d(str, x0.F)) {
            String string84 = context.getString(R.string.DOG_BREED_BASSET_FAUVE_DE_BRETAGNE);
            string84.getClass();
            return string84;
        }
        if (g2.d(str, x0.G)) {
            String string85 = context.getString(R.string.DOG_BREED_BASSET_HOUND);
            string85.getClass();
            return string85;
        }
        if (g2.d(str, x0.H)) {
            String string86 = context.getString(R.string.DOG_BREED_BAVARIAN_MOUNTAIN_SCENT_HOUND);
            string86.getClass();
            return string86;
        }
        if (g2.d(str, x0.I)) {
            String string87 = context.getString(R.string.DOG_BREED_BEAGADOR);
            string87.getClass();
            return string87;
        }
        if (g2.d(str, x0.J)) {
            String string88 = context.getString(R.string.DOG_BREED_BEAGLE);
            string88.getClass();
            return string88;
        }
        if (g2.d(str, x0.K)) {
            String string89 = context.getString(R.string.DOG_BREED_BEAGLE_HARRIER);
            string89.getClass();
            return string89;
        }
        if (g2.d(str, x0.L)) {
            String string90 = context.getString(R.string.DOG_BREED_BEARDED_COLLIE);
            string90.getClass();
            return string90;
        }
        if (g2.d(str, x0.M)) {
            String string91 = context.getString(R.string.DOG_BREED_BEDLINGTON_TERRIER);
            string91.getClass();
            return string91;
        }
        if (g2.d(str, x0.N)) {
            String string92 = context.getString(R.string.DOG_BREED_BELGIAN_SHEPHERD_DOG);
            string92.getClass();
            return string92;
        }
        if (g2.d(str, x0.O)) {
            String string93 = context.getString(R.string.DOG_BREED_BERGAMASCO_SHEPHERD_DOG);
            string93.getClass();
            return string93;
        }
        if (g2.d(str, x0.P)) {
            String string94 = context.getString(R.string.DOG_BREED_BERGER_DE_BEAUCE);
            string94.getClass();
            return string94;
        }
        if (g2.d(str, x0.Q)) {
            String string95 = context.getString(R.string.DOG_BREED_BERNEDOODLE);
            string95.getClass();
            return string95;
        }
        if (g2.d(str, x0.R)) {
            String string96 = context.getString(R.string.DOG_BREED_BERNEFIE);
            string96.getClass();
            return string96;
        }
        if (g2.d(str, x0.S)) {
            String string97 = context.getString(R.string.DOG_BREED_BERNESE_MOUNTAIN_DOG);
            string97.getClass();
            return string97;
        }
        if (g2.d(str, x0.T)) {
            String string98 = context.getString(R.string.DOG_BREED_BERNESE_SHEPHERD);
            string98.getClass();
            return string98;
        }
        if (g2.d(str, x0.U)) {
            String string99 = context.getString(R.string.DOG_BREED_BICHON_FRISE);
            string99.getClass();
            return string99;
        }
        if (g2.d(str, x0.V)) {
            String string100 = context.getString(R.string.DOG_BREED_BILLY);
            string100.getClass();
            return string100;
        }
        if (g2.d(str, x0.W)) {
            String string101 = context.getString(R.string.DOG_BREED_BLACK_AND_TAN_COONHOUND);
            string101.getClass();
            return string101;
        }
        if (g2.d(str, x0.X)) {
            String string102 = context.getString(R.string.DOG_BREED_BLOODHOUND);
            string102.getClass();
            return string102;
        }
        if (g2.d(str, x0.Y)) {
            String string103 = context.getString(R.string.DOG_BREED_BLUE_GASCONY_BASSET);
            string103.getClass();
            return string103;
        }
        if (g2.d(str, x0.Z)) {
            String string104 = context.getString(R.string.DOG_BREED_BLUE_GASCONY_GRIFFON);
            string104.getClass();
            return string104;
        }
        if (g2.d(str, x0.a0)) {
            String string105 = context.getString(R.string.DOG_BREED_BLUE_PICARDY_SPANIEL);
            string105.getClass();
            return string105;
        }
        if (g2.d(str, x0.b0)) {
            String string106 = context.getString(R.string.DOG_BREED_BOHEMIAN_SHEPHERD_DOG);
            string106.getClass();
            return string106;
        }
        if (g2.d(str, x0.c0)) {
            String string107 = context.getString(R.string.DOG_BREED_BOHEMIAN_WIREHAIRED_POINTING_GRIFFON);
            string107.getClass();
            return string107;
        }
        if (g2.d(str, x0.d0)) {
            String string108 = context.getString(R.string.DOG_BREED_BOJACK);
            string108.getClass();
            return string108;
        }
        if (g2.d(str, x0.e0)) {
            String string109 = context.getString(R.string.DOG_BREED_BOLOGNESE);
            string109.getClass();
            return string109;
        }
        if (g2.d(str, x0.f0)) {
            String string110 = context.getString(R.string.DOG_BREED_BORDER_COLLIE);
            string110.getClass();
            return string110;
        }
        if (g2.d(str, x0.g0)) {
            String string111 = context.getString(R.string.DOG_BREED_BORDER_COLLIE_LAB);
            string111.getClass();
            return string111;
        }
        if (g2.d(str, x0.h0)) {
            String string112 = context.getString(R.string.DOG_BREED_BORDER_TERRIER);
            string112.getClass();
            return string112;
        }
        if (g2.d(str, x0.i0)) {
            String string113 = context.getString(R.string.DOG_BREED_BORDOODLE);
            string113.getClass();
            return string113;
        }
        if (g2.d(str, x0.j0)) {
            String string114 = context.getString(R.string.DOG_BREED_BORZOI__RUSSIAN_HUNTING_SIGHTHOUND);
            string114.getClass();
            return string114;
        }
        if (g2.d(str, x0.k0)) {
            String string115 = context.getString(R.string.DOG_BREED_BOSNIAN_AND_HERZEGOVINIAN__CROATIAN_SHEPHERD_DOG);
            string115.getClass();
            return string115;
        }
        if (g2.d(str, x0.l0)) {
            String string116 = context.getString(R.string.DOG_BREED_BOSNIAN_BROKENHAIRED_HOUND__CALLED_BARAK);
            string116.getClass();
            return string116;
        }
        if (g2.d(str, x0.m0)) {
            String string117 = context.getString(R.string.DOG_BREED_BOSTON_HUAHUA);
            string117.getClass();
            return string117;
        }
        if (g2.d(str, x0.n0)) {
            String string118 = context.getString(R.string.DOG_BREED_BOSTON_TERRIER);
            string118.getClass();
            return string118;
        }
        if (g2.d(str, x0.o0)) {
            String string119 = context.getString(R.string.DOG_BREED_BOURBONNAIS_POINTING_DOG);
            string119.getClass();
            return string119;
        }
        if (g2.d(str, x0.p0)) {
            String string120 = context.getString(R.string.DOG_BREED_BOUVIER_DES_ARDENNES);
            string120.getClass();
            return string120;
        }
        if (g2.d(str, x0.q0)) {
            String string121 = context.getString(R.string.DOG_BREED_BOUVIER_DES_FLANDRES);
            string121.getClass();
            return string121;
        }
        if (g2.d(str, x0.r0)) {
            String string122 = context.getString(R.string.DOG_BREED_BOXADOR);
            string122.getClass();
            return string122;
        }
        if (g2.d(str, x0.s0)) {
            String string123 = context.getString(R.string.DOG_BREED_BOXANE);
            string123.getClass();
            return string123;
        }
        if (g2.d(str, x0.t0)) {
            String string124 = context.getString(R.string.DOG_BREED_BOXER);
            string124.getClass();
            return string124;
        }
        if (g2.d(str, x0.u0)) {
            String string125 = context.getString(R.string.DOG_BREED_BOXERDOODLE);
            string125.getClass();
            return string125;
        }
        if (g2.d(str, x0.v0)) {
            String string126 = context.getString(R.string.DOG_BREED_BRAZILIAN_TERRIER);
            string126.getClass();
            return string126;
        }
        if (g2.d(str, x0.w0)) {
            String string127 = context.getString(R.string.DOG_BREED_BRAZILIAN_TRACKER);
            string127.getClass();
            return string127;
        }
        if (g2.d(str, x0.x0)) {
            String string128 = context.getString(R.string.DOG_BREED_BRIARD);
            string128.getClass();
            return string128;
        }
        if (g2.d(str, x0.y0)) {
            String string129 = context.getString(R.string.DOG_BREED_BRIQUET_GRIFFON_VENDEEN);
            string129.getClass();
            return string129;
        }
        if (g2.d(str, x0.z0)) {
            String string130 = context.getString(R.string.DOG_BREED_BRITTANY_SPANIEL);
            string130.getClass();
            return string130;
        }
        if (g2.d(str, x0.A0)) {
            String string131 = context.getString(R.string.DOG_BREED_BROHOLMER);
            string131.getClass();
            return string131;
        }
        if (g2.d(str, x0.B0)) {
            String string132 = context.getString(R.string.DOG_BREED_BUGG);
            string132.getClass();
            return string132;
        }
        if (g2.d(str, x0.C0)) {
            String string133 = context.getString(R.string.DOG_BREED_BULLADOR);
            string133.getClass();
            return string133;
        }
        if (g2.d(str, x0.D0)) {
            String string134 = context.getString(R.string.DOG_BREED_BULLBOXER);
            string134.getClass();
            return string134;
        }
        if (g2.d(str, x0.E0)) {
            String string135 = context.getString(R.string.DOG_BREED_BULLDOG);
            string135.getClass();
            return string135;
        }
        if (g2.d(str, x0.F0)) {
            String string136 = context.getString(R.string.DOG_BREED_BULLMASTIFF);
            string136.getClass();
            return string136;
        }
        if (g2.d(str, x0.G0)) {
            String string137 = context.getString(R.string.DOG_BREED_BULLMATIAN);
            string137.getClass();
            return string137;
        }
        if (g2.d(str, x0.H0)) {
            String string138 = context.getString(R.string.DOG_BREED_BULL_DANIFF);
            string138.getClass();
            return string138;
        }
        if (g2.d(str, x0.I0)) {
            String string139 = context.getString(R.string.DOG_BREED_BULL_TERRIER);
            string139.getClass();
            return string139;
        }
        if (g2.d(str, x0.J0)) {
            String string140 = context.getString(R.string.DOG_BREED_BULL_TERRIER_LAB);
            string140.getClass();
            return string140;
        }
        if (g2.d(str, x0.K0)) {
            String string141 = context.getString(R.string.DOG_BREED_BURGOS_POINTING_DOG);
            string141.getClass();
            return string141;
        }
        if (g2.d(str, x0.L0)) {
            String string142 = context.getString(R.string.DOG_BREED_CAIRN_TERRIER);
            string142.getClass();
            return string142;
        }
        if (g2.d(str, x0.M0)) {
            String string143 = context.getString(R.string.DOG_BREED_CANAAN_DOG);
            string143.getClass();
            return string143;
        }
        if (g2.d(str, x0.N0)) {
            String string144 = context.getString(R.string.DOG_BREED_CANADIAN_ESKIMO_DOG);
            string144.getClass();
            return string144;
        }
        if (g2.d(str, x0.O0)) {
            String string145 = context.getString(R.string.DOG_BREED_CANARIAN_WARREN_HOUND);
            string145.getClass();
            return string145;
        }
        if (g2.d(str, x0.P0)) {
            String string146 = context.getString(R.string.DOG_BREED_CASTRO_LABOREIRO_DOG);
            string146.getClass();
            return string146;
        }
        if (g2.d(str, x0.Q0)) {
            String string147 = context.getString(R.string.DOG_BREED_CATALAN_SHEEPDOG);
            string147.getClass();
            return string147;
        }
        if (g2.d(str, x0.R0)) {
            String string148 = context.getString(R.string.DOG_BREED_CAUCASIAN_SHEPHERD_DOG);
            string148.getClass();
            return string148;
        }
        if (g2.d(str, x0.S0)) {
            String string149 = context.getString(R.string.DOG_BREED_CAVACHIN);
            string149.getClass();
            return string149;
        }
        if (g2.d(str, x0.T0)) {
            String string150 = context.getString(R.string.DOG_BREED_CAVACHON);
            string150.getClass();
            return string150;
        }
        if (g2.d(str, x0.U0)) {
            String string151 = context.getString(R.string.DOG_BREED_CAVADOR);
            string151.getClass();
            return string151;
        }
        if (g2.d(str, x0.V0)) {
            String string152 = context.getString(R.string.DOG_BREED_CAVALIER_KING_CHARLES_SPANIEL);
            string152.getClass();
            return string152;
        }
        if (g2.d(str, x0.W0)) {
            String string153 = context.getString(R.string.DOG_BREED_CAVAPOM);
            string153.getClass();
            return string153;
        }
        if (g2.d(str, x0.X0)) {
            String string154 = context.getString(R.string.DOG_BREED_CAVAPOO);
            string154.getClass();
            return string154;
        }
        if (g2.d(str, x0.Y0)) {
            String string155 = context.getString(R.string.DOG_BREED_CENTRAL_ASIA_SHEPHERD_DOG);
            string155.getClass();
            return string155;
        }
        if (g2.d(str, x0.Z0)) {
            String string156 = context.getString(R.string.DOG_BREED_CESKY_TERRIER);
            string156.getClass();
            return string156;
        }
        if (g2.d(str, x0.a1)) {
            String string157 = context.getString(R.string.DOG_BREED_CHESAPEAKE_BAY_RETRIEVER);
            string157.getClass();
            return string157;
        }
        if (g2.d(str, x0.b1)) {
            String string158 = context.getString(R.string.DOG_BREED_CHIHUAHUA);
            string158.getClass();
            return string158;
        }
        if (g2.d(str, x0.c1)) {
            String string159 = context.getString(R.string.DOG_BREED_CHINESE_CRESTED_DOG);
            string159.getClass();
            return string159;
        }
        if (g2.d(str, x0.d1)) {
            String string160 = context.getString(R.string.DOG_BREED_CHIPOO);
            string160.getClass();
            return string160;
        }
        if (g2.d(str, x0.e1)) {
            String string161 = context.getString(R.string.DOG_BREED_CHIWEENIE);
            string161.getClass();
            return string161;
        }
        if (g2.d(str, x0.f1)) {
            String string162 = context.getString(R.string.DOG_BREED_CHORKIE);
            string162.getClass();
            return string162;
        }
        if (g2.d(str, x0.g1)) {
            String string163 = context.getString(R.string.DOG_BREED_CHOW_CHOW);
            string163.getClass();
            return string163;
        }
        if (g2.d(str, x0.h1)) {
            String string164 = context.getString(R.string.DOG_BREED_CIMARR_N_URUGUAYO_res_0x8001006e);
            string164.getClass();
            return string164;
        }
        if (g2.d(str, x0.i1)) {
            String string165 = context.getString(R.string.DOG_BREED_CIRNECO_DELLETNA);
            string165.getClass();
            return string165;
        }
        if (g2.d(str, x0.j1)) {
            String string166 = context.getString(R.string.DOG_BREED_CLUMBER_SPANIEL);
            string166.getClass();
            return string166;
        }
        if (g2.d(str, x0.k1)) {
            String string167 = context.getString(R.string.DOG_BREED_COARSEHAIRED_STYRIAN_HOUND);
            string167.getClass();
            return string167;
        }
        if (g2.d(str, x0.l1)) {
            String string168 = context.getString(R.string.DOG_BREED_COCKAPOO);
            string168.getClass();
            return string168;
        }
        if (g2.d(str, x0.m1)) {
            String string169 = context.getString(R.string.DOG_BREED_COLLIE_ROUGH);
            string169.getClass();
            return string169;
        }
        if (g2.d(str, x0.n1)) {
            String string170 = context.getString(R.string.DOG_BREED_COLLIE_SMOOTH);
            string170.getClass();
            return string170;
        }
        if (g2.d(str, x0.o1)) {
            String string171 = context.getString(R.string.DOG_BREED_CONTINENTAL_BULLDOG);
            string171.getClass();
            return string171;
        }
        if (g2.d(str, x0.p1)) {
            String string172 = context.getString(R.string.DOG_BREED_CONTINENTAL_TOY_SPANIEL);
            string172.getClass();
            return string172;
        }
        if (g2.d(str, x0.q1)) {
            String string173 = context.getString(R.string.DOG_BREED_CORGIDOR);
            string173.getClass();
            return string173;
        }
        if (g2.d(str, x0.r1)) {
            String string174 = context.getString(R.string.DOG_BREED_CORGIPOM);
            string174.getClass();
            return string174;
        }
        if (g2.d(str, x0.s1)) {
            String string175 = context.getString(R.string.DOG_BREED_CORGIPOO);
            string175.getClass();
            return string175;
        }
        if (g2.d(str, x0.t1)) {
            String string176 = context.getString(R.string.DOG_BREED_CORGSKY);
            string176.getClass();
            return string176;
        }
        if (g2.d(str, x0.u1)) {
            String string177 = context.getString(R.string.DOG_BREED_CORKIE);
            string177.getClass();
            return string177;
        }
        if (g2.d(str, x0.v1)) {
            String string178 = context.getString(R.string.DOG_BREED_CORMAN_SHEPHERD);
            string178.getClass();
            return string178;
        }
        if (g2.d(str, x0.w1)) {
            String string179 = context.getString(R.string.DOG_BREED_COTON_DE_TULEAR);
            string179.getClass();
            return string179;
        }
        if (g2.d(str, x0.x1)) {
            String string180 = context.getString(R.string.DOG_BREED_CROATIAN_SHEPHERD_DOG);
            string180.getClass();
            return string180;
        }
        if (g2.d(str, x0.y1)) {
            String string181 = context.getString(R.string.DOG_BREED_CURLY_COATED_RETRIEVER);
            string181.getClass();
            return string181;
        }
        if (g2.d(str, x0.z1)) {
            String string182 = context.getString(R.string.DOG_BREED_CZECHOSLOVAKIAN_WOLFDOG);
            string182.getClass();
            return string182;
        }
        if (g2.d(str, x0.A1)) {
            String string183 = context.getString(R.string.DOG_BREED_DACHSADOR);
            string183.getClass();
            return string183;
        }
        if (g2.d(str, x0.B1)) {
            String string184 = context.getString(R.string.DOG_BREED_DACHSHUND);
            string184.getClass();
            return string184;
        }
        if (g2.d(str, x0.C1)) {
            String string185 = context.getString(R.string.DOG_BREED_DALMADOODLE);
            string185.getClass();
            return string185;
        }
        if (g2.d(str, x0.D1)) {
            String string186 = context.getString(R.string.DOG_BREED_DALMATIAN);
            string186.getClass();
            return string186;
        }
        if (g2.d(str, x0.E1)) {
            String string187 = context.getString(R.string.DOG_BREED_DANDIE_DINMONT_TERRIER);
            string187.getClass();
            return string187;
        }
        if (g2.d(str, x0.F1)) {
            String string188 = context.getString(R.string.DOG_BREED_DANIFF);
            string188.getClass();
            return string188;
        }
        if (g2.d(str, x0.G1)) {
            String string189 = context.getString(R.string.DOG_BREED_DANISHSWEDISH_FARMDOG);
            string189.getClass();
            return string189;
        }
        if (g2.d(str, x0.H1)) {
            String string190 = context.getString(R.string.DOG_BREED_DEERHOUND);
            string190.getClass();
            return string190;
        }
        if (g2.d(str, x0.I1)) {
            String string191 = context.getString(R.string.DOG_BREED_DEUTSCH_LANGHAAR);
            string191.getClass();
            return string191;
        }
        if (g2.d(str, x0.J1)) {
            String string192 = context.getString(R.string.DOG_BREED_DEUTSCH_STICHELHAAR);
            string192.getClass();
            return string192;
        }
        if (g2.d(str, x0.K1)) {
            String string193 = context.getString(R.string.DOG_BREED_DOBERDOR);
            string193.getClass();
            return string193;
        }
        if (g2.d(str, x0.L1)) {
            String string194 = context.getString(R.string.DOG_BREED_DOBERMANN);
            string194.getClass();
            return string194;
        }
        if (g2.d(str, x0.M1)) {
            String string195 = context.getString(R.string.DOG_BREED_DOBERSHEPHERD);
            string195.getClass();
            return string195;
        }
        if (g2.d(str, x0.N1)) {
            String string196 = context.getString(R.string.DOG_BREED_DOGO_ARGENTINO);
            string196.getClass();
            return string196;
        }
        if (g2.d(str, x0.O1)) {
            String string197 = context.getString(R.string.DOG_BREED_DOGUE_DE_BORDEAUX);
            string197.getClass();
            return string197;
        }
        if (g2.d(str, x0.P1)) {
            String string198 = context.getString(R.string.DOG_BREED_DORGI);
            string198.getClass();
            return string198;
        }
        if (g2.d(str, x0.Q1)) {
            String string199 = context.getString(R.string.DOG_BREED_DORKIE);
            string199.getClass();
            return string199;
        }
        if (g2.d(str, x0.R1)) {
            String string200 = context.getString(R.string.DOG_BREED_DOXIEPOO);
            string200.getClass();
            return string200;
        }
        if (g2.d(str, x0.S1)) {
            String string201 = context.getString(R.string.DOG_BREED_DOXLE);
            string201.getClass();
            return string201;
        }
        if (g2.d(str, x0.T1)) {
            String string202 = context.getString(R.string.DOG_BREED_DRENTSCHE_PARTRIDGE_DOG);
            string202.getClass();
            return string202;
        }
        if (g2.d(str, x0.U1)) {
            String string203 = context.getString(R.string.DOG_BREED_DREVER);
            string203.getClass();
            return string203;
        }
        if (g2.d(str, x0.V1)) {
            String string204 = context.getString(R.string.DOG_BREED_DUTCH_SCHAPENDOES);
            string204.getClass();
            return string204;
        }
        if (g2.d(str, x0.W1)) {
            String string205 = context.getString(R.string.DOG_BREED_DUTCH_SHEPHERD_DOG);
            string205.getClass();
            return string205;
        }
        if (g2.d(str, x0.X1)) {
            String string206 = context.getString(R.string.DOG_BREED_DUTCH_SMOUSHOND);
            string206.getClass();
            return string206;
        }
        if (g2.d(str, x0.Y1)) {
            String string207 = context.getString(R.string.DOG_BREED_EAST_SIBERIAN_LAIKA);
            string207.getClass();
            return string207;
        }
        if (g2.d(str, x0.Z1)) {
            String string208 = context.getString(R.string.DOG_BREED_ENGLISH_COCKER_SPANIEL);
            string208.getClass();
            return string208;
        }
        if (g2.d(str, x0.a2)) {
            String string209 = context.getString(R.string.DOG_BREED_ENGLISH_FOXHOUND);
            string209.getClass();
            return string209;
        }
        if (g2.d(str, x0.b2)) {
            String string210 = context.getString(R.string.DOG_BREED_ENGLISH_POINTER);
            string210.getClass();
            return string210;
        }
        if (g2.d(str, x0.c2)) {
            String string211 = context.getString(R.string.DOG_BREED_ENGLISH_SETTER);
            string211.getClass();
            return string211;
        }
        if (g2.d(str, x0.d2)) {
            String string212 = context.getString(R.string.DOG_BREED_ENGLISH_SPRINGER_SPANIEL);
            string212.getClass();
            return string212;
        }
        if (g2.d(str, x0.e2)) {
            String string213 = context.getString(R.string.DOG_BREED_ENGLISH_TOY_TERRIER_BLACK_TAN);
            string213.getClass();
            return string213;
        }
        if (g2.d(str, x0.f2)) {
            String string214 = context.getString(R.string.DOG_BREED_ENTLEBUCH_CATTLE_DOG);
            string214.getClass();
            return string214;
        }
        if (g2.d(str, x0.g2)) {
            String string215 = context.getString(R.string.DOG_BREED_ESTONIAN_HOUND);
            string215.getClass();
            return string215;
        }
        if (g2.d(str, x0.h2)) {
            String string216 = context.getString(R.string.DOG_BREED_ESTRELA_MOUNTAIN_DOG);
            string216.getClass();
            return string216;
        }
        if (g2.d(str, x0.i2)) {
            String string217 = context.getString(R.string.DOG_BREED_EURASIAN);
            string217.getClass();
            return string217;
        }
        if (g2.d(str, x0.j2)) {
            String string218 = context.getString(R.string.DOG_BREED_FAWN_BRITTANY_GRIFFON);
            string218.getClass();
            return string218;
        }
        if (g2.d(str, x0.k2)) {
            String string219 = context.getString(R.string.DOG_BREED_FIELD_SPANIEL);
            string219.getClass();
            return string219;
        }
        if (g2.d(str, x0.l2)) {
            String string220 = context.getString(R.string.DOG_BREED_FILA_BRASILEIRO);
            string220.getClass();
            return string220;
        }
        if (g2.d(str, x0.m2)) {
            String string221 = context.getString(R.string.DOG_BREED_FINNISH_HOUND);
            string221.getClass();
            return string221;
        }
        if (g2.d(str, x0.n2)) {
            String string222 = context.getString(R.string.DOG_BREED_FINNISH_LAPPONIAN_DOG);
            string222.getClass();
            return string222;
        }
        if (g2.d(str, x0.o2)) {
            String string223 = context.getString(R.string.DOG_BREED_FINNISH_SPITZ);
            string223.getClass();
            return string223;
        }
        if (g2.d(str, x0.p2)) {
            String string224 = context.getString(R.string.DOG_BREED_FLAT_COATED_RETRIEVER);
            string224.getClass();
            return string224;
        }
        if (g2.d(str, x0.q2)) {
            String string225 = context.getString(R.string.DOG_BREED_FOX_TERRIER_SMOOTH);
            string225.getClass();
            return string225;
        }
        if (g2.d(str, x0.r2)) {
            String string226 = context.getString(R.string.DOG_BREED_FOX_TERRIER_WIRE);
            string226.getClass();
            return string226;
        }
        if (g2.d(str, x0.s2)) {
            String string227 = context.getString(R.string.DOG_BREED_FRENCHTON);
            string227.getClass();
            return string227;
        }
        if (g2.d(str, x0.t2)) {
            String string228 = context.getString(R.string.DOG_BREED_FRENCH_BULLDOG);
            string228.getClass();
            return string228;
        }
        if (g2.d(str, x0.u2)) {
            String string229 = context.getString(R.string.DOG_BREED_FRENCH_BULLHUAHUA);
            string229.getClass();
            return string229;
        }
        if (g2.d(str, x0.v2)) {
            String string230 = context.getString(R.string.DOG_BREED_FRENCH_POINTING_DOG__GASCOGNE_TYPE);
            string230.getClass();
            return string230;
        }
        if (g2.d(str, x0.w2)) {
            String string231 = context.getString(R.string.DOG_BREED_FRENCH_POINTING_DOG__PYRENEAN_TYPE);
            string231.getClass();
            return string231;
        }
        if (g2.d(str, x0.x2)) {
            String string232 = context.getString(R.string.DOG_BREED_FRENCH_SPANIEL);
            string232.getClass();
            return string232;
        }
        if (g2.d(str, x0.y2)) {
            String string233 = context.getString(R.string.DOG_BREED_FRENCH_TRICOLOUR_HOUND);
            string233.getClass();
            return string233;
        }
        if (g2.d(str, x0.z2)) {
            String string234 = context.getString(R.string.DOG_BREED_FRENCH_WATER_DOG);
            string234.getClass();
            return string234;
        }
        if (g2.d(str, x0.A2)) {
            String string235 = context.getString(R.string.DOG_BREED_FRENCH_WHITE_AND_ORANGE_HOUND);
            string235.getClass();
            return string235;
        }
        if (g2.d(str, x0.B2)) {
            String string236 = context.getString(R.string.DOG_BREED_FRENCH_WHITE__BLACK_HOUND);
            string236.getClass();
            return string236;
        }
        if (g2.d(str, x0.C2)) {
            String string237 = context.getString(R.string.DOG_BREED_FRENGLE);
            string237.getClass();
            return string237;
        }
        if (g2.d(str, x0.D2)) {
            String string238 = context.getString(R.string.DOG_BREED_FRISIAN_WATER_DOG);
            string238.getClass();
            return string238;
        }
        if (g2.d(str, x0.E2)) {
            String string239 = context.getString(R.string.DOG_BREED_FROODLE);
            string239.getClass();
            return string239;
        }
        if (g2.d(str, x0.F2)) {
            String string240 = context.getString(R.string.DOG_BREED_GASCON_SAINTONGEOIS);
            string240.getClass();
            return string240;
        }
        if (g2.d(str, x0.G2)) {
            String string241 = context.getString(R.string.DOG_BREED_GERBERIAN_SHEPSKY);
            string241.getClass();
            return string241;
        }
        if (g2.d(str, x0.H2)) {
            String string242 = context.getString(R.string.DOG_BREED_GERMAN_HOUND);
            string242.getClass();
            return string242;
        }
        if (g2.d(str, x0.I2)) {
            String string243 = context.getString(R.string.DOG_BREED_GERMAN_HUNTING_TERRIER);
            string243.getClass();
            return string243;
        }
        if (g2.d(str, x0.J2)) {
            String string244 = context.getString(R.string.DOG_BREED_GERMAN_PINSCHER);
            string244.getClass();
            return string244;
        }
        if (g2.d(str, x0.K2)) {
            String string245 = context.getString(R.string.DOG_BREED_GERMAN_SHEPHERD_DOG);
            string245.getClass();
            return string245;
        }
        if (g2.d(str, x0.L2)) {
            String string246 = context.getString(R.string.DOG_BREED_GERMAN_SHEPSKY);
            string246.getClass();
            return string246;
        }
        if (g2.d(str, x0.M2)) {
            String string247 = context.getString(R.string.DOG_BREED_GERMAN_SHORT_HAIRED_POINTING_DOG);
            string247.getClass();
            return string247;
        }
        if (g2.d(str, x0.N2)) {
            String string248 = context.getString(R.string.DOG_BREED_GERMAN_SPANIEL);
            string248.getClass();
            return string248;
        }
        if (g2.d(str, x0.O2)) {
            String string249 = context.getString(R.string.DOG_BREED_GERMAN_SPITZ);
            string249.getClass();
            return string249;
        }
        if (g2.d(str, x0.P2)) {
            String string250 = context.getString(R.string.DOG_BREED_GERMAN_WIRE_HAIRED_POINTING_DOG);
            string250.getClass();
            return string250;
        }
        if (g2.d(str, x0.Q2)) {
            String string251 = context.getString(R.string.DOG_BREED_GIANT_SCHNAUZER);
            string251.getClass();
            return string251;
        }
        if (g2.d(str, x0.R2)) {
            String string252 = context.getString(R.string.DOG_BREED_GOBERIAN);
            string252.getClass();
            return string252;
        }
        if (g2.d(str, x0.S2)) {
            String string253 = context.getString(R.string.DOG_BREED_GOLDENDOODLE);
            string253.getClass();
            return string253;
        }
        if (g2.d(str, x0.T2)) {
            String string254 = context.getString(R.string.DOG_BREED_GOLDEN_DOX);
            string254.getClass();
            return string254;
        }
        if (g2.d(str, x0.U2)) {
            String string255 = context.getString(R.string.DOG_BREED_GOLDEN_HUSKY);
            string255.getClass();
            return string255;
        }
        if (g2.d(str, x0.V2)) {
            String string256 = context.getString(R.string.DOG_BREED_GOLDEN_RETRIEVER);
            string256.getClass();
            return string256;
        }
        if (g2.d(str, x0.W2)) {
            String string257 = context.getString(R.string.DOG_BREED_GOLDEN_SHEPHERD);
            string257.getClass();
            return string257;
        }
        if (g2.d(str, x0.X2)) {
            String string258 = context.getString(R.string.DOG_BREED_GORDON_SETTER);
            string258.getClass();
            return string258;
        }
        if (g2.d(str, x0.Y2)) {
            String string259 = context.getString(R.string.DOG_BREED_GRAND_BASSET_GRIFFON_VENDEEN);
            string259.getClass();
            return string259;
        }
        if (g2.d(str, x0.Z2)) {
            String string260 = context.getString(R.string.DOG_BREED_GRAND_GRIFFON_VENDEEN);
            string260.getClass();
            return string260;
        }
        if (g2.d(str, x0.a3)) {
            String string261 = context.getString(R.string.DOG_BREED_GREAT_ANGLOFRENCH_TRICOLOUR_HOUND);
            string261.getClass();
            return string261;
        }
        if (g2.d(str, x0.b3)) {
            String string262 = context.getString(R.string.DOG_BREED_GREAT_ANGLOFRENCH_WHITE_AND_BLACK_HOUND);
            string262.getClass();
            return string262;
        }
        if (g2.d(str, x0.c3)) {
            String string263 = context.getString(R.string.DOG_BREED_GREAT_ANGLOFRENCH_WHITE__ORANGE_HOUND);
            string263.getClass();
            return string263;
        }
        if (g2.d(str, x0.d3)) {
            String string264 = context.getString(R.string.DOG_BREED_GREAT_DANE);
            string264.getClass();
            return string264;
        }
        if (g2.d(str, x0.e3)) {
            String string265 = context.getString(R.string.DOG_BREED_GREAT_DANOODLE);
            string265.getClass();
            return string265;
        }
        if (g2.d(str, x0.f3)) {
            String string266 = context.getString(R.string.DOG_BREED_GREAT_GASCONY_BLUE);
            string266.getClass();
            return string266;
        }
        if (g2.d(str, x0.g3)) {
            String string267 = context.getString(R.string.DOG_BREED_GREAT_SWISS_MOUNTAIN_DOG);
            string267.getClass();
            return string267;
        }
        if (g2.d(str, x0.h3)) {
            String string268 = context.getString(R.string.DOG_BREED_GREENLAND_DOG);
            string268.getClass();
            return string268;
        }
        if (g2.d(str, x0.i3)) {
            String string269 = context.getString(R.string.DOG_BREED_GREYHOUND);
            string269.getClass();
            return string269;
        }
        if (g2.d(str, x0.j3)) {
            String string270 = context.getString(R.string.DOG_BREED_GRIFFON_BELGE);
            string270.getClass();
            return string270;
        }
        if (g2.d(str, x0.k3)) {
            String string271 = context.getString(R.string.DOG_BREED_GRIFFON_BRUXELLOIS);
            string271.getClass();
            return string271;
        }
        if (g2.d(str, x0.l3)) {
            String string272 = context.getString(R.string.DOG_BREED_GRIFFON_NIVERNAIS);
            string272.getClass();
            return string272;
        }
        if (g2.d(str, x0.m3)) {
            String string273 = context.getString(R.string.DOG_BREED_HALDEN_HOUND);
            string273.getClass();
            return string273;
        }
        if (g2.d(str, x0.n3)) {
            String string274 = context.getString(R.string.DOG_BREED_HAMILTONST_VARE_res_0x800100dc);
            string274.getClass();
            return string274;
        }
        if (g2.d(str, x0.o3)) {
            String string275 = context.getString(R.string.DOG_BREED_HANOVERIAN_SCENT_HOUND);
            string275.getClass();
            return string275;
        }
        if (g2.d(str, x0.p3)) {
            String string276 = context.getString(R.string.DOG_BREED_HARRIER);
            string276.getClass();
            return string276;
        }
        if (g2.d(str, x0.q3)) {
            String string277 = context.getString(R.string.DOG_BREED_HAVANESE);
            string277.getClass();
            return string277;
        }
        if (g2.d(str, x0.r3)) {
            String string278 = context.getString(R.string.DOG_BREED_HELLENIC_HOUND);
            string278.getClass();
            return string278;
        }
        if (g2.d(str, x0.s3)) {
            String string279 = context.getString(R.string.DOG_BREED_HOKKAIDO);
            string279.getClass();
            return string279;
        }
        if (g2.d(str, x0.t3)) {
            String string280 = context.getString(R.string.DOG_BREED_HOVAWART);
            string280.getClass();
            return string280;
        }
        if (g2.d(str, x0.u3)) {
            String string281 = context.getString(R.string.DOG_BREED_HUNGARIAN_GREYHOUND);
            string281.getClass();
            return string281;
        }
        if (g2.d(str, x0.v3)) {
            String string282 = context.getString(R.string.DOG_BREED_HUNGARIAN_HOUND__TRANSYLVANIAN_SCENT_HOUND);
            string282.getClass();
            return string282;
        }
        if (g2.d(str, x0.w3)) {
            String string283 = context.getString(R.string.DOG_BREED_HUNGARIAN_SHORTHAIRED_POINTER_VIZSLA);
            string283.getClass();
            return string283;
        }
        if (g2.d(str, x0.x3)) {
            String string284 = context.getString(R.string.DOG_BREED_HUNGARIAN_WIREHAIRED_POINTER);
            string284.getClass();
            return string284;
        }
        if (g2.d(str, x0.y3)) {
            String string285 = context.getString(R.string.DOG_BREED_HUSKYDOODLE);
            string285.getClass();
            return string285;
        }
        if (g2.d(str, x0.z3)) {
            String string286 = context.getString(R.string.DOG_BREED_HYGEN_HOUND);
            string286.getClass();
            return string286;
        }
        if (g2.d(str, x0.A3)) {
            String string287 = context.getString(R.string.DOG_BREED_IBIZAN_PODENCO);
            string287.getClass();
            return string287;
        }
        if (g2.d(str, x0.B3)) {
            String string288 = context.getString(R.string.DOG_BREED_ICELANDIC_SHEEPDOG);
            string288.getClass();
            return string288;
        }
        if (g2.d(str, x0.C3)) {
            String string289 = context.getString(R.string.DOG_BREED_IRISH_DOODLE);
            string289.getClass();
            return string289;
        }
        if (g2.d(str, x0.D3)) {
            String string290 = context.getString(R.string.DOG_BREED_IRISH_GLEN_OF_IMAAL_TERRIER);
            string290.getClass();
            return string290;
        }
        if (g2.d(str, x0.E3)) {
            String string291 = context.getString(R.string.DOG_BREED_IRISH_RED_AND_WHITE_SETTER);
            string291.getClass();
            return string291;
        }
        if (g2.d(str, x0.F3)) {
            String string292 = context.getString(R.string.DOG_BREED_IRISH_RED_SETTER);
            string292.getClass();
            return string292;
        }
        if (g2.d(str, x0.G3)) {
            String string293 = context.getString(R.string.DOG_BREED_IRISH_SOFT_COATED_WHEATEN_TERRIER);
            string293.getClass();
            return string293;
        }
        if (g2.d(str, x0.H3)) {
            String string294 = context.getString(R.string.DOG_BREED_IRISH_TERRIER);
            string294.getClass();
            return string294;
        }
        if (g2.d(str, x0.I3)) {
            String string295 = context.getString(R.string.DOG_BREED_IRISH_WATER_SPANIEL);
            string295.getClass();
            return string295;
        }
        if (g2.d(str, x0.J3)) {
            String string296 = context.getString(R.string.DOG_BREED_IRISH_WOLFHOUND);
            string296.getClass();
            return string296;
        }
        if (g2.d(str, x0.K3)) {
            String string297 = context.getString(R.string.DOG_BREED_ISTRIAN_SHORTHAIRED_HOUND);
            string297.getClass();
            return string297;
        }
        if (g2.d(str, x0.L3)) {
            String string298 = context.getString(R.string.DOG_BREED_ISTRIAN_WIREHAIRED_HOUND);
            string298.getClass();
            return string298;
        }
        if (g2.d(str, x0.M3)) {
            String string299 = context.getString(R.string.DOG_BREED_ITALIAN_CANE_CORSO);
            string299.getClass();
            return string299;
        }
        if (g2.d(str, x0.N3)) {
            String string300 = context.getString(R.string.DOG_BREED_ITALIAN_POINTING_DOG);
            string300.getClass();
            return string300;
        }
        if (g2.d(str, x0.O3)) {
            String string301 = context.getString(R.string.DOG_BREED_ITALIAN_ROUGHHAIRED_SEGUGIO);
            string301.getClass();
            return string301;
        }
        if (g2.d(str, x0.P3)) {
            String string302 = context.getString(R.string.DOG_BREED_ITALIAN_SHORTHAIRED_SEGUGIO);
            string302.getClass();
            return string302;
        }
        if (g2.d(str, x0.Q3)) {
            String string303 = context.getString(R.string.DOG_BREED_ITALIAN_SIGHTHOUND);
            string303.getClass();
            return string303;
        }
        if (g2.d(str, x0.R3)) {
            String string304 = context.getString(R.string.DOG_BREED_ITALIAN_SPINONE);
            string304.getClass();
            return string304;
        }
        if (g2.d(str, x0.S3)) {
            String string305 = context.getString(R.string.DOG_BREED_ITALIAN_VOLPINO);
            string305.getClass();
            return string305;
        }
        if (g2.d(str, x0.T3)) {
            String string306 = context.getString(R.string.DOG_BREED_JACKAPOO);
            string306.getClass();
            return string306;
        }
        if (g2.d(str, x0.U3)) {
            String string307 = context.getString(R.string.DOG_BREED_JACK_RUSSELL_TERRIER);
            string307.getClass();
            return string307;
        }
        if (g2.d(str, x0.V3)) {
            String string308 = context.getString(R.string.DOG_BREED_JAPANESE_CHIN);
            string308.getClass();
            return string308;
        }
        if (g2.d(str, x0.W3)) {
            String string309 = context.getString(R.string.DOG_BREED_JAPANESE_SPITZ);
            string309.getClass();
            return string309;
        }
        if (g2.d(str, x0.X3)) {
            String string310 = context.getString(R.string.DOG_BREED_JAPANESE_TERRIER);
            string310.getClass();
            return string310;
        }
        if (g2.d(str, x0.Y3)) {
            String string311 = context.getString(R.string.DOG_BREED_JUG);
            string311.getClass();
            return string311;
        }
        if (g2.d(str, x0.Z3)) {
            String string312 = context.getString(R.string.DOG_BREED_J_MTHUND_res_0x80010102);
            string312.getClass();
            return string312;
        }
        if (g2.d(str, x0.a4)) {
            String string313 = context.getString(R.string.DOG_BREED_KAI);
            string313.getClass();
            return string313;
        }
        if (g2.d(str, x0.b4)) {
            String string314 = context.getString(R.string.DOG_BREED_KANGAL_SHEPHERD_DOG);
            string314.getClass();
            return string314;
        }
        if (g2.d(str, x0.c4)) {
            String string315 = context.getString(R.string.DOG_BREED_KARELIAN_BEAR_DOG);
            string315.getClass();
            return string315;
        }
        if (g2.d(str, x0.d4)) {
            String string316 = context.getString(R.string.DOG_BREED_KARST_SHEPHERD_DOG);
            string316.getClass();
            return string316;
        }
        if (g2.d(str, x0.e4)) {
            String string317 = context.getString(R.string.DOG_BREED_KERRY_BLUE_TERRIER);
            string317.getClass();
            return string317;
        }
        if (g2.d(str, x0.f4)) {
            String string318 = context.getString(R.string.DOG_BREED_KING_CHARLES_SPANIEL);
            string318.getClass();
            return string318;
        }
        if (g2.d(str, x0.g4)) {
            String string319 = context.getString(R.string.DOG_BREED_KINTAMANIBALI_DOG);
            string319.getClass();
            return string319;
        }
        if (g2.d(str, x0.h4)) {
            String string320 = context.getString(R.string.DOG_BREED_KISHU);
            string320.getClass();
            return string320;
        }
        if (g2.d(str, x0.i4)) {
            String string321 = context.getString(R.string.DOG_BREED_KLEINER_M_NSTERL_NDER_res_0x8001010b);
            string321.getClass();
            return string321;
        }
        if (g2.d(str, x0.j4)) {
            String string322 = context.getString(R.string.DOG_BREED_KOMONDOR);
            string322.getClass();
            return string322;
        }
        if (g2.d(str, x0.k4)) {
            String string323 = context.getString(R.string.DOG_BREED_KOREA_JINDO_DOG);
            string323.getClass();
            return string323;
        }
        if (g2.d(str, x0.l4)) {
            String string324 = context.getString(R.string.DOG_BREED_KROMFOHRL_NDER_res_0x8001010e);
            string324.getClass();
            return string324;
        }
        if (g2.d(str, x0.m4)) {
            String string325 = context.getString(R.string.DOG_BREED_KUVASZ);
            string325.getClass();
            return string325;
        }
        if (g2.d(str, x0.n4)) {
            String string326 = context.getString(R.string.DOG_BREED_LABMARANER);
            string326.getClass();
            return string326;
        }
        if (g2.d(str, x0.o4)) {
            String string327 = context.getString(R.string.DOG_BREED_LABRADOODLE);
            string327.getClass();
            return string327;
        }
        if (g2.d(str, x0.p4)) {
            String string328 = context.getString(R.string.DOG_BREED_LABRADOR_RETRIEVER);
            string328.getClass();
            return string328;
        }
        if (g2.d(str, x0.q4)) {
            String string329 = context.getString(R.string.DOG_BREED_LABSKY);
            string329.getClass();
            return string329;
        }
        if (g2.d(str, x0.r4)) {
            String string330 = context.getString(R.string.DOG_BREED_LAKELAND_TERRIER);
            string330.getClass();
            return string330;
        }
        if (g2.d(str, x0.s4)) {
            String string331 = context.getString(R.string.DOG_BREED_LANCASHIRE_HEELER);
            string331.getClass();
            return string331;
        }
        if (g2.d(str, x0.t4)) {
            String string332 = context.getString(R.string.DOG_BREED_LANDSEER_EUROPEAN_CONTINENTAL_TYPE);
            string332.getClass();
            return string332;
        }
        if (g2.d(str, x0.u4)) {
            String string333 = context.getString(R.string.DOG_BREED_LAPPONIAN_HERDER);
            string333.getClass();
            return string333;
        }
        if (g2.d(str, x0.v4)) {
            String string334 = context.getString(R.string.DOG_BREED_LARGE_MUNSTERLANDER);
            string334.getClass();
            return string334;
        }
        if (g2.d(str, x0.w4)) {
            String string335 = context.getString(R.string.DOG_BREED_LEONBERGER);
            string335.getClass();
            return string335;
        }
        if (g2.d(str, x0.x4)) {
            String string336 = context.getString(R.string.DOG_BREED_LHASA_APSO);
            string336.getClass();
            return string336;
        }
        if (g2.d(str, x0.y4)) {
            String string337 = context.getString(R.string.DOG_BREED_LITTLE_LION_DOG);
            string337.getClass();
            return string337;
        }
        if (g2.d(str, x0.z4)) {
            String string338 = context.getString(R.string.DOG_BREED_LONGHAIRED_PYRENEAN_SHEEPDOG);
            string338.getClass();
            return string338;
        }
        if (g2.d(str, x0.A4)) {
            String string339 = context.getString(R.string.DOG_BREED_MAJORCA_MASTIFF);
            string339.getClass();
            return string339;
        }
        if (g2.d(str, x0.B4)) {
            String string340 = context.getString(R.string.DOG_BREED_MAJORCA_SHEPHERD_DOG);
            string340.getClass();
            return string340;
        }
        if (g2.d(str, x0.C4)) {
            String string341 = context.getString(R.string.DOG_BREED_MALCHI);
            string341.getClass();
            return string341;
        }
        if (g2.d(str, x0.D4)) {
            String string342 = context.getString(R.string.DOG_BREED_MALSHI);
            string342.getClass();
            return string342;
        }
        if (g2.d(str, x0.E4)) {
            String string343 = context.getString(R.string.DOG_BREED_MALTESE);
            string343.getClass();
            return string343;
        }
        if (g2.d(str, x0.F4)) {
            String string344 = context.getString(R.string.DOG_BREED_MALTIPOO);
            string344.getClass();
            return string344;
        }
        if (g2.d(str, x0.G4)) {
            String string345 = context.getString(R.string.DOG_BREED_MANCHESTER_TERRIER);
            string345.getClass();
            return string345;
        }
        if (g2.d(str, x0.H4)) {
            String string346 = context.getString(R.string.DOG_BREED_MAREMMA_AND_THE_ABRUZZES_SHEEPDOG);
            string346.getClass();
            return string346;
        }
        if (g2.d(str, x0.I4)) {
            String string347 = context.getString(R.string.DOG_BREED_MASTIFF);
            string347.getClass();
            return string347;
        }
        if (g2.d(str, x0.J4)) {
            String string348 = context.getString(R.string.DOG_BREED_MEDIUMSIZED_ANGLOFRENCH_HOUND);
            string348.getClass();
            return string348;
        }
        if (g2.d(str, x0.K4)) {
            String string349 = context.getString(R.string.DOG_BREED_MINIATURE_AMERICAN_SHEPHERD);
            string349.getClass();
            return string349;
        }
        if (g2.d(str, x0.L4)) {
            String string350 = context.getString(R.string.DOG_BREED_MINIATURE_BULL_TERRIER);
            string350.getClass();
            return string350;
        }
        if (g2.d(str, x0.M4)) {
            String string351 = context.getString(R.string.DOG_BREED_MINIATURE_PINSCHER);
            string351.getClass();
            return string351;
        }
        if (g2.d(str, x0.N4)) {
            String string352 = context.getString(R.string.DOG_BREED_MINIATURE_SCHNAUZER);
            string352.getClass();
            return string352;
        }
        if (g2.d(str, x0.O4)) {
            String string353 = context.getString(R.string.DOG_BREED_MONTENEGRIN_MOUNTAIN_HOUND);
            string353.getClass();
            return string353;
        }
        if (g2.d(str, x0.P4)) {
            String string354 = context.getString(R.string.DOG_BREED_MORKIE);
            string354.getClass();
            return string354;
        }
        if (g2.d(str, x0.Q4)) {
            String string355 = context.getString(R.string.DOG_BREED_MUDI);
            string355.getClass();
            return string355;
        }
        if (g2.d(str, x0.R4)) {
            String string356 = context.getString(R.string.DOG_BREED_NEAPOLITAN_MASTIFF);
            string356.getClass();
            return string356;
        }
        if (g2.d(str, x0.S4)) {
            String string357 = context.getString(R.string.DOG_BREED_NEDERLANDSE_KOOIKERHONDJE);
            string357.getClass();
            return string357;
        }
        if (g2.d(str, x0.T4)) {
            String string358 = context.getString(R.string.DOG_BREED_NEWFOUNDLAND);
            string358.getClass();
            return string358;
        }
        if (g2.d(str, x0.U4)) {
            String string359 = context.getString(R.string.DOG_BREED_NEWFYPOO);
            string359.getClass();
            return string359;
        }
        if (g2.d(str, x0.V4)) {
            String string360 = context.getString(R.string.DOG_BREED_NORFOLK_TERRIER);
            string360.getClass();
            return string360;
        }
        if (g2.d(str, x0.W4)) {
            String string361 = context.getString(R.string.DOG_BREED_NORMAN_ARTESIEN_BASSET);
            string361.getClass();
            return string361;
        }
        if (g2.d(str, x0.X4)) {
            String string362 = context.getString(R.string.DOG_BREED_NORRBOTTENSPITZ);
            string362.getClass();
            return string362;
        }
        if (g2.d(str, x0.Y4)) {
            String string363 = context.getString(R.string.DOG_BREED_NORWEGIAN_BUHUND);
            string363.getClass();
            return string363;
        }
        if (g2.d(str, x0.Z4)) {
            String string364 = context.getString(R.string.DOG_BREED_NORWEGIAN_ELKHOUND_BLACK);
            string364.getClass();
            return string364;
        }
        if (g2.d(str, x0.a5)) {
            String string365 = context.getString(R.string.DOG_BREED_NORWEGIAN_ELKHOUND_GREY);
            string365.getClass();
            return string365;
        }
        if (g2.d(str, x0.b5)) {
            String string366 = context.getString(R.string.DOG_BREED_NORWEGIAN_HOUND);
            string366.getClass();
            return string366;
        }
        if (g2.d(str, x0.c5)) {
            String string367 = context.getString(R.string.DOG_BREED_NORWEGIAN_LUNDEHUND);
            string367.getClass();
            return string367;
        }
        if (g2.d(str, x0.d5)) {
            String string368 = context.getString(R.string.DOG_BREED_NORWICH_TERRIER);
            string368.getClass();
            return string368;
        }
        if (g2.d(str, x0.e5)) {
            String string369 = context.getString(R.string.DOG_BREED_NOVA_SCOTIA_DUCK_TOLLING_RETRIEVER);
            string369.getClass();
            return string369;
        }
        if (g2.d(str, x0.f5)) {
            String string370 = context.getString(R.string.DOG_BREED_OLD_DANISH_POINTING_DOG);
            string370.getClass();
            return string370;
        }
        if (g2.d(str, x0.g5)) {
            String string371 = context.getString(R.string.DOG_BREED_OLD_ENGLISH_SHEEPDOG);
            string371.getClass();
            return string371;
        }
        if (g2.d(str, x0.h5)) {
            String string372 = context.getString(R.string.DOG_BREED_OTHER);
            string372.getClass();
            return string372;
        }
        if (g2.d(str, x0.i5)) {
            String string373 = context.getString(R.string.DOG_BREED_OTTERHOUND);
            string373.getClass();
            return string373;
        }
        if (g2.d(str, x0.j5)) {
            String string374 = context.getString(R.string.DOG_BREED_PAPIPOO);
            string374.getClass();
            return string374;
        }
        if (g2.d(str, x0.k5)) {
            String string375 = context.getString(R.string.DOG_BREED_PARSON_RUSSELL_TERRIER);
            string375.getClass();
            return string375;
        }
        if (g2.d(str, x0.l5)) {
            String string376 = context.getString(R.string.DOG_BREED_PEEKAPOO);
            string376.getClass();
            return string376;
        }
        if (g2.d(str, x0.m5)) {
            String string377 = context.getString(R.string.DOG_BREED_PEKINGESE);
            string377.getClass();
            return string377;
        }
        if (g2.d(str, x0.n5)) {
            String string378 = context.getString(R.string.DOG_BREED_PERUVIAN_HAIRLESS_DOG);
            string378.getClass();
            return string378;
        }
        if (g2.d(str, x0.o5)) {
            String string379 = context.getString(R.string.DOG_BREED_PETIT_BASSET_GRIFFON_VENDEEN);
            string379.getClass();
            return string379;
        }
        if (g2.d(str, x0.p5)) {
            String string380 = context.getString(R.string.DOG_BREED_PETIT_BRABAN_ON_res_0x80010146);
            string380.getClass();
            return string380;
        }
        if (g2.d(str, x0.q5)) {
            String string381 = context.getString(R.string.DOG_BREED_PHARAOH_HOUND);
            string381.getClass();
            return string381;
        }
        if (g2.d(str, x0.r5)) {
            String string382 = context.getString(R.string.DOG_BREED_PICARDY_SHEEPDOG);
            string382.getClass();
            return string382;
        }
        if (g2.d(str, x0.s5)) {
            String string383 = context.getString(R.string.DOG_BREED_PICARDY_SPANIEL);
            string383.getClass();
            return string383;
        }
        if (g2.d(str, x0.t5)) {
            String string384 = context.getString(R.string.DOG_BREED_PITSKY);
            string384.getClass();
            return string384;
        }
        if (g2.d(str, x0.u5)) {
            String string385 = context.getString(R.string.DOG_BREED_POINTERDOR);
            string385.getClass();
            return string385;
        }
        if (g2.d(str, x0.v5)) {
            String string386 = context.getString(R.string.DOG_BREED_POITEVIN);
            string386.getClass();
            return string386;
        }
        if (g2.d(str, x0.w5)) {
            String string387 = context.getString(R.string.DOG_BREED_POLISH_GREYHOUND);
            string387.getClass();
            return string387;
        }
        if (g2.d(str, x0.x5)) {
            String string388 = context.getString(R.string.DOG_BREED_POLISH_HOUND);
            string388.getClass();
            return string388;
        }
        if (g2.d(str, x0.y5)) {
            String string389 = context.getString(R.string.DOG_BREED_POLISH_HUNTING_DOG);
            string389.getClass();
            return string389;
        }
        if (g2.d(str, x0.z5)) {
            String string390 = context.getString(R.string.DOG_BREED_POLISH_LOWLAND_SHEEPDOG);
            string390.getClass();
            return string390;
        }
        if (g2.d(str, x0.A5)) {
            String string391 = context.getString(R.string.DOG_BREED_POMAPOO);
            string391.getClass();
            return string391;
        }
        if (g2.d(str, x0.B5)) {
            String string392 = context.getString(R.string.DOG_BREED_POMAPUG);
            string392.getClass();
            return string392;
        }
        if (g2.d(str, x0.C5)) {
            String string393 = context.getString(R.string.DOG_BREED_POMCHI);
            string393.getClass();
            return string393;
        }
        if (g2.d(str, x0.D5)) {
            String string394 = context.getString(R.string.DOG_BREED_POMEAGLE);
            string394.getClass();
            return string394;
        }
        if (g2.d(str, x0.E5)) {
            String string395 = context.getString(R.string.DOG_BREED_POMERDOG);
            string395.getClass();
            return string395;
        }
        if (g2.d(str, x0.F5)) {
            String string396 = context.getString(R.string.DOG_BREED_POMSKY);
            string396.getClass();
            return string396;
        }
        if (g2.d(str, x0.G5)) {
            String string397 = context.getString(R.string.DOG_BREED_PONTAUDEMER_SPANIEL);
            string397.getClass();
            return string397;
        }
        if (g2.d(str, x0.H5)) {
            String string398 = context.getString(R.string.DOG_BREED_POODLE);
            string398.getClass();
            return string398;
        }
        if (g2.d(str, x0.I5)) {
            String string399 = context.getString(R.string.DOG_BREED_PORCELAINE);
            string399.getClass();
            return string399;
        }
        if (g2.d(str, x0.J5)) {
            String string400 = context.getString(R.string.DOG_BREED_PORTUGUESE_POINTING_DOG);
            string400.getClass();
            return string400;
        }
        if (g2.d(str, x0.K5)) {
            String string401 = context.getString(R.string.DOG_BREED_PORTUGUESE_SHEEPDOG);
            string401.getClass();
            return string401;
        }
        if (g2.d(str, x0.L5)) {
            String string402 = context.getString(R.string.DOG_BREED_PORTUGUESE_WARREN_HOUNDPORTUGUESE_PODENGO);
            string402.getClass();
            return string402;
        }
        if (g2.d(str, x0.M5)) {
            String string403 = context.getString(R.string.DOG_BREED_PORTUGUESE_WATER_DOG);
            string403.getClass();
            return string403;
        }
        if (g2.d(str, x0.N5)) {
            String string404 = context.getString(R.string.DOG_BREED_POSAVATZ_HOUND);
            string404.getClass();
            return string404;
        }
        if (g2.d(str, x0.O5)) {
            String string405 = context.getString(R.string.DOG_BREED_PRAGUE_RATTER);
            string405.getClass();
            return string405;
        }
        if (g2.d(str, x0.P5)) {
            String string406 = context.getString(R.string.DOG_BREED_PRESA_CANARIO);
            string406.getClass();
            return string406;
        }
        if (g2.d(str, x0.Q5)) {
            String string407 = context.getString(R.string.DOG_BREED_PUDELPOINTER);
            string407.getClass();
            return string407;
        }
        if (g2.d(str, x0.R5)) {
            String string408 = context.getString(R.string.DOG_BREED_PUG);
            string408.getClass();
            return string408;
        }
        if (g2.d(str, x0.S5)) {
            String string409 = context.getString(R.string.DOG_BREED_PUGAPOO);
            string409.getClass();
            return string409;
        }
        if (g2.d(str, x0.T5)) {
            String string410 = context.getString(R.string.DOG_BREED_PUGGLE);
            string410.getClass();
            return string410;
        }
        if (g2.d(str, x0.U5)) {
            String string411 = context.getString(R.string.DOG_BREED_PUGINESE);
            string411.getClass();
            return string411;
        }
        if (g2.d(str, x0.V5)) {
            String string412 = context.getString(R.string.DOG_BREED_PUGSHIRE);
            string412.getClass();
            return string412;
        }
        if (g2.d(str, x0.W5)) {
            String string413 = context.getString(R.string.DOG_BREED_PULI);
            string413.getClass();
            return string413;
        }
        if (g2.d(str, x0.X5)) {
            String string414 = context.getString(R.string.DOG_BREED_PUMI);
            string414.getClass();
            return string414;
        }
        if (g2.d(str, x0.Y5)) {
            String string415 = context.getString(R.string.DOG_BREED_PYREDOODLE);
            string415.getClass();
            return string415;
        }
        if (g2.d(str, x0.Z5)) {
            String string416 = context.getString(R.string.DOG_BREED_PYRENEAN_MASTIFF);
            string416.getClass();
            return string416;
        }
        if (g2.d(str, x0.a6)) {
            String string417 = context.getString(R.string.DOG_BREED_PYRENEAN_MOUNTAIN_DOG);
            string417.getClass();
            return string417;
        }
        if (g2.d(str, x0.b6)) {
            String string418 = context.getString(R.string.DOG_BREED_PYRENEAN_SHEEPDOG__SMOOTH_FACED);
            string418.getClass();
            return string418;
        }
        if (g2.d(str, x0.c6)) {
            String string419 = context.getString(R.string.DOG_BREED_PYRENEES_HUSKY);
            string419.getClass();
            return string419;
        }
        if (g2.d(str, x0.d6)) {
            String string420 = context.getString(R.string.DOG_BREED_RAFEIRO_OF_ALENTEJO);
            string420.getClass();
            return string420;
        }
        if (g2.d(str, x0.e6)) {
            String string421 = context.getString(R.string.DOG_BREED_RHODESIAN_RIDGEBACK);
            string421.getClass();
            return string421;
        }
        if (g2.d(str, x0.f6)) {
            String string422 = context.getString(R.string.DOG_BREED_ROMAGNA_WATER_DOG);
            string422.getClass();
            return string422;
        }
        if (g2.d(str, x0.g6)) {
            String string423 = context.getString(R.string.DOG_BREED_ROMANIAN_BUCOVINA_SHEPHERD);
            string423.getClass();
            return string423;
        }
        if (g2.d(str, x0.h6)) {
            String string424 = context.getString(R.string.DOG_BREED_ROMANIAN_CARPATHIAN_SHEPHERD_DOG);
            string424.getClass();
            return string424;
        }
        if (g2.d(str, x0.i6)) {
            String string425 = context.getString(R.string.DOG_BREED_ROMANIAN_MIORITIC_SHEPHERD_DOG);
            string425.getClass();
            return string425;
        }
        if (g2.d(str, x0.j6)) {
            String string426 = context.getString(R.string.DOG_BREED_ROTTERMAN);
            string426.getClass();
            return string426;
        }
        if (g2.d(str, x0.k6)) {
            String string427 = context.getString(R.string.DOG_BREED_ROTTLE);
            string427.getClass();
            return string427;
        }
        if (g2.d(str, x0.l6)) {
            String string428 = context.getString(R.string.DOG_BREED_ROTTSKY);
            string428.getClass();
            return string428;
        }
        if (g2.d(str, x0.m6)) {
            String string429 = context.getString(R.string.DOG_BREED_ROTTWEILER);
            string429.getClass();
            return string429;
        }
        if (g2.d(str, x0.n6)) {
            String string430 = context.getString(R.string.DOG_BREED_RUSSIANEUROPEAN_LAIKA);
            string430.getClass();
            return string430;
        }
        if (g2.d(str, x0.o6)) {
            String string431 = context.getString(R.string.DOG_BREED_RUSSIAN_BLACK_TERRIER);
            string431.getClass();
            return string431;
        }
        if (g2.d(str, x0.p6)) {
            String string432 = context.getString(R.string.DOG_BREED_RUSSIAN_TOY);
            string432.getClass();
            return string432;
        }
        if (g2.d(str, x0.q6)) {
            String string433 = context.getString(R.string.DOG_BREED_SAARLOOS_WOLFHOND);
            string433.getClass();
            return string433;
        }
        if (g2.d(str, x0.r6)) {
            String string434 = context.getString(R.string.DOG_BREED_SAINT_BERDOODLE);
            string434.getClass();
            return string434;
        }
        if (g2.d(str, x0.s6)) {
            String string435 = context.getString(R.string.DOG_BREED_SAINT_GERMAIN_POINTER);
            string435.getClass();
            return string435;
        }
        if (g2.d(str, x0.t6)) {
            String string436 = context.getString(R.string.DOG_BREED_SAINT_MIGUEL_CATTLE_DOG);
            string436.getClass();
            return string436;
        }
        if (g2.d(str, x0.u6)) {
            String string437 = context.getString(R.string.DOG_BREED_SAINT_PYRENEES);
            string437.getClass();
            return string437;
        }
        if (g2.d(str, x0.v6)) {
            String string438 = context.getString(R.string.DOG_BREED_SAINT_SHEPHERD);
            string438.getClass();
            return string438;
        }
        if (g2.d(str, x0.w6)) {
            String string439 = context.getString(R.string.DOG_BREED_SALUKI);
            string439.getClass();
            return string439;
        }
        if (g2.d(str, x0.x6)) {
            String string440 = context.getString(R.string.DOG_BREED_SAMOYED);
            string440.getClass();
            return string440;
        }
        if (g2.d(str, x0.y6)) {
            String string441 = context.getString(R.string.DOG_BREED_SCHILLERST_VARE_res_0x80010183);
            string441.getClass();
            return string441;
        }
        if (g2.d(str, x0.z6)) {
            String string442 = context.getString(R.string.DOG_BREED_SCHIPPERKE);
            string442.getClass();
            return string442;
        }
        if (g2.d(str, x0.A6)) {
            String string443 = context.getString(R.string.DOG_BREED_SCHNAUZER);
            string443.getClass();
            return string443;
        }
        if (g2.d(str, x0.B6)) {
            String string444 = context.getString(R.string.DOG_BREED_SCHNOODLE);
            string444.getClass();
            return string444;
        }
        if (g2.d(str, x0.C6)) {
            String string445 = context.getString(R.string.DOG_BREED_SCOTTISH_TERRIER);
            string445.getClass();
            return string445;
        }
        if (g2.d(str, x0.D6)) {
            String string446 = context.getString(R.string.DOG_BREED_SEALYHAM_TERRIER);
            string446.getClass();
            return string446;
        }
        if (g2.d(str, x0.E6)) {
            String string447 = context.getString(R.string.DOG_BREED_SEGUGIO_MAREMMANO);
            string447.getClass();
            return string447;
        }
        if (g2.d(str, x0.F6)) {
            String string448 = context.getString(R.string.DOG_BREED_SERBIAN_HOUND);
            string448.getClass();
            return string448;
        }
        if (g2.d(str, x0.G6)) {
            String string449 = context.getString(R.string.DOG_BREED_SERBIAN_TRICOLOUR_HOUND);
            string449.getClass();
            return string449;
        }
        if (g2.d(str, x0.H6)) {
            String string450 = context.getString(R.string.DOG_BREED_SHAR_PEI);
            string450.getClass();
            return string450;
        }
        if (g2.d(str, x0.I6)) {
            String string451 = context.getString(R.string.DOG_BREED_SHEEPADOODLE);
            string451.getClass();
            return string451;
        }
        if (g2.d(str, x0.J6)) {
            String string452 = context.getString(R.string.DOG_BREED_SHEPRADOR);
            string452.getClass();
            return string452;
        }
        if (g2.d(str, x0.K6)) {
            String string453 = context.getString(R.string.DOG_BREED_SHETLAND_SHEEPDOG);
            string453.getClass();
            return string453;
        }
        if (g2.d(str, x0.L6)) {
            String string454 = context.getString(R.string.DOG_BREED_SHIBA);
            string454.getClass();
            return string454;
        }
        if (g2.d(str, x0.M6)) {
            String string455 = context.getString(R.string.DOG_BREED_SHICHI);
            string455.getClass();
            return string455;
        }
        if (g2.d(str, x0.N6)) {
            String string456 = context.getString(R.string.DOG_BREED_SHIHPOO);
            string456.getClass();
            return string456;
        }
        if (g2.d(str, x0.O6)) {
            String string457 = context.getString(R.string.DOG_BREED_SHIH_TZU);
            string457.getClass();
            return string457;
        }
        if (g2.d(str, x0.P6)) {
            String string458 = context.getString(R.string.DOG_BREED_SHIKOKU);
            string458.getClass();
            return string458;
        }
        if (g2.d(str, x0.Q6)) {
            String string459 = context.getString(R.string.DOG_BREED_SHIRANIAN);
            string459.getClass();
            return string459;
        }
        if (g2.d(str, x0.R6)) {
            String string460 = context.getString(R.string.DOG_BREED_SHOLLIE);
            string460.getClass();
            return string460;
        }
        if (g2.d(str, x0.S6)) {
            String string461 = context.getString(R.string.DOG_BREED_SIBERIAN_HUSKY);
            string461.getClass();
            return string461;
        }
        if (g2.d(str, x0.T6)) {
            String string462 = context.getString(R.string.DOG_BREED_SIBERIAN_RETRIEVER);
            string462.getClass();
            return string462;
        }
        if (g2.d(str, x0.U6)) {
            String string463 = context.getString(R.string.DOG_BREED_SKYE_TERRIER);
            string463.getClass();
            return string463;
        }
        if (g2.d(str, x0.V6)) {
            String string464 = context.getString(R.string.DOG_BREED_SLOUGHI);
            string464.getClass();
            return string464;
        }
        if (g2.d(str, x0.W6)) {
            String string465 = context.getString(R.string.DOG_BREED_SLOVAKIAN_CHUVACH);
            string465.getClass();
            return string465;
        }
        if (g2.d(str, x0.X6)) {
            String string466 = context.getString(R.string.DOG_BREED_SLOVAKIAN_HOUND);
            string466.getClass();
            return string466;
        }
        if (g2.d(str, x0.Y6)) {
            String string467 = context.getString(R.string.DOG_BREED_SMALL_BLUE_GASCONY);
            string467.getClass();
            return string467;
        }
        if (g2.d(str, x0.Z6)) {
            String string468 = context.getString(R.string.DOG_BREED_SMALL_SWISS_HOUND);
            string468.getClass();
            return string468;
        }
        if (g2.d(str, x0.a7)) {
            String string469 = context.getString(R.string.DOG_BREED_SM_LANDSST_VARE_res_0x8001019f);
            string469.getClass();
            return string469;
        }
        if (g2.d(str, x0.b7)) {
            String string470 = context.getString(R.string.DOG_BREED_SOUTH_RUSSIAN_SHEPHERD_DOG);
            string470.getClass();
            return string470;
        }
        if (g2.d(str, x0.c7)) {
            String string471 = context.getString(R.string.DOG_BREED_SPANADOR);
            string471.getClass();
            return string471;
        }
        if (g2.d(str, x0.d7)) {
            String string472 = context.getString(R.string.DOG_BREED_SPANISH_GREYHOUND);
            string472.getClass();
            return string472;
        }
        if (g2.d(str, x0.e7)) {
            String string473 = context.getString(R.string.DOG_BREED_SPANISH_HOUND);
            string473.getClass();
            return string473;
        }
        if (g2.d(str, x0.f7)) {
            String string474 = context.getString(R.string.DOG_BREED_SPANISH_MASTIFF);
            string474.getClass();
            return string474;
        }
        if (g2.d(str, x0.g7)) {
            String string475 = context.getString(R.string.DOG_BREED_SPANISH_WATER_DOG);
            string475.getClass();
            return string475;
        }
        if (g2.d(str, x0.h7)) {
            String string476 = context.getString(R.string.DOG_BREED_SPRINGADOR);
            string476.getClass();
            return string476;
        }
        if (g2.d(str, x0.i7)) {
            String string477 = context.getString(R.string.DOG_BREED_SPRINGERDOODLE);
            string477.getClass();
            return string477;
        }
        if (g2.d(str, x0.j7)) {
            String string478 = context.getString(R.string.DOG_BREED_STABIJHOUN);
            string478.getClass();
            return string478;
        }
        if (g2.d(str, x0.k7)) {
            String string479 = context.getString(R.string.DOG_BREED_STAFFORDSHIRE_BULL_TERRIER);
            string479.getClass();
            return string479;
        }
        if (g2.d(str, x0.l7)) {
            String string480 = context.getString(R.string.DOG_BREED_ST_BERNARD);
            string480.getClass();
            return string480;
        }
        if (g2.d(str, x0.m7)) {
            String string481 = context.getString(R.string.DOG_BREED_SUSSEX_SPANIEL);
            string481.getClass();
            return string481;
        }
        if (g2.d(str, x0.n7)) {
            String string482 = context.getString(R.string.DOG_BREED_SWEDISH_LAPPHUND);
            string482.getClass();
            return string482;
        }
        if (g2.d(str, x0.o7)) {
            String string483 = context.getString(R.string.DOG_BREED_SWEDISH_VALLHUND);
            string483.getClass();
            return string483;
        }
        if (g2.d(str, x0.p7)) {
            String string484 = context.getString(R.string.DOG_BREED_SWISS_HOUND);
            string484.getClass();
            return string484;
        }
        if (g2.d(str, x0.q7)) {
            String string485 = context.getString(R.string.DOG_BREED_TAIWAN_DOG);
            string485.getClass();
            return string485;
        }
        if (g2.d(str, x0.r7)) {
            String string486 = context.getString(R.string.DOG_BREED_TATRA_SHEPHERD_DOG);
            string486.getClass();
            return string486;
        }
        if (g2.d(str, x0.s7)) {
            String string487 = context.getString(R.string.DOG_BREED_THAI_BANGKAEW_DOG);
            string487.getClass();
            return string487;
        }
        if (g2.d(str, x0.t7)) {
            String string488 = context.getString(R.string.DOG_BREED_THAI_RIDGEBACK_DOG);
            string488.getClass();
            return string488;
        }
        if (g2.d(str, x0.u7)) {
            String string489 = context.getString(R.string.DOG_BREED_TIBETAN_MASTIFF);
            string489.getClass();
            return string489;
        }
        if (g2.d(str, x0.v7)) {
            String string490 = context.getString(R.string.DOG_BREED_TIBETAN_SPANIEL);
            string490.getClass();
            return string490;
        }
        if (g2.d(str, x0.w7)) {
            String string491 = context.getString(R.string.DOG_BREED_TIBETAN_TERRIER);
            string491.getClass();
            return string491;
        }
        if (g2.d(str, x0.x7)) {
            String string492 = context.getString(R.string.DOG_BREED_TOSA);
            string492.getClass();
            return string492;
        }
        if (g2.d(str, x0.y7)) {
            String string493 = context.getString(R.string.DOG_BREED_TRANSMONTANO_MASTIFF);
            string493.getClass();
            return string493;
        }
        if (g2.d(str, x0.z7)) {
            String string494 = context.getString(R.string.DOG_BREED_TYROLEAN_HOUND);
            string494.getClass();
            return string494;
        }
        if (g2.d(str, x0.A7)) {
            String string495 = context.getString(R.string.DOG_BREED_VALENCIAN_TERRIER);
            string495.getClass();
            return string495;
        }
        if (g2.d(str, x0.B7)) {
            String string496 = context.getString(R.string.DOG_BREED_WEIMARANER);
            string496.getClass();
            return string496;
        }
        if (g2.d(str, x0.C7)) {
            String string497 = context.getString(R.string.DOG_BREED_WEIMARDOODLE);
            string497.getClass();
            return string497;
        }
        if (g2.d(str, x0.D7)) {
            String string498 = context.getString(R.string.DOG_BREED_WELSH_CORGI_CARDIGAN);
            string498.getClass();
            return string498;
        }
        if (g2.d(str, x0.E7)) {
            String string499 = context.getString(R.string.DOG_BREED_WELSH_CORGI_PEMBROKE);
            string499.getClass();
            return string499;
        }
        if (g2.d(str, x0.F7)) {
            String string500 = context.getString(R.string.DOG_BREED_WELSH_SPRINGER_SPANIEL);
            string500.getClass();
            return string500;
        }
        if (g2.d(str, x0.G7)) {
            String string501 = context.getString(R.string.DOG_BREED_WELSH_TERRIER);
            string501.getClass();
            return string501;
        }
        if (g2.d(str, x0.H7)) {
            String string502 = context.getString(R.string.DOG_BREED_WESTIEPOO);
            string502.getClass();
            return string502;
        }
        if (g2.d(str, x0.I7)) {
            String string503 = context.getString(R.string.DOG_BREED_WESTPHALIAN_DACHSBRACKE);
            string503.getClass();
            return string503;
        }
        if (g2.d(str, x0.J7)) {
            String string504 = context.getString(R.string.DOG_BREED_WEST_HIGHLAND_WHITE_TERRIER);
            string504.getClass();
            return string504;
        }
        if (g2.d(str, x0.K7)) {
            String string505 = context.getString(R.string.DOG_BREED_WEST_SIBERIAN_LAIKA);
            string505.getClass();
            return string505;
        }
        if (g2.d(str, x0.L7)) {
            String string506 = context.getString(R.string.DOG_BREED_WHIPPET);
            string506.getClass();
            return string506;
        }
        if (g2.d(str, x0.M7)) {
            String string507 = context.getString(R.string.DOG_BREED_WHITE_SWISS_SHEPHERD_DOG);
            string507.getClass();
            return string507;
        }
        if (g2.d(str, x0.N7)) {
            String string508 = context.getString(R.string.DOG_BREED_WHOODLE);
            string508.getClass();
            return string508;
        }
        if (g2.d(str, x0.O7)) {
            String string509 = context.getString(R.string.DOG_BREED_WIREHAIRED_POINTING_GRIFFON_KORTHALS);
            string509.getClass();
            return string509;
        }
        if (g2.d(str, x0.P7)) {
            String string510 = context.getString(R.string.DOG_BREED_WIREHAIRED_SLOVAKIAN_POINTER);
            string510.getClass();
            return string510;
        }
        if (g2.d(str, x0.Q7)) {
            String string511 = context.getString(R.string.DOG_BREED_XOLOITZCUINTLE);
            string511.getClass();
            return string511;
        }
        if (g2.d(str, x0.R7)) {
            String string512 = context.getString(R.string.DOG_BREED_YAKUTIAN_LAIKA);
            string512.getClass();
            return string512;
        }
        if (g2.d(str, x0.S7)) {
            String string513 = context.getString(R.string.DOG_BREED_YORKILLON);
            string513.getClass();
            return string513;
        }
        if (g2.d(str, x0.T7)) {
            String string514 = context.getString(R.string.DOG_BREED_YORKIPOO);
            string514.getClass();
            return string514;
        }
        if (g2.d(str, x0.U7)) {
            String string515 = context.getString(R.string.DOG_BREED_YORKSHIRE_TERRIER);
            string515.getClass();
            return string515;
        }
        if (g2.d(str, x0.V7)) {
            String string516 = context.getString(R.string.DOG_BREED_YUGOSLAVIAN_SHEPHERD_DOG__SHARPLANINA);
            string516.getClass();
            return string516;
        }
        if (g2.d(str, x0.H9)) {
            String string517 = context.getString(R.string.multi_day_activities_active_epic);
            string517.getClass();
            return string517;
        }
        if (g2.d(str, x0.I9)) {
            String string518 = context.getString(R.string.multi_day_activities_activities_selected_format);
            string518.getClass();
            return string518;
        }
        if (g2.d(str, x0.J9)) {
            String string519 = context.getString(R.string.multi_day_activities_activity_added);
            string519.getClass();
            return string519;
        }
        if (g2.d(str, x0.K9)) {
            String string520 = context.getString(R.string.multi_day_activities_add_activities);
            string520.getClass();
            return string520;
        }
        if (g2.d(str, x0.L9)) {
            String string521 = context.getString(R.string.multi_day_activities_add_course_footer);
            string521.getClass();
            return string521;
        }
        if (g2.d(str, x0.M9)) {
            String string522 = context.getString(R.string.multi_day_activities_add_daily_note);
            string522.getClass();
            return string522;
        }
        if (g2.d(str, x0.N9)) {
            String string523 = context.getString(R.string.multi_day_activities_all_epic_totals);
            string523.getClass();
            return string523;
        }
        if (g2.d(str, x0.O9)) {
            String string524 = context.getString(R.string.multi_day_activities_all_other);
            string524.getClass();
            return string524;
        }
        if (g2.d(str, x0.P9)) {
            String string525 = context.getString(R.string.multi_day_activities_avg_daily_active);
            string525.getClass();
            return string525;
        }
        if (g2.d(str, x0.Q9)) {
            String string526 = context.getString(R.string.multi_day_activities_avg_daily_resting);
            string526.getClass();
            return string526;
        }
        if (g2.d(str, x0.R9)) {
            String string527 = context.getString(R.string.multi_day_activities_avg_resting_hr);
            string527.getClass();
            return string527;
        }
        if (g2.d(str, x0.S9)) {
            String string528 = context.getString(R.string.multi_day_activities_check_back_later);
            string528.getClass();
            return string528;
        }
        if (g2.d(str, x0.T9)) {
            String string529 = context.getString(R.string.multi_day_activities_check_back_later_no_name);
            string529.getClass();
            return string529;
        }
        if (g2.d(str, x0.U9)) {
            String string530 = context.getString(R.string.multi_day_activities_choose_epic_options);
            string530.getClass();
            return string530;
        }
        if (g2.d(str, x0.V9)) {
            String string531 = context.getString(R.string.multi_day_activities_choose_epic_options_message);
            string531.getClass();
            return string531;
        }
        if (g2.d(str, x0.W9)) {
            String string532 = context.getString(R.string.multi_day_activities_completed_epics);
            string532.getClass();
            return string532;
        }
        if (g2.d(str, x0.X9)) {
            String string533 = context.getString(R.string.multi_day_activities_create_an_epic);
            string533.getClass();
            return string533;
        }
        if (g2.d(str, x0.Y9)) {
            String string534 = context.getString(R.string.multi_day_activities_delete_epic);
            string534.getClass();
            return string534;
        }
        if (g2.d(str, x0.Z9)) {
            String string535 = context.getString(R.string.multi_day_activities_delete_epic_message);
            string535.getClass();
            return string535;
        }
        if (g2.d(str, x0.aa)) {
            String string536 = context.getString(R.string.multi_day_activities_deselect_all);
            string536.getClass();
            return string536;
        }
        if (g2.d(str, x0.ba)) {
            String string537 = context.getString(R.string.multi_day_activities_edit_epic);
            string537.getClass();
            return string537;
        }
        if (g2.d(str, x0.ca)) {
            String string538 = context.getString(R.string.multi_day_activities_edit_reports);
            string538.getClass();
            return string538;
        }
        if (g2.d(str, x0.da)) {
            String string539 = context.getString(R.string.multi_day_activities_epic);
            string539.getClass();
            return string539;
        }
        if (g2.d(str, x0.ea)) {
            String string540 = context.getString(R.string.multi_day_activities_epic_coming_soon);
            string540.getClass();
            return string540;
        }
        if (g2.d(str, x0.fa)) {
            String string541 = context.getString(R.string.multi_day_activities_epic_info);
            string541.getClass();
            return string541;
        }
        if (g2.d(str, x0.ga)) {
            String string542 = context.getString(R.string.multi_day_activities_epic_length);
            string542.getClass();
            return string542;
        }
        if (g2.d(str, x0.ha)) {
            String string543 = context.getString(R.string.multi_day_activities_epic_name);
            string543.getClass();
            return string543;
        }
        if (g2.d(str, x0.ia)) {
            String string544 = context.getString(R.string.multi_day_activities_epic_options);
            string544.getClass();
            return string544;
        }
        if (g2.d(str, x0.ja)) {
            String string545 = context.getString(R.string.multi_day_activities_epic_summary);
            string545.getClass();
            return string545;
        }
        if (g2.d(str, x0.ka)) {
            String string546 = context.getString(R.string.multi_day_activities_epics);
            string546.getClass();
            return string546;
        }
        if (g2.d(str, x0.la)) {
            String string547 = context.getString(R.string.multi_day_activities_everyone);
            string547.getClass();
            return string547;
        }
        if (g2.d(str, x0.ma)) {
            String string548 = context.getString(R.string.multi_day_activities_exit_epic);
            string548.getClass();
            return string548;
        }
        if (g2.d(str, x0.na)) {
            String string549 = context.getString(R.string.multi_day_activities_exit_epic_message);
            string549.getClass();
            return string549;
        }
        if (g2.d(str, x0.oa)) {
            String string550 = context.getString(R.string.multi_day_activities_future_epics);
            string550.getClass();
            return string550;
        }
        if (g2.d(str, x0.pa)) {
            String string551 = context.getString(R.string.multi_day_activities_future_epics_message);
            string551.getClass();
            return string551;
        }
        if (g2.d(str, x0.qa)) {
            String string552 = context.getString(R.string.multi_day_activities_genesis_description1);
            string552.getClass();
            return string552;
        }
        if (g2.d(str, x0.ra)) {
            String string553 = context.getString(R.string.multi_day_activities_genesis_description2);
            string553.getClass();
            return string553;
        }
        if (g2.d(str, x0.sa)) {
            String string554 = context.getString(R.string.multi_day_activities_go_on_epic);
            string554.getClass();
            return string554;
        }
        if (g2.d(str, x0.ta)) {
            String string555 = context.getString(R.string.multi_day_activities_health_stats_only_visible);
            string555.getClass();
            return string555;
        }
        if (g2.d(str, x0.ua)) {
            String string556 = context.getString(R.string.multi_day_activities_linked_course_not_available);
            string556.getClass();
            return string556;
        }
        if (g2.d(str, x0.va)) {
            String string557 = context.getString(R.string.multi_day_activities_livetrack_action);
            string557.getClass();
            return string557;
        }
        if (g2.d(str, x0.wa)) {
            String string558 = context.getString(R.string.multi_day_activities_livetrack_message);
            string558.getClass();
            return string558;
        }
        if (g2.d(str, x0.xa)) {
            String string559 = context.getString(R.string.multi_day_activities_livetrack_not_setup);
            string559.getClass();
            return string559;
        }
        if (g2.d(str, x0.ya)) {
            String string560 = context.getString(R.string.multi_day_activities_livetrack_share_link_footer);
            string560.getClass();
            return string560;
        }
        if (g2.d(str, x0.za)) {
            String string561 = context.getString(R.string.multi_day_activities_livetrack_title);
            string561.getClass();
            return string561;
        }
        if (g2.d(str, x0.Aa)) {
            String string562 = context.getString(R.string.multi_day_activities_max_day_message);
            string562.getClass();
            return string562;
        }
        if (g2.d(str, x0.Ba)) {
            String string563 = context.getString(R.string.multi_day_activities_message);
            string563.getClass();
            return string563;
        }
        if (g2.d(str, x0.Ca)) {
            String string564 = context.getString(R.string.multi_day_activities_my_followers);
            string564.getClass();
            return string564;
        }
        if (g2.d(str, x0.Da)) {
            String string565 = context.getString(R.string.multi_day_activities_my_followers_and_groups);
            string565.getClass();
            return string565;
        }
        if (g2.d(str, x0.Ea)) {
            String string566 = context.getString(R.string.multi_day_activities_new_activities);
            string566.getClass();
            return string566;
        }
        if (g2.d(str, x0.Fa)) {
            String string567 = context.getString(R.string.multi_day_activities_new_activities_message);
            string567.getClass();
            return string567;
        }
        if (g2.d(str, x0.Ga)) {
            String string568 = context.getString(R.string.multi_day_activities_no_activities_message);
            string568.getClass();
            return string568;
        }
        if (g2.d(str, x0.Ha)) {
            String string569 = context.getString(R.string.multi_day_activities_no_activities_to_add);
            string569.getClass();
            return string569;
        }
        if (g2.d(str, x0.Ia)) {
            String string570 = context.getString(R.string.multi_day_activities_no_activities_to_add_message);
            string570.getClass();
            return string570;
        }
        if (g2.d(str, x0.Ja)) {
            String string571 = context.getString(R.string.multi_day_activities_no_activity_data_available);
            string571.getClass();
            return string571;
        }
        if (g2.d(str, x0.Ka)) {
            String string572 = context.getString(R.string.multi_day_activities_no_health_data);
            string572.getClass();
            return string572;
        }
        if (g2.d(str, x0.La)) {
            String string573 = context.getString(R.string.multi_day_activities_only_me);
            string573.getClass();
            return string573;
        }
        if (g2.d(str, x0.Ma)) {
            String string574 = context.getString(R.string.multi_day_activities_optional_course_message);
            string574.getClass();
            return string574;
        }
        if (g2.d(str, x0.Na)) {
            String string575 = context.getString(R.string.multi_day_activities_privacy_change_message);
            string575.getClass();
            return string575;
        }
        if (g2.d(str, x0.Oa)) {
            String string576 = context.getString(R.string.multi_day_activities_privacy_change_title);
            string576.getClass();
            return string576;
        }
        if (g2.d(str, x0.Pa)) {
            String string577 = context.getString(R.string.multi_day_activities_remove_activity);
            string577.getClass();
            return string577;
        }
        if (g2.d(str, x0.Qa)) {
            String string578 = context.getString(R.string.multi_day_activities_remove_activity_message);
            string578.getClass();
            return string578;
        }
        if (g2.d(str, x0.Ra)) {
            String string579 = context.getString(R.string.multi_day_activities_reports_only_visible_to_you);
            string579.getClass();
            return string579;
        }
        if (g2.d(str, x0.Sa)) {
            String string580 = context.getString(R.string.multi_day_activities_reports_settings);
            string580.getClass();
            return string580;
        }
        if (g2.d(str, x0.Ta)) {
            String string581 = context.getString(R.string.multi_day_activities_reports_settings_header);
            string581.getClass();
            return string581;
        }
        if (g2.d(str, x0.Ua)) {
            String string582 = context.getString(R.string.multi_day_activities_select_a_course);
            string582.getClass();
            return string582;
        }
        if (g2.d(str, x0.Va)) {
            String string583 = context.getString(R.string.multi_day_activities_select_end_date);
            string583.getClass();
            return string583;
        }
        if (g2.d(str, x0.Wa)) {
            String string584 = context.getString(R.string.multi_day_activities_select_name);
            string584.getClass();
            return string584;
        }
        if (g2.d(str, x0.Xa)) {
            String string585 = context.getString(R.string.multi_day_activities_select_start_date);
            string585.getClass();
            return string585;
        }
        if (g2.d(str, x0.Ya)) {
            String string586 = context.getString(R.string.multi_day_activities_set_date);
            string586.getClass();
            return string586;
        }
        if (g2.d(str, x0.Za)) {
            String string587 = context.getString(R.string.multi_day_activities_share_message);
            string587.getClass();
            return string587;
        }
        if (g2.d(str, x0.ab)) {
            String string588 = context.getString(R.string.multi_day_activities_time_dhm);
            string588.getClass();
            return string588;
        }
        if (g2.d(str, x0.bb)) {
            String string589 = context.getString(R.string.multi_day_activities_total_active_time);
            string589.getClass();
            return string589;
        }
        if (g2.d(str, x0.cb)) {
            String string590 = context.getString(R.string.multi_day_activities_total_activity_time);
            string590.getClass();
            return string590;
        }
        if (g2.d(str, x0.db)) {
            String string591 = context.getString(R.string.multi_day_activities_total_days);
            string591.getClass();
            return string591;
        }
        if (g2.d(str, x0.eb)) {
            String string592 = context.getString(R.string.multi_day_activities_turn_on_livetrack);
            string592.getClass();
            return string592;
        }
        if (g2.d(str, x0.fb)) {
            String string593 = context.getString(R.string.multi_day_activities_turn_on_livetrack_message);
            string593.getClass();
            return string593;
        }
        if (g2.d(str, x0.gb)) {
            String string594 = context.getString(R.string.multi_day_activities_unavailable_dates);
            string594.getClass();
            return string594;
        }
        if (g2.d(str, x0.hb)) {
            String string595 = context.getString(R.string.multi_day_activities_unavailable_dates_message);
            string595.getClass();
            return string595;
        }
        if (g2.d(str, x0.ib)) {
            String string596 = context.getString(R.string.multi_day_activities_unavailable_header_course_message);
            string596.getClass();
            return string596;
        }
        if (g2.d(str, x0.jb)) {
            String string597 = context.getString(R.string.multi_day_activities_until_epic_begins);
            string597.getClass();
            return string597;
        }
        if (g2.d(str, x0.kb)) {
            String string598 = context.getString(R.string.multi_day_activities_upcoming_epics);
            string598.getClass();
            return string598;
        }
        if (g2.d(str, x0.lb)) {
            String string599 = context.getString(R.string.multi_day_activities_updating_snackbar);
            string599.getClass();
            return string599;
        }
        if (g2.d(str, x0.mb)) {
            String string600 = context.getString(R.string.multi_day_activities_view_all_epics);
            string600.getClass();
            return string600;
        }
        if (g2.d(str, x0.Z8)) {
            String string601 = context.getString(R.string.lbl_aero_time);
            string601.getClass();
            return string601;
        }
        if (g2.d(str, x0.a9)) {
            String string602 = context.getString(R.string.lbl_avg_aero_power);
            string602.getClass();
            return string602;
        }
        if (g2.d(str, x0.b9)) {
            String string603 = context.getString(R.string.lbl_avg_aero_torso_angle);
            string603.getClass();
            return string603;
        }
        if (g2.d(str, x0.c9)) {
            String string604 = context.getString(R.string.lbl_avg_lowered_power);
            string604.getClass();
            return string604;
        }
        if (g2.d(str, x0.d9)) {
            String string605 = context.getString(R.string.lbl_avg_lowered_torso_angle);
            string605.getClass();
            return string605;
        }
        if (g2.d(str, x0.e9)) {
            String string606 = context.getString(R.string.lbl_avg_standing_torso_angle);
            string606.getClass();
            return string606;
        }
        if (g2.d(str, x0.f9)) {
            String string607 = context.getString(R.string.lbl_avg_torso_angle);
            string607.getClass();
            return string607;
        }
        if (g2.d(str, x0.g9)) {
            String string608 = context.getString(R.string.lbl_avg_upright_power);
            string608.getClass();
            return string608;
        }
        if (g2.d(str, x0.h9)) {
            String string609 = context.getString(R.string.lbl_avg_upright_torso_angle);
            string609.getClass();
            return string609;
        }
        if (g2.d(str, x0.i9)) {
            String string610 = context.getString(R.string.lbl_cycling_dynamics_torso_angle);
            string610.getClass();
            return string610;
        }
        if (g2.d(str, x0.j9)) {
            String string611 = context.getString(R.string.lbl_lowered_time);
            string611.getClass();
            return string611;
        }
        if (g2.d(str, x0.k9)) {
            String string612 = context.getString(R.string.lbl_max_aero_power);
            string612.getClass();
            return string612;
        }
        if (g2.d(str, x0.l9)) {
            String string613 = context.getString(R.string.lbl_max_lowered_power);
            string613.getClass();
            return string613;
        }
        if (g2.d(str, x0.m9)) {
            String string614 = context.getString(R.string.lbl_max_upright_power);
            string614.getClass();
            return string614;
        }
        if (g2.d(str, x0.n9)) {
            String string615 = context.getString(R.string.lbl_torso_angle);
            string615.getClass();
            return string615;
        }
        if (g2.d(str, x0.o9)) {
            String string616 = context.getString(R.string.lbl_torso_angle_ranges);
            string616.getClass();
            return string616;
        }
        if (g2.d(str, x0.p9)) {
            String string617 = context.getString(R.string.lbl_torso_angle_thresholds);
            string617.getClass();
            return string617;
        }
        if (g2.d(str, x0.q9)) {
            String string618 = context.getString(R.string.lbl_total_aero_time);
            string618.getClass();
            return string618;
        }
        if (g2.d(str, x0.r9)) {
            String string619 = context.getString(R.string.lbl_total_lowered_time);
            string619.getClass();
            return string619;
        }
        if (g2.d(str, x0.s9)) {
            String string620 = context.getString(R.string.lbl_total_upright_time);
            string620.getClass();
            return string620;
        }
        if (g2.d(str, x0.t9)) {
            String string621 = context.getString(R.string.lbl_upright_time);
            string621.getClass();
            return string621;
        }
        if (g2.d(str, x0.u9)) {
            String string622 = context.getString(R.string.lbl_using_torso_angle);
            string622.getClass();
            return string622;
        }
        if (g2.d(str, x0.v9)) {
            String string623 = context.getString(R.string.msg_cycling_position_aero_lowered);
            string623.getClass();
            return string623;
        }
        if (g2.d(str, x0.w9)) {
            String string624 = context.getString(R.string.msg_cycling_position_hrm_measured);
            string624.getClass();
            return string624;
        }
        if (g2.d(str, x0.x9)) {
            String string625 = context.getString(R.string.msg_cycling_position_with_aero_bars);
            string625.getClass();
            return string625;
        }
        if (g2.d(str, x0.y9)) {
            String string626 = context.getString(R.string.msg_cycling_position_without_aero_bars);
            string626.getClass();
            return string626;
        }
        if (g2.d(str, x0.z9)) {
            String string627 = context.getString(R.string.msg_lower_torso_angle_note);
            string627.getClass();
            return string627;
        }
        if (g2.d(str, x0.A9)) {
            String string628 = context.getString(R.string.msg_time_in_position_chart);
            string628.getClass();
            return string628;
        }
        if (g2.d(str, x0.B9)) {
            String string629 = context.getString(R.string.msg_time_spent_aero_lowered);
            string629.getClass();
            return string629;
        }
        if (g2.d(str, x0.C9)) {
            String string630 = context.getString(R.string.msg_torso_angle_by_tracking);
            string630.getClass();
            return string630;
        }
        if (g2.d(str, x0.D9)) {
            String string631 = context.getString(R.string.msg_torso_angle_description);
            string631.getClass();
            return string631;
        }
        if (g2.d(str, x0.E9)) {
            String string632 = context.getString(R.string.msg_torso_angle_measurement);
            string632.getClass();
            return string632;
        }
        if (g2.d(str, x0.F9)) {
            String string633 = context.getString(R.string.msg_torso_angle_ranges);
            string633.getClass();
            return string633;
        }
        if (g2.d(str, x0.G9)) {
            String string634 = context.getString(R.string.msg_torso_angle_variations);
            string634.getClass();
            return string634;
        }
        if (g2.d(str, x0.od)) {
            String string635 = context.getString(R.string.lbl_exclude_from_physio_metrics);
            string635.getClass();
            return string635;
        }
        if (g2.d(str, x0.pd)) {
            String string636 = context.getString(R.string.lbl_excluded_from_physio_metrics);
            string636.getClass();
            return string636;
        }
        if (g2.d(str, x0.qd)) {
            String string637 = context.getString(R.string.msg_exclude_from_physio_metrics);
            string637.getClass();
            return string637;
        }
        if (g2.d(str, x0.rd)) {
            String string638 = context.getString(R.string.msg_trim_activity_changes);
            string638.getClass();
            return string638;
        }
        if (g2.d(str, x0.X8)) {
            String string639 = context.getString(R.string.lbl_synced_gym_equipment);
            string639.getClass();
            return string639;
        }
        if (g2.d(str, x0.Y8)) {
            String string640 = context.getString(R.string.msg_synced_gym_equipment);
            string640.getClass();
            return string640;
        }
        if (g2.d(str, x0.sd)) {
            String string641 = context.getString(R.string.added_sugar_abbreviation);
            string641.getClass();
            return string641;
        }
        if (g2.d(str, x0.td)) {
            String string642 = context.getString(R.string.calcium_abbreviation);
            string642.getClass();
            return string642;
        }
        if (g2.d(str, x0.ud)) {
            String string643 = context.getString(R.string.custom_meal_1);
            string643.getClass();
            return string643;
        }
        if (g2.d(str, x0.vd)) {
            String string644 = context.getString(R.string.custom_meal_2);
            string644.getClass();
            return string644;
        }
        if (g2.d(str, x0.wd)) {
            String string645 = context.getString(R.string.custom_meal_3);
            string645.getClass();
            return string645;
        }
        if (g2.d(str, x0.xd)) {
            String string646 = context.getString(R.string.describe_your_meal);
            string646.getClass();
            return string646;
        }
        if (g2.d(str, x0.yd)) {
            String string647 = context.getString(R.string.description_length_limit_reached_message);
            string647.getClass();
            return string647;
        }
        if (g2.d(str, x0.zd)) {
            String string648 = context.getString(R.string.lbl_add_ingredients);
            string648.getClass();
            return string648;
        }
        if (g2.d(str, x0.Ad)) {
            String string649 = context.getString(R.string.lbl_add_remove);
            string649.getClass();
            return string649;
        }
        if (g2.d(str, x0.Bd)) {
            String string650 = context.getString(R.string.lbl_added_sugar_surplus);
            string650.getClass();
            return string650;
        }
        if (g2.d(str, x0.Cd)) {
            String string651 = context.getString(R.string.lbl_adjust_meal_times);
            string651.getClass();
            return string651;
        }
        if (g2.d(str, x0.Dd)) {
            String string652 = context.getString(R.string.lbl_avg_daily_macros);
            string652.getClass();
            return string652;
        }
        if (g2.d(str, x0.Ed)) {
            String string653 = context.getString(R.string.lbl_avg_daily_nutrients);
            string653.getClass();
            return string653;
        }
        if (g2.d(str, x0.Fd)) {
            String string654 = context.getString(R.string.lbl_avg_daily_other);
            string654.getClass();
            return string654;
        }
        if (g2.d(str, x0.Gd)) {
            String string655 = context.getString(R.string.lbl_avg_surplus);
            string655.getClass();
            return string655;
        }
        if (g2.d(str, x0.Hd)) {
            String string656 = context.getString(R.string.lbl_calcium_surplus);
            string656.getClass();
            return string656;
        }
        if (g2.d(str, x0.Id)) {
            String string657 = context.getString(R.string.lbl_create_a_recipe);
            string657.getClass();
            return string657;
        }
        if (g2.d(str, x0.Jd)) {
            String string658 = context.getString(R.string.lbl_create_recipe);
            string658.getClass();
            return string658;
        }
        if (g2.d(str, x0.Kd)) {
            String string659 = context.getString(R.string.lbl_create_recipes);
            string659.getClass();
            return string659;
        }
        if (g2.d(str, x0.Ld)) {
            String string660 = context.getString(R.string.lbl_daily_macros);
            string660.getClass();
            return string660;
        }
        if (g2.d(str, x0.Md)) {
            String string661 = context.getString(R.string.lbl_daily_meals);
            string661.getClass();
            return string661;
        }
        if (g2.d(str, x0.Nd)) {
            String string662 = context.getString(R.string.lbl_daily_nutrients);
            string662.getClass();
            return string662;
        }
        if (g2.d(str, x0.Od)) {
            String string663 = context.getString(R.string.lbl_daily_type_view);
            string663.getClass();
            return string663;
        }
        if (g2.d(str, x0.Pd)) {
            String string664 = context.getString(R.string.lbl_daily_view);
            string664.getClass();
            return string664;
        }
        if (g2.d(str, x0.Qd)) {
            String string665 = context.getString(R.string.lbl_delete_recipe);
            string665.getClass();
            return string665;
        }
        if (g2.d(str, x0.Rd)) {
            String string666 = context.getString(R.string.lbl_delete_recipe_alert_title);
            string666.getClass();
            return string666;
        }
        if (g2.d(str, x0.Sd)) {
            String string667 = context.getString(R.string.lbl_disable_other_nutrients_tracking);
            string667.getClass();
            return string667;
        }
        if (g2.d(str, x0.Td)) {
            String string668 = context.getString(R.string.lbl_edit_list);
            string668.getClass();
            return string668;
        }
        if (g2.d(str, x0.Ud)) {
            String string669 = context.getString(R.string.lbl_edit_other_nutrients);
            string669.getClass();
            return string669;
        }
        if (g2.d(str, x0.Vd)) {
            String string670 = context.getString(R.string.lbl_edit_recipe);
            string670.getClass();
            return string670;
        }
        if (g2.d(str, x0.Wd)) {
            String string671 = context.getString(R.string.lbl_enable_other_nutrient_tracking);
            string671.getClass();
            return string671;
        }
        if (g2.d(str, x0.Xd)) {
            String string672 = context.getString(R.string.lbl_enter_end_time);
            string672.getClass();
            return string672;
        }
        if (g2.d(str, x0.Yd)) {
            String string673 = context.getString(R.string.lbl_enter_start_time);
            string673.getClass();
            return string673;
        }
        if (g2.d(str, x0.Zd)) {
            String string674 = context.getString(R.string.lbl_fiber_surplus);
            string674.getClass();
            return string674;
        }
        if (g2.d(str, x0.ae)) {
            String string675 = context.getString(R.string.lbl_image_upload_failes);
            string675.getClass();
            return string675;
        }
        if (g2.d(str, x0.be)) {
            String string676 = context.getString(R.string.lbl_ingredient_limit_reached);
            string676.getClass();
            return string676;
        }
        if (g2.d(str, x0.ce)) {
            String string677 = context.getString(R.string.lbl_ingredients);
            string677.getClass();
            return string677;
        }
        if (g2.d(str, x0.de)) {
            String string678 = context.getString(R.string.lbl_iron_surplus);
            string678.getClass();
            return string678;
        }
        if (g2.d(str, x0.ee)) {
            String string679 = context.getString(R.string.lbl_log_by_voice);
            string679.getClass();
            return string679;
        }
        if (g2.d(str, x0.fe)) {
            String string680 = context.getString(R.string.lbl_log_to);
            string680.getClass();
            return string680;
        }
        if (g2.d(str, x0.ge)) {
            String string681 = context.getString(R.string.lbl_macronutrient_goals);
            string681.getClass();
            return string681;
        }
        if (g2.d(str, x0.he)) {
            String string682 = context.getString(R.string.lbl_macros);
            string682.getClass();
            return string682;
        }
        if (g2.d(str, x0.ie)) {
            String string683 = context.getString(R.string.lbl_meal_required);
            string683.getClass();
            return string683;
        }
        if (g2.d(str, x0.je)) {
            String string684 = context.getString(R.string.lbl_meal_settings);
            string684.getClass();
            return string684;
        }
        if (g2.d(str, x0.ke)) {
            String string685 = context.getString(R.string.lbl_meal_windows_count);
            string685.getClass();
            return string685;
        }
        if (g2.d(str, x0.le)) {
            String string686 = context.getString(R.string.lbl_meal_your_way);
            string686.getClass();
            return string686;
        }
        if (g2.d(str, x0.me)) {
            String string687 = context.getString(R.string.lbl_meals);
            string687.getClass();
            return string687;
        }
        if (g2.d(str, x0.ne)) {
            String string688 = context.getString(R.string.lbl_meals_view);
            string688.getClass();
            return string688;
        }
        if (g2.d(str, x0.oe)) {
            String string689 = context.getString(R.string.lbl_meals_view_description);
            string689.getClass();
            return string689;
        }
        if (g2.d(str, x0.pe)) {
            String string690 = context.getString(R.string.lbl_micronutrients);
            string690.getClass();
            return string690;
        }
        if (g2.d(str, x0.qe)) {
            String string691 = context.getString(R.string.lbl_more_nutrient_tracking);
            string691.getClass();
            return string691;
        }
        if (g2.d(str, x0.re)) {
            String string692 = context.getString(R.string.lbl_my_recipes);
            string692.getClass();
            return string692;
        }
        if (g2.d(str, x0.se)) {
            String string693 = context.getString(R.string.lbl_non_editable_meal_description);
            string693.getClass();
            return string693;
        }
        if (g2.d(str, x0.te)) {
            String string694 = context.getString(R.string.lbl_notes);
            string694.getClass();
            return string694;
        }
        if (g2.d(str, x0.ue)) {
            String string695 = context.getString(R.string.lbl_nutrient_surplus);
            string695.getClass();
            return string695;
        }
        if (g2.d(str, x0.ve)) {
            String string696 = context.getString(R.string.lbl_nutrients);
            string696.getClass();
            return string696;
        }
        if (g2.d(str, x0.we)) {
            String string697 = context.getString(R.string.lbl_nutrients_min_required);
            string697.getClass();
            return string697;
        }
        if (g2.d(str, x0.xe)) {
            String string698 = context.getString(R.string.lbl_other_nutrient_goals);
            string698.getClass();
            return string698;
        }
        if (g2.d(str, x0.ye)) {
            String string699 = context.getString(R.string.lbl_other_nutrients);
            string699.getClass();
            return string699;
        }
        if (g2.d(str, x0.ze)) {
            String string700 = context.getString(R.string.lbl_recipe_details);
            string700.getClass();
            return string700;
        }
        if (g2.d(str, x0.Ae)) {
            String string701 = context.getString(R.string.lbl_recipe_name);
            string701.getClass();
            return string701;
        }
        if (g2.d(str, x0.Be)) {
            String string702 = context.getString(R.string.lbl_recipes);
            string702.getClass();
            return string702;
        }
        if (g2.d(str, x0.Ce)) {
            String string703 = context.getString(R.string.lbl_remove_recipe);
            string703.getClass();
            return string703;
        }
        if (g2.d(str, x0.De)) {
            String string704 = context.getString(R.string.lbl_review);
            string704.getClass();
            return string704;
        }
        if (g2.d(str, x0.Ee)) {
            String string705 = context.getString(R.string.lbl_review_your_meal_settings);
            string705.getClass();
            return string705;
        }
        if (g2.d(str, x0.Fe)) {
            String string706 = context.getString(R.string.lbl_saturated_fat_surplus);
            string706.getClass();
            return string706;
        }
        if (g2.d(str, x0.Ge)) {
            String string707 = context.getString(R.string.lbl_saved_to_my_recipes);
            string707.getClass();
            return string707;
        }
        if (g2.d(str, x0.He)) {
            String string708 = context.getString(R.string.lbl_select_a_meal);
            string708.getClass();
            return string708;
        }
        if (g2.d(str, x0.Ie)) {
            String string709 = context.getString(R.string.lbl_select_items_to_add_to_recipe);
            string709.getClass();
            return string709;
        }
        if (g2.d(str, x0.Je)) {
            String string710 = context.getString(R.string.lbl_select_meals_to_show_hide);
            string710.getClass();
            return string710;
        }
        if (g2.d(str, x0.Ke)) {
            String string711 = context.getString(R.string.lbl_set_start_and_end_time);
            string711.getClass();
            return string711;
        }
        if (g2.d(str, x0.Le)) {
            String string712 = context.getString(R.string.lbl_set_your_other_nutrient_goals);
            string712.getClass();
            return string712;
        }
        if (g2.d(str, x0.Me)) {
            String string713 = context.getString(R.string.lbl_single_serving);
            string713.getClass();
            return string713;
        }
        if (g2.d(str, x0.Ne)) {
            String string714 = context.getString(R.string.lbl_surplus);
            string714.getClass();
            return string714;
        }
        if (g2.d(str, x0.Oe)) {
            String string715 = context.getString(R.string.lbl_timeline);
            string715.getClass();
            return string715;
        }
        if (g2.d(str, x0.Pe)) {
            String string716 = context.getString(R.string.lbl_timeline_view);
            string716.getClass();
            return string716;
        }
        if (g2.d(str, x0.Qe)) {
            String string717 = context.getString(R.string.lbl_timeline_view_description);
            string717.getClass();
            return string717;
        }
        if (g2.d(str, x0.Re)) {
            String string718 = context.getString(R.string.lbl_tracking_disabled);
            string718.getClass();
            return string718;
        }
        if (g2.d(str, x0.Se)) {
            String string719 = context.getString(R.string.lbl_vitamin_a_surplus);
            string719.getClass();
            return string719;
        }
        if (g2.d(str, x0.Te)) {
            String string720 = context.getString(R.string.lbl_vitamin_d_surplus);
            string720.getClass();
            return string720;
        }
        if (g2.d(str, x0.Ue)) {
            String string721 = context.getString(R.string.listening);
            string721.getClass();
            return string721;
        }
        if (g2.d(str, x0.Ve)) {
            String string722 = context.getString(R.string.mgs_enter_a_meal_name);
            string722.getClass();
            return string722;
        }
        if (g2.d(str, x0.We)) {
            String string723 = context.getString(R.string.mgs_your_recipe_was_created_but_image_could_not_upload);
            string723.getClass();
            return string723;
        }
        if (g2.d(str, x0.Xe)) {
            String string724 = context.getString(R.string.micronutrients_description);
            string724.getClass();
            return string724;
        }
        if (g2.d(str, x0.Ye)) {
            String string725 = context.getString(R.string.microphone_access_needed_message);
            string725.getClass();
            return string725;
        }
        if (g2.d(str, x0.Ze)) {
            String string726 = context.getString(R.string.microphone_access_needed_title);
            string726.getClass();
            return string726;
        }
        if (g2.d(str, x0.af)) {
            String string727 = context.getString(R.string.more_ways_to_make_nutrition_yours);
            string727.getClass();
            return string727;
        }
        if (g2.d(str, x0.bf)) {
            String string728 = context.getString(R.string.msg_at_least_one_food_required);
            string728.getClass();
            return string728;
        }
        if (g2.d(str, x0.cf)) {
            String string729 = context.getString(R.string.msg_at_least_one_serving_required);
            string729.getClass();
            return string729;
        }
        if (g2.d(str, x0.df)) {
            String string730 = context.getString(R.string.msg_choose_a_date_and_meal_to_copy_these_foods);
            string730.getClass();
            return string730;
        }
        if (g2.d(str, x0.ef)) {
            String string731 = context.getString(R.string.msg_choose_a_date_and_meal_to_copy_this_food);
            string731.getClass();
            return string731;
        }
        if (g2.d(str, x0.ff)) {
            String string732 = context.getString(R.string.msg_choose_a_date_and_meal_to_move_these_foods);
            string732.getClass();
            return string732;
        }
        if (g2.d(str, x0.gf)) {
            String string733 = context.getString(R.string.msg_choose_a_date_and_meal_to_move_this_food);
            string733.getClass();
            return string733;
        }
        if (g2.d(str, x0.hf)) {
            String string734 = context.getString(R.string.msg_choose_a_date_and_time_to_copy_these_foods);
            string734.getClass();
            return string734;
        }
        if (g2.d(str, x0.jf)) {
            String string735 = context.getString(R.string.msg_choose_a_date_and_time_to_copy_this_food);
            string735.getClass();
            return string735;
        }
        if (g2.d(str, x0.kf)) {
            String string736 = context.getString(R.string.msg_choose_a_date_and_time_to_move_these_foods);
            string736.getClass();
            return string736;
        }
        if (g2.d(str, x0.lf)) {
            String string737 = context.getString(R.string.msg_choose_a_date_and_time_to_move_this_food);
            string737.getClass();
            return string737;
        }
        if (g2.d(str, x0.mf)) {
            String string738 = context.getString(R.string.msg_combine_ingredients);
            string738.getClass();
            return string738;
        }
        if (g2.d(str, x0.nf)) {
            String string739 = context.getString(R.string.msg_copy_uncategorized_warning);
            string739.getClass();
            return string739;
        }
        if (g2.d(str, x0.of)) {
            String string740 = context.getString(R.string.msg_create_a_recipe);
            string740.getClass();
            return string740;
        }
        if (g2.d(str, x0.pf)) {
            String string741 = context.getString(R.string.msg_customize_meals);
            string741.getClass();
            return string741;
        }
        if (g2.d(str, x0.qf)) {
            String string742 = context.getString(R.string.msg_delete_recipe_alert);
            string742.getClass();
            return string742;
        }
        if (g2.d(str, x0.rf)) {
            String string743 = context.getString(R.string.msg_disable_other_nutrients_tracking);
            string743.getClass();
            return string743;
        }
        if (g2.d(str, x0.sf)) {
            String string744 = context.getString(R.string.msg_food_added_to_recipe);
            string744.getClass();
            return string744;
        }
        if (g2.d(str, x0.tf)) {
            String string745 = context.getString(R.string.msg_food_added_to_results);
            string745.getClass();
            return string745;
        }
        if (g2.d(str, x0.uf)) {
            String string746 = context.getString(R.string.msg_go_beyond_macros);
            string746.getClass();
            return string746;
        }
        if (g2.d(str, x0.vf)) {
            String string747 = context.getString(R.string.msg_ingredient_updated);
            string747.getClass();
            return string747;
        }
        if (g2.d(str, x0.wf)) {
            String string748 = context.getString(R.string.msg_invalid_meal_name);
            string748.getClass();
            return string748;
        }
        if (g2.d(str, x0.xf)) {
            String string749 = context.getString(R.string.msg_maximum_number_of_foods_reached);
            string749.getClass();
            return string749;
        }
        if (g2.d(str, x0.yf)) {
            String string750 = context.getString(R.string.msg_maximum_number_of_foods_reached_reduce);
            string750.getClass();
            return string750;
        }
        if (g2.d(str, x0.zf)) {
            String string751 = context.getString(R.string.msg_meal_goals_updated);
            string751.getClass();
            return string751;
        }
        if (g2.d(str, x0.Af)) {
            String string752 = context.getString(R.string.msg_meal_name_already_in_use);
            string752.getClass();
            return string752;
        }
        if (g2.d(str, x0.Bf)) {
            String string753 = context.getString(R.string.msg_move_uncategorized_warning);
            string753.getClass();
            return string753;
        }
        if (g2.d(str, x0.Cf)) {
            String string754 = context.getString(R.string.msg_no_food_found_recipe);
            string754.getClass();
            return string754;
        }
        if (g2.d(str, x0.Df)) {
            String string755 = context.getString(R.string.msg_no_scan_barcode_detected_recipe);
            string755.getClass();
            return string755;
        }
        if (g2.d(str, x0.Ef)) {
            String string756 = context.getString(R.string.msg_one_meal_window_required);
            string756.getClass();
            return string756;
        }
        if (g2.d(str, x0.Ff)) {
            String string757 = context.getString(R.string.msg_other_nutrients_limit_reached);
            string757.getClass();
            return string757;
        }
        if (g2.d(str, x0.Gf)) {
            String string758 = context.getString(R.string.msg_other_nutrients_min_required);
            string758.getClass();
            return string758;
        }
        if (g2.d(str, x0.Hf)) {
            String string759 = context.getString(R.string.msg_quickly_log_with_voice_logging);
            string759.getClass();
            return string759;
        }
        if (g2.d(str, x0.If)) {
            String string760 = context.getString(R.string.msg_recipe_added_to_favorites);
            string760.getClass();
            return string760;
        }
        if (g2.d(str, x0.Jf)) {
            String string761 = context.getString(R.string.msg_recipe_added_to_meal);
            string761.getClass();
            return string761;
        }
        if (g2.d(str, x0.Kf)) {
            String string762 = context.getString(R.string.msg_recipe_added_to_photo_results);
            string762.getClass();
            return string762;
        }
        if (g2.d(str, x0.Lf)) {
            String string763 = context.getString(R.string.msg_recipe_added_to_recipe);
            string763.getClass();
            return string763;
        }
        if (g2.d(str, x0.Mf)) {
            String string764 = context.getString(R.string.msg_recipe_added_to_results);
            string764.getClass();
            return string764;
        }
        if (g2.d(str, x0.Nf)) {
            String string765 = context.getString(R.string.msg_recipe_created_but_some_information_failed_to_save);
            string765.getClass();
            return string765;
        }
        if (g2.d(str, x0.Of)) {
            String string766 = context.getString(R.string.msg_recipe_logged_to_meal);
            string766.getClass();
            return string766;
        }
        if (g2.d(str, x0.Pf)) {
            String string767 = context.getString(R.string.msg_recipe_removed_from_favorites);
            string767.getClass();
            return string767;
        }
        if (g2.d(str, x0.Qf)) {
            String string768 = context.getString(R.string.msg_select_other_nutrients_in_range);
            string768.getClass();
            return string768;
        }
        if (g2.d(str, x0.Rf)) {
            String string769 = context.getString(R.string.no_matching_foods_found_message);
            string769.getClass();
            return string769;
        }
        if (g2.d(str, x0.Sf)) {
            String string770 = context.getString(R.string.nutrition_tracking_reminder_text_meal_name);
            string770.getClass();
            return string770;
        }
        if (g2.d(str, x0.Tf)) {
            String string771 = context.getString(R.string.review_meal_details_and_foods_to_log_subtitle);
            string771.getClass();
            return string771;
        }
        if (g2.d(str, x0.Uf)) {
            String string772 = context.getString(R.string.saturated_fat_abbreviation);
            string772.getClass();
            return string772;
        }
        if (g2.d(str, x0.Vf)) {
            String string773 = context.getString(R.string.speech_recognition_access_needed_message);
            string773.getClass();
            return string773;
        }
        if (g2.d(str, x0.Wf)) {
            String string774 = context.getString(R.string.speech_recognition_access_needed_title);
            string774.getClass();
            return string774;
        }
        if (g2.d(str, x0.Xf)) {
            String string775 = context.getString(R.string.vitamin_a_abbreviation);
            string775.getClass();
            return string775;
        }
        if (g2.d(str, x0.Yf)) {
            String string776 = context.getString(R.string.vitamin_d_abbreviation);
            string776.getClass();
            return string776;
        }
        if (g2.d(str, x0.Zf)) {
            String string777 = context.getString(R.string.what_are_nutrients_section_body);
            string777.getClass();
            return string777;
        }
        if (g2.d(str, x0.ag)) {
            String string778 = context.getString(R.string.what_are_nutrients_section_title);
            string778.getClass();
            return string778;
        }
        if (g2.d(str, x0.nb)) {
            String string779 = context.getString(R.string.lbl_get_vo2_max_estimate);
            string779.getClass();
            return string779;
        }
        if (g2.d(str, x0.ob)) {
            String string780 = context.getString(R.string.lbl_vo2_max_estimate);
            string780.getClass();
            return string780;
        }
        if (g2.d(str, x0.pb)) {
            String string781 = context.getString(R.string.lbl_vo2_max_test);
            string781.getClass();
            return string781;
        }
        if (g2.d(str, x0.qb)) {
            String string782 = context.getString(R.string.lbl_vo2_max_walking_test);
            string782.getClass();
            return string782;
        }
        if (g2.d(str, x0.rb)) {
            String string783 = context.getString(R.string.lbl_vo2max_estimate_complete);
            string783.getClass();
            return string783;
        }
        if (g2.d(str, x0.sb)) {
            String string784 = context.getString(R.string.lbl_vo2max_not_determined);
            string784.getClass();
            return string784;
        }
        if (g2.d(str, x0.tb)) {
            String string785 = context.getString(R.string.lbl_walking_test);
            string785.getClass();
            return string785;
        }
        if (g2.d(str, x0.ub)) {
            String string786 = context.getString(R.string.msg_finish_set_up_vo2_max_estimate);
            string786.getClass();
            return string786;
        }
        if (g2.d(str, x0.vb)) {
            String string787 = context.getString(R.string.msg_no_vo2_max_data);
            string787.getClass();
            return string787;
        }
        if (g2.d(str, x0.wb)) {
            String string788 = context.getString(R.string.msg_receiving_a_reading_for_vo2max);
            string788.getClass();
            return string788;
        }
        if (g2.d(str, x0.xb)) {
            String string789 = context.getString(R.string.msg_step_1_vo2max);
            string789.getClass();
            return string789;
        }
        if (g2.d(str, x0.yb)) {
            String string790 = context.getString(R.string.msg_step_2_vo2max);
            string790.getClass();
            return string790;
        }
        if (g2.d(str, x0.zb)) {
            String string791 = context.getString(R.string.msg_step_3_vo2max);
            string791.getClass();
            return string791;
        }
        if (g2.d(str, x0.Ab)) {
            String string792 = context.getString(R.string.msg_vo2_max_estimate);
            string792.getClass();
            return string792;
        }
        if (g2.d(str, x0.Bb)) {
            String string793 = context.getString(R.string.msg_vo2_max_walking_test);
            string793.getClass();
            return string793;
        }
        if (g2.d(str, x0.Cb)) {
            String string794 = context.getString(R.string.msg_vo2max_estimate_complete);
            string794.getClass();
            return string794;
        }
        if (g2.d(str, x0.Db)) {
            String string795 = context.getString(R.string.msg_vo2max_not_determined);
            string795.getClass();
            return string795;
        }
        if (g2.d(str, x0.Eb)) {
            String string796 = context.getString(R.string.msg_walking_test_for_vo2max_1);
            string796.getClass();
            return string796;
        }
        if (g2.d(str, x0.Fb)) {
            String string797 = context.getString(R.string.msg_walking_test_for_vo2max_2);
            string797.getClass();
            return string797;
        }
        if (g2.d(str, x0.Gb)) {
            String string798 = context.getString(R.string.average_weekly_intensity_minutes);
            string798.getClass();
            return string798;
        }
        if (g2.d(str, x0.Hb)) {
            String string799 = context.getString(R.string.average_weekly_intensity_minutes_accessibility);
            string799.getClass();
            return string799;
        }
        if (g2.d(str, x0.Ib)) {
            String string800 = context.getString(R.string.average_weekly_steps_abbreviated);
            string800.getClass();
            return string800;
        }
        if (g2.d(str, x0.Jb)) {
            String string801 = context.getString(R.string.average_weekly_steps_accessibility);
            string801.getClass();
            return string801;
        }
        if (g2.d(str, x0.Kb)) {
            String string802 = context.getString(R.string.current_walk_streak);
            string802.getClass();
            return string802;
        }
        if (g2.d(str, x0.Lb)) {
            String string803 = context.getString(R.string.furthest_distance_walked);
            string803.getClass();
            return string803;
        }
        if (g2.d(str, x0.Mb)) {
            String string804 = context.getString(R.string.garmin_walk_coach);
            string804.getClass();
            return string804;
        }
        if (g2.d(str, x0.Nb)) {
            String string805 = context.getString(R.string.garmin_walk_coach_description);
            string805.getClass();
            return string805;
        }
        if (g2.d(str, x0.Ob)) {
            String string806 = context.getString(R.string.keep_up_the_good_work);
            string806.getClass();
            return string806;
        }
        if (g2.d(str, x0.Pb)) {
            String string807 = context.getString(R.string.lbl_num_marathons);
            string807.getClass();
            return string807;
        }
        if (g2.d(str, x0.Qb)) {
            String string808 = context.getString(R.string.long_walk_day);
            string808.getClass();
            return string808;
        }
        if (g2.d(str, x0.Rb)) {
            String string809 = context.getString(R.string.long_walk_day_preference_question);
            string809.getClass();
            return string809;
        }
        if (g2.d(str, x0.Sb)) {
            String string810 = context.getString(R.string.long_walk_days);
            string810.getClass();
            return string810;
        }
        if (g2.d(str, x0.Tb)) {
            String string811 = context.getString(R.string.longest_walk_streak);
            string811.getClass();
            return string811;
        }
        if (g2.d(str, x0.Ub)) {
            String string812 = context.getString(R.string.more_than_a_distance);
            string812.getClass();
            return string812;
        }
        if (g2.d(str, x0.Vb)) {
            String string813 = context.getString(R.string.must_have_one_or_two_long_walk_days);
            string813.getClass();
            return string813;
        }
        if (g2.d(str, x0.Wb)) {
            String string814 = context.getString(R.string.select_long_walk_days);
            string814.getClass();
            return string814;
        }
        if (g2.d(str, x0.Xb)) {
            String string815 = context.getString(R.string.walk_report_walked_distance);
            string815.getClass();
            return string815;
        }
        if (g2.d(str, x0.Yb)) {
            String string816 = context.getString(R.string.walking_stats);
            string816.getClass();
            return string816;
        }
        if (g2.d(str, x0.Zb)) {
            String string817 = context.getString(R.string.hazards_road_closures_message);
            string817.getClass();
            return string817;
        }
        if (g2.d(str, x0.ac)) {
            String string818 = context.getString(R.string.lbl_add_point_to_course);
            string818.getClass();
            return string818;
        }
        if (g2.d(str, x0.bc)) {
            String string819 = context.getString(R.string.lbl_avoidances);
            string819.getClass();
            return string819;
        }
        if (g2.d(str, x0.cc)) {
            String string820 = context.getString(R.string.lbl_course_route);
            string820.getClass();
            return string820;
        }
        if (g2.d(str, x0.dc)) {
            String string821 = context.getString(R.string.lbl_course_routes);
            string821.getClass();
            return string821;
        }
        if (g2.d(str, x0.ec)) {
            String string822 = context.getString(R.string.lbl_create_your_best_ride);
            string822.getClass();
            return string822;
        }
        if (g2.d(str, x0.fc)) {
            String string823 = context.getString(R.string.lbl_explore_more);
            string823.getClass();
            return string823;
        }
        if (g2.d(str, x0.gc)) {
            String string824 = context.getString(R.string.lbl_explore_more_message);
            string824.getClass();
            return string824;
        }
        if (g2.d(str, x0.hc)) {
            String string825 = context.getString(R.string.lbl_hazard_types);
            string825.getClass();
            return string825;
        }
        if (g2.d(str, x0.ic)) {
            String string826 = context.getString(R.string.lbl_high_traffic);
            string826.getClass();
            return string826;
        }
        if (g2.d(str, x0.jc)) {
            String string827 = context.getString(R.string.lbl_high_traffic_road);
            string827.getClass();
            return string827;
        }
        if (g2.d(str, x0.kc)) {
            String string828 = context.getString(R.string.lbl_high_traffic_roads);
            string828.getClass();
            return string828;
        }
        if (g2.d(str, x0.lc)) {
            String string829 = context.getString(R.string.lbl_more_routing_control);
            string829.getClass();
            return string829;
        }
        if (g2.d(str, x0.mc)) {
            String string830 = context.getString(R.string.lbl_more_routing_control_message);
            string830.getClass();
            return string830;
        }
        if (g2.d(str, x0.nc)) {
            String string831 = context.getString(R.string.lbl_no_points_of_interest_selected);
            string831.getClass();
            return string831;
        }
        if (g2.d(str, x0.oc)) {
            String string832 = context.getString(R.string.lbl_number_of_points_of_interest_selected);
            string832.getClass();
            return string832;
        }
        if (g2.d(str, x0.pc)) {
            String string833 = context.getString(R.string.lbl_one_point_of_interest_selected);
            string833.getClass();
            return string833;
        }
        if (g2.d(str, x0.qc)) {
            String string834 = context.getString(R.string.lbl_poi_attractions);
            string834.getClass();
            return string834;
        }
        if (g2.d(str, x0.rc)) {
            String string835 = context.getString(R.string.lbl_poi_automatic_drawing_method);
            string835.getClass();
            return string835;
        }
        if (g2.d(str, x0.sc)) {
            String string836 = context.getString(R.string.lbl_poi_banks_and_atms);
            string836.getClass();
            return string836;
        }
        if (g2.d(str, x0.tc)) {
            String string837 = context.getString(R.string.lbl_poi_bike_shops_and_repair);
            string837.getClass();
            return string837;
        }
        if (g2.d(str, x0.uc)) {
            String string838 = context.getString(R.string.lbl_poi_coffee_shops);
            string838.getClass();
            return string838;
        }
        if (g2.d(str, x0.vc)) {
            String string839 = context.getString(R.string.lbl_poi_community);
            string839.getClass();
            return string839;
        }
        if (g2.d(str, x0.wc)) {
            String string840 = context.getString(R.string.lbl_poi_convenience);
            string840.getClass();
            return string840;
        }
        if (g2.d(str, x0.xc)) {
            String string841 = context.getString(R.string.lbl_poi_emergency);
            string841.getClass();
            return string841;
        }
        if (g2.d(str, x0.yc)) {
            String string842 = context.getString(R.string.lbl_poi_lodging);
            string842.getClass();
            return string842;
        }
        if (g2.d(str, x0.zc)) {
            String string843 = context.getString(R.string.lbl_poi_parks);
            string843.getClass();
            return string843;
        }
        if (g2.d(str, x0.Ac)) {
            String string844 = context.getString(R.string.lbl_poi_recreation);
            string844.getClass();
            return string844;
        }
        if (g2.d(str, x0.Bc)) {
            String string845 = context.getString(R.string.lbl_poi_restaurants);
            string845.getClass();
            return string845;
        }
        if (g2.d(str, x0.Cc)) {
            String string846 = context.getString(R.string.lbl_poi_restrooms);
            string846.getClass();
            return string846;
        }
        if (g2.d(str, x0.Dc)) {
            String string847 = context.getString(R.string.lbl_poi_shopping);
            string847.getClass();
            return string847;
        }
        if (g2.d(str, x0.Ec)) {
            String string848 = context.getString(R.string.lbl_poi_transportation);
            string848.getClass();
            return string848;
        }
        if (g2.d(str, x0.Fc)) {
            String string849 = context.getString(R.string.lbl_poi_water_stops);
            string849.getClass();
            return string849;
        }
        if (g2.d(str, x0.Gc)) {
            String string850 = context.getString(R.string.lbl_poi_wineries_and_breweries);
            string850.getClass();
            return string850;
        }
        if (g2.d(str, x0.Hc)) {
            String string851 = context.getString(R.string.lbl_points_of_interest);
            string851.getClass();
            return string851;
        }
        if (g2.d(str, x0.Ic)) {
            String string852 = context.getString(R.string.lbl_return_with_tailwind);
            string852.getClass();
            return string852;
        }
        if (g2.d(str, x0.Jc)) {
            String string853 = context.getString(R.string.lbl_road_closure);
            string853.getClass();
            return string853;
        }
        if (g2.d(str, x0.Kc)) {
            String string854 = context.getString(R.string.lbl_road_closures);
            string854.getClass();
            return string854;
        }
        if (g2.d(str, x0.Lc)) {
            String string855 = context.getString(R.string.lbl_routing_free_flow);
            string855.getClass();
            return string855;
        }
        if (g2.d(str, x0.Mc)) {
            String string856 = context.getString(R.string.lbl_routing_free_flow_subtitle);
            string856.getClass();
            return string856;
        }
        if (g2.d(str, x0.Nc)) {
            String string857 = context.getString(R.string.lbl_routing_least_elevation);
            string857.getClass();
            return string857;
        }
        if (g2.d(str, x0.Oc)) {
            String string858 = context.getString(R.string.lbl_routing_least_elevation_subtitle);
            string858.getClass();
            return string858;
        }
        if (g2.d(str, x0.Pc)) {
            String string859 = context.getString(R.string.lbl_sgr_awards_item_description);
            string859.getClass();
            return string859;
        }
        if (g2.d(str, x0.Qc)) {
            String string860 = context.getString(R.string.lbl_sgr_awards_item_title);
            string860.getClass();
            return string860;
        }
        if (g2.d(str, x0.Rc)) {
            String string861 = context.getString(R.string.lbl_sgr_explore_item_description);
            string861.getClass();
            return string861;
        }
        if (g2.d(str, x0.Sc)) {
            String string862 = context.getString(R.string.lbl_sgr_explore_item_title);
            string862.getClass();
            return string862;
        }
        if (g2.d(str, x0.Tc)) {
            String string863 = context.getString(R.string.lbl_sgr_other_awards);
            string863.getClass();
            return string863;
        }
        if (g2.d(str, x0.Uc)) {
            String string864 = context.getString(R.string.lbl_sgr_sheet_header);
            string864.getClass();
            return string864;
        }
        if (g2.d(str, x0.Vc)) {
            String string865 = context.getString(R.string.lbl_sgr_sheet_title);
            string865.getClass();
            return string865;
        }
        if (g2.d(str, x0.Wc)) {
            String string866 = context.getString(R.string.lbl_smarter_course_creation);
            string866.getClass();
            return string866;
        }
        if (g2.d(str, x0.Xc)) {
            String string867 = context.getString(R.string.lbl_smarter_course_creation_message);
            string867.getClass();
            return string867;
        }
        if (g2.d(str, x0.Yc)) {
            String string868 = context.getString(R.string.lbl_start_course_here);
            string868.getClass();
            return string868;
        }
        if (g2.d(str, x0.Zc)) {
            String string869 = context.getString(R.string.lbl_turn_on_PIOs);
            string869.getClass();
            return string869;
        }
        if (g2.d(str, x0.ad)) {
            String string870 = context.getString(R.string.lbl_whats_new_in_courses);
            string870.getClass();
            return string870;
        }
        if (g2.d(str, x0.bd)) {
            String string871 = context.getString(R.string.message_course_includes_hazards_and_road_closures);
            string871.getClass();
            return string871;
        }
        if (g2.d(str, x0.cd)) {
            String string872 = context.getString(R.string.message_course_includes_road_closures);
            string872.getClass();
            return string872;
        }
        if (g2.d(str, x0.dd)) {
            String string873 = context.getString(R.string.message_high_traffic_roads_cannot_be_avoided);
            string873.getClass();
            return string873;
        }
        if (g2.d(str, x0.ed)) {
            String string874 = context.getString(R.string.message_more_road_closures_in_the_area_check_maps_for_details);
            string874.getClass();
            return string874;
        }
        if (g2.d(str, x0.fd)) {
            String string875 = context.getString(R.string.message_road_closures_user_set_hazards);
            string875.getClass();
            return string875;
        }
        if (g2.d(str, x0.gd)) {
            String string876 = context.getString(R.string.message_waypoint_was_adjusted);
            string876.getClass();
            return string876;
        }
        if (g2.d(str, x0.hd)) {
            String string877 = context.getString(R.string.msg_greta_data_screen_tutorial_5);
            string877.getClass();
            return string877;
        }
        if (g2.d(str, x0.id)) {
            String string878 = context.getString(R.string.msg_greta_data_screen_tutorial_5a);
            string878.getClass();
            return string878;
        }
        if (g2.d(str, x0.jd)) {
            String string879 = context.getString(R.string.msg_greta_in_ride_controls_tutorial_4a);
            string879.getClass();
            return string879;
        }
        if (g2.d(str, x0.kd)) {
            String string880 = context.getString(R.string.msg_greta_in_ride_controls_tutorial_4b);
            string880.getClass();
            return string880;
        }
        if (g2.d(str, x0.ld)) {
            String string881 = context.getString(R.string.msg_greta_stage_an_activity_tutorial_2);
            string881.getClass();
            return string881;
        }
        if (g2.d(str, x0.md)) {
            String string882 = context.getString(R.string.msg_greta_stage_an_activity_tutorial_2a);
            string882.getClass();
            return string882;
        }
        if (!g2.d(str, x0.nd)) {
            return "";
        }
        String string883 = context.getString(R.string.msg_greta_stage_an_activity_tutorial_2b);
        string883.getClass();
        return string883;
    }

    public final String b(String str, Object... objArr) throws PackageManager.NameNotFoundException {
        str.getClass();
        Context context = this.b;
        Context contextCreateContextForSplit = context.createContextForSplit("gcm_on_demand_resources");
        int identifier = contextCreateContextForSplit.getResources().getIdentifier(str, "string", contextCreateContextForSplit.getPackageName() + ".gcm_on_demand_resources");
        if (identifier != 0) {
            return context.getString(identifier, Arrays.copyOf(objArr, objArr.length));
        }
        return null;
    }

    public final String c(String str, Object... objArr) {
        str.getClass();
        x0.a.getClass();
        boolean zD = g2.d(str, x0.W7);
        Context context = this.b;
        if (zD) {
            String string = context.getString(R.string.add_new_dog, Arrays.copyOf(objArr, objArr.length));
            string.getClass();
            return string;
        }
        if (g2.d(str, x0.X7)) {
            String string2 = context.getString(R.string.add_new_dog_alert_message, Arrays.copyOf(objArr, objArr.length));
            string2.getClass();
            return string2;
        }
        if (g2.d(str, x0.Y7)) {
            String string3 = context.getString(R.string.lbl_activities_with_dogs, Arrays.copyOf(objArr, objArr.length));
            string3.getClass();
            return string3;
        }
        if (g2.d(str, x0.Z7)) {
            String string4 = context.getString(R.string.lbl_activity_stats_with_dogs, Arrays.copyOf(objArr, objArr.length));
            string4.getClass();
            return string4;
        }
        if (g2.d(str, x0.a8)) {
            String string5 = context.getString(R.string.lbl_add_a_dog, Arrays.copyOf(objArr, objArr.length));
            string5.getClass();
            return string5;
        }
        if (g2.d(str, x0.b8)) {
            String string6 = context.getString(R.string.lbl_all_activities_with_dogs, Arrays.copyOf(objArr, objArr.length));
            string6.getClass();
            return string6;
        }
        if (g2.d(str, x0.c8)) {
            String string7 = context.getString(R.string.lbl_canicross, Arrays.copyOf(objArr, objArr.length));
            string7.getClass();
            return string7;
        }
        if (g2.d(str, x0.d8)) {
            String string8 = context.getString(R.string.lbl_create_profile_for_dog, Arrays.copyOf(objArr, objArr.length));
            string8.getClass();
            return string8;
        }
        if (g2.d(str, x0.e8)) {
            String string9 = context.getString(R.string.lbl_dog, Arrays.copyOf(objArr, objArr.length));
            string9.getClass();
            return string9;
        }
        if (g2.d(str, x0.f8)) {
            String string10 = context.getString(R.string.lbl_dog_breed_concatentation, Arrays.copyOf(objArr, objArr.length));
            string10.getClass();
            return string10;
        }
        if (g2.d(str, x0.g8)) {
            String string11 = context.getString(R.string.lbl_dog_limit_reached, Arrays.copyOf(objArr, objArr.length));
            string11.getClass();
            return string11;
        }
        if (g2.d(str, x0.h8)) {
            String string12 = context.getString(R.string.lbl_dogs, Arrays.copyOf(objArr, objArr.length));
            string12.getClass();
            return string12;
        }
        if (g2.d(str, x0.i8)) {
            String string13 = context.getString(R.string.lbl_dogs_create_profile_message, Arrays.copyOf(objArr, objArr.length));
            string13.getClass();
            return string13;
        }
        if (g2.d(str, x0.j8)) {
            String string14 = context.getString(R.string.lbl_dogs_fixed, Arrays.copyOf(objArr, objArr.length));
            string14.getClass();
            return string14;
        }
        if (g2.d(str, x0.k8)) {
            String string15 = context.getString(R.string.lbl_dogs_genesis_message, Arrays.copyOf(objArr, objArr.length));
            string15.getClass();
            return string15;
        }
        if (g2.d(str, x0.l8)) {
            String string16 = context.getString(R.string.lbl_dogs_genesis_message_child_account, Arrays.copyOf(objArr, objArr.length));
            string16.getClass();
            return string16;
        }
        if (g2.d(str, x0.m8)) {
            String string17 = context.getString(R.string.lbl_dogs_genesis_title, Arrays.copyOf(objArr, objArr.length));
            string17.getClass();
            return string17;
        }
        if (g2.d(str, x0.n8)) {
            String string18 = context.getString(R.string.lbl_dogs_help_p1, Arrays.copyOf(objArr, objArr.length));
            string18.getClass();
            return string18;
        }
        if (g2.d(str, x0.o8)) {
            String string19 = context.getString(R.string.lbl_dogs_help_p2, Arrays.copyOf(objArr, objArr.length));
            string19.getClass();
            return string19;
        }
        if (g2.d(str, x0.p8)) {
            String string20 = context.getString(R.string.lbl_dogs_help_p3, Arrays.copyOf(objArr, objArr.length));
            string20.getClass();
            return string20;
        }
        if (g2.d(str, x0.q8)) {
            String string21 = context.getString(R.string.lbl_dogs_help_p4, Arrays.copyOf(objArr, objArr.length));
            string21.getClass();
            return string21;
        }
        if (g2.d(str, x0.r8)) {
            String string22 = context.getString(R.string.lbl_dogs_no_dogs_added, Arrays.copyOf(objArr, objArr.length));
            string22.getClass();
            return string22;
        }
        if (g2.d(str, x0.s8)) {
            String string23 = context.getString(R.string.lbl_dogs_original_image, Arrays.copyOf(objArr, objArr.length));
            string23.getClass();
            return string23;
        }
        if (g2.d(str, x0.t8)) {
            String string24 = context.getString(R.string.lbl_dogs_previous_image, Arrays.copyOf(objArr, objArr.length));
            string24.getClass();
            return string24;
        }
        if (g2.d(str, x0.u8)) {
            String string25 = context.getString(R.string.lbl_dogs_primary_breed_required, Arrays.copyOf(objArr, objArr.length));
            string25.getClass();
            return string25;
        }
        if (g2.d(str, x0.v8)) {
            String string26 = context.getString(R.string.lbl_dogs_remove_alert_message, Arrays.copyOf(objArr, objArr.length));
            string26.getClass();
            return string26;
        }
        if (g2.d(str, x0.w8)) {
            String string27 = context.getString(R.string.lbl_dogs_remove_alert_title, Arrays.copyOf(objArr, objArr.length));
            string27.getClass();
            return string27;
        }
        if (g2.d(str, x0.x8)) {
            String string28 = context.getString(R.string.lbl_dogs_retire_alert_message, Arrays.copyOf(objArr, objArr.length));
            string28.getClass();
            return string28;
        }
        if (g2.d(str, x0.y8)) {
            String string29 = context.getString(R.string.lbl_dogs_retire_alert_title, Arrays.copyOf(objArr, objArr.length));
            string29.getClass();
            return string29;
        }
        if (g2.d(str, x0.z8)) {
            String string30 = context.getString(R.string.lbl_dogs_toggle_physio_metrics_description, Arrays.copyOf(objArr, objArr.length));
            string30.getClass();
            return string30;
        }
        if (g2.d(str, x0.A8)) {
            String string31 = context.getString(R.string.lbl_dogs_your_activities_with, Arrays.copyOf(objArr, objArr.length));
            string31.getClass();
            return string31;
        }
        if (g2.d(str, x0.B8)) {
            String string32 = context.getString(R.string.lbl_edit_dog, Arrays.copyOf(objArr, objArr.length));
            string32.getClass();
            return string32;
        }
        if (g2.d(str, x0.C8)) {
            String string33 = context.getString(R.string.lbl_include_a_dog, Arrays.copyOf(objArr, objArr.length));
            string33.getClass();
            return string33;
        }
        if (g2.d(str, x0.D8)) {
            String string34 = context.getString(R.string.lbl_least_recent, Arrays.copyOf(objArr, objArr.length));
            string34.getClass();
            return string34;
        }
        if (g2.d(str, x0.E8)) {
            String string35 = context.getString(R.string.lbl_no_active_dogs, Arrays.copyOf(objArr, objArr.length));
            string35.getClass();
            return string35;
        }
        if (g2.d(str, x0.F8)) {
            String string36 = context.getString(R.string.lbl_no_retired_dogs, Arrays.copyOf(objArr, objArr.length));
            string36.getClass();
            return string36;
        }
        if (g2.d(str, x0.G8)) {
            String string37 = context.getString(R.string.lbl_physio_metrics, Arrays.copyOf(objArr, objArr.length));
            string37.getClass();
            return string37;
        }
        if (g2.d(str, x0.H8)) {
            String string38 = context.getString(R.string.lbl_physio_metrics_off, Arrays.copyOf(objArr, objArr.length));
            string38.getClass();
            return string38;
        }
        if (g2.d(str, x0.I8)) {
            String string39 = context.getString(R.string.lbl_physio_metrics_on, Arrays.copyOf(objArr, objArr.length));
            string39.getClass();
            return string39;
        }
        if (g2.d(str, x0.J8)) {
            String string40 = context.getString(R.string.lbl_primary_breed, Arrays.copyOf(objArr, objArr.length));
            string40.getClass();
            return string40;
        }
        if (g2.d(str, x0.K8)) {
            String string41 = context.getString(R.string.lbl_reached_dog_limit_message, Arrays.copyOf(objArr, objArr.length));
            string41.getClass();
            return string41;
        }
        if (g2.d(str, x0.L8)) {
            String string42 = context.getString(R.string.lbl_secondary_breed, Arrays.copyOf(objArr, objArr.length));
            string42.getClass();
            return string42;
        }
        if (g2.d(str, x0.M8)) {
            String string43 = context.getString(R.string.lbl_secondary_breeds, Arrays.copyOf(objArr, objArr.length));
            string43.getClass();
            return string43;
        }
        if (g2.d(str, x0.N8)) {
            String string44 = context.getString(R.string.lbl_select_count, Arrays.copyOf(objArr, objArr.length));
            string44.getClass();
            return string44;
        }
        if (g2.d(str, x0.O8)) {
            String string45 = context.getString(R.string.lbl_select_secondary_breeds, Arrays.copyOf(objArr, objArr.length));
            string45.getClass();
            return string45;
        }
        if (g2.d(str, x0.P8)) {
            String string46 = context.getString(R.string.lbl_sex, Arrays.copyOf(objArr, objArr.length));
            string46.getClass();
            return string46;
        }
        if (g2.d(str, x0.Q8)) {
            String string47 = context.getString(R.string.lbl_skijoring, Arrays.copyOf(objArr, objArr.length));
            string47.getClass();
            return string47;
        }
        if (g2.d(str, x0.R8)) {
            String string48 = context.getString(R.string.lbl_unable_to_add_dog, Arrays.copyOf(objArr, objArr.length));
            string48.getClass();
            return string48;
        }
        if (g2.d(str, x0.S8)) {
            String string49 = context.getString(R.string.lbl_unable_to_add_dog_message, Arrays.copyOf(objArr, objArr.length));
            string49.getClass();
            return string49;
        }
        if (g2.d(str, x0.T8)) {
            String string50 = context.getString(R.string.lbl_unretire_dog, Arrays.copyOf(objArr, objArr.length));
            string50.getClass();
            return string50;
        }
        if (g2.d(str, x0.U8)) {
            String string51 = context.getString(R.string.lbl_unretire_dog_to_edit_message, Arrays.copyOf(objArr, objArr.length));
            string51.getClass();
            return string51;
        }
        if (g2.d(str, x0.V8)) {
            String string52 = context.getString(R.string.lbl_view_activities_with_dogs, Arrays.copyOf(objArr, objArr.length));
            string52.getClass();
            return string52;
        }
        if (g2.d(str, x0.W8)) {
            String string53 = context.getString(R.string.lbl_you_have_no_retired_dogs, Arrays.copyOf(objArr, objArr.length));
            string53.getClass();
            return string53;
        }
        if (g2.d(str, x0.b)) {
            String string54 = context.getString(R.string.DOG_BREED_AFFENPINSCHER, Arrays.copyOf(objArr, objArr.length));
            string54.getClass();
            return string54;
        }
        if (g2.d(str, x0.c)) {
            String string55 = context.getString(R.string.DOG_BREED_AFGHAN_HOUND, Arrays.copyOf(objArr, objArr.length));
            string55.getClass();
            return string55;
        }
        if (g2.d(str, x0.d)) {
            String string56 = context.getString(R.string.DOG_BREED_AIREDALE_TERRIER, Arrays.copyOf(objArr, objArr.length));
            string56.getClass();
            return string56;
        }
        if (g2.d(str, x0.e)) {
            String string57 = context.getString(R.string.DOG_BREED_AKITA, Arrays.copyOf(objArr, objArr.length));
            string57.getClass();
            return string57;
        }
        if (g2.d(str, x0.f)) {
            String string58 = context.getString(R.string.DOG_BREED_ALASKAN_MALAMUTE, Arrays.copyOf(objArr, objArr.length));
            string58.getClass();
            return string58;
        }
        if (g2.d(str, x0.g)) {
            String string59 = context.getString(R.string.DOG_BREED_ALPINE_DACHSBRACKE, Arrays.copyOf(objArr, objArr.length));
            string59.getClass();
            return string59;
        }
        if (g2.d(str, x0.h)) {
            String string60 = context.getString(R.string.DOG_BREED_AMERICAN_AKITA, Arrays.copyOf(objArr, objArr.length));
            string60.getClass();
            return string60;
        }
        if (g2.d(str, x0.i)) {
            String string61 = context.getString(R.string.DOG_BREED_AMERICAN_COCKER_SPANIEL, Arrays.copyOf(objArr, objArr.length));
            string61.getClass();
            return string61;
        }
        if (g2.d(str, x0.j)) {
            String string62 = context.getString(R.string.DOG_BREED_AMERICAN_FOXHOUND, Arrays.copyOf(objArr, objArr.length));
            string62.getClass();
            return string62;
        }
        if (g2.d(str, x0.k)) {
            String string63 = context.getString(R.string.DOG_BREED_AMERICAN_STAFFORDSHIRE_TERRIER, Arrays.copyOf(objArr, objArr.length));
            string63.getClass();
            return string63;
        }
        if (g2.d(str, x0.l)) {
            String string64 = context.getString(R.string.DOG_BREED_AMERICAN_WATER_SPANIEL, Arrays.copyOf(objArr, objArr.length));
            string64.getClass();
            return string64;
        }
        if (g2.d(str, x0.m)) {
            String string65 = context.getString(R.string.DOG_BREED_APPENZELL_CATTLE_DOG, Arrays.copyOf(objArr, objArr.length));
            string65.getClass();
            return string65;
        }
        if (g2.d(str, x0.n)) {
            String string66 = context.getString(R.string.DOG_BREED_ARIEGEOIS, Arrays.copyOf(objArr, objArr.length));
            string66.getClass();
            return string66;
        }
        if (g2.d(str, x0.o)) {
            String string67 = context.getString(R.string.DOG_BREED_ARIEGE_POINTING_DOG, Arrays.copyOf(objArr, objArr.length));
            string67.getClass();
            return string67;
        }
        if (g2.d(str, x0.p)) {
            String string68 = context.getString(R.string.DOG_BREED_ARTOIS_HOUND, Arrays.copyOf(objArr, objArr.length));
            string68.getClass();
            return string68;
        }
        if (g2.d(str, x0.q)) {
            String string69 = context.getString(R.string.DOG_BREED_ATLAS_MOUNTAIN_DOG_AIDI, Arrays.copyOf(objArr, objArr.length));
            string69.getClass();
            return string69;
        }
        if (g2.d(str, x0.r)) {
            String string70 = context.getString(R.string.DOG_BREED_AUSSIEDOODLE, Arrays.copyOf(objArr, objArr.length));
            string70.getClass();
            return string70;
        }
        if (g2.d(str, x0.s)) {
            String string71 = context.getString(R.string.DOG_BREED_AUSSIE_LAB, Arrays.copyOf(objArr, objArr.length));
            string71.getClass();
            return string71;
        }
        if (g2.d(str, x0.t)) {
            String string72 = context.getString(R.string.DOG_BREED_AUSTRALIAN_CATTLE_DOG, Arrays.copyOf(objArr, objArr.length));
            string72.getClass();
            return string72;
        }
        if (g2.d(str, x0.u)) {
            String string73 = context.getString(R.string.DOG_BREED_AUSTRALIAN_KELPIE, Arrays.copyOf(objArr, objArr.length));
            string73.getClass();
            return string73;
        }
        if (g2.d(str, x0.v)) {
            String string74 = context.getString(R.string.DOG_BREED_AUSTRALIAN_SHEPHERD, Arrays.copyOf(objArr, objArr.length));
            string74.getClass();
            return string74;
        }
        if (g2.d(str, x0.w)) {
            String string75 = context.getString(R.string.DOG_BREED_AUSTRALIAN_SILKY_TERRIER, Arrays.copyOf(objArr, objArr.length));
            string75.getClass();
            return string75;
        }
        if (g2.d(str, x0.x)) {
            String string76 = context.getString(R.string.DOG_BREED_AUSTRALIAN_STUMPY_TAIL_CATTLE_DOG, Arrays.copyOf(objArr, objArr.length));
            string76.getClass();
            return string76;
        }
        if (g2.d(str, x0.y)) {
            String string77 = context.getString(R.string.DOG_BREED_AUSTRALIAN_TERRIER, Arrays.copyOf(objArr, objArr.length));
            string77.getClass();
            return string77;
        }
        if (g2.d(str, x0.z)) {
            String string78 = context.getString(R.string.DOG_BREED_AUSTRIAN_BLACK_AND_TAN_HOUND, Arrays.copyOf(objArr, objArr.length));
            string78.getClass();
            return string78;
        }
        if (g2.d(str, x0.A)) {
            String string79 = context.getString(R.string.DOG_BREED_AUSTRIAN_PINSCHER, Arrays.copyOf(objArr, objArr.length));
            string79.getClass();
            return string79;
        }
        if (g2.d(str, x0.B)) {
            String string80 = context.getString(R.string.DOG_BREED_AUVERGNE_POINTER, Arrays.copyOf(objArr, objArr.length));
            string80.getClass();
            return string80;
        }
        if (g2.d(str, x0.C)) {
            String string81 = context.getString(R.string.DOG_BREED_AZAWAKH, Arrays.copyOf(objArr, objArr.length));
            string81.getClass();
            return string81;
        }
        if (g2.d(str, x0.D)) {
            String string82 = context.getString(R.string.DOG_BREED_BASENJI, Arrays.copyOf(objArr, objArr.length));
            string82.getClass();
            return string82;
        }
        if (g2.d(str, x0.E)) {
            String string83 = context.getString(R.string.DOG_BREED_BASSETOODLE, Arrays.copyOf(objArr, objArr.length));
            string83.getClass();
            return string83;
        }
        if (g2.d(str, x0.F)) {
            String string84 = context.getString(R.string.DOG_BREED_BASSET_FAUVE_DE_BRETAGNE, Arrays.copyOf(objArr, objArr.length));
            string84.getClass();
            return string84;
        }
        if (g2.d(str, x0.G)) {
            String string85 = context.getString(R.string.DOG_BREED_BASSET_HOUND, Arrays.copyOf(objArr, objArr.length));
            string85.getClass();
            return string85;
        }
        if (g2.d(str, x0.H)) {
            String string86 = context.getString(R.string.DOG_BREED_BAVARIAN_MOUNTAIN_SCENT_HOUND, Arrays.copyOf(objArr, objArr.length));
            string86.getClass();
            return string86;
        }
        if (g2.d(str, x0.I)) {
            String string87 = context.getString(R.string.DOG_BREED_BEAGADOR, Arrays.copyOf(objArr, objArr.length));
            string87.getClass();
            return string87;
        }
        if (g2.d(str, x0.J)) {
            String string88 = context.getString(R.string.DOG_BREED_BEAGLE, Arrays.copyOf(objArr, objArr.length));
            string88.getClass();
            return string88;
        }
        if (g2.d(str, x0.K)) {
            String string89 = context.getString(R.string.DOG_BREED_BEAGLE_HARRIER, Arrays.copyOf(objArr, objArr.length));
            string89.getClass();
            return string89;
        }
        if (g2.d(str, x0.L)) {
            String string90 = context.getString(R.string.DOG_BREED_BEARDED_COLLIE, Arrays.copyOf(objArr, objArr.length));
            string90.getClass();
            return string90;
        }
        if (g2.d(str, x0.M)) {
            String string91 = context.getString(R.string.DOG_BREED_BEDLINGTON_TERRIER, Arrays.copyOf(objArr, objArr.length));
            string91.getClass();
            return string91;
        }
        if (g2.d(str, x0.N)) {
            String string92 = context.getString(R.string.DOG_BREED_BELGIAN_SHEPHERD_DOG, Arrays.copyOf(objArr, objArr.length));
            string92.getClass();
            return string92;
        }
        if (g2.d(str, x0.O)) {
            String string93 = context.getString(R.string.DOG_BREED_BERGAMASCO_SHEPHERD_DOG, Arrays.copyOf(objArr, objArr.length));
            string93.getClass();
            return string93;
        }
        if (g2.d(str, x0.P)) {
            String string94 = context.getString(R.string.DOG_BREED_BERGER_DE_BEAUCE, Arrays.copyOf(objArr, objArr.length));
            string94.getClass();
            return string94;
        }
        if (g2.d(str, x0.Q)) {
            String string95 = context.getString(R.string.DOG_BREED_BERNEDOODLE, Arrays.copyOf(objArr, objArr.length));
            string95.getClass();
            return string95;
        }
        if (g2.d(str, x0.R)) {
            String string96 = context.getString(R.string.DOG_BREED_BERNEFIE, Arrays.copyOf(objArr, objArr.length));
            string96.getClass();
            return string96;
        }
        if (g2.d(str, x0.S)) {
            String string97 = context.getString(R.string.DOG_BREED_BERNESE_MOUNTAIN_DOG, Arrays.copyOf(objArr, objArr.length));
            string97.getClass();
            return string97;
        }
        if (g2.d(str, x0.T)) {
            String string98 = context.getString(R.string.DOG_BREED_BERNESE_SHEPHERD, Arrays.copyOf(objArr, objArr.length));
            string98.getClass();
            return string98;
        }
        if (g2.d(str, x0.U)) {
            String string99 = context.getString(R.string.DOG_BREED_BICHON_FRISE, Arrays.copyOf(objArr, objArr.length));
            string99.getClass();
            return string99;
        }
        if (g2.d(str, x0.V)) {
            String string100 = context.getString(R.string.DOG_BREED_BILLY, Arrays.copyOf(objArr, objArr.length));
            string100.getClass();
            return string100;
        }
        if (g2.d(str, x0.W)) {
            String string101 = context.getString(R.string.DOG_BREED_BLACK_AND_TAN_COONHOUND, Arrays.copyOf(objArr, objArr.length));
            string101.getClass();
            return string101;
        }
        if (g2.d(str, x0.X)) {
            String string102 = context.getString(R.string.DOG_BREED_BLOODHOUND, Arrays.copyOf(objArr, objArr.length));
            string102.getClass();
            return string102;
        }
        if (g2.d(str, x0.Y)) {
            String string103 = context.getString(R.string.DOG_BREED_BLUE_GASCONY_BASSET, Arrays.copyOf(objArr, objArr.length));
            string103.getClass();
            return string103;
        }
        if (g2.d(str, x0.Z)) {
            String string104 = context.getString(R.string.DOG_BREED_BLUE_GASCONY_GRIFFON, Arrays.copyOf(objArr, objArr.length));
            string104.getClass();
            return string104;
        }
        if (g2.d(str, x0.a0)) {
            String string105 = context.getString(R.string.DOG_BREED_BLUE_PICARDY_SPANIEL, Arrays.copyOf(objArr, objArr.length));
            string105.getClass();
            return string105;
        }
        if (g2.d(str, x0.b0)) {
            String string106 = context.getString(R.string.DOG_BREED_BOHEMIAN_SHEPHERD_DOG, Arrays.copyOf(objArr, objArr.length));
            string106.getClass();
            return string106;
        }
        if (g2.d(str, x0.c0)) {
            String string107 = context.getString(R.string.DOG_BREED_BOHEMIAN_WIREHAIRED_POINTING_GRIFFON, Arrays.copyOf(objArr, objArr.length));
            string107.getClass();
            return string107;
        }
        if (g2.d(str, x0.d0)) {
            String string108 = context.getString(R.string.DOG_BREED_BOJACK, Arrays.copyOf(objArr, objArr.length));
            string108.getClass();
            return string108;
        }
        if (g2.d(str, x0.e0)) {
            String string109 = context.getString(R.string.DOG_BREED_BOLOGNESE, Arrays.copyOf(objArr, objArr.length));
            string109.getClass();
            return string109;
        }
        if (g2.d(str, x0.f0)) {
            String string110 = context.getString(R.string.DOG_BREED_BORDER_COLLIE, Arrays.copyOf(objArr, objArr.length));
            string110.getClass();
            return string110;
        }
        if (g2.d(str, x0.g0)) {
            String string111 = context.getString(R.string.DOG_BREED_BORDER_COLLIE_LAB, Arrays.copyOf(objArr, objArr.length));
            string111.getClass();
            return string111;
        }
        if (g2.d(str, x0.h0)) {
            String string112 = context.getString(R.string.DOG_BREED_BORDER_TERRIER, Arrays.copyOf(objArr, objArr.length));
            string112.getClass();
            return string112;
        }
        if (g2.d(str, x0.i0)) {
            String string113 = context.getString(R.string.DOG_BREED_BORDOODLE, Arrays.copyOf(objArr, objArr.length));
            string113.getClass();
            return string113;
        }
        if (g2.d(str, x0.j0)) {
            String string114 = context.getString(R.string.DOG_BREED_BORZOI__RUSSIAN_HUNTING_SIGHTHOUND, Arrays.copyOf(objArr, objArr.length));
            string114.getClass();
            return string114;
        }
        if (g2.d(str, x0.k0)) {
            String string115 = context.getString(R.string.DOG_BREED_BOSNIAN_AND_HERZEGOVINIAN__CROATIAN_SHEPHERD_DOG, Arrays.copyOf(objArr, objArr.length));
            string115.getClass();
            return string115;
        }
        if (g2.d(str, x0.l0)) {
            String string116 = context.getString(R.string.DOG_BREED_BOSNIAN_BROKENHAIRED_HOUND__CALLED_BARAK, Arrays.copyOf(objArr, objArr.length));
            string116.getClass();
            return string116;
        }
        if (g2.d(str, x0.m0)) {
            String string117 = context.getString(R.string.DOG_BREED_BOSTON_HUAHUA, Arrays.copyOf(objArr, objArr.length));
            string117.getClass();
            return string117;
        }
        if (g2.d(str, x0.n0)) {
            String string118 = context.getString(R.string.DOG_BREED_BOSTON_TERRIER, Arrays.copyOf(objArr, objArr.length));
            string118.getClass();
            return string118;
        }
        if (g2.d(str, x0.o0)) {
            String string119 = context.getString(R.string.DOG_BREED_BOURBONNAIS_POINTING_DOG, Arrays.copyOf(objArr, objArr.length));
            string119.getClass();
            return string119;
        }
        if (g2.d(str, x0.p0)) {
            String string120 = context.getString(R.string.DOG_BREED_BOUVIER_DES_ARDENNES, Arrays.copyOf(objArr, objArr.length));
            string120.getClass();
            return string120;
        }
        if (g2.d(str, x0.q0)) {
            String string121 = context.getString(R.string.DOG_BREED_BOUVIER_DES_FLANDRES, Arrays.copyOf(objArr, objArr.length));
            string121.getClass();
            return string121;
        }
        if (g2.d(str, x0.r0)) {
            String string122 = context.getString(R.string.DOG_BREED_BOXADOR, Arrays.copyOf(objArr, objArr.length));
            string122.getClass();
            return string122;
        }
        if (g2.d(str, x0.s0)) {
            String string123 = context.getString(R.string.DOG_BREED_BOXANE, Arrays.copyOf(objArr, objArr.length));
            string123.getClass();
            return string123;
        }
        if (g2.d(str, x0.t0)) {
            String string124 = context.getString(R.string.DOG_BREED_BOXER, Arrays.copyOf(objArr, objArr.length));
            string124.getClass();
            return string124;
        }
        if (g2.d(str, x0.u0)) {
            String string125 = context.getString(R.string.DOG_BREED_BOXERDOODLE, Arrays.copyOf(objArr, objArr.length));
            string125.getClass();
            return string125;
        }
        if (g2.d(str, x0.v0)) {
            String string126 = context.getString(R.string.DOG_BREED_BRAZILIAN_TERRIER, Arrays.copyOf(objArr, objArr.length));
            string126.getClass();
            return string126;
        }
        if (g2.d(str, x0.w0)) {
            String string127 = context.getString(R.string.DOG_BREED_BRAZILIAN_TRACKER, Arrays.copyOf(objArr, objArr.length));
            string127.getClass();
            return string127;
        }
        if (g2.d(str, x0.x0)) {
            String string128 = context.getString(R.string.DOG_BREED_BRIARD, Arrays.copyOf(objArr, objArr.length));
            string128.getClass();
            return string128;
        }
        if (g2.d(str, x0.y0)) {
            String string129 = context.getString(R.string.DOG_BREED_BRIQUET_GRIFFON_VENDEEN, Arrays.copyOf(objArr, objArr.length));
            string129.getClass();
            return string129;
        }
        if (g2.d(str, x0.z0)) {
            String string130 = context.getString(R.string.DOG_BREED_BRITTANY_SPANIEL, Arrays.copyOf(objArr, objArr.length));
            string130.getClass();
            return string130;
        }
        if (g2.d(str, x0.A0)) {
            String string131 = context.getString(R.string.DOG_BREED_BROHOLMER, Arrays.copyOf(objArr, objArr.length));
            string131.getClass();
            return string131;
        }
        if (g2.d(str, x0.B0)) {
            String string132 = context.getString(R.string.DOG_BREED_BUGG, Arrays.copyOf(objArr, objArr.length));
            string132.getClass();
            return string132;
        }
        if (g2.d(str, x0.C0)) {
            String string133 = context.getString(R.string.DOG_BREED_BULLADOR, Arrays.copyOf(objArr, objArr.length));
            string133.getClass();
            return string133;
        }
        if (g2.d(str, x0.D0)) {
            String string134 = context.getString(R.string.DOG_BREED_BULLBOXER, Arrays.copyOf(objArr, objArr.length));
            string134.getClass();
            return string134;
        }
        if (g2.d(str, x0.E0)) {
            String string135 = context.getString(R.string.DOG_BREED_BULLDOG, Arrays.copyOf(objArr, objArr.length));
            string135.getClass();
            return string135;
        }
        if (g2.d(str, x0.F0)) {
            String string136 = context.getString(R.string.DOG_BREED_BULLMASTIFF, Arrays.copyOf(objArr, objArr.length));
            string136.getClass();
            return string136;
        }
        if (g2.d(str, x0.G0)) {
            String string137 = context.getString(R.string.DOG_BREED_BULLMATIAN, Arrays.copyOf(objArr, objArr.length));
            string137.getClass();
            return string137;
        }
        if (g2.d(str, x0.H0)) {
            String string138 = context.getString(R.string.DOG_BREED_BULL_DANIFF, Arrays.copyOf(objArr, objArr.length));
            string138.getClass();
            return string138;
        }
        if (g2.d(str, x0.I0)) {
            String string139 = context.getString(R.string.DOG_BREED_BULL_TERRIER, Arrays.copyOf(objArr, objArr.length));
            string139.getClass();
            return string139;
        }
        if (g2.d(str, x0.J0)) {
            String string140 = context.getString(R.string.DOG_BREED_BULL_TERRIER_LAB, Arrays.copyOf(objArr, objArr.length));
            string140.getClass();
            return string140;
        }
        if (g2.d(str, x0.K0)) {
            String string141 = context.getString(R.string.DOG_BREED_BURGOS_POINTING_DOG, Arrays.copyOf(objArr, objArr.length));
            string141.getClass();
            return string141;
        }
        if (g2.d(str, x0.L0)) {
            String string142 = context.getString(R.string.DOG_BREED_CAIRN_TERRIER, Arrays.copyOf(objArr, objArr.length));
            string142.getClass();
            return string142;
        }
        if (g2.d(str, x0.M0)) {
            String string143 = context.getString(R.string.DOG_BREED_CANAAN_DOG, Arrays.copyOf(objArr, objArr.length));
            string143.getClass();
            return string143;
        }
        if (g2.d(str, x0.N0)) {
            String string144 = context.getString(R.string.DOG_BREED_CANADIAN_ESKIMO_DOG, Arrays.copyOf(objArr, objArr.length));
            string144.getClass();
            return string144;
        }
        if (g2.d(str, x0.O0)) {
            String string145 = context.getString(R.string.DOG_BREED_CANARIAN_WARREN_HOUND, Arrays.copyOf(objArr, objArr.length));
            string145.getClass();
            return string145;
        }
        if (g2.d(str, x0.P0)) {
            String string146 = context.getString(R.string.DOG_BREED_CASTRO_LABOREIRO_DOG, Arrays.copyOf(objArr, objArr.length));
            string146.getClass();
            return string146;
        }
        if (g2.d(str, x0.Q0)) {
            String string147 = context.getString(R.string.DOG_BREED_CATALAN_SHEEPDOG, Arrays.copyOf(objArr, objArr.length));
            string147.getClass();
            return string147;
        }
        if (g2.d(str, x0.R0)) {
            String string148 = context.getString(R.string.DOG_BREED_CAUCASIAN_SHEPHERD_DOG, Arrays.copyOf(objArr, objArr.length));
            string148.getClass();
            return string148;
        }
        if (g2.d(str, x0.S0)) {
            String string149 = context.getString(R.string.DOG_BREED_CAVACHIN, Arrays.copyOf(objArr, objArr.length));
            string149.getClass();
            return string149;
        }
        if (g2.d(str, x0.T0)) {
            String string150 = context.getString(R.string.DOG_BREED_CAVACHON, Arrays.copyOf(objArr, objArr.length));
            string150.getClass();
            return string150;
        }
        if (g2.d(str, x0.U0)) {
            String string151 = context.getString(R.string.DOG_BREED_CAVADOR, Arrays.copyOf(objArr, objArr.length));
            string151.getClass();
            return string151;
        }
        if (g2.d(str, x0.V0)) {
            String string152 = context.getString(R.string.DOG_BREED_CAVALIER_KING_CHARLES_SPANIEL, Arrays.copyOf(objArr, objArr.length));
            string152.getClass();
            return string152;
        }
        if (g2.d(str, x0.W0)) {
            String string153 = context.getString(R.string.DOG_BREED_CAVAPOM, Arrays.copyOf(objArr, objArr.length));
            string153.getClass();
            return string153;
        }
        if (g2.d(str, x0.X0)) {
            String string154 = context.getString(R.string.DOG_BREED_CAVAPOO, Arrays.copyOf(objArr, objArr.length));
            string154.getClass();
            return string154;
        }
        if (g2.d(str, x0.Y0)) {
            String string155 = context.getString(R.string.DOG_BREED_CENTRAL_ASIA_SHEPHERD_DOG, Arrays.copyOf(objArr, objArr.length));
            string155.getClass();
            return string155;
        }
        if (g2.d(str, x0.Z0)) {
            String string156 = context.getString(R.string.DOG_BREED_CESKY_TERRIER, Arrays.copyOf(objArr, objArr.length));
            string156.getClass();
            return string156;
        }
        if (g2.d(str, x0.a1)) {
            String string157 = context.getString(R.string.DOG_BREED_CHESAPEAKE_BAY_RETRIEVER, Arrays.copyOf(objArr, objArr.length));
            string157.getClass();
            return string157;
        }
        if (g2.d(str, x0.b1)) {
            String string158 = context.getString(R.string.DOG_BREED_CHIHUAHUA, Arrays.copyOf(objArr, objArr.length));
            string158.getClass();
            return string158;
        }
        if (g2.d(str, x0.c1)) {
            String string159 = context.getString(R.string.DOG_BREED_CHINESE_CRESTED_DOG, Arrays.copyOf(objArr, objArr.length));
            string159.getClass();
            return string159;
        }
        if (g2.d(str, x0.d1)) {
            String string160 = context.getString(R.string.DOG_BREED_CHIPOO, Arrays.copyOf(objArr, objArr.length));
            string160.getClass();
            return string160;
        }
        if (g2.d(str, x0.e1)) {
            String string161 = context.getString(R.string.DOG_BREED_CHIWEENIE, Arrays.copyOf(objArr, objArr.length));
            string161.getClass();
            return string161;
        }
        if (g2.d(str, x0.f1)) {
            String string162 = context.getString(R.string.DOG_BREED_CHORKIE, Arrays.copyOf(objArr, objArr.length));
            string162.getClass();
            return string162;
        }
        if (g2.d(str, x0.g1)) {
            String string163 = context.getString(R.string.DOG_BREED_CHOW_CHOW, Arrays.copyOf(objArr, objArr.length));
            string163.getClass();
            return string163;
        }
        if (g2.d(str, x0.h1)) {
            String string164 = context.getString(R.string.DOG_BREED_CIMARR_N_URUGUAYO_res_0x8001006e, Arrays.copyOf(objArr, objArr.length));
            string164.getClass();
            return string164;
        }
        if (g2.d(str, x0.i1)) {
            String string165 = context.getString(R.string.DOG_BREED_CIRNECO_DELLETNA, Arrays.copyOf(objArr, objArr.length));
            string165.getClass();
            return string165;
        }
        if (g2.d(str, x0.j1)) {
            String string166 = context.getString(R.string.DOG_BREED_CLUMBER_SPANIEL, Arrays.copyOf(objArr, objArr.length));
            string166.getClass();
            return string166;
        }
        if (g2.d(str, x0.k1)) {
            String string167 = context.getString(R.string.DOG_BREED_COARSEHAIRED_STYRIAN_HOUND, Arrays.copyOf(objArr, objArr.length));
            string167.getClass();
            return string167;
        }
        if (g2.d(str, x0.l1)) {
            String string168 = context.getString(R.string.DOG_BREED_COCKAPOO, Arrays.copyOf(objArr, objArr.length));
            string168.getClass();
            return string168;
        }
        if (g2.d(str, x0.m1)) {
            String string169 = context.getString(R.string.DOG_BREED_COLLIE_ROUGH, Arrays.copyOf(objArr, objArr.length));
            string169.getClass();
            return string169;
        }
        if (g2.d(str, x0.n1)) {
            String string170 = context.getString(R.string.DOG_BREED_COLLIE_SMOOTH, Arrays.copyOf(objArr, objArr.length));
            string170.getClass();
            return string170;
        }
        if (g2.d(str, x0.o1)) {
            String string171 = context.getString(R.string.DOG_BREED_CONTINENTAL_BULLDOG, Arrays.copyOf(objArr, objArr.length));
            string171.getClass();
            return string171;
        }
        if (g2.d(str, x0.p1)) {
            String string172 = context.getString(R.string.DOG_BREED_CONTINENTAL_TOY_SPANIEL, Arrays.copyOf(objArr, objArr.length));
            string172.getClass();
            return string172;
        }
        if (g2.d(str, x0.q1)) {
            String string173 = context.getString(R.string.DOG_BREED_CORGIDOR, Arrays.copyOf(objArr, objArr.length));
            string173.getClass();
            return string173;
        }
        if (g2.d(str, x0.r1)) {
            String string174 = context.getString(R.string.DOG_BREED_CORGIPOM, Arrays.copyOf(objArr, objArr.length));
            string174.getClass();
            return string174;
        }
        if (g2.d(str, x0.s1)) {
            String string175 = context.getString(R.string.DOG_BREED_CORGIPOO, Arrays.copyOf(objArr, objArr.length));
            string175.getClass();
            return string175;
        }
        if (g2.d(str, x0.t1)) {
            String string176 = context.getString(R.string.DOG_BREED_CORGSKY, Arrays.copyOf(objArr, objArr.length));
            string176.getClass();
            return string176;
        }
        if (g2.d(str, x0.u1)) {
            String string177 = context.getString(R.string.DOG_BREED_CORKIE, Arrays.copyOf(objArr, objArr.length));
            string177.getClass();
            return string177;
        }
        if (g2.d(str, x0.v1)) {
            String string178 = context.getString(R.string.DOG_BREED_CORMAN_SHEPHERD, Arrays.copyOf(objArr, objArr.length));
            string178.getClass();
            return string178;
        }
        if (g2.d(str, x0.w1)) {
            String string179 = context.getString(R.string.DOG_BREED_COTON_DE_TULEAR, Arrays.copyOf(objArr, objArr.length));
            string179.getClass();
            return string179;
        }
        if (g2.d(str, x0.x1)) {
            String string180 = context.getString(R.string.DOG_BREED_CROATIAN_SHEPHERD_DOG, Arrays.copyOf(objArr, objArr.length));
            string180.getClass();
            return string180;
        }
        if (g2.d(str, x0.y1)) {
            String string181 = context.getString(R.string.DOG_BREED_CURLY_COATED_RETRIEVER, Arrays.copyOf(objArr, objArr.length));
            string181.getClass();
            return string181;
        }
        if (g2.d(str, x0.z1)) {
            String string182 = context.getString(R.string.DOG_BREED_CZECHOSLOVAKIAN_WOLFDOG, Arrays.copyOf(objArr, objArr.length));
            string182.getClass();
            return string182;
        }
        if (g2.d(str, x0.A1)) {
            String string183 = context.getString(R.string.DOG_BREED_DACHSADOR, Arrays.copyOf(objArr, objArr.length));
            string183.getClass();
            return string183;
        }
        if (g2.d(str, x0.B1)) {
            String string184 = context.getString(R.string.DOG_BREED_DACHSHUND, Arrays.copyOf(objArr, objArr.length));
            string184.getClass();
            return string184;
        }
        if (g2.d(str, x0.C1)) {
            String string185 = context.getString(R.string.DOG_BREED_DALMADOODLE, Arrays.copyOf(objArr, objArr.length));
            string185.getClass();
            return string185;
        }
        if (g2.d(str, x0.D1)) {
            String string186 = context.getString(R.string.DOG_BREED_DALMATIAN, Arrays.copyOf(objArr, objArr.length));
            string186.getClass();
            return string186;
        }
        if (g2.d(str, x0.E1)) {
            String string187 = context.getString(R.string.DOG_BREED_DANDIE_DINMONT_TERRIER, Arrays.copyOf(objArr, objArr.length));
            string187.getClass();
            return string187;
        }
        if (g2.d(str, x0.F1)) {
            String string188 = context.getString(R.string.DOG_BREED_DANIFF, Arrays.copyOf(objArr, objArr.length));
            string188.getClass();
            return string188;
        }
        if (g2.d(str, x0.G1)) {
            String string189 = context.getString(R.string.DOG_BREED_DANISHSWEDISH_FARMDOG, Arrays.copyOf(objArr, objArr.length));
            string189.getClass();
            return string189;
        }
        if (g2.d(str, x0.H1)) {
            String string190 = context.getString(R.string.DOG_BREED_DEERHOUND, Arrays.copyOf(objArr, objArr.length));
            string190.getClass();
            return string190;
        }
        if (g2.d(str, x0.I1)) {
            String string191 = context.getString(R.string.DOG_BREED_DEUTSCH_LANGHAAR, Arrays.copyOf(objArr, objArr.length));
            string191.getClass();
            return string191;
        }
        if (g2.d(str, x0.J1)) {
            String string192 = context.getString(R.string.DOG_BREED_DEUTSCH_STICHELHAAR, Arrays.copyOf(objArr, objArr.length));
            string192.getClass();
            return string192;
        }
        if (g2.d(str, x0.K1)) {
            String string193 = context.getString(R.string.DOG_BREED_DOBERDOR, Arrays.copyOf(objArr, objArr.length));
            string193.getClass();
            return string193;
        }
        if (g2.d(str, x0.L1)) {
            String string194 = context.getString(R.string.DOG_BREED_DOBERMANN, Arrays.copyOf(objArr, objArr.length));
            string194.getClass();
            return string194;
        }
        if (g2.d(str, x0.M1)) {
            String string195 = context.getString(R.string.DOG_BREED_DOBERSHEPHERD, Arrays.copyOf(objArr, objArr.length));
            string195.getClass();
            return string195;
        }
        if (g2.d(str, x0.N1)) {
            String string196 = context.getString(R.string.DOG_BREED_DOGO_ARGENTINO, Arrays.copyOf(objArr, objArr.length));
            string196.getClass();
            return string196;
        }
        if (g2.d(str, x0.O1)) {
            String string197 = context.getString(R.string.DOG_BREED_DOGUE_DE_BORDEAUX, Arrays.copyOf(objArr, objArr.length));
            string197.getClass();
            return string197;
        }
        if (g2.d(str, x0.P1)) {
            String string198 = context.getString(R.string.DOG_BREED_DORGI, Arrays.copyOf(objArr, objArr.length));
            string198.getClass();
            return string198;
        }
        if (g2.d(str, x0.Q1)) {
            String string199 = context.getString(R.string.DOG_BREED_DORKIE, Arrays.copyOf(objArr, objArr.length));
            string199.getClass();
            return string199;
        }
        if (g2.d(str, x0.R1)) {
            String string200 = context.getString(R.string.DOG_BREED_DOXIEPOO, Arrays.copyOf(objArr, objArr.length));
            string200.getClass();
            return string200;
        }
        if (g2.d(str, x0.S1)) {
            String string201 = context.getString(R.string.DOG_BREED_DOXLE, Arrays.copyOf(objArr, objArr.length));
            string201.getClass();
            return string201;
        }
        if (g2.d(str, x0.T1)) {
            String string202 = context.getString(R.string.DOG_BREED_DRENTSCHE_PARTRIDGE_DOG, Arrays.copyOf(objArr, objArr.length));
            string202.getClass();
            return string202;
        }
        if (g2.d(str, x0.U1)) {
            String string203 = context.getString(R.string.DOG_BREED_DREVER, Arrays.copyOf(objArr, objArr.length));
            string203.getClass();
            return string203;
        }
        if (g2.d(str, x0.V1)) {
            String string204 = context.getString(R.string.DOG_BREED_DUTCH_SCHAPENDOES, Arrays.copyOf(objArr, objArr.length));
            string204.getClass();
            return string204;
        }
        if (g2.d(str, x0.W1)) {
            String string205 = context.getString(R.string.DOG_BREED_DUTCH_SHEPHERD_DOG, Arrays.copyOf(objArr, objArr.length));
            string205.getClass();
            return string205;
        }
        if (g2.d(str, x0.X1)) {
            String string206 = context.getString(R.string.DOG_BREED_DUTCH_SMOUSHOND, Arrays.copyOf(objArr, objArr.length));
            string206.getClass();
            return string206;
        }
        if (g2.d(str, x0.Y1)) {
            String string207 = context.getString(R.string.DOG_BREED_EAST_SIBERIAN_LAIKA, Arrays.copyOf(objArr, objArr.length));
            string207.getClass();
            return string207;
        }
        if (g2.d(str, x0.Z1)) {
            String string208 = context.getString(R.string.DOG_BREED_ENGLISH_COCKER_SPANIEL, Arrays.copyOf(objArr, objArr.length));
            string208.getClass();
            return string208;
        }
        if (g2.d(str, x0.a2)) {
            String string209 = context.getString(R.string.DOG_BREED_ENGLISH_FOXHOUND, Arrays.copyOf(objArr, objArr.length));
            string209.getClass();
            return string209;
        }
        if (g2.d(str, x0.b2)) {
            String string210 = context.getString(R.string.DOG_BREED_ENGLISH_POINTER, Arrays.copyOf(objArr, objArr.length));
            string210.getClass();
            return string210;
        }
        if (g2.d(str, x0.c2)) {
            String string211 = context.getString(R.string.DOG_BREED_ENGLISH_SETTER, Arrays.copyOf(objArr, objArr.length));
            string211.getClass();
            return string211;
        }
        if (g2.d(str, x0.d2)) {
            String string212 = context.getString(R.string.DOG_BREED_ENGLISH_SPRINGER_SPANIEL, Arrays.copyOf(objArr, objArr.length));
            string212.getClass();
            return string212;
        }
        if (g2.d(str, x0.e2)) {
            String string213 = context.getString(R.string.DOG_BREED_ENGLISH_TOY_TERRIER_BLACK_TAN, Arrays.copyOf(objArr, objArr.length));
            string213.getClass();
            return string213;
        }
        if (g2.d(str, x0.f2)) {
            String string214 = context.getString(R.string.DOG_BREED_ENTLEBUCH_CATTLE_DOG, Arrays.copyOf(objArr, objArr.length));
            string214.getClass();
            return string214;
        }
        if (g2.d(str, x0.g2)) {
            String string215 = context.getString(R.string.DOG_BREED_ESTONIAN_HOUND, Arrays.copyOf(objArr, objArr.length));
            string215.getClass();
            return string215;
        }
        if (g2.d(str, x0.h2)) {
            String string216 = context.getString(R.string.DOG_BREED_ESTRELA_MOUNTAIN_DOG, Arrays.copyOf(objArr, objArr.length));
            string216.getClass();
            return string216;
        }
        if (g2.d(str, x0.i2)) {
            String string217 = context.getString(R.string.DOG_BREED_EURASIAN, Arrays.copyOf(objArr, objArr.length));
            string217.getClass();
            return string217;
        }
        if (g2.d(str, x0.j2)) {
            String string218 = context.getString(R.string.DOG_BREED_FAWN_BRITTANY_GRIFFON, Arrays.copyOf(objArr, objArr.length));
            string218.getClass();
            return string218;
        }
        if (g2.d(str, x0.k2)) {
            String string219 = context.getString(R.string.DOG_BREED_FIELD_SPANIEL, Arrays.copyOf(objArr, objArr.length));
            string219.getClass();
            return string219;
        }
        if (g2.d(str, x0.l2)) {
            String string220 = context.getString(R.string.DOG_BREED_FILA_BRASILEIRO, Arrays.copyOf(objArr, objArr.length));
            string220.getClass();
            return string220;
        }
        if (g2.d(str, x0.m2)) {
            String string221 = context.getString(R.string.DOG_BREED_FINNISH_HOUND, Arrays.copyOf(objArr, objArr.length));
            string221.getClass();
            return string221;
        }
        if (g2.d(str, x0.n2)) {
            String string222 = context.getString(R.string.DOG_BREED_FINNISH_LAPPONIAN_DOG, Arrays.copyOf(objArr, objArr.length));
            string222.getClass();
            return string222;
        }
        if (g2.d(str, x0.o2)) {
            String string223 = context.getString(R.string.DOG_BREED_FINNISH_SPITZ, Arrays.copyOf(objArr, objArr.length));
            string223.getClass();
            return string223;
        }
        if (g2.d(str, x0.p2)) {
            String string224 = context.getString(R.string.DOG_BREED_FLAT_COATED_RETRIEVER, Arrays.copyOf(objArr, objArr.length));
            string224.getClass();
            return string224;
        }
        if (g2.d(str, x0.q2)) {
            String string225 = context.getString(R.string.DOG_BREED_FOX_TERRIER_SMOOTH, Arrays.copyOf(objArr, objArr.length));
            string225.getClass();
            return string225;
        }
        if (g2.d(str, x0.r2)) {
            String string226 = context.getString(R.string.DOG_BREED_FOX_TERRIER_WIRE, Arrays.copyOf(objArr, objArr.length));
            string226.getClass();
            return string226;
        }
        if (g2.d(str, x0.s2)) {
            String string227 = context.getString(R.string.DOG_BREED_FRENCHTON, Arrays.copyOf(objArr, objArr.length));
            string227.getClass();
            return string227;
        }
        if (g2.d(str, x0.t2)) {
            String string228 = context.getString(R.string.DOG_BREED_FRENCH_BULLDOG, Arrays.copyOf(objArr, objArr.length));
            string228.getClass();
            return string228;
        }
        if (g2.d(str, x0.u2)) {
            String string229 = context.getString(R.string.DOG_BREED_FRENCH_BULLHUAHUA, Arrays.copyOf(objArr, objArr.length));
            string229.getClass();
            return string229;
        }
        if (g2.d(str, x0.v2)) {
            String string230 = context.getString(R.string.DOG_BREED_FRENCH_POINTING_DOG__GASCOGNE_TYPE, Arrays.copyOf(objArr, objArr.length));
            string230.getClass();
            return string230;
        }
        if (g2.d(str, x0.w2)) {
            String string231 = context.getString(R.string.DOG_BREED_FRENCH_POINTING_DOG__PYRENEAN_TYPE, Arrays.copyOf(objArr, objArr.length));
            string231.getClass();
            return string231;
        }
        if (g2.d(str, x0.x2)) {
            String string232 = context.getString(R.string.DOG_BREED_FRENCH_SPANIEL, Arrays.copyOf(objArr, objArr.length));
            string232.getClass();
            return string232;
        }
        if (g2.d(str, x0.y2)) {
            String string233 = context.getString(R.string.DOG_BREED_FRENCH_TRICOLOUR_HOUND, Arrays.copyOf(objArr, objArr.length));
            string233.getClass();
            return string233;
        }
        if (g2.d(str, x0.z2)) {
            String string234 = context.getString(R.string.DOG_BREED_FRENCH_WATER_DOG, Arrays.copyOf(objArr, objArr.length));
            string234.getClass();
            return string234;
        }
        if (g2.d(str, x0.A2)) {
            String string235 = context.getString(R.string.DOG_BREED_FRENCH_WHITE_AND_ORANGE_HOUND, Arrays.copyOf(objArr, objArr.length));
            string235.getClass();
            return string235;
        }
        if (g2.d(str, x0.B2)) {
            String string236 = context.getString(R.string.DOG_BREED_FRENCH_WHITE__BLACK_HOUND, Arrays.copyOf(objArr, objArr.length));
            string236.getClass();
            return string236;
        }
        if (g2.d(str, x0.C2)) {
            String string237 = context.getString(R.string.DOG_BREED_FRENGLE, Arrays.copyOf(objArr, objArr.length));
            string237.getClass();
            return string237;
        }
        if (g2.d(str, x0.D2)) {
            String string238 = context.getString(R.string.DOG_BREED_FRISIAN_WATER_DOG, Arrays.copyOf(objArr, objArr.length));
            string238.getClass();
            return string238;
        }
        if (g2.d(str, x0.E2)) {
            String string239 = context.getString(R.string.DOG_BREED_FROODLE, Arrays.copyOf(objArr, objArr.length));
            string239.getClass();
            return string239;
        }
        if (g2.d(str, x0.F2)) {
            String string240 = context.getString(R.string.DOG_BREED_GASCON_SAINTONGEOIS, Arrays.copyOf(objArr, objArr.length));
            string240.getClass();
            return string240;
        }
        if (g2.d(str, x0.G2)) {
            String string241 = context.getString(R.string.DOG_BREED_GERBERIAN_SHEPSKY, Arrays.copyOf(objArr, objArr.length));
            string241.getClass();
            return string241;
        }
        if (g2.d(str, x0.H2)) {
            String string242 = context.getString(R.string.DOG_BREED_GERMAN_HOUND, Arrays.copyOf(objArr, objArr.length));
            string242.getClass();
            return string242;
        }
        if (g2.d(str, x0.I2)) {
            String string243 = context.getString(R.string.DOG_BREED_GERMAN_HUNTING_TERRIER, Arrays.copyOf(objArr, objArr.length));
            string243.getClass();
            return string243;
        }
        if (g2.d(str, x0.J2)) {
            String string244 = context.getString(R.string.DOG_BREED_GERMAN_PINSCHER, Arrays.copyOf(objArr, objArr.length));
            string244.getClass();
            return string244;
        }
        if (g2.d(str, x0.K2)) {
            String string245 = context.getString(R.string.DOG_BREED_GERMAN_SHEPHERD_DOG, Arrays.copyOf(objArr, objArr.length));
            string245.getClass();
            return string245;
        }
        if (g2.d(str, x0.L2)) {
            String string246 = context.getString(R.string.DOG_BREED_GERMAN_SHEPSKY, Arrays.copyOf(objArr, objArr.length));
            string246.getClass();
            return string246;
        }
        if (g2.d(str, x0.M2)) {
            String string247 = context.getString(R.string.DOG_BREED_GERMAN_SHORT_HAIRED_POINTING_DOG, Arrays.copyOf(objArr, objArr.length));
            string247.getClass();
            return string247;
        }
        if (g2.d(str, x0.N2)) {
            String string248 = context.getString(R.string.DOG_BREED_GERMAN_SPANIEL, Arrays.copyOf(objArr, objArr.length));
            string248.getClass();
            return string248;
        }
        if (g2.d(str, x0.O2)) {
            String string249 = context.getString(R.string.DOG_BREED_GERMAN_SPITZ, Arrays.copyOf(objArr, objArr.length));
            string249.getClass();
            return string249;
        }
        if (g2.d(str, x0.P2)) {
            String string250 = context.getString(R.string.DOG_BREED_GERMAN_WIRE_HAIRED_POINTING_DOG, Arrays.copyOf(objArr, objArr.length));
            string250.getClass();
            return string250;
        }
        if (g2.d(str, x0.Q2)) {
            String string251 = context.getString(R.string.DOG_BREED_GIANT_SCHNAUZER, Arrays.copyOf(objArr, objArr.length));
            string251.getClass();
            return string251;
        }
        if (g2.d(str, x0.R2)) {
            String string252 = context.getString(R.string.DOG_BREED_GOBERIAN, Arrays.copyOf(objArr, objArr.length));
            string252.getClass();
            return string252;
        }
        if (g2.d(str, x0.S2)) {
            String string253 = context.getString(R.string.DOG_BREED_GOLDENDOODLE, Arrays.copyOf(objArr, objArr.length));
            string253.getClass();
            return string253;
        }
        if (g2.d(str, x0.T2)) {
            String string254 = context.getString(R.string.DOG_BREED_GOLDEN_DOX, Arrays.copyOf(objArr, objArr.length));
            string254.getClass();
            return string254;
        }
        if (g2.d(str, x0.U2)) {
            String string255 = context.getString(R.string.DOG_BREED_GOLDEN_HUSKY, Arrays.copyOf(objArr, objArr.length));
            string255.getClass();
            return string255;
        }
        if (g2.d(str, x0.V2)) {
            String string256 = context.getString(R.string.DOG_BREED_GOLDEN_RETRIEVER, Arrays.copyOf(objArr, objArr.length));
            string256.getClass();
            return string256;
        }
        if (g2.d(str, x0.W2)) {
            String string257 = context.getString(R.string.DOG_BREED_GOLDEN_SHEPHERD, Arrays.copyOf(objArr, objArr.length));
            string257.getClass();
            return string257;
        }
        if (g2.d(str, x0.X2)) {
            String string258 = context.getString(R.string.DOG_BREED_GORDON_SETTER, Arrays.copyOf(objArr, objArr.length));
            string258.getClass();
            return string258;
        }
        if (g2.d(str, x0.Y2)) {
            String string259 = context.getString(R.string.DOG_BREED_GRAND_BASSET_GRIFFON_VENDEEN, Arrays.copyOf(objArr, objArr.length));
            string259.getClass();
            return string259;
        }
        if (g2.d(str, x0.Z2)) {
            String string260 = context.getString(R.string.DOG_BREED_GRAND_GRIFFON_VENDEEN, Arrays.copyOf(objArr, objArr.length));
            string260.getClass();
            return string260;
        }
        if (g2.d(str, x0.a3)) {
            String string261 = context.getString(R.string.DOG_BREED_GREAT_ANGLOFRENCH_TRICOLOUR_HOUND, Arrays.copyOf(objArr, objArr.length));
            string261.getClass();
            return string261;
        }
        if (g2.d(str, x0.b3)) {
            String string262 = context.getString(R.string.DOG_BREED_GREAT_ANGLOFRENCH_WHITE_AND_BLACK_HOUND, Arrays.copyOf(objArr, objArr.length));
            string262.getClass();
            return string262;
        }
        if (g2.d(str, x0.c3)) {
            String string263 = context.getString(R.string.DOG_BREED_GREAT_ANGLOFRENCH_WHITE__ORANGE_HOUND, Arrays.copyOf(objArr, objArr.length));
            string263.getClass();
            return string263;
        }
        if (g2.d(str, x0.d3)) {
            String string264 = context.getString(R.string.DOG_BREED_GREAT_DANE, Arrays.copyOf(objArr, objArr.length));
            string264.getClass();
            return string264;
        }
        if (g2.d(str, x0.e3)) {
            String string265 = context.getString(R.string.DOG_BREED_GREAT_DANOODLE, Arrays.copyOf(objArr, objArr.length));
            string265.getClass();
            return string265;
        }
        if (g2.d(str, x0.f3)) {
            String string266 = context.getString(R.string.DOG_BREED_GREAT_GASCONY_BLUE, Arrays.copyOf(objArr, objArr.length));
            string266.getClass();
            return string266;
        }
        if (g2.d(str, x0.g3)) {
            String string267 = context.getString(R.string.DOG_BREED_GREAT_SWISS_MOUNTAIN_DOG, Arrays.copyOf(objArr, objArr.length));
            string267.getClass();
            return string267;
        }
        if (g2.d(str, x0.h3)) {
            String string268 = context.getString(R.string.DOG_BREED_GREENLAND_DOG, Arrays.copyOf(objArr, objArr.length));
            string268.getClass();
            return string268;
        }
        if (g2.d(str, x0.i3)) {
            String string269 = context.getString(R.string.DOG_BREED_GREYHOUND, Arrays.copyOf(objArr, objArr.length));
            string269.getClass();
            return string269;
        }
        if (g2.d(str, x0.j3)) {
            String string270 = context.getString(R.string.DOG_BREED_GRIFFON_BELGE, Arrays.copyOf(objArr, objArr.length));
            string270.getClass();
            return string270;
        }
        if (g2.d(str, x0.k3)) {
            String string271 = context.getString(R.string.DOG_BREED_GRIFFON_BRUXELLOIS, Arrays.copyOf(objArr, objArr.length));
            string271.getClass();
            return string271;
        }
        if (g2.d(str, x0.l3)) {
            String string272 = context.getString(R.string.DOG_BREED_GRIFFON_NIVERNAIS, Arrays.copyOf(objArr, objArr.length));
            string272.getClass();
            return string272;
        }
        if (g2.d(str, x0.m3)) {
            String string273 = context.getString(R.string.DOG_BREED_HALDEN_HOUND, Arrays.copyOf(objArr, objArr.length));
            string273.getClass();
            return string273;
        }
        if (g2.d(str, x0.n3)) {
            String string274 = context.getString(R.string.DOG_BREED_HAMILTONST_VARE_res_0x800100dc, Arrays.copyOf(objArr, objArr.length));
            string274.getClass();
            return string274;
        }
        if (g2.d(str, x0.o3)) {
            String string275 = context.getString(R.string.DOG_BREED_HANOVERIAN_SCENT_HOUND, Arrays.copyOf(objArr, objArr.length));
            string275.getClass();
            return string275;
        }
        if (g2.d(str, x0.p3)) {
            String string276 = context.getString(R.string.DOG_BREED_HARRIER, Arrays.copyOf(objArr, objArr.length));
            string276.getClass();
            return string276;
        }
        if (g2.d(str, x0.q3)) {
            String string277 = context.getString(R.string.DOG_BREED_HAVANESE, Arrays.copyOf(objArr, objArr.length));
            string277.getClass();
            return string277;
        }
        if (g2.d(str, x0.r3)) {
            String string278 = context.getString(R.string.DOG_BREED_HELLENIC_HOUND, Arrays.copyOf(objArr, objArr.length));
            string278.getClass();
            return string278;
        }
        if (g2.d(str, x0.s3)) {
            String string279 = context.getString(R.string.DOG_BREED_HOKKAIDO, Arrays.copyOf(objArr, objArr.length));
            string279.getClass();
            return string279;
        }
        if (g2.d(str, x0.t3)) {
            String string280 = context.getString(R.string.DOG_BREED_HOVAWART, Arrays.copyOf(objArr, objArr.length));
            string280.getClass();
            return string280;
        }
        if (g2.d(str, x0.u3)) {
            String string281 = context.getString(R.string.DOG_BREED_HUNGARIAN_GREYHOUND, Arrays.copyOf(objArr, objArr.length));
            string281.getClass();
            return string281;
        }
        if (g2.d(str, x0.v3)) {
            String string282 = context.getString(R.string.DOG_BREED_HUNGARIAN_HOUND__TRANSYLVANIAN_SCENT_HOUND, Arrays.copyOf(objArr, objArr.length));
            string282.getClass();
            return string282;
        }
        if (g2.d(str, x0.w3)) {
            String string283 = context.getString(R.string.DOG_BREED_HUNGARIAN_SHORTHAIRED_POINTER_VIZSLA, Arrays.copyOf(objArr, objArr.length));
            string283.getClass();
            return string283;
        }
        if (g2.d(str, x0.x3)) {
            String string284 = context.getString(R.string.DOG_BREED_HUNGARIAN_WIREHAIRED_POINTER, Arrays.copyOf(objArr, objArr.length));
            string284.getClass();
            return string284;
        }
        if (g2.d(str, x0.y3)) {
            String string285 = context.getString(R.string.DOG_BREED_HUSKYDOODLE, Arrays.copyOf(objArr, objArr.length));
            string285.getClass();
            return string285;
        }
        if (g2.d(str, x0.z3)) {
            String string286 = context.getString(R.string.DOG_BREED_HYGEN_HOUND, Arrays.copyOf(objArr, objArr.length));
            string286.getClass();
            return string286;
        }
        if (g2.d(str, x0.A3)) {
            String string287 = context.getString(R.string.DOG_BREED_IBIZAN_PODENCO, Arrays.copyOf(objArr, objArr.length));
            string287.getClass();
            return string287;
        }
        if (g2.d(str, x0.B3)) {
            String string288 = context.getString(R.string.DOG_BREED_ICELANDIC_SHEEPDOG, Arrays.copyOf(objArr, objArr.length));
            string288.getClass();
            return string288;
        }
        if (g2.d(str, x0.C3)) {
            String string289 = context.getString(R.string.DOG_BREED_IRISH_DOODLE, Arrays.copyOf(objArr, objArr.length));
            string289.getClass();
            return string289;
        }
        if (g2.d(str, x0.D3)) {
            String string290 = context.getString(R.string.DOG_BREED_IRISH_GLEN_OF_IMAAL_TERRIER, Arrays.copyOf(objArr, objArr.length));
            string290.getClass();
            return string290;
        }
        if (g2.d(str, x0.E3)) {
            String string291 = context.getString(R.string.DOG_BREED_IRISH_RED_AND_WHITE_SETTER, Arrays.copyOf(objArr, objArr.length));
            string291.getClass();
            return string291;
        }
        if (g2.d(str, x0.F3)) {
            String string292 = context.getString(R.string.DOG_BREED_IRISH_RED_SETTER, Arrays.copyOf(objArr, objArr.length));
            string292.getClass();
            return string292;
        }
        if (g2.d(str, x0.G3)) {
            String string293 = context.getString(R.string.DOG_BREED_IRISH_SOFT_COATED_WHEATEN_TERRIER, Arrays.copyOf(objArr, objArr.length));
            string293.getClass();
            return string293;
        }
        if (g2.d(str, x0.H3)) {
            String string294 = context.getString(R.string.DOG_BREED_IRISH_TERRIER, Arrays.copyOf(objArr, objArr.length));
            string294.getClass();
            return string294;
        }
        if (g2.d(str, x0.I3)) {
            String string295 = context.getString(R.string.DOG_BREED_IRISH_WATER_SPANIEL, Arrays.copyOf(objArr, objArr.length));
            string295.getClass();
            return string295;
        }
        if (g2.d(str, x0.J3)) {
            String string296 = context.getString(R.string.DOG_BREED_IRISH_WOLFHOUND, Arrays.copyOf(objArr, objArr.length));
            string296.getClass();
            return string296;
        }
        if (g2.d(str, x0.K3)) {
            String string297 = context.getString(R.string.DOG_BREED_ISTRIAN_SHORTHAIRED_HOUND, Arrays.copyOf(objArr, objArr.length));
            string297.getClass();
            return string297;
        }
        if (g2.d(str, x0.L3)) {
            String string298 = context.getString(R.string.DOG_BREED_ISTRIAN_WIREHAIRED_HOUND, Arrays.copyOf(objArr, objArr.length));
            string298.getClass();
            return string298;
        }
        if (g2.d(str, x0.M3)) {
            String string299 = context.getString(R.string.DOG_BREED_ITALIAN_CANE_CORSO, Arrays.copyOf(objArr, objArr.length));
            string299.getClass();
            return string299;
        }
        if (g2.d(str, x0.N3)) {
            String string300 = context.getString(R.string.DOG_BREED_ITALIAN_POINTING_DOG, Arrays.copyOf(objArr, objArr.length));
            string300.getClass();
            return string300;
        }
        if (g2.d(str, x0.O3)) {
            String string301 = context.getString(R.string.DOG_BREED_ITALIAN_ROUGHHAIRED_SEGUGIO, Arrays.copyOf(objArr, objArr.length));
            string301.getClass();
            return string301;
        }
        if (g2.d(str, x0.P3)) {
            String string302 = context.getString(R.string.DOG_BREED_ITALIAN_SHORTHAIRED_SEGUGIO, Arrays.copyOf(objArr, objArr.length));
            string302.getClass();
            return string302;
        }
        if (g2.d(str, x0.Q3)) {
            String string303 = context.getString(R.string.DOG_BREED_ITALIAN_SIGHTHOUND, Arrays.copyOf(objArr, objArr.length));
            string303.getClass();
            return string303;
        }
        if (g2.d(str, x0.R3)) {
            String string304 = context.getString(R.string.DOG_BREED_ITALIAN_SPINONE, Arrays.copyOf(objArr, objArr.length));
            string304.getClass();
            return string304;
        }
        if (g2.d(str, x0.S3)) {
            String string305 = context.getString(R.string.DOG_BREED_ITALIAN_VOLPINO, Arrays.copyOf(objArr, objArr.length));
            string305.getClass();
            return string305;
        }
        if (g2.d(str, x0.T3)) {
            String string306 = context.getString(R.string.DOG_BREED_JACKAPOO, Arrays.copyOf(objArr, objArr.length));
            string306.getClass();
            return string306;
        }
        if (g2.d(str, x0.U3)) {
            String string307 = context.getString(R.string.DOG_BREED_JACK_RUSSELL_TERRIER, Arrays.copyOf(objArr, objArr.length));
            string307.getClass();
            return string307;
        }
        if (g2.d(str, x0.V3)) {
            String string308 = context.getString(R.string.DOG_BREED_JAPANESE_CHIN, Arrays.copyOf(objArr, objArr.length));
            string308.getClass();
            return string308;
        }
        if (g2.d(str, x0.W3)) {
            String string309 = context.getString(R.string.DOG_BREED_JAPANESE_SPITZ, Arrays.copyOf(objArr, objArr.length));
            string309.getClass();
            return string309;
        }
        if (g2.d(str, x0.X3)) {
            String string310 = context.getString(R.string.DOG_BREED_JAPANESE_TERRIER, Arrays.copyOf(objArr, objArr.length));
            string310.getClass();
            return string310;
        }
        if (g2.d(str, x0.Y3)) {
            String string311 = context.getString(R.string.DOG_BREED_JUG, Arrays.copyOf(objArr, objArr.length));
            string311.getClass();
            return string311;
        }
        if (g2.d(str, x0.Z3)) {
            String string312 = context.getString(R.string.DOG_BREED_J_MTHUND_res_0x80010102, Arrays.copyOf(objArr, objArr.length));
            string312.getClass();
            return string312;
        }
        if (g2.d(str, x0.a4)) {
            String string313 = context.getString(R.string.DOG_BREED_KAI, Arrays.copyOf(objArr, objArr.length));
            string313.getClass();
            return string313;
        }
        if (g2.d(str, x0.b4)) {
            String string314 = context.getString(R.string.DOG_BREED_KANGAL_SHEPHERD_DOG, Arrays.copyOf(objArr, objArr.length));
            string314.getClass();
            return string314;
        }
        if (g2.d(str, x0.c4)) {
            String string315 = context.getString(R.string.DOG_BREED_KARELIAN_BEAR_DOG, Arrays.copyOf(objArr, objArr.length));
            string315.getClass();
            return string315;
        }
        if (g2.d(str, x0.d4)) {
            String string316 = context.getString(R.string.DOG_BREED_KARST_SHEPHERD_DOG, Arrays.copyOf(objArr, objArr.length));
            string316.getClass();
            return string316;
        }
        if (g2.d(str, x0.e4)) {
            String string317 = context.getString(R.string.DOG_BREED_KERRY_BLUE_TERRIER, Arrays.copyOf(objArr, objArr.length));
            string317.getClass();
            return string317;
        }
        if (g2.d(str, x0.f4)) {
            String string318 = context.getString(R.string.DOG_BREED_KING_CHARLES_SPANIEL, Arrays.copyOf(objArr, objArr.length));
            string318.getClass();
            return string318;
        }
        if (g2.d(str, x0.g4)) {
            String string319 = context.getString(R.string.DOG_BREED_KINTAMANIBALI_DOG, Arrays.copyOf(objArr, objArr.length));
            string319.getClass();
            return string319;
        }
        if (g2.d(str, x0.h4)) {
            String string320 = context.getString(R.string.DOG_BREED_KISHU, Arrays.copyOf(objArr, objArr.length));
            string320.getClass();
            return string320;
        }
        if (g2.d(str, x0.i4)) {
            String string321 = context.getString(R.string.DOG_BREED_KLEINER_M_NSTERL_NDER_res_0x8001010b, Arrays.copyOf(objArr, objArr.length));
            string321.getClass();
            return string321;
        }
        if (g2.d(str, x0.j4)) {
            String string322 = context.getString(R.string.DOG_BREED_KOMONDOR, Arrays.copyOf(objArr, objArr.length));
            string322.getClass();
            return string322;
        }
        if (g2.d(str, x0.k4)) {
            String string323 = context.getString(R.string.DOG_BREED_KOREA_JINDO_DOG, Arrays.copyOf(objArr, objArr.length));
            string323.getClass();
            return string323;
        }
        if (g2.d(str, x0.l4)) {
            String string324 = context.getString(R.string.DOG_BREED_KROMFOHRL_NDER_res_0x8001010e, Arrays.copyOf(objArr, objArr.length));
            string324.getClass();
            return string324;
        }
        if (g2.d(str, x0.m4)) {
            String string325 = context.getString(R.string.DOG_BREED_KUVASZ, Arrays.copyOf(objArr, objArr.length));
            string325.getClass();
            return string325;
        }
        if (g2.d(str, x0.n4)) {
            String string326 = context.getString(R.string.DOG_BREED_LABMARANER, Arrays.copyOf(objArr, objArr.length));
            string326.getClass();
            return string326;
        }
        if (g2.d(str, x0.o4)) {
            String string327 = context.getString(R.string.DOG_BREED_LABRADOODLE, Arrays.copyOf(objArr, objArr.length));
            string327.getClass();
            return string327;
        }
        if (g2.d(str, x0.p4)) {
            String string328 = context.getString(R.string.DOG_BREED_LABRADOR_RETRIEVER, Arrays.copyOf(objArr, objArr.length));
            string328.getClass();
            return string328;
        }
        if (g2.d(str, x0.q4)) {
            String string329 = context.getString(R.string.DOG_BREED_LABSKY, Arrays.copyOf(objArr, objArr.length));
            string329.getClass();
            return string329;
        }
        if (g2.d(str, x0.r4)) {
            String string330 = context.getString(R.string.DOG_BREED_LAKELAND_TERRIER, Arrays.copyOf(objArr, objArr.length));
            string330.getClass();
            return string330;
        }
        if (g2.d(str, x0.s4)) {
            String string331 = context.getString(R.string.DOG_BREED_LANCASHIRE_HEELER, Arrays.copyOf(objArr, objArr.length));
            string331.getClass();
            return string331;
        }
        if (g2.d(str, x0.t4)) {
            String string332 = context.getString(R.string.DOG_BREED_LANDSEER_EUROPEAN_CONTINENTAL_TYPE, Arrays.copyOf(objArr, objArr.length));
            string332.getClass();
            return string332;
        }
        if (g2.d(str, x0.u4)) {
            String string333 = context.getString(R.string.DOG_BREED_LAPPONIAN_HERDER, Arrays.copyOf(objArr, objArr.length));
            string333.getClass();
            return string333;
        }
        if (g2.d(str, x0.v4)) {
            String string334 = context.getString(R.string.DOG_BREED_LARGE_MUNSTERLANDER, Arrays.copyOf(objArr, objArr.length));
            string334.getClass();
            return string334;
        }
        if (g2.d(str, x0.w4)) {
            String string335 = context.getString(R.string.DOG_BREED_LEONBERGER, Arrays.copyOf(objArr, objArr.length));
            string335.getClass();
            return string335;
        }
        if (g2.d(str, x0.x4)) {
            String string336 = context.getString(R.string.DOG_BREED_LHASA_APSO, Arrays.copyOf(objArr, objArr.length));
            string336.getClass();
            return string336;
        }
        if (g2.d(str, x0.y4)) {
            String string337 = context.getString(R.string.DOG_BREED_LITTLE_LION_DOG, Arrays.copyOf(objArr, objArr.length));
            string337.getClass();
            return string337;
        }
        if (g2.d(str, x0.z4)) {
            String string338 = context.getString(R.string.DOG_BREED_LONGHAIRED_PYRENEAN_SHEEPDOG, Arrays.copyOf(objArr, objArr.length));
            string338.getClass();
            return string338;
        }
        if (g2.d(str, x0.A4)) {
            String string339 = context.getString(R.string.DOG_BREED_MAJORCA_MASTIFF, Arrays.copyOf(objArr, objArr.length));
            string339.getClass();
            return string339;
        }
        if (g2.d(str, x0.B4)) {
            String string340 = context.getString(R.string.DOG_BREED_MAJORCA_SHEPHERD_DOG, Arrays.copyOf(objArr, objArr.length));
            string340.getClass();
            return string340;
        }
        if (g2.d(str, x0.C4)) {
            String string341 = context.getString(R.string.DOG_BREED_MALCHI, Arrays.copyOf(objArr, objArr.length));
            string341.getClass();
            return string341;
        }
        if (g2.d(str, x0.D4)) {
            String string342 = context.getString(R.string.DOG_BREED_MALSHI, Arrays.copyOf(objArr, objArr.length));
            string342.getClass();
            return string342;
        }
        if (g2.d(str, x0.E4)) {
            String string343 = context.getString(R.string.DOG_BREED_MALTESE, Arrays.copyOf(objArr, objArr.length));
            string343.getClass();
            return string343;
        }
        if (g2.d(str, x0.F4)) {
            String string344 = context.getString(R.string.DOG_BREED_MALTIPOO, Arrays.copyOf(objArr, objArr.length));
            string344.getClass();
            return string344;
        }
        if (g2.d(str, x0.G4)) {
            String string345 = context.getString(R.string.DOG_BREED_MANCHESTER_TERRIER, Arrays.copyOf(objArr, objArr.length));
            string345.getClass();
            return string345;
        }
        if (g2.d(str, x0.H4)) {
            String string346 = context.getString(R.string.DOG_BREED_MAREMMA_AND_THE_ABRUZZES_SHEEPDOG, Arrays.copyOf(objArr, objArr.length));
            string346.getClass();
            return string346;
        }
        if (g2.d(str, x0.I4)) {
            String string347 = context.getString(R.string.DOG_BREED_MASTIFF, Arrays.copyOf(objArr, objArr.length));
            string347.getClass();
            return string347;
        }
        if (g2.d(str, x0.J4)) {
            String string348 = context.getString(R.string.DOG_BREED_MEDIUMSIZED_ANGLOFRENCH_HOUND, Arrays.copyOf(objArr, objArr.length));
            string348.getClass();
            return string348;
        }
        if (g2.d(str, x0.K4)) {
            String string349 = context.getString(R.string.DOG_BREED_MINIATURE_AMERICAN_SHEPHERD, Arrays.copyOf(objArr, objArr.length));
            string349.getClass();
            return string349;
        }
        if (g2.d(str, x0.L4)) {
            String string350 = context.getString(R.string.DOG_BREED_MINIATURE_BULL_TERRIER, Arrays.copyOf(objArr, objArr.length));
            string350.getClass();
            return string350;
        }
        if (g2.d(str, x0.M4)) {
            String string351 = context.getString(R.string.DOG_BREED_MINIATURE_PINSCHER, Arrays.copyOf(objArr, objArr.length));
            string351.getClass();
            return string351;
        }
        if (g2.d(str, x0.N4)) {
            String string352 = context.getString(R.string.DOG_BREED_MINIATURE_SCHNAUZER, Arrays.copyOf(objArr, objArr.length));
            string352.getClass();
            return string352;
        }
        if (g2.d(str, x0.O4)) {
            String string353 = context.getString(R.string.DOG_BREED_MONTENEGRIN_MOUNTAIN_HOUND, Arrays.copyOf(objArr, objArr.length));
            string353.getClass();
            return string353;
        }
        if (g2.d(str, x0.P4)) {
            String string354 = context.getString(R.string.DOG_BREED_MORKIE, Arrays.copyOf(objArr, objArr.length));
            string354.getClass();
            return string354;
        }
        if (g2.d(str, x0.Q4)) {
            String string355 = context.getString(R.string.DOG_BREED_MUDI, Arrays.copyOf(objArr, objArr.length));
            string355.getClass();
            return string355;
        }
        if (g2.d(str, x0.R4)) {
            String string356 = context.getString(R.string.DOG_BREED_NEAPOLITAN_MASTIFF, Arrays.copyOf(objArr, objArr.length));
            string356.getClass();
            return string356;
        }
        if (g2.d(str, x0.S4)) {
            String string357 = context.getString(R.string.DOG_BREED_NEDERLANDSE_KOOIKERHONDJE, Arrays.copyOf(objArr, objArr.length));
            string357.getClass();
            return string357;
        }
        if (g2.d(str, x0.T4)) {
            String string358 = context.getString(R.string.DOG_BREED_NEWFOUNDLAND, Arrays.copyOf(objArr, objArr.length));
            string358.getClass();
            return string358;
        }
        if (g2.d(str, x0.U4)) {
            String string359 = context.getString(R.string.DOG_BREED_NEWFYPOO, Arrays.copyOf(objArr, objArr.length));
            string359.getClass();
            return string359;
        }
        if (g2.d(str, x0.V4)) {
            String string360 = context.getString(R.string.DOG_BREED_NORFOLK_TERRIER, Arrays.copyOf(objArr, objArr.length));
            string360.getClass();
            return string360;
        }
        if (g2.d(str, x0.W4)) {
            String string361 = context.getString(R.string.DOG_BREED_NORMAN_ARTESIEN_BASSET, Arrays.copyOf(objArr, objArr.length));
            string361.getClass();
            return string361;
        }
        if (g2.d(str, x0.X4)) {
            String string362 = context.getString(R.string.DOG_BREED_NORRBOTTENSPITZ, Arrays.copyOf(objArr, objArr.length));
            string362.getClass();
            return string362;
        }
        if (g2.d(str, x0.Y4)) {
            String string363 = context.getString(R.string.DOG_BREED_NORWEGIAN_BUHUND, Arrays.copyOf(objArr, objArr.length));
            string363.getClass();
            return string363;
        }
        if (g2.d(str, x0.Z4)) {
            String string364 = context.getString(R.string.DOG_BREED_NORWEGIAN_ELKHOUND_BLACK, Arrays.copyOf(objArr, objArr.length));
            string364.getClass();
            return string364;
        }
        if (g2.d(str, x0.a5)) {
            String string365 = context.getString(R.string.DOG_BREED_NORWEGIAN_ELKHOUND_GREY, Arrays.copyOf(objArr, objArr.length));
            string365.getClass();
            return string365;
        }
        if (g2.d(str, x0.b5)) {
            String string366 = context.getString(R.string.DOG_BREED_NORWEGIAN_HOUND, Arrays.copyOf(objArr, objArr.length));
            string366.getClass();
            return string366;
        }
        if (g2.d(str, x0.c5)) {
            String string367 = context.getString(R.string.DOG_BREED_NORWEGIAN_LUNDEHUND, Arrays.copyOf(objArr, objArr.length));
            string367.getClass();
            return string367;
        }
        if (g2.d(str, x0.d5)) {
            String string368 = context.getString(R.string.DOG_BREED_NORWICH_TERRIER, Arrays.copyOf(objArr, objArr.length));
            string368.getClass();
            return string368;
        }
        if (g2.d(str, x0.e5)) {
            String string369 = context.getString(R.string.DOG_BREED_NOVA_SCOTIA_DUCK_TOLLING_RETRIEVER, Arrays.copyOf(objArr, objArr.length));
            string369.getClass();
            return string369;
        }
        if (g2.d(str, x0.f5)) {
            String string370 = context.getString(R.string.DOG_BREED_OLD_DANISH_POINTING_DOG, Arrays.copyOf(objArr, objArr.length));
            string370.getClass();
            return string370;
        }
        if (g2.d(str, x0.g5)) {
            String string371 = context.getString(R.string.DOG_BREED_OLD_ENGLISH_SHEEPDOG, Arrays.copyOf(objArr, objArr.length));
            string371.getClass();
            return string371;
        }
        if (g2.d(str, x0.h5)) {
            String string372 = context.getString(R.string.DOG_BREED_OTHER, Arrays.copyOf(objArr, objArr.length));
            string372.getClass();
            return string372;
        }
        if (g2.d(str, x0.i5)) {
            String string373 = context.getString(R.string.DOG_BREED_OTTERHOUND, Arrays.copyOf(objArr, objArr.length));
            string373.getClass();
            return string373;
        }
        if (g2.d(str, x0.j5)) {
            String string374 = context.getString(R.string.DOG_BREED_PAPIPOO, Arrays.copyOf(objArr, objArr.length));
            string374.getClass();
            return string374;
        }
        if (g2.d(str, x0.k5)) {
            String string375 = context.getString(R.string.DOG_BREED_PARSON_RUSSELL_TERRIER, Arrays.copyOf(objArr, objArr.length));
            string375.getClass();
            return string375;
        }
        if (g2.d(str, x0.l5)) {
            String string376 = context.getString(R.string.DOG_BREED_PEEKAPOO, Arrays.copyOf(objArr, objArr.length));
            string376.getClass();
            return string376;
        }
        if (g2.d(str, x0.m5)) {
            String string377 = context.getString(R.string.DOG_BREED_PEKINGESE, Arrays.copyOf(objArr, objArr.length));
            string377.getClass();
            return string377;
        }
        if (g2.d(str, x0.n5)) {
            String string378 = context.getString(R.string.DOG_BREED_PERUVIAN_HAIRLESS_DOG, Arrays.copyOf(objArr, objArr.length));
            string378.getClass();
            return string378;
        }
        if (g2.d(str, x0.o5)) {
            String string379 = context.getString(R.string.DOG_BREED_PETIT_BASSET_GRIFFON_VENDEEN, Arrays.copyOf(objArr, objArr.length));
            string379.getClass();
            return string379;
        }
        if (g2.d(str, x0.p5)) {
            String string380 = context.getString(R.string.DOG_BREED_PETIT_BRABAN_ON_res_0x80010146, Arrays.copyOf(objArr, objArr.length));
            string380.getClass();
            return string380;
        }
        if (g2.d(str, x0.q5)) {
            String string381 = context.getString(R.string.DOG_BREED_PHARAOH_HOUND, Arrays.copyOf(objArr, objArr.length));
            string381.getClass();
            return string381;
        }
        if (g2.d(str, x0.r5)) {
            String string382 = context.getString(R.string.DOG_BREED_PICARDY_SHEEPDOG, Arrays.copyOf(objArr, objArr.length));
            string382.getClass();
            return string382;
        }
        if (g2.d(str, x0.s5)) {
            String string383 = context.getString(R.string.DOG_BREED_PICARDY_SPANIEL, Arrays.copyOf(objArr, objArr.length));
            string383.getClass();
            return string383;
        }
        if (g2.d(str, x0.t5)) {
            String string384 = context.getString(R.string.DOG_BREED_PITSKY, Arrays.copyOf(objArr, objArr.length));
            string384.getClass();
            return string384;
        }
        if (g2.d(str, x0.u5)) {
            String string385 = context.getString(R.string.DOG_BREED_POINTERDOR, Arrays.copyOf(objArr, objArr.length));
            string385.getClass();
            return string385;
        }
        if (g2.d(str, x0.v5)) {
            String string386 = context.getString(R.string.DOG_BREED_POITEVIN, Arrays.copyOf(objArr, objArr.length));
            string386.getClass();
            return string386;
        }
        if (g2.d(str, x0.w5)) {
            String string387 = context.getString(R.string.DOG_BREED_POLISH_GREYHOUND, Arrays.copyOf(objArr, objArr.length));
            string387.getClass();
            return string387;
        }
        if (g2.d(str, x0.x5)) {
            String string388 = context.getString(R.string.DOG_BREED_POLISH_HOUND, Arrays.copyOf(objArr, objArr.length));
            string388.getClass();
            return string388;
        }
        if (g2.d(str, x0.y5)) {
            String string389 = context.getString(R.string.DOG_BREED_POLISH_HUNTING_DOG, Arrays.copyOf(objArr, objArr.length));
            string389.getClass();
            return string389;
        }
        if (g2.d(str, x0.z5)) {
            String string390 = context.getString(R.string.DOG_BREED_POLISH_LOWLAND_SHEEPDOG, Arrays.copyOf(objArr, objArr.length));
            string390.getClass();
            return string390;
        }
        if (g2.d(str, x0.A5)) {
            String string391 = context.getString(R.string.DOG_BREED_POMAPOO, Arrays.copyOf(objArr, objArr.length));
            string391.getClass();
            return string391;
        }
        if (g2.d(str, x0.B5)) {
            String string392 = context.getString(R.string.DOG_BREED_POMAPUG, Arrays.copyOf(objArr, objArr.length));
            string392.getClass();
            return string392;
        }
        if (g2.d(str, x0.C5)) {
            String string393 = context.getString(R.string.DOG_BREED_POMCHI, Arrays.copyOf(objArr, objArr.length));
            string393.getClass();
            return string393;
        }
        if (g2.d(str, x0.D5)) {
            String string394 = context.getString(R.string.DOG_BREED_POMEAGLE, Arrays.copyOf(objArr, objArr.length));
            string394.getClass();
            return string394;
        }
        if (g2.d(str, x0.E5)) {
            String string395 = context.getString(R.string.DOG_BREED_POMERDOG, Arrays.copyOf(objArr, objArr.length));
            string395.getClass();
            return string395;
        }
        if (g2.d(str, x0.F5)) {
            String string396 = context.getString(R.string.DOG_BREED_POMSKY, Arrays.copyOf(objArr, objArr.length));
            string396.getClass();
            return string396;
        }
        if (g2.d(str, x0.G5)) {
            String string397 = context.getString(R.string.DOG_BREED_PONTAUDEMER_SPANIEL, Arrays.copyOf(objArr, objArr.length));
            string397.getClass();
            return string397;
        }
        if (g2.d(str, x0.H5)) {
            String string398 = context.getString(R.string.DOG_BREED_POODLE, Arrays.copyOf(objArr, objArr.length));
            string398.getClass();
            return string398;
        }
        if (g2.d(str, x0.I5)) {
            String string399 = context.getString(R.string.DOG_BREED_PORCELAINE, Arrays.copyOf(objArr, objArr.length));
            string399.getClass();
            return string399;
        }
        if (g2.d(str, x0.J5)) {
            String string400 = context.getString(R.string.DOG_BREED_PORTUGUESE_POINTING_DOG, Arrays.copyOf(objArr, objArr.length));
            string400.getClass();
            return string400;
        }
        if (g2.d(str, x0.K5)) {
            String string401 = context.getString(R.string.DOG_BREED_PORTUGUESE_SHEEPDOG, Arrays.copyOf(objArr, objArr.length));
            string401.getClass();
            return string401;
        }
        if (g2.d(str, x0.L5)) {
            String string402 = context.getString(R.string.DOG_BREED_PORTUGUESE_WARREN_HOUNDPORTUGUESE_PODENGO, Arrays.copyOf(objArr, objArr.length));
            string402.getClass();
            return string402;
        }
        if (g2.d(str, x0.M5)) {
            String string403 = context.getString(R.string.DOG_BREED_PORTUGUESE_WATER_DOG, Arrays.copyOf(objArr, objArr.length));
            string403.getClass();
            return string403;
        }
        if (g2.d(str, x0.N5)) {
            String string404 = context.getString(R.string.DOG_BREED_POSAVATZ_HOUND, Arrays.copyOf(objArr, objArr.length));
            string404.getClass();
            return string404;
        }
        if (g2.d(str, x0.O5)) {
            String string405 = context.getString(R.string.DOG_BREED_PRAGUE_RATTER, Arrays.copyOf(objArr, objArr.length));
            string405.getClass();
            return string405;
        }
        if (g2.d(str, x0.P5)) {
            String string406 = context.getString(R.string.DOG_BREED_PRESA_CANARIO, Arrays.copyOf(objArr, objArr.length));
            string406.getClass();
            return string406;
        }
        if (g2.d(str, x0.Q5)) {
            String string407 = context.getString(R.string.DOG_BREED_PUDELPOINTER, Arrays.copyOf(objArr, objArr.length));
            string407.getClass();
            return string407;
        }
        if (g2.d(str, x0.R5)) {
            String string408 = context.getString(R.string.DOG_BREED_PUG, Arrays.copyOf(objArr, objArr.length));
            string408.getClass();
            return string408;
        }
        if (g2.d(str, x0.S5)) {
            String string409 = context.getString(R.string.DOG_BREED_PUGAPOO, Arrays.copyOf(objArr, objArr.length));
            string409.getClass();
            return string409;
        }
        if (g2.d(str, x0.T5)) {
            String string410 = context.getString(R.string.DOG_BREED_PUGGLE, Arrays.copyOf(objArr, objArr.length));
            string410.getClass();
            return string410;
        }
        if (g2.d(str, x0.U5)) {
            String string411 = context.getString(R.string.DOG_BREED_PUGINESE, Arrays.copyOf(objArr, objArr.length));
            string411.getClass();
            return string411;
        }
        if (g2.d(str, x0.V5)) {
            String string412 = context.getString(R.string.DOG_BREED_PUGSHIRE, Arrays.copyOf(objArr, objArr.length));
            string412.getClass();
            return string412;
        }
        if (g2.d(str, x0.W5)) {
            String string413 = context.getString(R.string.DOG_BREED_PULI, Arrays.copyOf(objArr, objArr.length));
            string413.getClass();
            return string413;
        }
        if (g2.d(str, x0.X5)) {
            String string414 = context.getString(R.string.DOG_BREED_PUMI, Arrays.copyOf(objArr, objArr.length));
            string414.getClass();
            return string414;
        }
        if (g2.d(str, x0.Y5)) {
            String string415 = context.getString(R.string.DOG_BREED_PYREDOODLE, Arrays.copyOf(objArr, objArr.length));
            string415.getClass();
            return string415;
        }
        if (g2.d(str, x0.Z5)) {
            String string416 = context.getString(R.string.DOG_BREED_PYRENEAN_MASTIFF, Arrays.copyOf(objArr, objArr.length));
            string416.getClass();
            return string416;
        }
        if (g2.d(str, x0.a6)) {
            String string417 = context.getString(R.string.DOG_BREED_PYRENEAN_MOUNTAIN_DOG, Arrays.copyOf(objArr, objArr.length));
            string417.getClass();
            return string417;
        }
        if (g2.d(str, x0.b6)) {
            String string418 = context.getString(R.string.DOG_BREED_PYRENEAN_SHEEPDOG__SMOOTH_FACED, Arrays.copyOf(objArr, objArr.length));
            string418.getClass();
            return string418;
        }
        if (g2.d(str, x0.c6)) {
            String string419 = context.getString(R.string.DOG_BREED_PYRENEES_HUSKY, Arrays.copyOf(objArr, objArr.length));
            string419.getClass();
            return string419;
        }
        if (g2.d(str, x0.d6)) {
            String string420 = context.getString(R.string.DOG_BREED_RAFEIRO_OF_ALENTEJO, Arrays.copyOf(objArr, objArr.length));
            string420.getClass();
            return string420;
        }
        if (g2.d(str, x0.e6)) {
            String string421 = context.getString(R.string.DOG_BREED_RHODESIAN_RIDGEBACK, Arrays.copyOf(objArr, objArr.length));
            string421.getClass();
            return string421;
        }
        if (g2.d(str, x0.f6)) {
            String string422 = context.getString(R.string.DOG_BREED_ROMAGNA_WATER_DOG, Arrays.copyOf(objArr, objArr.length));
            string422.getClass();
            return string422;
        }
        if (g2.d(str, x0.g6)) {
            String string423 = context.getString(R.string.DOG_BREED_ROMANIAN_BUCOVINA_SHEPHERD, Arrays.copyOf(objArr, objArr.length));
            string423.getClass();
            return string423;
        }
        if (g2.d(str, x0.h6)) {
            String string424 = context.getString(R.string.DOG_BREED_ROMANIAN_CARPATHIAN_SHEPHERD_DOG, Arrays.copyOf(objArr, objArr.length));
            string424.getClass();
            return string424;
        }
        if (g2.d(str, x0.i6)) {
            String string425 = context.getString(R.string.DOG_BREED_ROMANIAN_MIORITIC_SHEPHERD_DOG, Arrays.copyOf(objArr, objArr.length));
            string425.getClass();
            return string425;
        }
        if (g2.d(str, x0.j6)) {
            String string426 = context.getString(R.string.DOG_BREED_ROTTERMAN, Arrays.copyOf(objArr, objArr.length));
            string426.getClass();
            return string426;
        }
        if (g2.d(str, x0.k6)) {
            String string427 = context.getString(R.string.DOG_BREED_ROTTLE, Arrays.copyOf(objArr, objArr.length));
            string427.getClass();
            return string427;
        }
        if (g2.d(str, x0.l6)) {
            String string428 = context.getString(R.string.DOG_BREED_ROTTSKY, Arrays.copyOf(objArr, objArr.length));
            string428.getClass();
            return string428;
        }
        if (g2.d(str, x0.m6)) {
            String string429 = context.getString(R.string.DOG_BREED_ROTTWEILER, Arrays.copyOf(objArr, objArr.length));
            string429.getClass();
            return string429;
        }
        if (g2.d(str, x0.n6)) {
            String string430 = context.getString(R.string.DOG_BREED_RUSSIANEUROPEAN_LAIKA, Arrays.copyOf(objArr, objArr.length));
            string430.getClass();
            return string430;
        }
        if (g2.d(str, x0.o6)) {
            String string431 = context.getString(R.string.DOG_BREED_RUSSIAN_BLACK_TERRIER, Arrays.copyOf(objArr, objArr.length));
            string431.getClass();
            return string431;
        }
        if (g2.d(str, x0.p6)) {
            String string432 = context.getString(R.string.DOG_BREED_RUSSIAN_TOY, Arrays.copyOf(objArr, objArr.length));
            string432.getClass();
            return string432;
        }
        if (g2.d(str, x0.q6)) {
            String string433 = context.getString(R.string.DOG_BREED_SAARLOOS_WOLFHOND, Arrays.copyOf(objArr, objArr.length));
            string433.getClass();
            return string433;
        }
        if (g2.d(str, x0.r6)) {
            String string434 = context.getString(R.string.DOG_BREED_SAINT_BERDOODLE, Arrays.copyOf(objArr, objArr.length));
            string434.getClass();
            return string434;
        }
        if (g2.d(str, x0.s6)) {
            String string435 = context.getString(R.string.DOG_BREED_SAINT_GERMAIN_POINTER, Arrays.copyOf(objArr, objArr.length));
            string435.getClass();
            return string435;
        }
        if (g2.d(str, x0.t6)) {
            String string436 = context.getString(R.string.DOG_BREED_SAINT_MIGUEL_CATTLE_DOG, Arrays.copyOf(objArr, objArr.length));
            string436.getClass();
            return string436;
        }
        if (g2.d(str, x0.u6)) {
            String string437 = context.getString(R.string.DOG_BREED_SAINT_PYRENEES, Arrays.copyOf(objArr, objArr.length));
            string437.getClass();
            return string437;
        }
        if (g2.d(str, x0.v6)) {
            String string438 = context.getString(R.string.DOG_BREED_SAINT_SHEPHERD, Arrays.copyOf(objArr, objArr.length));
            string438.getClass();
            return string438;
        }
        if (g2.d(str, x0.w6)) {
            String string439 = context.getString(R.string.DOG_BREED_SALUKI, Arrays.copyOf(objArr, objArr.length));
            string439.getClass();
            return string439;
        }
        if (g2.d(str, x0.x6)) {
            String string440 = context.getString(R.string.DOG_BREED_SAMOYED, Arrays.copyOf(objArr, objArr.length));
            string440.getClass();
            return string440;
        }
        if (g2.d(str, x0.y6)) {
            String string441 = context.getString(R.string.DOG_BREED_SCHILLERST_VARE_res_0x80010183, Arrays.copyOf(objArr, objArr.length));
            string441.getClass();
            return string441;
        }
        if (g2.d(str, x0.z6)) {
            String string442 = context.getString(R.string.DOG_BREED_SCHIPPERKE, Arrays.copyOf(objArr, objArr.length));
            string442.getClass();
            return string442;
        }
        if (g2.d(str, x0.A6)) {
            String string443 = context.getString(R.string.DOG_BREED_SCHNAUZER, Arrays.copyOf(objArr, objArr.length));
            string443.getClass();
            return string443;
        }
        if (g2.d(str, x0.B6)) {
            String string444 = context.getString(R.string.DOG_BREED_SCHNOODLE, Arrays.copyOf(objArr, objArr.length));
            string444.getClass();
            return string444;
        }
        if (g2.d(str, x0.C6)) {
            String string445 = context.getString(R.string.DOG_BREED_SCOTTISH_TERRIER, Arrays.copyOf(objArr, objArr.length));
            string445.getClass();
            return string445;
        }
        if (g2.d(str, x0.D6)) {
            String string446 = context.getString(R.string.DOG_BREED_SEALYHAM_TERRIER, Arrays.copyOf(objArr, objArr.length));
            string446.getClass();
            return string446;
        }
        if (g2.d(str, x0.E6)) {
            String string447 = context.getString(R.string.DOG_BREED_SEGUGIO_MAREMMANO, Arrays.copyOf(objArr, objArr.length));
            string447.getClass();
            return string447;
        }
        if (g2.d(str, x0.F6)) {
            String string448 = context.getString(R.string.DOG_BREED_SERBIAN_HOUND, Arrays.copyOf(objArr, objArr.length));
            string448.getClass();
            return string448;
        }
        if (g2.d(str, x0.G6)) {
            String string449 = context.getString(R.string.DOG_BREED_SERBIAN_TRICOLOUR_HOUND, Arrays.copyOf(objArr, objArr.length));
            string449.getClass();
            return string449;
        }
        if (g2.d(str, x0.H6)) {
            String string450 = context.getString(R.string.DOG_BREED_SHAR_PEI, Arrays.copyOf(objArr, objArr.length));
            string450.getClass();
            return string450;
        }
        if (g2.d(str, x0.I6)) {
            String string451 = context.getString(R.string.DOG_BREED_SHEEPADOODLE, Arrays.copyOf(objArr, objArr.length));
            string451.getClass();
            return string451;
        }
        if (g2.d(str, x0.J6)) {
            String string452 = context.getString(R.string.DOG_BREED_SHEPRADOR, Arrays.copyOf(objArr, objArr.length));
            string452.getClass();
            return string452;
        }
        if (g2.d(str, x0.K6)) {
            String string453 = context.getString(R.string.DOG_BREED_SHETLAND_SHEEPDOG, Arrays.copyOf(objArr, objArr.length));
            string453.getClass();
            return string453;
        }
        if (g2.d(str, x0.L6)) {
            String string454 = context.getString(R.string.DOG_BREED_SHIBA, Arrays.copyOf(objArr, objArr.length));
            string454.getClass();
            return string454;
        }
        if (g2.d(str, x0.M6)) {
            String string455 = context.getString(R.string.DOG_BREED_SHICHI, Arrays.copyOf(objArr, objArr.length));
            string455.getClass();
            return string455;
        }
        if (g2.d(str, x0.N6)) {
            String string456 = context.getString(R.string.DOG_BREED_SHIHPOO, Arrays.copyOf(objArr, objArr.length));
            string456.getClass();
            return string456;
        }
        if (g2.d(str, x0.O6)) {
            String string457 = context.getString(R.string.DOG_BREED_SHIH_TZU, Arrays.copyOf(objArr, objArr.length));
            string457.getClass();
            return string457;
        }
        if (g2.d(str, x0.P6)) {
            String string458 = context.getString(R.string.DOG_BREED_SHIKOKU, Arrays.copyOf(objArr, objArr.length));
            string458.getClass();
            return string458;
        }
        if (g2.d(str, x0.Q6)) {
            String string459 = context.getString(R.string.DOG_BREED_SHIRANIAN, Arrays.copyOf(objArr, objArr.length));
            string459.getClass();
            return string459;
        }
        if (g2.d(str, x0.R6)) {
            String string460 = context.getString(R.string.DOG_BREED_SHOLLIE, Arrays.copyOf(objArr, objArr.length));
            string460.getClass();
            return string460;
        }
        if (g2.d(str, x0.S6)) {
            String string461 = context.getString(R.string.DOG_BREED_SIBERIAN_HUSKY, Arrays.copyOf(objArr, objArr.length));
            string461.getClass();
            return string461;
        }
        if (g2.d(str, x0.T6)) {
            String string462 = context.getString(R.string.DOG_BREED_SIBERIAN_RETRIEVER, Arrays.copyOf(objArr, objArr.length));
            string462.getClass();
            return string462;
        }
        if (g2.d(str, x0.U6)) {
            String string463 = context.getString(R.string.DOG_BREED_SKYE_TERRIER, Arrays.copyOf(objArr, objArr.length));
            string463.getClass();
            return string463;
        }
        if (g2.d(str, x0.V6)) {
            String string464 = context.getString(R.string.DOG_BREED_SLOUGHI, Arrays.copyOf(objArr, objArr.length));
            string464.getClass();
            return string464;
        }
        if (g2.d(str, x0.W6)) {
            String string465 = context.getString(R.string.DOG_BREED_SLOVAKIAN_CHUVACH, Arrays.copyOf(objArr, objArr.length));
            string465.getClass();
            return string465;
        }
        if (g2.d(str, x0.X6)) {
            String string466 = context.getString(R.string.DOG_BREED_SLOVAKIAN_HOUND, Arrays.copyOf(objArr, objArr.length));
            string466.getClass();
            return string466;
        }
        if (g2.d(str, x0.Y6)) {
            String string467 = context.getString(R.string.DOG_BREED_SMALL_BLUE_GASCONY, Arrays.copyOf(objArr, objArr.length));
            string467.getClass();
            return string467;
        }
        if (g2.d(str, x0.Z6)) {
            String string468 = context.getString(R.string.DOG_BREED_SMALL_SWISS_HOUND, Arrays.copyOf(objArr, objArr.length));
            string468.getClass();
            return string468;
        }
        if (g2.d(str, x0.a7)) {
            String string469 = context.getString(R.string.DOG_BREED_SM_LANDSST_VARE_res_0x8001019f, Arrays.copyOf(objArr, objArr.length));
            string469.getClass();
            return string469;
        }
        if (g2.d(str, x0.b7)) {
            String string470 = context.getString(R.string.DOG_BREED_SOUTH_RUSSIAN_SHEPHERD_DOG, Arrays.copyOf(objArr, objArr.length));
            string470.getClass();
            return string470;
        }
        if (g2.d(str, x0.c7)) {
            String string471 = context.getString(R.string.DOG_BREED_SPANADOR, Arrays.copyOf(objArr, objArr.length));
            string471.getClass();
            return string471;
        }
        if (g2.d(str, x0.d7)) {
            String string472 = context.getString(R.string.DOG_BREED_SPANISH_GREYHOUND, Arrays.copyOf(objArr, objArr.length));
            string472.getClass();
            return string472;
        }
        if (g2.d(str, x0.e7)) {
            String string473 = context.getString(R.string.DOG_BREED_SPANISH_HOUND, Arrays.copyOf(objArr, objArr.length));
            string473.getClass();
            return string473;
        }
        if (g2.d(str, x0.f7)) {
            String string474 = context.getString(R.string.DOG_BREED_SPANISH_MASTIFF, Arrays.copyOf(objArr, objArr.length));
            string474.getClass();
            return string474;
        }
        if (g2.d(str, x0.g7)) {
            String string475 = context.getString(R.string.DOG_BREED_SPANISH_WATER_DOG, Arrays.copyOf(objArr, objArr.length));
            string475.getClass();
            return string475;
        }
        if (g2.d(str, x0.h7)) {
            String string476 = context.getString(R.string.DOG_BREED_SPRINGADOR, Arrays.copyOf(objArr, objArr.length));
            string476.getClass();
            return string476;
        }
        if (g2.d(str, x0.i7)) {
            String string477 = context.getString(R.string.DOG_BREED_SPRINGERDOODLE, Arrays.copyOf(objArr, objArr.length));
            string477.getClass();
            return string477;
        }
        if (g2.d(str, x0.j7)) {
            String string478 = context.getString(R.string.DOG_BREED_STABIJHOUN, Arrays.copyOf(objArr, objArr.length));
            string478.getClass();
            return string478;
        }
        if (g2.d(str, x0.k7)) {
            String string479 = context.getString(R.string.DOG_BREED_STAFFORDSHIRE_BULL_TERRIER, Arrays.copyOf(objArr, objArr.length));
            string479.getClass();
            return string479;
        }
        if (g2.d(str, x0.l7)) {
            String string480 = context.getString(R.string.DOG_BREED_ST_BERNARD, Arrays.copyOf(objArr, objArr.length));
            string480.getClass();
            return string480;
        }
        if (g2.d(str, x0.m7)) {
            String string481 = context.getString(R.string.DOG_BREED_SUSSEX_SPANIEL, Arrays.copyOf(objArr, objArr.length));
            string481.getClass();
            return string481;
        }
        if (g2.d(str, x0.n7)) {
            String string482 = context.getString(R.string.DOG_BREED_SWEDISH_LAPPHUND, Arrays.copyOf(objArr, objArr.length));
            string482.getClass();
            return string482;
        }
        if (g2.d(str, x0.o7)) {
            String string483 = context.getString(R.string.DOG_BREED_SWEDISH_VALLHUND, Arrays.copyOf(objArr, objArr.length));
            string483.getClass();
            return string483;
        }
        if (g2.d(str, x0.p7)) {
            String string484 = context.getString(R.string.DOG_BREED_SWISS_HOUND, Arrays.copyOf(objArr, objArr.length));
            string484.getClass();
            return string484;
        }
        if (g2.d(str, x0.q7)) {
            String string485 = context.getString(R.string.DOG_BREED_TAIWAN_DOG, Arrays.copyOf(objArr, objArr.length));
            string485.getClass();
            return string485;
        }
        if (g2.d(str, x0.r7)) {
            String string486 = context.getString(R.string.DOG_BREED_TATRA_SHEPHERD_DOG, Arrays.copyOf(objArr, objArr.length));
            string486.getClass();
            return string486;
        }
        if (g2.d(str, x0.s7)) {
            String string487 = context.getString(R.string.DOG_BREED_THAI_BANGKAEW_DOG, Arrays.copyOf(objArr, objArr.length));
            string487.getClass();
            return string487;
        }
        if (g2.d(str, x0.t7)) {
            String string488 = context.getString(R.string.DOG_BREED_THAI_RIDGEBACK_DOG, Arrays.copyOf(objArr, objArr.length));
            string488.getClass();
            return string488;
        }
        if (g2.d(str, x0.u7)) {
            String string489 = context.getString(R.string.DOG_BREED_TIBETAN_MASTIFF, Arrays.copyOf(objArr, objArr.length));
            string489.getClass();
            return string489;
        }
        if (g2.d(str, x0.v7)) {
            String string490 = context.getString(R.string.DOG_BREED_TIBETAN_SPANIEL, Arrays.copyOf(objArr, objArr.length));
            string490.getClass();
            return string490;
        }
        if (g2.d(str, x0.w7)) {
            String string491 = context.getString(R.string.DOG_BREED_TIBETAN_TERRIER, Arrays.copyOf(objArr, objArr.length));
            string491.getClass();
            return string491;
        }
        if (g2.d(str, x0.x7)) {
            String string492 = context.getString(R.string.DOG_BREED_TOSA, Arrays.copyOf(objArr, objArr.length));
            string492.getClass();
            return string492;
        }
        if (g2.d(str, x0.y7)) {
            String string493 = context.getString(R.string.DOG_BREED_TRANSMONTANO_MASTIFF, Arrays.copyOf(objArr, objArr.length));
            string493.getClass();
            return string493;
        }
        if (g2.d(str, x0.z7)) {
            String string494 = context.getString(R.string.DOG_BREED_TYROLEAN_HOUND, Arrays.copyOf(objArr, objArr.length));
            string494.getClass();
            return string494;
        }
        if (g2.d(str, x0.A7)) {
            String string495 = context.getString(R.string.DOG_BREED_VALENCIAN_TERRIER, Arrays.copyOf(objArr, objArr.length));
            string495.getClass();
            return string495;
        }
        if (g2.d(str, x0.B7)) {
            String string496 = context.getString(R.string.DOG_BREED_WEIMARANER, Arrays.copyOf(objArr, objArr.length));
            string496.getClass();
            return string496;
        }
        if (g2.d(str, x0.C7)) {
            String string497 = context.getString(R.string.DOG_BREED_WEIMARDOODLE, Arrays.copyOf(objArr, objArr.length));
            string497.getClass();
            return string497;
        }
        if (g2.d(str, x0.D7)) {
            String string498 = context.getString(R.string.DOG_BREED_WELSH_CORGI_CARDIGAN, Arrays.copyOf(objArr, objArr.length));
            string498.getClass();
            return string498;
        }
        if (g2.d(str, x0.E7)) {
            String string499 = context.getString(R.string.DOG_BREED_WELSH_CORGI_PEMBROKE, Arrays.copyOf(objArr, objArr.length));
            string499.getClass();
            return string499;
        }
        if (g2.d(str, x0.F7)) {
            String string500 = context.getString(R.string.DOG_BREED_WELSH_SPRINGER_SPANIEL, Arrays.copyOf(objArr, objArr.length));
            string500.getClass();
            return string500;
        }
        if (g2.d(str, x0.G7)) {
            String string501 = context.getString(R.string.DOG_BREED_WELSH_TERRIER, Arrays.copyOf(objArr, objArr.length));
            string501.getClass();
            return string501;
        }
        if (g2.d(str, x0.H7)) {
            String string502 = context.getString(R.string.DOG_BREED_WESTIEPOO, Arrays.copyOf(objArr, objArr.length));
            string502.getClass();
            return string502;
        }
        if (g2.d(str, x0.I7)) {
            String string503 = context.getString(R.string.DOG_BREED_WESTPHALIAN_DACHSBRACKE, Arrays.copyOf(objArr, objArr.length));
            string503.getClass();
            return string503;
        }
        if (g2.d(str, x0.J7)) {
            String string504 = context.getString(R.string.DOG_BREED_WEST_HIGHLAND_WHITE_TERRIER, Arrays.copyOf(objArr, objArr.length));
            string504.getClass();
            return string504;
        }
        if (g2.d(str, x0.K7)) {
            String string505 = context.getString(R.string.DOG_BREED_WEST_SIBERIAN_LAIKA, Arrays.copyOf(objArr, objArr.length));
            string505.getClass();
            return string505;
        }
        if (g2.d(str, x0.L7)) {
            String string506 = context.getString(R.string.DOG_BREED_WHIPPET, Arrays.copyOf(objArr, objArr.length));
            string506.getClass();
            return string506;
        }
        if (g2.d(str, x0.M7)) {
            String string507 = context.getString(R.string.DOG_BREED_WHITE_SWISS_SHEPHERD_DOG, Arrays.copyOf(objArr, objArr.length));
            string507.getClass();
            return string507;
        }
        if (g2.d(str, x0.N7)) {
            String string508 = context.getString(R.string.DOG_BREED_WHOODLE, Arrays.copyOf(objArr, objArr.length));
            string508.getClass();
            return string508;
        }
        if (g2.d(str, x0.O7)) {
            String string509 = context.getString(R.string.DOG_BREED_WIREHAIRED_POINTING_GRIFFON_KORTHALS, Arrays.copyOf(objArr, objArr.length));
            string509.getClass();
            return string509;
        }
        if (g2.d(str, x0.P7)) {
            String string510 = context.getString(R.string.DOG_BREED_WIREHAIRED_SLOVAKIAN_POINTER, Arrays.copyOf(objArr, objArr.length));
            string510.getClass();
            return string510;
        }
        if (g2.d(str, x0.Q7)) {
            String string511 = context.getString(R.string.DOG_BREED_XOLOITZCUINTLE, Arrays.copyOf(objArr, objArr.length));
            string511.getClass();
            return string511;
        }
        if (g2.d(str, x0.R7)) {
            String string512 = context.getString(R.string.DOG_BREED_YAKUTIAN_LAIKA, Arrays.copyOf(objArr, objArr.length));
            string512.getClass();
            return string512;
        }
        if (g2.d(str, x0.S7)) {
            String string513 = context.getString(R.string.DOG_BREED_YORKILLON, Arrays.copyOf(objArr, objArr.length));
            string513.getClass();
            return string513;
        }
        if (g2.d(str, x0.T7)) {
            String string514 = context.getString(R.string.DOG_BREED_YORKIPOO, Arrays.copyOf(objArr, objArr.length));
            string514.getClass();
            return string514;
        }
        if (g2.d(str, x0.U7)) {
            String string515 = context.getString(R.string.DOG_BREED_YORKSHIRE_TERRIER, Arrays.copyOf(objArr, objArr.length));
            string515.getClass();
            return string515;
        }
        if (g2.d(str, x0.V7)) {
            String string516 = context.getString(R.string.DOG_BREED_YUGOSLAVIAN_SHEPHERD_DOG__SHARPLANINA, Arrays.copyOf(objArr, objArr.length));
            string516.getClass();
            return string516;
        }
        if (g2.d(str, x0.H9)) {
            String string517 = context.getString(R.string.multi_day_activities_active_epic, Arrays.copyOf(objArr, objArr.length));
            string517.getClass();
            return string517;
        }
        if (g2.d(str, x0.I9)) {
            String string518 = context.getString(R.string.multi_day_activities_activities_selected_format, Arrays.copyOf(objArr, objArr.length));
            string518.getClass();
            return string518;
        }
        if (g2.d(str, x0.J9)) {
            String string519 = context.getString(R.string.multi_day_activities_activity_added, Arrays.copyOf(objArr, objArr.length));
            string519.getClass();
            return string519;
        }
        if (g2.d(str, x0.K9)) {
            String string520 = context.getString(R.string.multi_day_activities_add_activities, Arrays.copyOf(objArr, objArr.length));
            string520.getClass();
            return string520;
        }
        if (g2.d(str, x0.L9)) {
            String string521 = context.getString(R.string.multi_day_activities_add_course_footer, Arrays.copyOf(objArr, objArr.length));
            string521.getClass();
            return string521;
        }
        if (g2.d(str, x0.M9)) {
            String string522 = context.getString(R.string.multi_day_activities_add_daily_note, Arrays.copyOf(objArr, objArr.length));
            string522.getClass();
            return string522;
        }
        if (g2.d(str, x0.N9)) {
            String string523 = context.getString(R.string.multi_day_activities_all_epic_totals, Arrays.copyOf(objArr, objArr.length));
            string523.getClass();
            return string523;
        }
        if (g2.d(str, x0.O9)) {
            String string524 = context.getString(R.string.multi_day_activities_all_other, Arrays.copyOf(objArr, objArr.length));
            string524.getClass();
            return string524;
        }
        if (g2.d(str, x0.P9)) {
            String string525 = context.getString(R.string.multi_day_activities_avg_daily_active, Arrays.copyOf(objArr, objArr.length));
            string525.getClass();
            return string525;
        }
        if (g2.d(str, x0.Q9)) {
            String string526 = context.getString(R.string.multi_day_activities_avg_daily_resting, Arrays.copyOf(objArr, objArr.length));
            string526.getClass();
            return string526;
        }
        if (g2.d(str, x0.R9)) {
            String string527 = context.getString(R.string.multi_day_activities_avg_resting_hr, Arrays.copyOf(objArr, objArr.length));
            string527.getClass();
            return string527;
        }
        if (g2.d(str, x0.S9)) {
            String string528 = context.getString(R.string.multi_day_activities_check_back_later, Arrays.copyOf(objArr, objArr.length));
            string528.getClass();
            return string528;
        }
        if (g2.d(str, x0.T9)) {
            String string529 = context.getString(R.string.multi_day_activities_check_back_later_no_name, Arrays.copyOf(objArr, objArr.length));
            string529.getClass();
            return string529;
        }
        if (g2.d(str, x0.U9)) {
            String string530 = context.getString(R.string.multi_day_activities_choose_epic_options, Arrays.copyOf(objArr, objArr.length));
            string530.getClass();
            return string530;
        }
        if (g2.d(str, x0.V9)) {
            String string531 = context.getString(R.string.multi_day_activities_choose_epic_options_message, Arrays.copyOf(objArr, objArr.length));
            string531.getClass();
            return string531;
        }
        if (g2.d(str, x0.W9)) {
            String string532 = context.getString(R.string.multi_day_activities_completed_epics, Arrays.copyOf(objArr, objArr.length));
            string532.getClass();
            return string532;
        }
        if (g2.d(str, x0.X9)) {
            String string533 = context.getString(R.string.multi_day_activities_create_an_epic, Arrays.copyOf(objArr, objArr.length));
            string533.getClass();
            return string533;
        }
        if (g2.d(str, x0.Y9)) {
            String string534 = context.getString(R.string.multi_day_activities_delete_epic, Arrays.copyOf(objArr, objArr.length));
            string534.getClass();
            return string534;
        }
        if (g2.d(str, x0.Z9)) {
            String string535 = context.getString(R.string.multi_day_activities_delete_epic_message, Arrays.copyOf(objArr, objArr.length));
            string535.getClass();
            return string535;
        }
        if (g2.d(str, x0.aa)) {
            String string536 = context.getString(R.string.multi_day_activities_deselect_all, Arrays.copyOf(objArr, objArr.length));
            string536.getClass();
            return string536;
        }
        if (g2.d(str, x0.ba)) {
            String string537 = context.getString(R.string.multi_day_activities_edit_epic, Arrays.copyOf(objArr, objArr.length));
            string537.getClass();
            return string537;
        }
        if (g2.d(str, x0.ca)) {
            String string538 = context.getString(R.string.multi_day_activities_edit_reports, Arrays.copyOf(objArr, objArr.length));
            string538.getClass();
            return string538;
        }
        if (g2.d(str, x0.da)) {
            String string539 = context.getString(R.string.multi_day_activities_epic, Arrays.copyOf(objArr, objArr.length));
            string539.getClass();
            return string539;
        }
        if (g2.d(str, x0.ea)) {
            String string540 = context.getString(R.string.multi_day_activities_epic_coming_soon, Arrays.copyOf(objArr, objArr.length));
            string540.getClass();
            return string540;
        }
        if (g2.d(str, x0.fa)) {
            String string541 = context.getString(R.string.multi_day_activities_epic_info, Arrays.copyOf(objArr, objArr.length));
            string541.getClass();
            return string541;
        }
        if (g2.d(str, x0.ga)) {
            String string542 = context.getString(R.string.multi_day_activities_epic_length, Arrays.copyOf(objArr, objArr.length));
            string542.getClass();
            return string542;
        }
        if (g2.d(str, x0.ha)) {
            String string543 = context.getString(R.string.multi_day_activities_epic_name, Arrays.copyOf(objArr, objArr.length));
            string543.getClass();
            return string543;
        }
        if (g2.d(str, x0.ia)) {
            String string544 = context.getString(R.string.multi_day_activities_epic_options, Arrays.copyOf(objArr, objArr.length));
            string544.getClass();
            return string544;
        }
        if (g2.d(str, x0.ja)) {
            String string545 = context.getString(R.string.multi_day_activities_epic_summary, Arrays.copyOf(objArr, objArr.length));
            string545.getClass();
            return string545;
        }
        if (g2.d(str, x0.ka)) {
            String string546 = context.getString(R.string.multi_day_activities_epics, Arrays.copyOf(objArr, objArr.length));
            string546.getClass();
            return string546;
        }
        if (g2.d(str, x0.la)) {
            String string547 = context.getString(R.string.multi_day_activities_everyone, Arrays.copyOf(objArr, objArr.length));
            string547.getClass();
            return string547;
        }
        if (g2.d(str, x0.ma)) {
            String string548 = context.getString(R.string.multi_day_activities_exit_epic, Arrays.copyOf(objArr, objArr.length));
            string548.getClass();
            return string548;
        }
        if (g2.d(str, x0.na)) {
            String string549 = context.getString(R.string.multi_day_activities_exit_epic_message, Arrays.copyOf(objArr, objArr.length));
            string549.getClass();
            return string549;
        }
        if (g2.d(str, x0.oa)) {
            String string550 = context.getString(R.string.multi_day_activities_future_epics, Arrays.copyOf(objArr, objArr.length));
            string550.getClass();
            return string550;
        }
        if (g2.d(str, x0.pa)) {
            String string551 = context.getString(R.string.multi_day_activities_future_epics_message, Arrays.copyOf(objArr, objArr.length));
            string551.getClass();
            return string551;
        }
        if (g2.d(str, x0.qa)) {
            String string552 = context.getString(R.string.multi_day_activities_genesis_description1, Arrays.copyOf(objArr, objArr.length));
            string552.getClass();
            return string552;
        }
        if (g2.d(str, x0.ra)) {
            String string553 = context.getString(R.string.multi_day_activities_genesis_description2, Arrays.copyOf(objArr, objArr.length));
            string553.getClass();
            return string553;
        }
        if (g2.d(str, x0.sa)) {
            String string554 = context.getString(R.string.multi_day_activities_go_on_epic, Arrays.copyOf(objArr, objArr.length));
            string554.getClass();
            return string554;
        }
        if (g2.d(str, x0.ta)) {
            String string555 = context.getString(R.string.multi_day_activities_health_stats_only_visible, Arrays.copyOf(objArr, objArr.length));
            string555.getClass();
            return string555;
        }
        if (g2.d(str, x0.ua)) {
            String string556 = context.getString(R.string.multi_day_activities_linked_course_not_available, Arrays.copyOf(objArr, objArr.length));
            string556.getClass();
            return string556;
        }
        if (g2.d(str, x0.va)) {
            String string557 = context.getString(R.string.multi_day_activities_livetrack_action, Arrays.copyOf(objArr, objArr.length));
            string557.getClass();
            return string557;
        }
        if (g2.d(str, x0.wa)) {
            String string558 = context.getString(R.string.multi_day_activities_livetrack_message, Arrays.copyOf(objArr, objArr.length));
            string558.getClass();
            return string558;
        }
        if (g2.d(str, x0.xa)) {
            String string559 = context.getString(R.string.multi_day_activities_livetrack_not_setup, Arrays.copyOf(objArr, objArr.length));
            string559.getClass();
            return string559;
        }
        if (g2.d(str, x0.ya)) {
            String string560 = context.getString(R.string.multi_day_activities_livetrack_share_link_footer, Arrays.copyOf(objArr, objArr.length));
            string560.getClass();
            return string560;
        }
        if (g2.d(str, x0.za)) {
            String string561 = context.getString(R.string.multi_day_activities_livetrack_title, Arrays.copyOf(objArr, objArr.length));
            string561.getClass();
            return string561;
        }
        if (g2.d(str, x0.Aa)) {
            String string562 = context.getString(R.string.multi_day_activities_max_day_message, Arrays.copyOf(objArr, objArr.length));
            string562.getClass();
            return string562;
        }
        if (g2.d(str, x0.Ba)) {
            String string563 = context.getString(R.string.multi_day_activities_message, Arrays.copyOf(objArr, objArr.length));
            string563.getClass();
            return string563;
        }
        if (g2.d(str, x0.Ca)) {
            String string564 = context.getString(R.string.multi_day_activities_my_followers, Arrays.copyOf(objArr, objArr.length));
            string564.getClass();
            return string564;
        }
        if (g2.d(str, x0.Da)) {
            String string565 = context.getString(R.string.multi_day_activities_my_followers_and_groups, Arrays.copyOf(objArr, objArr.length));
            string565.getClass();
            return string565;
        }
        if (g2.d(str, x0.Ea)) {
            String string566 = context.getString(R.string.multi_day_activities_new_activities, Arrays.copyOf(objArr, objArr.length));
            string566.getClass();
            return string566;
        }
        if (g2.d(str, x0.Fa)) {
            String string567 = context.getString(R.string.multi_day_activities_new_activities_message, Arrays.copyOf(objArr, objArr.length));
            string567.getClass();
            return string567;
        }
        if (g2.d(str, x0.Ga)) {
            String string568 = context.getString(R.string.multi_day_activities_no_activities_message, Arrays.copyOf(objArr, objArr.length));
            string568.getClass();
            return string568;
        }
        if (g2.d(str, x0.Ha)) {
            String string569 = context.getString(R.string.multi_day_activities_no_activities_to_add, Arrays.copyOf(objArr, objArr.length));
            string569.getClass();
            return string569;
        }
        if (g2.d(str, x0.Ia)) {
            String string570 = context.getString(R.string.multi_day_activities_no_activities_to_add_message, Arrays.copyOf(objArr, objArr.length));
            string570.getClass();
            return string570;
        }
        if (g2.d(str, x0.Ja)) {
            String string571 = context.getString(R.string.multi_day_activities_no_activity_data_available, Arrays.copyOf(objArr, objArr.length));
            string571.getClass();
            return string571;
        }
        if (g2.d(str, x0.Ka)) {
            String string572 = context.getString(R.string.multi_day_activities_no_health_data, Arrays.copyOf(objArr, objArr.length));
            string572.getClass();
            return string572;
        }
        if (g2.d(str, x0.La)) {
            String string573 = context.getString(R.string.multi_day_activities_only_me, Arrays.copyOf(objArr, objArr.length));
            string573.getClass();
            return string573;
        }
        if (g2.d(str, x0.Ma)) {
            String string574 = context.getString(R.string.multi_day_activities_optional_course_message, Arrays.copyOf(objArr, objArr.length));
            string574.getClass();
            return string574;
        }
        if (g2.d(str, x0.Na)) {
            String string575 = context.getString(R.string.multi_day_activities_privacy_change_message, Arrays.copyOf(objArr, objArr.length));
            string575.getClass();
            return string575;
        }
        if (g2.d(str, x0.Oa)) {
            String string576 = context.getString(R.string.multi_day_activities_privacy_change_title, Arrays.copyOf(objArr, objArr.length));
            string576.getClass();
            return string576;
        }
        if (g2.d(str, x0.Pa)) {
            String string577 = context.getString(R.string.multi_day_activities_remove_activity, Arrays.copyOf(objArr, objArr.length));
            string577.getClass();
            return string577;
        }
        if (g2.d(str, x0.Qa)) {
            String string578 = context.getString(R.string.multi_day_activities_remove_activity_message, Arrays.copyOf(objArr, objArr.length));
            string578.getClass();
            return string578;
        }
        if (g2.d(str, x0.Ra)) {
            String string579 = context.getString(R.string.multi_day_activities_reports_only_visible_to_you, Arrays.copyOf(objArr, objArr.length));
            string579.getClass();
            return string579;
        }
        if (g2.d(str, x0.Sa)) {
            String string580 = context.getString(R.string.multi_day_activities_reports_settings, Arrays.copyOf(objArr, objArr.length));
            string580.getClass();
            return string580;
        }
        if (g2.d(str, x0.Ta)) {
            String string581 = context.getString(R.string.multi_day_activities_reports_settings_header, Arrays.copyOf(objArr, objArr.length));
            string581.getClass();
            return string581;
        }
        if (g2.d(str, x0.Ua)) {
            String string582 = context.getString(R.string.multi_day_activities_select_a_course, Arrays.copyOf(objArr, objArr.length));
            string582.getClass();
            return string582;
        }
        if (g2.d(str, x0.Va)) {
            String string583 = context.getString(R.string.multi_day_activities_select_end_date, Arrays.copyOf(objArr, objArr.length));
            string583.getClass();
            return string583;
        }
        if (g2.d(str, x0.Wa)) {
            String string584 = context.getString(R.string.multi_day_activities_select_name, Arrays.copyOf(objArr, objArr.length));
            string584.getClass();
            return string584;
        }
        if (g2.d(str, x0.Xa)) {
            String string585 = context.getString(R.string.multi_day_activities_select_start_date, Arrays.copyOf(objArr, objArr.length));
            string585.getClass();
            return string585;
        }
        if (g2.d(str, x0.Ya)) {
            String string586 = context.getString(R.string.multi_day_activities_set_date, Arrays.copyOf(objArr, objArr.length));
            string586.getClass();
            return string586;
        }
        if (g2.d(str, x0.Za)) {
            String string587 = context.getString(R.string.multi_day_activities_share_message, Arrays.copyOf(objArr, objArr.length));
            string587.getClass();
            return string587;
        }
        if (g2.d(str, x0.ab)) {
            String string588 = context.getString(R.string.multi_day_activities_time_dhm, Arrays.copyOf(objArr, objArr.length));
            string588.getClass();
            return string588;
        }
        if (g2.d(str, x0.bb)) {
            String string589 = context.getString(R.string.multi_day_activities_total_active_time, Arrays.copyOf(objArr, objArr.length));
            string589.getClass();
            return string589;
        }
        if (g2.d(str, x0.cb)) {
            String string590 = context.getString(R.string.multi_day_activities_total_activity_time, Arrays.copyOf(objArr, objArr.length));
            string590.getClass();
            return string590;
        }
        if (g2.d(str, x0.db)) {
            String string591 = context.getString(R.string.multi_day_activities_total_days, Arrays.copyOf(objArr, objArr.length));
            string591.getClass();
            return string591;
        }
        if (g2.d(str, x0.eb)) {
            String string592 = context.getString(R.string.multi_day_activities_turn_on_livetrack, Arrays.copyOf(objArr, objArr.length));
            string592.getClass();
            return string592;
        }
        if (g2.d(str, x0.fb)) {
            String string593 = context.getString(R.string.multi_day_activities_turn_on_livetrack_message, Arrays.copyOf(objArr, objArr.length));
            string593.getClass();
            return string593;
        }
        if (g2.d(str, x0.gb)) {
            String string594 = context.getString(R.string.multi_day_activities_unavailable_dates, Arrays.copyOf(objArr, objArr.length));
            string594.getClass();
            return string594;
        }
        if (g2.d(str, x0.hb)) {
            String string595 = context.getString(R.string.multi_day_activities_unavailable_dates_message, Arrays.copyOf(objArr, objArr.length));
            string595.getClass();
            return string595;
        }
        if (g2.d(str, x0.ib)) {
            String string596 = context.getString(R.string.multi_day_activities_unavailable_header_course_message, Arrays.copyOf(objArr, objArr.length));
            string596.getClass();
            return string596;
        }
        if (g2.d(str, x0.jb)) {
            String string597 = context.getString(R.string.multi_day_activities_until_epic_begins, Arrays.copyOf(objArr, objArr.length));
            string597.getClass();
            return string597;
        }
        if (g2.d(str, x0.kb)) {
            String string598 = context.getString(R.string.multi_day_activities_upcoming_epics, Arrays.copyOf(objArr, objArr.length));
            string598.getClass();
            return string598;
        }
        if (g2.d(str, x0.lb)) {
            String string599 = context.getString(R.string.multi_day_activities_updating_snackbar, Arrays.copyOf(objArr, objArr.length));
            string599.getClass();
            return string599;
        }
        if (g2.d(str, x0.mb)) {
            String string600 = context.getString(R.string.multi_day_activities_view_all_epics, Arrays.copyOf(objArr, objArr.length));
            string600.getClass();
            return string600;
        }
        if (g2.d(str, x0.Z8)) {
            String string601 = context.getString(R.string.lbl_aero_time, Arrays.copyOf(objArr, objArr.length));
            string601.getClass();
            return string601;
        }
        if (g2.d(str, x0.a9)) {
            String string602 = context.getString(R.string.lbl_avg_aero_power, Arrays.copyOf(objArr, objArr.length));
            string602.getClass();
            return string602;
        }
        if (g2.d(str, x0.b9)) {
            String string603 = context.getString(R.string.lbl_avg_aero_torso_angle, Arrays.copyOf(objArr, objArr.length));
            string603.getClass();
            return string603;
        }
        if (g2.d(str, x0.c9)) {
            String string604 = context.getString(R.string.lbl_avg_lowered_power, Arrays.copyOf(objArr, objArr.length));
            string604.getClass();
            return string604;
        }
        if (g2.d(str, x0.d9)) {
            String string605 = context.getString(R.string.lbl_avg_lowered_torso_angle, Arrays.copyOf(objArr, objArr.length));
            string605.getClass();
            return string605;
        }
        if (g2.d(str, x0.e9)) {
            String string606 = context.getString(R.string.lbl_avg_standing_torso_angle, Arrays.copyOf(objArr, objArr.length));
            string606.getClass();
            return string606;
        }
        if (g2.d(str, x0.f9)) {
            String string607 = context.getString(R.string.lbl_avg_torso_angle, Arrays.copyOf(objArr, objArr.length));
            string607.getClass();
            return string607;
        }
        if (g2.d(str, x0.g9)) {
            String string608 = context.getString(R.string.lbl_avg_upright_power, Arrays.copyOf(objArr, objArr.length));
            string608.getClass();
            return string608;
        }
        if (g2.d(str, x0.h9)) {
            String string609 = context.getString(R.string.lbl_avg_upright_torso_angle, Arrays.copyOf(objArr, objArr.length));
            string609.getClass();
            return string609;
        }
        if (g2.d(str, x0.i9)) {
            String string610 = context.getString(R.string.lbl_cycling_dynamics_torso_angle, Arrays.copyOf(objArr, objArr.length));
            string610.getClass();
            return string610;
        }
        if (g2.d(str, x0.j9)) {
            String string611 = context.getString(R.string.lbl_lowered_time, Arrays.copyOf(objArr, objArr.length));
            string611.getClass();
            return string611;
        }
        if (g2.d(str, x0.k9)) {
            String string612 = context.getString(R.string.lbl_max_aero_power, Arrays.copyOf(objArr, objArr.length));
            string612.getClass();
            return string612;
        }
        if (g2.d(str, x0.l9)) {
            String string613 = context.getString(R.string.lbl_max_lowered_power, Arrays.copyOf(objArr, objArr.length));
            string613.getClass();
            return string613;
        }
        if (g2.d(str, x0.m9)) {
            String string614 = context.getString(R.string.lbl_max_upright_power, Arrays.copyOf(objArr, objArr.length));
            string614.getClass();
            return string614;
        }
        if (g2.d(str, x0.n9)) {
            String string615 = context.getString(R.string.lbl_torso_angle, Arrays.copyOf(objArr, objArr.length));
            string615.getClass();
            return string615;
        }
        if (g2.d(str, x0.o9)) {
            String string616 = context.getString(R.string.lbl_torso_angle_ranges, Arrays.copyOf(objArr, objArr.length));
            string616.getClass();
            return string616;
        }
        if (g2.d(str, x0.p9)) {
            String string617 = context.getString(R.string.lbl_torso_angle_thresholds, Arrays.copyOf(objArr, objArr.length));
            string617.getClass();
            return string617;
        }
        if (g2.d(str, x0.q9)) {
            String string618 = context.getString(R.string.lbl_total_aero_time, Arrays.copyOf(objArr, objArr.length));
            string618.getClass();
            return string618;
        }
        if (g2.d(str, x0.r9)) {
            String string619 = context.getString(R.string.lbl_total_lowered_time, Arrays.copyOf(objArr, objArr.length));
            string619.getClass();
            return string619;
        }
        if (g2.d(str, x0.s9)) {
            String string620 = context.getString(R.string.lbl_total_upright_time, Arrays.copyOf(objArr, objArr.length));
            string620.getClass();
            return string620;
        }
        if (g2.d(str, x0.t9)) {
            String string621 = context.getString(R.string.lbl_upright_time, Arrays.copyOf(objArr, objArr.length));
            string621.getClass();
            return string621;
        }
        if (g2.d(str, x0.u9)) {
            String string622 = context.getString(R.string.lbl_using_torso_angle, Arrays.copyOf(objArr, objArr.length));
            string622.getClass();
            return string622;
        }
        if (g2.d(str, x0.v9)) {
            String string623 = context.getString(R.string.msg_cycling_position_aero_lowered, Arrays.copyOf(objArr, objArr.length));
            string623.getClass();
            return string623;
        }
        if (g2.d(str, x0.w9)) {
            String string624 = context.getString(R.string.msg_cycling_position_hrm_measured, Arrays.copyOf(objArr, objArr.length));
            string624.getClass();
            return string624;
        }
        if (g2.d(str, x0.x9)) {
            String string625 = context.getString(R.string.msg_cycling_position_with_aero_bars, Arrays.copyOf(objArr, objArr.length));
            string625.getClass();
            return string625;
        }
        if (g2.d(str, x0.y9)) {
            String string626 = context.getString(R.string.msg_cycling_position_without_aero_bars, Arrays.copyOf(objArr, objArr.length));
            string626.getClass();
            return string626;
        }
        if (g2.d(str, x0.z9)) {
            String string627 = context.getString(R.string.msg_lower_torso_angle_note, Arrays.copyOf(objArr, objArr.length));
            string627.getClass();
            return string627;
        }
        if (g2.d(str, x0.A9)) {
            String string628 = context.getString(R.string.msg_time_in_position_chart, Arrays.copyOf(objArr, objArr.length));
            string628.getClass();
            return string628;
        }
        if (g2.d(str, x0.B9)) {
            String string629 = context.getString(R.string.msg_time_spent_aero_lowered, Arrays.copyOf(objArr, objArr.length));
            string629.getClass();
            return string629;
        }
        if (g2.d(str, x0.C9)) {
            String string630 = context.getString(R.string.msg_torso_angle_by_tracking, Arrays.copyOf(objArr, objArr.length));
            string630.getClass();
            return string630;
        }
        if (g2.d(str, x0.D9)) {
            String string631 = context.getString(R.string.msg_torso_angle_description, Arrays.copyOf(objArr, objArr.length));
            string631.getClass();
            return string631;
        }
        if (g2.d(str, x0.E9)) {
            String string632 = context.getString(R.string.msg_torso_angle_measurement, Arrays.copyOf(objArr, objArr.length));
            string632.getClass();
            return string632;
        }
        if (g2.d(str, x0.F9)) {
            String string633 = context.getString(R.string.msg_torso_angle_ranges, Arrays.copyOf(objArr, objArr.length));
            string633.getClass();
            return string633;
        }
        if (g2.d(str, x0.G9)) {
            String string634 = context.getString(R.string.msg_torso_angle_variations, Arrays.copyOf(objArr, objArr.length));
            string634.getClass();
            return string634;
        }
        if (g2.d(str, x0.od)) {
            String string635 = context.getString(R.string.lbl_exclude_from_physio_metrics, Arrays.copyOf(objArr, objArr.length));
            string635.getClass();
            return string635;
        }
        if (g2.d(str, x0.pd)) {
            String string636 = context.getString(R.string.lbl_excluded_from_physio_metrics, Arrays.copyOf(objArr, objArr.length));
            string636.getClass();
            return string636;
        }
        if (g2.d(str, x0.qd)) {
            String string637 = context.getString(R.string.msg_exclude_from_physio_metrics, Arrays.copyOf(objArr, objArr.length));
            string637.getClass();
            return string637;
        }
        if (g2.d(str, x0.rd)) {
            String string638 = context.getString(R.string.msg_trim_activity_changes, Arrays.copyOf(objArr, objArr.length));
            string638.getClass();
            return string638;
        }
        if (g2.d(str, x0.X8)) {
            String string639 = context.getString(R.string.lbl_synced_gym_equipment, Arrays.copyOf(objArr, objArr.length));
            string639.getClass();
            return string639;
        }
        if (g2.d(str, x0.Y8)) {
            String string640 = context.getString(R.string.msg_synced_gym_equipment, Arrays.copyOf(objArr, objArr.length));
            string640.getClass();
            return string640;
        }
        if (g2.d(str, x0.sd)) {
            String string641 = context.getString(R.string.added_sugar_abbreviation, Arrays.copyOf(objArr, objArr.length));
            string641.getClass();
            return string641;
        }
        if (g2.d(str, x0.td)) {
            String string642 = context.getString(R.string.calcium_abbreviation, Arrays.copyOf(objArr, objArr.length));
            string642.getClass();
            return string642;
        }
        if (g2.d(str, x0.ud)) {
            String string643 = context.getString(R.string.custom_meal_1, Arrays.copyOf(objArr, objArr.length));
            string643.getClass();
            return string643;
        }
        if (g2.d(str, x0.vd)) {
            String string644 = context.getString(R.string.custom_meal_2, Arrays.copyOf(objArr, objArr.length));
            string644.getClass();
            return string644;
        }
        if (g2.d(str, x0.wd)) {
            String string645 = context.getString(R.string.custom_meal_3, Arrays.copyOf(objArr, objArr.length));
            string645.getClass();
            return string645;
        }
        if (g2.d(str, x0.xd)) {
            String string646 = context.getString(R.string.describe_your_meal, Arrays.copyOf(objArr, objArr.length));
            string646.getClass();
            return string646;
        }
        if (g2.d(str, x0.yd)) {
            String string647 = context.getString(R.string.description_length_limit_reached_message, Arrays.copyOf(objArr, objArr.length));
            string647.getClass();
            return string647;
        }
        if (g2.d(str, x0.zd)) {
            String string648 = context.getString(R.string.lbl_add_ingredients, Arrays.copyOf(objArr, objArr.length));
            string648.getClass();
            return string648;
        }
        if (g2.d(str, x0.Ad)) {
            String string649 = context.getString(R.string.lbl_add_remove, Arrays.copyOf(objArr, objArr.length));
            string649.getClass();
            return string649;
        }
        if (g2.d(str, x0.Bd)) {
            String string650 = context.getString(R.string.lbl_added_sugar_surplus, Arrays.copyOf(objArr, objArr.length));
            string650.getClass();
            return string650;
        }
        if (g2.d(str, x0.Cd)) {
            String string651 = context.getString(R.string.lbl_adjust_meal_times, Arrays.copyOf(objArr, objArr.length));
            string651.getClass();
            return string651;
        }
        if (g2.d(str, x0.Dd)) {
            String string652 = context.getString(R.string.lbl_avg_daily_macros, Arrays.copyOf(objArr, objArr.length));
            string652.getClass();
            return string652;
        }
        if (g2.d(str, x0.Ed)) {
            String string653 = context.getString(R.string.lbl_avg_daily_nutrients, Arrays.copyOf(objArr, objArr.length));
            string653.getClass();
            return string653;
        }
        if (g2.d(str, x0.Fd)) {
            String string654 = context.getString(R.string.lbl_avg_daily_other, Arrays.copyOf(objArr, objArr.length));
            string654.getClass();
            return string654;
        }
        if (g2.d(str, x0.Gd)) {
            String string655 = context.getString(R.string.lbl_avg_surplus, Arrays.copyOf(objArr, objArr.length));
            string655.getClass();
            return string655;
        }
        if (g2.d(str, x0.Hd)) {
            String string656 = context.getString(R.string.lbl_calcium_surplus, Arrays.copyOf(objArr, objArr.length));
            string656.getClass();
            return string656;
        }
        if (g2.d(str, x0.Id)) {
            String string657 = context.getString(R.string.lbl_create_a_recipe, Arrays.copyOf(objArr, objArr.length));
            string657.getClass();
            return string657;
        }
        if (g2.d(str, x0.Jd)) {
            String string658 = context.getString(R.string.lbl_create_recipe, Arrays.copyOf(objArr, objArr.length));
            string658.getClass();
            return string658;
        }
        if (g2.d(str, x0.Kd)) {
            String string659 = context.getString(R.string.lbl_create_recipes, Arrays.copyOf(objArr, objArr.length));
            string659.getClass();
            return string659;
        }
        if (g2.d(str, x0.Ld)) {
            String string660 = context.getString(R.string.lbl_daily_macros, Arrays.copyOf(objArr, objArr.length));
            string660.getClass();
            return string660;
        }
        if (g2.d(str, x0.Md)) {
            String string661 = context.getString(R.string.lbl_daily_meals, Arrays.copyOf(objArr, objArr.length));
            string661.getClass();
            return string661;
        }
        if (g2.d(str, x0.Nd)) {
            String string662 = context.getString(R.string.lbl_daily_nutrients, Arrays.copyOf(objArr, objArr.length));
            string662.getClass();
            return string662;
        }
        if (g2.d(str, x0.Od)) {
            String string663 = context.getString(R.string.lbl_daily_type_view, Arrays.copyOf(objArr, objArr.length));
            string663.getClass();
            return string663;
        }
        if (g2.d(str, x0.Pd)) {
            String string664 = context.getString(R.string.lbl_daily_view, Arrays.copyOf(objArr, objArr.length));
            string664.getClass();
            return string664;
        }
        if (g2.d(str, x0.Qd)) {
            String string665 = context.getString(R.string.lbl_delete_recipe, Arrays.copyOf(objArr, objArr.length));
            string665.getClass();
            return string665;
        }
        if (g2.d(str, x0.Rd)) {
            String string666 = context.getString(R.string.lbl_delete_recipe_alert_title, Arrays.copyOf(objArr, objArr.length));
            string666.getClass();
            return string666;
        }
        if (g2.d(str, x0.Sd)) {
            String string667 = context.getString(R.string.lbl_disable_other_nutrients_tracking, Arrays.copyOf(objArr, objArr.length));
            string667.getClass();
            return string667;
        }
        if (g2.d(str, x0.Td)) {
            String string668 = context.getString(R.string.lbl_edit_list, Arrays.copyOf(objArr, objArr.length));
            string668.getClass();
            return string668;
        }
        if (g2.d(str, x0.Ud)) {
            String string669 = context.getString(R.string.lbl_edit_other_nutrients, Arrays.copyOf(objArr, objArr.length));
            string669.getClass();
            return string669;
        }
        if (g2.d(str, x0.Vd)) {
            String string670 = context.getString(R.string.lbl_edit_recipe, Arrays.copyOf(objArr, objArr.length));
            string670.getClass();
            return string670;
        }
        if (g2.d(str, x0.Wd)) {
            String string671 = context.getString(R.string.lbl_enable_other_nutrient_tracking, Arrays.copyOf(objArr, objArr.length));
            string671.getClass();
            return string671;
        }
        if (g2.d(str, x0.Xd)) {
            String string672 = context.getString(R.string.lbl_enter_end_time, Arrays.copyOf(objArr, objArr.length));
            string672.getClass();
            return string672;
        }
        if (g2.d(str, x0.Yd)) {
            String string673 = context.getString(R.string.lbl_enter_start_time, Arrays.copyOf(objArr, objArr.length));
            string673.getClass();
            return string673;
        }
        if (g2.d(str, x0.Zd)) {
            String string674 = context.getString(R.string.lbl_fiber_surplus, Arrays.copyOf(objArr, objArr.length));
            string674.getClass();
            return string674;
        }
        if (g2.d(str, x0.ae)) {
            String string675 = context.getString(R.string.lbl_image_upload_failes, Arrays.copyOf(objArr, objArr.length));
            string675.getClass();
            return string675;
        }
        if (g2.d(str, x0.be)) {
            String string676 = context.getString(R.string.lbl_ingredient_limit_reached, Arrays.copyOf(objArr, objArr.length));
            string676.getClass();
            return string676;
        }
        if (g2.d(str, x0.ce)) {
            String string677 = context.getString(R.string.lbl_ingredients, Arrays.copyOf(objArr, objArr.length));
            string677.getClass();
            return string677;
        }
        if (g2.d(str, x0.de)) {
            String string678 = context.getString(R.string.lbl_iron_surplus, Arrays.copyOf(objArr, objArr.length));
            string678.getClass();
            return string678;
        }
        if (g2.d(str, x0.ee)) {
            String string679 = context.getString(R.string.lbl_log_by_voice, Arrays.copyOf(objArr, objArr.length));
            string679.getClass();
            return string679;
        }
        if (g2.d(str, x0.fe)) {
            String string680 = context.getString(R.string.lbl_log_to, Arrays.copyOf(objArr, objArr.length));
            string680.getClass();
            return string680;
        }
        if (g2.d(str, x0.ge)) {
            String string681 = context.getString(R.string.lbl_macronutrient_goals, Arrays.copyOf(objArr, objArr.length));
            string681.getClass();
            return string681;
        }
        if (g2.d(str, x0.he)) {
            String string682 = context.getString(R.string.lbl_macros, Arrays.copyOf(objArr, objArr.length));
            string682.getClass();
            return string682;
        }
        if (g2.d(str, x0.ie)) {
            String string683 = context.getString(R.string.lbl_meal_required, Arrays.copyOf(objArr, objArr.length));
            string683.getClass();
            return string683;
        }
        if (g2.d(str, x0.je)) {
            String string684 = context.getString(R.string.lbl_meal_settings, Arrays.copyOf(objArr, objArr.length));
            string684.getClass();
            return string684;
        }
        if (g2.d(str, x0.ke)) {
            String string685 = context.getString(R.string.lbl_meal_windows_count, Arrays.copyOf(objArr, objArr.length));
            string685.getClass();
            return string685;
        }
        if (g2.d(str, x0.le)) {
            String string686 = context.getString(R.string.lbl_meal_your_way, Arrays.copyOf(objArr, objArr.length));
            string686.getClass();
            return string686;
        }
        if (g2.d(str, x0.me)) {
            String string687 = context.getString(R.string.lbl_meals, Arrays.copyOf(objArr, objArr.length));
            string687.getClass();
            return string687;
        }
        if (g2.d(str, x0.ne)) {
            String string688 = context.getString(R.string.lbl_meals_view, Arrays.copyOf(objArr, objArr.length));
            string688.getClass();
            return string688;
        }
        if (g2.d(str, x0.oe)) {
            String string689 = context.getString(R.string.lbl_meals_view_description, Arrays.copyOf(objArr, objArr.length));
            string689.getClass();
            return string689;
        }
        if (g2.d(str, x0.pe)) {
            String string690 = context.getString(R.string.lbl_micronutrients, Arrays.copyOf(objArr, objArr.length));
            string690.getClass();
            return string690;
        }
        if (g2.d(str, x0.qe)) {
            String string691 = context.getString(R.string.lbl_more_nutrient_tracking, Arrays.copyOf(objArr, objArr.length));
            string691.getClass();
            return string691;
        }
        if (g2.d(str, x0.re)) {
            String string692 = context.getString(R.string.lbl_my_recipes, Arrays.copyOf(objArr, objArr.length));
            string692.getClass();
            return string692;
        }
        if (g2.d(str, x0.se)) {
            String string693 = context.getString(R.string.lbl_non_editable_meal_description, Arrays.copyOf(objArr, objArr.length));
            string693.getClass();
            return string693;
        }
        if (g2.d(str, x0.te)) {
            String string694 = context.getString(R.string.lbl_notes, Arrays.copyOf(objArr, objArr.length));
            string694.getClass();
            return string694;
        }
        if (g2.d(str, x0.ue)) {
            String string695 = context.getString(R.string.lbl_nutrient_surplus, Arrays.copyOf(objArr, objArr.length));
            string695.getClass();
            return string695;
        }
        if (g2.d(str, x0.ve)) {
            String string696 = context.getString(R.string.lbl_nutrients, Arrays.copyOf(objArr, objArr.length));
            string696.getClass();
            return string696;
        }
        if (g2.d(str, x0.we)) {
            String string697 = context.getString(R.string.lbl_nutrients_min_required, Arrays.copyOf(objArr, objArr.length));
            string697.getClass();
            return string697;
        }
        if (g2.d(str, x0.xe)) {
            String string698 = context.getString(R.string.lbl_other_nutrient_goals, Arrays.copyOf(objArr, objArr.length));
            string698.getClass();
            return string698;
        }
        if (g2.d(str, x0.ye)) {
            String string699 = context.getString(R.string.lbl_other_nutrients, Arrays.copyOf(objArr, objArr.length));
            string699.getClass();
            return string699;
        }
        if (g2.d(str, x0.ze)) {
            String string700 = context.getString(R.string.lbl_recipe_details, Arrays.copyOf(objArr, objArr.length));
            string700.getClass();
            return string700;
        }
        if (g2.d(str, x0.Ae)) {
            String string701 = context.getString(R.string.lbl_recipe_name, Arrays.copyOf(objArr, objArr.length));
            string701.getClass();
            return string701;
        }
        if (g2.d(str, x0.Be)) {
            String string702 = context.getString(R.string.lbl_recipes, Arrays.copyOf(objArr, objArr.length));
            string702.getClass();
            return string702;
        }
        if (g2.d(str, x0.Ce)) {
            String string703 = context.getString(R.string.lbl_remove_recipe, Arrays.copyOf(objArr, objArr.length));
            string703.getClass();
            return string703;
        }
        if (g2.d(str, x0.De)) {
            String string704 = context.getString(R.string.lbl_review, Arrays.copyOf(objArr, objArr.length));
            string704.getClass();
            return string704;
        }
        if (g2.d(str, x0.Ee)) {
            String string705 = context.getString(R.string.lbl_review_your_meal_settings, Arrays.copyOf(objArr, objArr.length));
            string705.getClass();
            return string705;
        }
        if (g2.d(str, x0.Fe)) {
            String string706 = context.getString(R.string.lbl_saturated_fat_surplus, Arrays.copyOf(objArr, objArr.length));
            string706.getClass();
            return string706;
        }
        if (g2.d(str, x0.Ge)) {
            String string707 = context.getString(R.string.lbl_saved_to_my_recipes, Arrays.copyOf(objArr, objArr.length));
            string707.getClass();
            return string707;
        }
        if (g2.d(str, x0.He)) {
            String string708 = context.getString(R.string.lbl_select_a_meal, Arrays.copyOf(objArr, objArr.length));
            string708.getClass();
            return string708;
        }
        if (g2.d(str, x0.Ie)) {
            String string709 = context.getString(R.string.lbl_select_items_to_add_to_recipe, Arrays.copyOf(objArr, objArr.length));
            string709.getClass();
            return string709;
        }
        if (g2.d(str, x0.Je)) {
            String string710 = context.getString(R.string.lbl_select_meals_to_show_hide, Arrays.copyOf(objArr, objArr.length));
            string710.getClass();
            return string710;
        }
        if (g2.d(str, x0.Ke)) {
            String string711 = context.getString(R.string.lbl_set_start_and_end_time, Arrays.copyOf(objArr, objArr.length));
            string711.getClass();
            return string711;
        }
        if (g2.d(str, x0.Le)) {
            String string712 = context.getString(R.string.lbl_set_your_other_nutrient_goals, Arrays.copyOf(objArr, objArr.length));
            string712.getClass();
            return string712;
        }
        if (g2.d(str, x0.Me)) {
            String string713 = context.getString(R.string.lbl_single_serving, Arrays.copyOf(objArr, objArr.length));
            string713.getClass();
            return string713;
        }
        if (g2.d(str, x0.Ne)) {
            String string714 = context.getString(R.string.lbl_surplus, Arrays.copyOf(objArr, objArr.length));
            string714.getClass();
            return string714;
        }
        if (g2.d(str, x0.Oe)) {
            String string715 = context.getString(R.string.lbl_timeline, Arrays.copyOf(objArr, objArr.length));
            string715.getClass();
            return string715;
        }
        if (g2.d(str, x0.Pe)) {
            String string716 = context.getString(R.string.lbl_timeline_view, Arrays.copyOf(objArr, objArr.length));
            string716.getClass();
            return string716;
        }
        if (g2.d(str, x0.Qe)) {
            String string717 = context.getString(R.string.lbl_timeline_view_description, Arrays.copyOf(objArr, objArr.length));
            string717.getClass();
            return string717;
        }
        if (g2.d(str, x0.Re)) {
            String string718 = context.getString(R.string.lbl_tracking_disabled, Arrays.copyOf(objArr, objArr.length));
            string718.getClass();
            return string718;
        }
        if (g2.d(str, x0.Se)) {
            String string719 = context.getString(R.string.lbl_vitamin_a_surplus, Arrays.copyOf(objArr, objArr.length));
            string719.getClass();
            return string719;
        }
        if (g2.d(str, x0.Te)) {
            String string720 = context.getString(R.string.lbl_vitamin_d_surplus, Arrays.copyOf(objArr, objArr.length));
            string720.getClass();
            return string720;
        }
        if (g2.d(str, x0.Ue)) {
            String string721 = context.getString(R.string.listening, Arrays.copyOf(objArr, objArr.length));
            string721.getClass();
            return string721;
        }
        if (g2.d(str, x0.Ve)) {
            String string722 = context.getString(R.string.mgs_enter_a_meal_name, Arrays.copyOf(objArr, objArr.length));
            string722.getClass();
            return string722;
        }
        if (g2.d(str, x0.We)) {
            String string723 = context.getString(R.string.mgs_your_recipe_was_created_but_image_could_not_upload, Arrays.copyOf(objArr, objArr.length));
            string723.getClass();
            return string723;
        }
        if (g2.d(str, x0.Xe)) {
            String string724 = context.getString(R.string.micronutrients_description, Arrays.copyOf(objArr, objArr.length));
            string724.getClass();
            return string724;
        }
        if (g2.d(str, x0.Ye)) {
            String string725 = context.getString(R.string.microphone_access_needed_message, Arrays.copyOf(objArr, objArr.length));
            string725.getClass();
            return string725;
        }
        if (g2.d(str, x0.Ze)) {
            String string726 = context.getString(R.string.microphone_access_needed_title, Arrays.copyOf(objArr, objArr.length));
            string726.getClass();
            return string726;
        }
        if (g2.d(str, x0.af)) {
            String string727 = context.getString(R.string.more_ways_to_make_nutrition_yours, Arrays.copyOf(objArr, objArr.length));
            string727.getClass();
            return string727;
        }
        if (g2.d(str, x0.bf)) {
            String string728 = context.getString(R.string.msg_at_least_one_food_required, Arrays.copyOf(objArr, objArr.length));
            string728.getClass();
            return string728;
        }
        if (g2.d(str, x0.cf)) {
            String string729 = context.getString(R.string.msg_at_least_one_serving_required, Arrays.copyOf(objArr, objArr.length));
            string729.getClass();
            return string729;
        }
        if (g2.d(str, x0.df)) {
            String string730 = context.getString(R.string.msg_choose_a_date_and_meal_to_copy_these_foods, Arrays.copyOf(objArr, objArr.length));
            string730.getClass();
            return string730;
        }
        if (g2.d(str, x0.ef)) {
            String string731 = context.getString(R.string.msg_choose_a_date_and_meal_to_copy_this_food, Arrays.copyOf(objArr, objArr.length));
            string731.getClass();
            return string731;
        }
        if (g2.d(str, x0.ff)) {
            String string732 = context.getString(R.string.msg_choose_a_date_and_meal_to_move_these_foods, Arrays.copyOf(objArr, objArr.length));
            string732.getClass();
            return string732;
        }
        if (g2.d(str, x0.gf)) {
            String string733 = context.getString(R.string.msg_choose_a_date_and_meal_to_move_this_food, Arrays.copyOf(objArr, objArr.length));
            string733.getClass();
            return string733;
        }
        if (g2.d(str, x0.hf)) {
            String string734 = context.getString(R.string.msg_choose_a_date_and_time_to_copy_these_foods, Arrays.copyOf(objArr, objArr.length));
            string734.getClass();
            return string734;
        }
        if (g2.d(str, x0.jf)) {
            String string735 = context.getString(R.string.msg_choose_a_date_and_time_to_copy_this_food, Arrays.copyOf(objArr, objArr.length));
            string735.getClass();
            return string735;
        }
        if (g2.d(str, x0.kf)) {
            String string736 = context.getString(R.string.msg_choose_a_date_and_time_to_move_these_foods, Arrays.copyOf(objArr, objArr.length));
            string736.getClass();
            return string736;
        }
        if (g2.d(str, x0.lf)) {
            String string737 = context.getString(R.string.msg_choose_a_date_and_time_to_move_this_food, Arrays.copyOf(objArr, objArr.length));
            string737.getClass();
            return string737;
        }
        if (g2.d(str, x0.mf)) {
            String string738 = context.getString(R.string.msg_combine_ingredients, Arrays.copyOf(objArr, objArr.length));
            string738.getClass();
            return string738;
        }
        if (g2.d(str, x0.nf)) {
            String string739 = context.getString(R.string.msg_copy_uncategorized_warning, Arrays.copyOf(objArr, objArr.length));
            string739.getClass();
            return string739;
        }
        if (g2.d(str, x0.of)) {
            String string740 = context.getString(R.string.msg_create_a_recipe, Arrays.copyOf(objArr, objArr.length));
            string740.getClass();
            return string740;
        }
        if (g2.d(str, x0.pf)) {
            String string741 = context.getString(R.string.msg_customize_meals, Arrays.copyOf(objArr, objArr.length));
            string741.getClass();
            return string741;
        }
        if (g2.d(str, x0.qf)) {
            String string742 = context.getString(R.string.msg_delete_recipe_alert, Arrays.copyOf(objArr, objArr.length));
            string742.getClass();
            return string742;
        }
        if (g2.d(str, x0.rf)) {
            String string743 = context.getString(R.string.msg_disable_other_nutrients_tracking, Arrays.copyOf(objArr, objArr.length));
            string743.getClass();
            return string743;
        }
        if (g2.d(str, x0.sf)) {
            String string744 = context.getString(R.string.msg_food_added_to_recipe, Arrays.copyOf(objArr, objArr.length));
            string744.getClass();
            return string744;
        }
        if (g2.d(str, x0.tf)) {
            String string745 = context.getString(R.string.msg_food_added_to_results, Arrays.copyOf(objArr, objArr.length));
            string745.getClass();
            return string745;
        }
        if (g2.d(str, x0.uf)) {
            String string746 = context.getString(R.string.msg_go_beyond_macros, Arrays.copyOf(objArr, objArr.length));
            string746.getClass();
            return string746;
        }
        if (g2.d(str, x0.vf)) {
            String string747 = context.getString(R.string.msg_ingredient_updated, Arrays.copyOf(objArr, objArr.length));
            string747.getClass();
            return string747;
        }
        if (g2.d(str, x0.wf)) {
            String string748 = context.getString(R.string.msg_invalid_meal_name, Arrays.copyOf(objArr, objArr.length));
            string748.getClass();
            return string748;
        }
        if (g2.d(str, x0.xf)) {
            String string749 = context.getString(R.string.msg_maximum_number_of_foods_reached, Arrays.copyOf(objArr, objArr.length));
            string749.getClass();
            return string749;
        }
        if (g2.d(str, x0.yf)) {
            String string750 = context.getString(R.string.msg_maximum_number_of_foods_reached_reduce, Arrays.copyOf(objArr, objArr.length));
            string750.getClass();
            return string750;
        }
        if (g2.d(str, x0.zf)) {
            String string751 = context.getString(R.string.msg_meal_goals_updated, Arrays.copyOf(objArr, objArr.length));
            string751.getClass();
            return string751;
        }
        if (g2.d(str, x0.Af)) {
            String string752 = context.getString(R.string.msg_meal_name_already_in_use, Arrays.copyOf(objArr, objArr.length));
            string752.getClass();
            return string752;
        }
        if (g2.d(str, x0.Bf)) {
            String string753 = context.getString(R.string.msg_move_uncategorized_warning, Arrays.copyOf(objArr, objArr.length));
            string753.getClass();
            return string753;
        }
        if (g2.d(str, x0.Cf)) {
            String string754 = context.getString(R.string.msg_no_food_found_recipe, Arrays.copyOf(objArr, objArr.length));
            string754.getClass();
            return string754;
        }
        if (g2.d(str, x0.Df)) {
            String string755 = context.getString(R.string.msg_no_scan_barcode_detected_recipe, Arrays.copyOf(objArr, objArr.length));
            string755.getClass();
            return string755;
        }
        if (g2.d(str, x0.Ef)) {
            String string756 = context.getString(R.string.msg_one_meal_window_required, Arrays.copyOf(objArr, objArr.length));
            string756.getClass();
            return string756;
        }
        if (g2.d(str, x0.Ff)) {
            String string757 = context.getString(R.string.msg_other_nutrients_limit_reached, Arrays.copyOf(objArr, objArr.length));
            string757.getClass();
            return string757;
        }
        if (g2.d(str, x0.Gf)) {
            String string758 = context.getString(R.string.msg_other_nutrients_min_required, Arrays.copyOf(objArr, objArr.length));
            string758.getClass();
            return string758;
        }
        if (g2.d(str, x0.Hf)) {
            String string759 = context.getString(R.string.msg_quickly_log_with_voice_logging, Arrays.copyOf(objArr, objArr.length));
            string759.getClass();
            return string759;
        }
        if (g2.d(str, x0.If)) {
            String string760 = context.getString(R.string.msg_recipe_added_to_favorites, Arrays.copyOf(objArr, objArr.length));
            string760.getClass();
            return string760;
        }
        if (g2.d(str, x0.Jf)) {
            String string761 = context.getString(R.string.msg_recipe_added_to_meal, Arrays.copyOf(objArr, objArr.length));
            string761.getClass();
            return string761;
        }
        if (g2.d(str, x0.Kf)) {
            String string762 = context.getString(R.string.msg_recipe_added_to_photo_results, Arrays.copyOf(objArr, objArr.length));
            string762.getClass();
            return string762;
        }
        if (g2.d(str, x0.Lf)) {
            String string763 = context.getString(R.string.msg_recipe_added_to_recipe, Arrays.copyOf(objArr, objArr.length));
            string763.getClass();
            return string763;
        }
        if (g2.d(str, x0.Mf)) {
            String string764 = context.getString(R.string.msg_recipe_added_to_results, Arrays.copyOf(objArr, objArr.length));
            string764.getClass();
            return string764;
        }
        if (g2.d(str, x0.Nf)) {
            String string765 = context.getString(R.string.msg_recipe_created_but_some_information_failed_to_save, Arrays.copyOf(objArr, objArr.length));
            string765.getClass();
            return string765;
        }
        if (g2.d(str, x0.Of)) {
            String string766 = context.getString(R.string.msg_recipe_logged_to_meal, Arrays.copyOf(objArr, objArr.length));
            string766.getClass();
            return string766;
        }
        if (g2.d(str, x0.Pf)) {
            String string767 = context.getString(R.string.msg_recipe_removed_from_favorites, Arrays.copyOf(objArr, objArr.length));
            string767.getClass();
            return string767;
        }
        if (g2.d(str, x0.Qf)) {
            String string768 = context.getString(R.string.msg_select_other_nutrients_in_range, Arrays.copyOf(objArr, objArr.length));
            string768.getClass();
            return string768;
        }
        if (g2.d(str, x0.Rf)) {
            String string769 = context.getString(R.string.no_matching_foods_found_message, Arrays.copyOf(objArr, objArr.length));
            string769.getClass();
            return string769;
        }
        if (g2.d(str, x0.Sf)) {
            String string770 = context.getString(R.string.nutrition_tracking_reminder_text_meal_name, Arrays.copyOf(objArr, objArr.length));
            string770.getClass();
            return string770;
        }
        if (g2.d(str, x0.Tf)) {
            String string771 = context.getString(R.string.review_meal_details_and_foods_to_log_subtitle, Arrays.copyOf(objArr, objArr.length));
            string771.getClass();
            return string771;
        }
        if (g2.d(str, x0.Uf)) {
            String string772 = context.getString(R.string.saturated_fat_abbreviation, Arrays.copyOf(objArr, objArr.length));
            string772.getClass();
            return string772;
        }
        if (g2.d(str, x0.Vf)) {
            String string773 = context.getString(R.string.speech_recognition_access_needed_message, Arrays.copyOf(objArr, objArr.length));
            string773.getClass();
            return string773;
        }
        if (g2.d(str, x0.Wf)) {
            String string774 = context.getString(R.string.speech_recognition_access_needed_title, Arrays.copyOf(objArr, objArr.length));
            string774.getClass();
            return string774;
        }
        if (g2.d(str, x0.Xf)) {
            String string775 = context.getString(R.string.vitamin_a_abbreviation, Arrays.copyOf(objArr, objArr.length));
            string775.getClass();
            return string775;
        }
        if (g2.d(str, x0.Yf)) {
            String string776 = context.getString(R.string.vitamin_d_abbreviation, Arrays.copyOf(objArr, objArr.length));
            string776.getClass();
            return string776;
        }
        if (g2.d(str, x0.Zf)) {
            String string777 = context.getString(R.string.what_are_nutrients_section_body, Arrays.copyOf(objArr, objArr.length));
            string777.getClass();
            return string777;
        }
        if (g2.d(str, x0.ag)) {
            String string778 = context.getString(R.string.what_are_nutrients_section_title, Arrays.copyOf(objArr, objArr.length));
            string778.getClass();
            return string778;
        }
        if (g2.d(str, x0.nb)) {
            String string779 = context.getString(R.string.lbl_get_vo2_max_estimate, Arrays.copyOf(objArr, objArr.length));
            string779.getClass();
            return string779;
        }
        if (g2.d(str, x0.ob)) {
            String string780 = context.getString(R.string.lbl_vo2_max_estimate, Arrays.copyOf(objArr, objArr.length));
            string780.getClass();
            return string780;
        }
        if (g2.d(str, x0.pb)) {
            String string781 = context.getString(R.string.lbl_vo2_max_test, Arrays.copyOf(objArr, objArr.length));
            string781.getClass();
            return string781;
        }
        if (g2.d(str, x0.qb)) {
            String string782 = context.getString(R.string.lbl_vo2_max_walking_test, Arrays.copyOf(objArr, objArr.length));
            string782.getClass();
            return string782;
        }
        if (g2.d(str, x0.rb)) {
            String string783 = context.getString(R.string.lbl_vo2max_estimate_complete, Arrays.copyOf(objArr, objArr.length));
            string783.getClass();
            return string783;
        }
        if (g2.d(str, x0.sb)) {
            String string784 = context.getString(R.string.lbl_vo2max_not_determined, Arrays.copyOf(objArr, objArr.length));
            string784.getClass();
            return string784;
        }
        if (g2.d(str, x0.tb)) {
            String string785 = context.getString(R.string.lbl_walking_test, Arrays.copyOf(objArr, objArr.length));
            string785.getClass();
            return string785;
        }
        if (g2.d(str, x0.ub)) {
            String string786 = context.getString(R.string.msg_finish_set_up_vo2_max_estimate, Arrays.copyOf(objArr, objArr.length));
            string786.getClass();
            return string786;
        }
        if (g2.d(str, x0.vb)) {
            String string787 = context.getString(R.string.msg_no_vo2_max_data, Arrays.copyOf(objArr, objArr.length));
            string787.getClass();
            return string787;
        }
        if (g2.d(str, x0.wb)) {
            String string788 = context.getString(R.string.msg_receiving_a_reading_for_vo2max, Arrays.copyOf(objArr, objArr.length));
            string788.getClass();
            return string788;
        }
        if (g2.d(str, x0.xb)) {
            String string789 = context.getString(R.string.msg_step_1_vo2max, Arrays.copyOf(objArr, objArr.length));
            string789.getClass();
            return string789;
        }
        if (g2.d(str, x0.yb)) {
            String string790 = context.getString(R.string.msg_step_2_vo2max, Arrays.copyOf(objArr, objArr.length));
            string790.getClass();
            return string790;
        }
        if (g2.d(str, x0.zb)) {
            String string791 = context.getString(R.string.msg_step_3_vo2max, Arrays.copyOf(objArr, objArr.length));
            string791.getClass();
            return string791;
        }
        if (g2.d(str, x0.Ab)) {
            String string792 = context.getString(R.string.msg_vo2_max_estimate, Arrays.copyOf(objArr, objArr.length));
            string792.getClass();
            return string792;
        }
        if (g2.d(str, x0.Bb)) {
            String string793 = context.getString(R.string.msg_vo2_max_walking_test, Arrays.copyOf(objArr, objArr.length));
            string793.getClass();
            return string793;
        }
        if (g2.d(str, x0.Cb)) {
            String string794 = context.getString(R.string.msg_vo2max_estimate_complete, Arrays.copyOf(objArr, objArr.length));
            string794.getClass();
            return string794;
        }
        if (g2.d(str, x0.Db)) {
            String string795 = context.getString(R.string.msg_vo2max_not_determined, Arrays.copyOf(objArr, objArr.length));
            string795.getClass();
            return string795;
        }
        if (g2.d(str, x0.Eb)) {
            String string796 = context.getString(R.string.msg_walking_test_for_vo2max_1, Arrays.copyOf(objArr, objArr.length));
            string796.getClass();
            return string796;
        }
        if (g2.d(str, x0.Fb)) {
            String string797 = context.getString(R.string.msg_walking_test_for_vo2max_2, Arrays.copyOf(objArr, objArr.length));
            string797.getClass();
            return string797;
        }
        if (g2.d(str, x0.Gb)) {
            String string798 = context.getString(R.string.average_weekly_intensity_minutes, Arrays.copyOf(objArr, objArr.length));
            string798.getClass();
            return string798;
        }
        if (g2.d(str, x0.Hb)) {
            String string799 = context.getString(R.string.average_weekly_intensity_minutes_accessibility, Arrays.copyOf(objArr, objArr.length));
            string799.getClass();
            return string799;
        }
        if (g2.d(str, x0.Ib)) {
            String string800 = context.getString(R.string.average_weekly_steps_abbreviated, Arrays.copyOf(objArr, objArr.length));
            string800.getClass();
            return string800;
        }
        if (g2.d(str, x0.Jb)) {
            String string801 = context.getString(R.string.average_weekly_steps_accessibility, Arrays.copyOf(objArr, objArr.length));
            string801.getClass();
            return string801;
        }
        if (g2.d(str, x0.Kb)) {
            String string802 = context.getString(R.string.current_walk_streak, Arrays.copyOf(objArr, objArr.length));
            string802.getClass();
            return string802;
        }
        if (g2.d(str, x0.Lb)) {
            String string803 = context.getString(R.string.furthest_distance_walked, Arrays.copyOf(objArr, objArr.length));
            string803.getClass();
            return string803;
        }
        if (g2.d(str, x0.Mb)) {
            String string804 = context.getString(R.string.garmin_walk_coach, Arrays.copyOf(objArr, objArr.length));
            string804.getClass();
            return string804;
        }
        if (g2.d(str, x0.Nb)) {
            String string805 = context.getString(R.string.garmin_walk_coach_description, Arrays.copyOf(objArr, objArr.length));
            string805.getClass();
            return string805;
        }
        if (g2.d(str, x0.Ob)) {
            String string806 = context.getString(R.string.keep_up_the_good_work, Arrays.copyOf(objArr, objArr.length));
            string806.getClass();
            return string806;
        }
        if (g2.d(str, x0.Pb)) {
            String string807 = context.getString(R.string.lbl_num_marathons, Arrays.copyOf(objArr, objArr.length));
            string807.getClass();
            return string807;
        }
        if (g2.d(str, x0.Qb)) {
            String string808 = context.getString(R.string.long_walk_day, Arrays.copyOf(objArr, objArr.length));
            string808.getClass();
            return string808;
        }
        if (g2.d(str, x0.Rb)) {
            String string809 = context.getString(R.string.long_walk_day_preference_question, Arrays.copyOf(objArr, objArr.length));
            string809.getClass();
            return string809;
        }
        if (g2.d(str, x0.Sb)) {
            String string810 = context.getString(R.string.long_walk_days, Arrays.copyOf(objArr, objArr.length));
            string810.getClass();
            return string810;
        }
        if (g2.d(str, x0.Tb)) {
            String string811 = context.getString(R.string.longest_walk_streak, Arrays.copyOf(objArr, objArr.length));
            string811.getClass();
            return string811;
        }
        if (g2.d(str, x0.Ub)) {
            String string812 = context.getString(R.string.more_than_a_distance, Arrays.copyOf(objArr, objArr.length));
            string812.getClass();
            return string812;
        }
        if (g2.d(str, x0.Vb)) {
            String string813 = context.getString(R.string.must_have_one_or_two_long_walk_days, Arrays.copyOf(objArr, objArr.length));
            string813.getClass();
            return string813;
        }
        if (g2.d(str, x0.Wb)) {
            String string814 = context.getString(R.string.select_long_walk_days, Arrays.copyOf(objArr, objArr.length));
            string814.getClass();
            return string814;
        }
        if (g2.d(str, x0.Xb)) {
            String string815 = context.getString(R.string.walk_report_walked_distance, Arrays.copyOf(objArr, objArr.length));
            string815.getClass();
            return string815;
        }
        if (g2.d(str, x0.Yb)) {
            String string816 = context.getString(R.string.walking_stats, Arrays.copyOf(objArr, objArr.length));
            string816.getClass();
            return string816;
        }
        if (g2.d(str, x0.Zb)) {
            String string817 = context.getString(R.string.hazards_road_closures_message, Arrays.copyOf(objArr, objArr.length));
            string817.getClass();
            return string817;
        }
        if (g2.d(str, x0.ac)) {
            String string818 = context.getString(R.string.lbl_add_point_to_course, Arrays.copyOf(objArr, objArr.length));
            string818.getClass();
            return string818;
        }
        if (g2.d(str, x0.bc)) {
            String string819 = context.getString(R.string.lbl_avoidances, Arrays.copyOf(objArr, objArr.length));
            string819.getClass();
            return string819;
        }
        if (g2.d(str, x0.cc)) {
            String string820 = context.getString(R.string.lbl_course_route, Arrays.copyOf(objArr, objArr.length));
            string820.getClass();
            return string820;
        }
        if (g2.d(str, x0.dc)) {
            String string821 = context.getString(R.string.lbl_course_routes, Arrays.copyOf(objArr, objArr.length));
            string821.getClass();
            return string821;
        }
        if (g2.d(str, x0.ec)) {
            String string822 = context.getString(R.string.lbl_create_your_best_ride, Arrays.copyOf(objArr, objArr.length));
            string822.getClass();
            return string822;
        }
        if (g2.d(str, x0.fc)) {
            String string823 = context.getString(R.string.lbl_explore_more, Arrays.copyOf(objArr, objArr.length));
            string823.getClass();
            return string823;
        }
        if (g2.d(str, x0.gc)) {
            String string824 = context.getString(R.string.lbl_explore_more_message, Arrays.copyOf(objArr, objArr.length));
            string824.getClass();
            return string824;
        }
        if (g2.d(str, x0.hc)) {
            String string825 = context.getString(R.string.lbl_hazard_types, Arrays.copyOf(objArr, objArr.length));
            string825.getClass();
            return string825;
        }
        if (g2.d(str, x0.ic)) {
            String string826 = context.getString(R.string.lbl_high_traffic, Arrays.copyOf(objArr, objArr.length));
            string826.getClass();
            return string826;
        }
        if (g2.d(str, x0.jc)) {
            String string827 = context.getString(R.string.lbl_high_traffic_road, Arrays.copyOf(objArr, objArr.length));
            string827.getClass();
            return string827;
        }
        if (g2.d(str, x0.kc)) {
            String string828 = context.getString(R.string.lbl_high_traffic_roads, Arrays.copyOf(objArr, objArr.length));
            string828.getClass();
            return string828;
        }
        if (g2.d(str, x0.lc)) {
            String string829 = context.getString(R.string.lbl_more_routing_control, Arrays.copyOf(objArr, objArr.length));
            string829.getClass();
            return string829;
        }
        if (g2.d(str, x0.mc)) {
            String string830 = context.getString(R.string.lbl_more_routing_control_message, Arrays.copyOf(objArr, objArr.length));
            string830.getClass();
            return string830;
        }
        if (g2.d(str, x0.nc)) {
            String string831 = context.getString(R.string.lbl_no_points_of_interest_selected, Arrays.copyOf(objArr, objArr.length));
            string831.getClass();
            return string831;
        }
        if (g2.d(str, x0.oc)) {
            String string832 = context.getString(R.string.lbl_number_of_points_of_interest_selected, Arrays.copyOf(objArr, objArr.length));
            string832.getClass();
            return string832;
        }
        if (g2.d(str, x0.pc)) {
            String string833 = context.getString(R.string.lbl_one_point_of_interest_selected, Arrays.copyOf(objArr, objArr.length));
            string833.getClass();
            return string833;
        }
        if (g2.d(str, x0.qc)) {
            String string834 = context.getString(R.string.lbl_poi_attractions, Arrays.copyOf(objArr, objArr.length));
            string834.getClass();
            return string834;
        }
        if (g2.d(str, x0.rc)) {
            String string835 = context.getString(R.string.lbl_poi_automatic_drawing_method, Arrays.copyOf(objArr, objArr.length));
            string835.getClass();
            return string835;
        }
        if (g2.d(str, x0.sc)) {
            String string836 = context.getString(R.string.lbl_poi_banks_and_atms, Arrays.copyOf(objArr, objArr.length));
            string836.getClass();
            return string836;
        }
        if (g2.d(str, x0.tc)) {
            String string837 = context.getString(R.string.lbl_poi_bike_shops_and_repair, Arrays.copyOf(objArr, objArr.length));
            string837.getClass();
            return string837;
        }
        if (g2.d(str, x0.uc)) {
            String string838 = context.getString(R.string.lbl_poi_coffee_shops, Arrays.copyOf(objArr, objArr.length));
            string838.getClass();
            return string838;
        }
        if (g2.d(str, x0.vc)) {
            String string839 = context.getString(R.string.lbl_poi_community, Arrays.copyOf(objArr, objArr.length));
            string839.getClass();
            return string839;
        }
        if (g2.d(str, x0.wc)) {
            String string840 = context.getString(R.string.lbl_poi_convenience, Arrays.copyOf(objArr, objArr.length));
            string840.getClass();
            return string840;
        }
        if (g2.d(str, x0.xc)) {
            String string841 = context.getString(R.string.lbl_poi_emergency, Arrays.copyOf(objArr, objArr.length));
            string841.getClass();
            return string841;
        }
        if (g2.d(str, x0.yc)) {
            String string842 = context.getString(R.string.lbl_poi_lodging, Arrays.copyOf(objArr, objArr.length));
            string842.getClass();
            return string842;
        }
        if (g2.d(str, x0.zc)) {
            String string843 = context.getString(R.string.lbl_poi_parks, Arrays.copyOf(objArr, objArr.length));
            string843.getClass();
            return string843;
        }
        if (g2.d(str, x0.Ac)) {
            String string844 = context.getString(R.string.lbl_poi_recreation, Arrays.copyOf(objArr, objArr.length));
            string844.getClass();
            return string844;
        }
        if (g2.d(str, x0.Bc)) {
            String string845 = context.getString(R.string.lbl_poi_restaurants, Arrays.copyOf(objArr, objArr.length));
            string845.getClass();
            return string845;
        }
        if (g2.d(str, x0.Cc)) {
            String string846 = context.getString(R.string.lbl_poi_restrooms, Arrays.copyOf(objArr, objArr.length));
            string846.getClass();
            return string846;
        }
        if (g2.d(str, x0.Dc)) {
            String string847 = context.getString(R.string.lbl_poi_shopping, Arrays.copyOf(objArr, objArr.length));
            string847.getClass();
            return string847;
        }
        if (g2.d(str, x0.Ec)) {
            String string848 = context.getString(R.string.lbl_poi_transportation, Arrays.copyOf(objArr, objArr.length));
            string848.getClass();
            return string848;
        }
        if (g2.d(str, x0.Fc)) {
            String string849 = context.getString(R.string.lbl_poi_water_stops, Arrays.copyOf(objArr, objArr.length));
            string849.getClass();
            return string849;
        }
        if (g2.d(str, x0.Gc)) {
            String string850 = context.getString(R.string.lbl_poi_wineries_and_breweries, Arrays.copyOf(objArr, objArr.length));
            string850.getClass();
            return string850;
        }
        if (g2.d(str, x0.Hc)) {
            String string851 = context.getString(R.string.lbl_points_of_interest, Arrays.copyOf(objArr, objArr.length));
            string851.getClass();
            return string851;
        }
        if (g2.d(str, x0.Ic)) {
            String string852 = context.getString(R.string.lbl_return_with_tailwind, Arrays.copyOf(objArr, objArr.length));
            string852.getClass();
            return string852;
        }
        if (g2.d(str, x0.Jc)) {
            String string853 = context.getString(R.string.lbl_road_closure, Arrays.copyOf(objArr, objArr.length));
            string853.getClass();
            return string853;
        }
        if (g2.d(str, x0.Kc)) {
            String string854 = context.getString(R.string.lbl_road_closures, Arrays.copyOf(objArr, objArr.length));
            string854.getClass();
            return string854;
        }
        if (g2.d(str, x0.Lc)) {
            String string855 = context.getString(R.string.lbl_routing_free_flow, Arrays.copyOf(objArr, objArr.length));
            string855.getClass();
            return string855;
        }
        if (g2.d(str, x0.Mc)) {
            String string856 = context.getString(R.string.lbl_routing_free_flow_subtitle, Arrays.copyOf(objArr, objArr.length));
            string856.getClass();
            return string856;
        }
        if (g2.d(str, x0.Nc)) {
            String string857 = context.getString(R.string.lbl_routing_least_elevation, Arrays.copyOf(objArr, objArr.length));
            string857.getClass();
            return string857;
        }
        if (g2.d(str, x0.Oc)) {
            String string858 = context.getString(R.string.lbl_routing_least_elevation_subtitle, Arrays.copyOf(objArr, objArr.length));
            string858.getClass();
            return string858;
        }
        if (g2.d(str, x0.Pc)) {
            String string859 = context.getString(R.string.lbl_sgr_awards_item_description, Arrays.copyOf(objArr, objArr.length));
            string859.getClass();
            return string859;
        }
        if (g2.d(str, x0.Qc)) {
            String string860 = context.getString(R.string.lbl_sgr_awards_item_title, Arrays.copyOf(objArr, objArr.length));
            string860.getClass();
            return string860;
        }
        if (g2.d(str, x0.Rc)) {
            String string861 = context.getString(R.string.lbl_sgr_explore_item_description, Arrays.copyOf(objArr, objArr.length));
            string861.getClass();
            return string861;
        }
        if (g2.d(str, x0.Sc)) {
            String string862 = context.getString(R.string.lbl_sgr_explore_item_title, Arrays.copyOf(objArr, objArr.length));
            string862.getClass();
            return string862;
        }
        if (g2.d(str, x0.Tc)) {
            String string863 = context.getString(R.string.lbl_sgr_other_awards, Arrays.copyOf(objArr, objArr.length));
            string863.getClass();
            return string863;
        }
        if (g2.d(str, x0.Uc)) {
            String string864 = context.getString(R.string.lbl_sgr_sheet_header, Arrays.copyOf(objArr, objArr.length));
            string864.getClass();
            return string864;
        }
        if (g2.d(str, x0.Vc)) {
            String string865 = context.getString(R.string.lbl_sgr_sheet_title, Arrays.copyOf(objArr, objArr.length));
            string865.getClass();
            return string865;
        }
        if (g2.d(str, x0.Wc)) {
            String string866 = context.getString(R.string.lbl_smarter_course_creation, Arrays.copyOf(objArr, objArr.length));
            string866.getClass();
            return string866;
        }
        if (g2.d(str, x0.Xc)) {
            String string867 = context.getString(R.string.lbl_smarter_course_creation_message, Arrays.copyOf(objArr, objArr.length));
            string867.getClass();
            return string867;
        }
        if (g2.d(str, x0.Yc)) {
            String string868 = context.getString(R.string.lbl_start_course_here, Arrays.copyOf(objArr, objArr.length));
            string868.getClass();
            return string868;
        }
        if (g2.d(str, x0.Zc)) {
            String string869 = context.getString(R.string.lbl_turn_on_PIOs, Arrays.copyOf(objArr, objArr.length));
            string869.getClass();
            return string869;
        }
        if (g2.d(str, x0.ad)) {
            String string870 = context.getString(R.string.lbl_whats_new_in_courses, Arrays.copyOf(objArr, objArr.length));
            string870.getClass();
            return string870;
        }
        if (g2.d(str, x0.bd)) {
            String string871 = context.getString(R.string.message_course_includes_hazards_and_road_closures, Arrays.copyOf(objArr, objArr.length));
            string871.getClass();
            return string871;
        }
        if (g2.d(str, x0.cd)) {
            String string872 = context.getString(R.string.message_course_includes_road_closures, Arrays.copyOf(objArr, objArr.length));
            string872.getClass();
            return string872;
        }
        if (g2.d(str, x0.dd)) {
            String string873 = context.getString(R.string.message_high_traffic_roads_cannot_be_avoided, Arrays.copyOf(objArr, objArr.length));
            string873.getClass();
            return string873;
        }
        if (g2.d(str, x0.ed)) {
            String string874 = context.getString(R.string.message_more_road_closures_in_the_area_check_maps_for_details, Arrays.copyOf(objArr, objArr.length));
            string874.getClass();
            return string874;
        }
        if (g2.d(str, x0.fd)) {
            String string875 = context.getString(R.string.message_road_closures_user_set_hazards, Arrays.copyOf(objArr, objArr.length));
            string875.getClass();
            return string875;
        }
        if (g2.d(str, x0.gd)) {
            String string876 = context.getString(R.string.message_waypoint_was_adjusted, Arrays.copyOf(objArr, objArr.length));
            string876.getClass();
            return string876;
        }
        if (g2.d(str, x0.hd)) {
            String string877 = context.getString(R.string.msg_greta_data_screen_tutorial_5, Arrays.copyOf(objArr, objArr.length));
            string877.getClass();
            return string877;
        }
        if (g2.d(str, x0.id)) {
            String string878 = context.getString(R.string.msg_greta_data_screen_tutorial_5a, Arrays.copyOf(objArr, objArr.length));
            string878.getClass();
            return string878;
        }
        if (g2.d(str, x0.jd)) {
            String string879 = context.getString(R.string.msg_greta_in_ride_controls_tutorial_4a, Arrays.copyOf(objArr, objArr.length));
            string879.getClass();
            return string879;
        }
        if (g2.d(str, x0.kd)) {
            String string880 = context.getString(R.string.msg_greta_in_ride_controls_tutorial_4b, Arrays.copyOf(objArr, objArr.length));
            string880.getClass();
            return string880;
        }
        if (g2.d(str, x0.ld)) {
            String string881 = context.getString(R.string.msg_greta_stage_an_activity_tutorial_2, Arrays.copyOf(objArr, objArr.length));
            string881.getClass();
            return string881;
        }
        if (g2.d(str, x0.md)) {
            String string882 = context.getString(R.string.msg_greta_stage_an_activity_tutorial_2a, Arrays.copyOf(objArr, objArr.length));
            string882.getClass();
            return string882;
        }
        if (!g2.d(str, x0.nd)) {
            return "";
        }
        String string883 = context.getString(R.string.msg_greta_stage_an_activity_tutorial_2b, Arrays.copyOf(objArr, objArr.length));
        string883.getClass();
        return string883;
    }

    public final String d(String str) throws PackageManager.NameNotFoundException {
        str.getClass();
        Context context = this.b;
        Context contextCreateContextForSplit = context.createContextForSplit("gcm_on_demand_resources");
        int identifier = contextCreateContextForSplit.getResources().getIdentifier(str, "string", contextCreateContextForSplit.getPackageName() + ".gcm_on_demand_resources");
        if (identifier != 0) {
            return context.getString(identifier);
        }
        return null;
    }
}
