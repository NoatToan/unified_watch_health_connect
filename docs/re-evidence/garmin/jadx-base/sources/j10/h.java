package j10;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connections.groups.details.GroupActivityFeedTypeActivity;
import com.garmin.android.apps.connectmobile.connections.groups.details.GroupSettingsActivitiesActivity;
import com.garmin.android.apps.connectmobile.connections.groups.details.GroupSettingsActivity;
import com.garmin.android.apps.connectmobile.connections.groups.details.GroupSettingsMultilineSelectionActivity;
import com.garmin.android.apps.connectmobile.connections.groups.details.GroupSettingsPrivacyActivity;
import com.garmin.android.apps.connectmobile.connections.groups.details.settings.defaultimage.GroupDefaultImageSelectActivity;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.social.share.UCropImageActivity;
import gg1.l0;
import org.apache.commons.io.IOUtils;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupSettingsActivity f96377b;

    public /* synthetic */ h(GroupSettingsActivity groupSettingsActivity, int i14) {
        this.f96376a = i14;
        this.f96377b = groupSettingsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f96376a;
        final int i15 = 5;
        final int i16 = 3;
        final int i17 = 4;
        final int i18 = 2;
        final int i19 = 0;
        final int i24 = 1;
        final GroupSettingsActivity groupSettingsActivity = this.f96377b;
        switch (i14) {
            case 0:
                int i25 = GroupSettingsActivity.f31420z;
                groupSettingsActivity.ea();
                break;
            case 1:
                int i26 = GroupSettingsActivity.f31420z;
                String string = groupSettingsActivity.getString(R.string.lbl_website);
                View viewCa = groupSettingsActivity.ca();
                final EditText editText = (EditText) viewCa.findViewById(R.id.dialog_edit_text);
                androidx.appcompat.app.e eVarDa = groupSettingsActivity.da(string, viewCa, new DialogInterface.OnClickListener() { // from class: j10.k
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i27) {
                        String str;
                        int i28 = i17;
                        EditText editText2 = editText;
                        GroupSettingsActivity groupSettingsActivity2 = groupSettingsActivity;
                        switch (i28) {
                            case 0:
                                int i29 = GroupSettingsActivity.f31420z;
                                String string2 = editText2.getText().toString();
                                str = TextUtils.isEmpty(string2) ? null : string2;
                                groupSettingsActivity2.f31439t.f31560c = str;
                                groupSettingsActivity2.f31429i.setButtonBottomLeftLabel(str);
                                break;
                            case 1:
                                int i30 = GroupSettingsActivity.f31420z;
                                o13.p<Boolean, String> pVarM = jm0.e.m(editText2.getText().toString());
                                Boolean bool = pVarM.f128594a;
                                String str2 = pVarM.f128595b;
                                if (!bool.booleanValue()) {
                                    dialogInterface.dismiss();
                                    androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(groupSettingsActivity2);
                                    aVar.setTitle(R.string.social_invalid_fb_url_title);
                                    aVar.setMessage(R.string.social_invalid_fb_url_message);
                                    aVar.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
                                    aVar.create().show();
                                } else {
                                    groupSettingsActivity2.f31439t.f31571n = str2;
                                    groupSettingsActivity2.f31431k.setButtonBottomLeftLabel(str2);
                                }
                                break;
                            case 2:
                                int i34 = GroupSettingsActivity.f31420z;
                                String string3 = editText2.getText().toString();
                                str = TextUtils.isEmpty(string3) ? null : string3;
                                groupSettingsActivity2.f31439t.f31569l = str;
                                groupSettingsActivity2.f31430j.setButtonBottomLeftLabel(str);
                                break;
                            case 3:
                                int i35 = GroupSettingsActivity.f31420z;
                                o13.p<Boolean, String> pVarN = jm0.e.n(editText2.getText().toString());
                                Boolean bool2 = pVarN.f128594a;
                                String str3 = pVarN.f128595b;
                                if (!bool2.booleanValue()) {
                                    Toast.makeText(groupSettingsActivity2, R.string.msg_error_invalid_name_x_former_twitter, 1).show();
                                } else {
                                    groupSettingsActivity2.f31439t.f31572o = str3;
                                    groupSettingsActivity2.f31432l.setButtonBottomLeftLabel(str3);
                                }
                                break;
                            case 4:
                                int i36 = GroupSettingsActivity.f31420z;
                                o13.p<Boolean, String> pVarO = jm0.e.o(editText2.getText().toString());
                                Boolean bool3 = pVarO.f128594a;
                                String str4 = pVarO.f128595b;
                                if (!bool3.booleanValue()) {
                                    Toast.makeText(groupSettingsActivity2, R.string.msg_valid_url, 1).show();
                                } else {
                                    groupSettingsActivity2.f31439t.f31570m = str4;
                                    groupSettingsActivity2.f31433m.setButtonBottomLeftLabel(str4);
                                }
                                break;
                            default:
                                int i37 = GroupSettingsActivity.f31420z;
                                String string4 = editText2.getText().toString();
                                groupSettingsActivity2.f31439t.f31559b = string4;
                                groupSettingsActivity2.f31428h.setButtonBottomLeftLabel(string4);
                                break;
                        }
                    }
                });
                GroupSettingsActivity.ga(editText, groupSettingsActivity.f31439t.f31570m, groupSettingsActivity.getString(R.string.lbl_enter_group_website));
                editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(512), groupSettingsActivity.f31421a});
                eVarDa.getWindow().setSoftInputMode(4);
                eVarDa.show();
                break;
            case 2:
                f.c<Intent> cVar = groupSettingsActivity.f31443y;
                GroupDTO groupDTO = groupSettingsActivity.f31439t;
                GroupSettingsPrivacyActivity.f31458b.getClass();
                groupDTO.getClass();
                Intent intent = new Intent(groupSettingsActivity, (Class<?>) GroupSettingsPrivacyActivity.class);
                intent.putExtra("GCM_extra_connection_group", groupDTO);
                cVar.a(intent, null);
                break;
            case 3:
                f.c<Intent> cVar2 = groupSettingsActivity.f31443y;
                GroupSettingsActivitiesActivity.a aVar = GroupSettingsActivitiesActivity.f31417b;
                GroupDTO groupDTO2 = groupSettingsActivity.f31439t;
                aVar.getClass();
                groupDTO2.getClass();
                Intent intent2 = new Intent(groupSettingsActivity, (Class<?>) GroupSettingsActivitiesActivity.class);
                intent2.putExtra("GCM_extra_connection_group", groupDTO2);
                cVar2.a(intent2, null);
                break;
            case 4:
                f.c<Intent> cVar3 = groupSettingsActivity.f31443y;
                GroupDTO groupDTO3 = groupSettingsActivity.f31439t;
                GroupActivityFeedTypeActivity.f31371a.getClass();
                groupDTO3.getClass();
                Intent intent3 = new Intent(groupSettingsActivity, (Class<?>) GroupActivityFeedTypeActivity.class);
                intent3.putExtra("param_group", groupDTO3);
                cVar3.a(intent3, null);
                break;
            case 5:
                int i27 = GroupSettingsActivity.f31420z;
                GroupDefaultImageSelectActivity.f31494c.getClass();
                groupSettingsActivity.startActivityForResult(new Intent(groupSettingsActivity, (Class<?>) GroupDefaultImageSelectActivity.class), 2);
                groupSettingsActivity.f31424d.dismiss();
                break;
            case 6:
                f.c<f.j> cVar4 = groupSettingsActivity.f31442x;
                f.j.a aVar2 = new f.j.a();
                g.e.d dVar = g.e.d.f74074a;
                dVar.getClass();
                aVar2.f67620a = dVar;
                cVar4.a(aVar2.a(), null);
                groupSettingsActivity.f31424d.dismiss();
                break;
            case 7:
                f.c<Intent> cVar5 = groupSettingsActivity.f31441w;
                Uri uri = groupSettingsActivity.f31426f;
                if (uri != null) {
                    cVar5.a(UCropImageActivity.ca(groupSettingsActivity, uri), null);
                } else if (!TextUtils.isEmpty(groupSettingsActivity.f31427g)) {
                    k10.d dVar2 = groupSettingsActivity.f31425e;
                    String str = groupSettingsActivity.f31427g;
                    dVar2.getClass();
                    int iS = dVar2.f102157c.s(groupSettingsActivity, str);
                    cVar5.a(UCropImageActivity.ca(groupSettingsActivity, Uri.parse("android.resource://" + groupSettingsActivity.getResources().getResourcePackageName(iS) + IOUtils.DIR_SEPARATOR_UNIX + groupSettingsActivity.getResources().getResourceTypeName(iS) + IOUtils.DIR_SEPARATOR_UNIX + groupSettingsActivity.getResources().getResourceEntryName(iS))), null);
                } else if (TextUtils.isEmpty(groupSettingsActivity.f31439t.f31564g)) {
                    k10.d dVar3 = groupSettingsActivity.f31425e;
                    String str2 = groupSettingsActivity.f31439t.I;
                    dVar3.getClass();
                    cVar5.a(UCropImageActivity.ca(groupSettingsActivity, Uri.parse(jm0.e.c(dVar3.f102157c.s(groupSettingsActivity, str2), groupSettingsActivity))), null);
                } else {
                    cVar5.a(UCropImageActivity.ca(groupSettingsActivity, Uri.parse(groupSettingsActivity.f31439t.f31564g)), null);
                }
                groupSettingsActivity.f31424d.dismiss();
                break;
            case 8:
                GroupDTO groupDTO4 = groupSettingsActivity.f31439t;
                int i28 = GroupSettingsMultilineSelectionActivity.f31448j;
                Intent intent4 = new Intent(groupSettingsActivity, (Class<?>) GroupSettingsMultilineSelectionActivity.class);
                intent4.putExtra("GCM_extra_connection_group", groupDTO4);
                intent4.setAction("edit_group_leaderboard_types");
                groupSettingsActivity.startActivityForResult(intent4, 1);
                break;
            case 9:
                GroupDTO groupDTO5 = groupSettingsActivity.f31439t;
                int i29 = GroupSettingsMultilineSelectionActivity.f31448j;
                Intent intent5 = new Intent(groupSettingsActivity, (Class<?>) GroupSettingsMultilineSelectionActivity.class);
                intent5.putExtra("GCM_extra_connection_group", groupDTO5);
                intent5.setAction("edit_group_features_types");
                groupSettingsActivity.startActivityForResult(intent5, 1);
                break;
            case 10:
                int i30 = GroupSettingsActivity.f31420z;
                groupSettingsActivity.ea();
                break;
            case 11:
                int i34 = GroupSettingsActivity.f31420z;
                String string2 = groupSettingsActivity.getString(R.string.lbl_group_name);
                View viewCa2 = groupSettingsActivity.ca();
                final EditText editText2 = (EditText) viewCa2.findViewById(R.id.dialog_edit_text);
                androidx.appcompat.app.e eVarDa2 = groupSettingsActivity.da(string2, viewCa2, new DialogInterface.OnClickListener() { // from class: j10.k
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i210) {
                        String str3;
                        int i211 = i15;
                        EditText editText3 = editText2;
                        GroupSettingsActivity groupSettingsActivity2 = groupSettingsActivity;
                        switch (i211) {
                            case 0:
                                int i212 = GroupSettingsActivity.f31420z;
                                String string3 = editText3.getText().toString();
                                str3 = TextUtils.isEmpty(string3) ? null : string3;
                                groupSettingsActivity2.f31439t.f31560c = str3;
                                groupSettingsActivity2.f31429i.setButtonBottomLeftLabel(str3);
                                break;
                            case 1:
                                int i35 = GroupSettingsActivity.f31420z;
                                o13.p<Boolean, String> pVarM = jm0.e.m(editText3.getText().toString());
                                Boolean bool = pVarM.f128594a;
                                String str4 = pVarM.f128595b;
                                if (!bool.booleanValue()) {
                                    dialogInterface.dismiss();
                                    androidx.appcompat.app.e.a aVar3 = new androidx.appcompat.app.e.a(groupSettingsActivity2);
                                    aVar3.setTitle(R.string.social_invalid_fb_url_title);
                                    aVar3.setMessage(R.string.social_invalid_fb_url_message);
                                    aVar3.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
                                    aVar3.create().show();
                                } else {
                                    groupSettingsActivity2.f31439t.f31571n = str4;
                                    groupSettingsActivity2.f31431k.setButtonBottomLeftLabel(str4);
                                }
                                break;
                            case 2:
                                int i36 = GroupSettingsActivity.f31420z;
                                String string4 = editText3.getText().toString();
                                str3 = TextUtils.isEmpty(string4) ? null : string4;
                                groupSettingsActivity2.f31439t.f31569l = str3;
                                groupSettingsActivity2.f31430j.setButtonBottomLeftLabel(str3);
                                break;
                            case 3:
                                int i37 = GroupSettingsActivity.f31420z;
                                o13.p<Boolean, String> pVarN = jm0.e.n(editText3.getText().toString());
                                Boolean bool2 = pVarN.f128594a;
                                String str5 = pVarN.f128595b;
                                if (!bool2.booleanValue()) {
                                    Toast.makeText(groupSettingsActivity2, R.string.msg_error_invalid_name_x_former_twitter, 1).show();
                                } else {
                                    groupSettingsActivity2.f31439t.f31572o = str5;
                                    groupSettingsActivity2.f31432l.setButtonBottomLeftLabel(str5);
                                }
                                break;
                            case 4:
                                int i38 = GroupSettingsActivity.f31420z;
                                o13.p<Boolean, String> pVarO = jm0.e.o(editText3.getText().toString());
                                Boolean bool3 = pVarO.f128594a;
                                String str6 = pVarO.f128595b;
                                if (!bool3.booleanValue()) {
                                    Toast.makeText(groupSettingsActivity2, R.string.msg_valid_url, 1).show();
                                } else {
                                    groupSettingsActivity2.f31439t.f31570m = str6;
                                    groupSettingsActivity2.f31433m.setButtonBottomLeftLabel(str6);
                                }
                                break;
                            default:
                                int i39 = GroupSettingsActivity.f31420z;
                                String string5 = editText3.getText().toString();
                                groupSettingsActivity2.f31439t.f31559b = string5;
                                groupSettingsActivity2.f31428h.setButtonBottomLeftLabel(string5);
                                break;
                        }
                    }
                });
                GroupSettingsActivity.ga(editText2, groupSettingsActivity.f31439t.f31559b, groupSettingsActivity.getString(R.string.lbl_enter_group_name));
                editText2.addTextChangedListener(new l(groupSettingsActivity, eVarDa2));
                editText2.setFilters(new InputFilter[]{new jm0.e.a(128), groupSettingsActivity.f31421a});
                eVarDa2.getWindow().setSoftInputMode(4);
                eVarDa2.show();
                break;
            case 12:
                int i35 = GroupSettingsActivity.f31420z;
                String string3 = groupSettingsActivity.getString(R.string.lbl_description);
                View viewCa3 = groupSettingsActivity.ca();
                final EditText editText3 = (EditText) viewCa3.findViewById(R.id.dialog_edit_text);
                androidx.appcompat.app.e eVarDa3 = groupSettingsActivity.da(string3, viewCa3, new DialogInterface.OnClickListener() { // from class: j10.k
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i210) {
                        String str3;
                        int i211 = i19;
                        EditText editText4 = editText3;
                        GroupSettingsActivity groupSettingsActivity2 = groupSettingsActivity;
                        switch (i211) {
                            case 0:
                                int i212 = GroupSettingsActivity.f31420z;
                                String string4 = editText4.getText().toString();
                                str3 = TextUtils.isEmpty(string4) ? null : string4;
                                groupSettingsActivity2.f31439t.f31560c = str3;
                                groupSettingsActivity2.f31429i.setButtonBottomLeftLabel(str3);
                                break;
                            case 1:
                                int i36 = GroupSettingsActivity.f31420z;
                                o13.p<Boolean, String> pVarM = jm0.e.m(editText4.getText().toString());
                                Boolean bool = pVarM.f128594a;
                                String str4 = pVarM.f128595b;
                                if (!bool.booleanValue()) {
                                    dialogInterface.dismiss();
                                    androidx.appcompat.app.e.a aVar3 = new androidx.appcompat.app.e.a(groupSettingsActivity2);
                                    aVar3.setTitle(R.string.social_invalid_fb_url_title);
                                    aVar3.setMessage(R.string.social_invalid_fb_url_message);
                                    aVar3.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
                                    aVar3.create().show();
                                } else {
                                    groupSettingsActivity2.f31439t.f31571n = str4;
                                    groupSettingsActivity2.f31431k.setButtonBottomLeftLabel(str4);
                                }
                                break;
                            case 2:
                                int i37 = GroupSettingsActivity.f31420z;
                                String string5 = editText4.getText().toString();
                                str3 = TextUtils.isEmpty(string5) ? null : string5;
                                groupSettingsActivity2.f31439t.f31569l = str3;
                                groupSettingsActivity2.f31430j.setButtonBottomLeftLabel(str3);
                                break;
                            case 3:
                                int i38 = GroupSettingsActivity.f31420z;
                                o13.p<Boolean, String> pVarN = jm0.e.n(editText4.getText().toString());
                                Boolean bool2 = pVarN.f128594a;
                                String str5 = pVarN.f128595b;
                                if (!bool2.booleanValue()) {
                                    Toast.makeText(groupSettingsActivity2, R.string.msg_error_invalid_name_x_former_twitter, 1).show();
                                } else {
                                    groupSettingsActivity2.f31439t.f31572o = str5;
                                    groupSettingsActivity2.f31432l.setButtonBottomLeftLabel(str5);
                                }
                                break;
                            case 4:
                                int i39 = GroupSettingsActivity.f31420z;
                                o13.p<Boolean, String> pVarO = jm0.e.o(editText4.getText().toString());
                                Boolean bool3 = pVarO.f128594a;
                                String str6 = pVarO.f128595b;
                                if (!bool3.booleanValue()) {
                                    Toast.makeText(groupSettingsActivity2, R.string.msg_valid_url, 1).show();
                                } else {
                                    groupSettingsActivity2.f31439t.f31570m = str6;
                                    groupSettingsActivity2.f31433m.setButtonBottomLeftLabel(str6);
                                }
                                break;
                            default:
                                int i310 = GroupSettingsActivity.f31420z;
                                String string6 = editText4.getText().toString();
                                groupSettingsActivity2.f31439t.f31559b = string6;
                                groupSettingsActivity2.f31428h.setButtonBottomLeftLabel(string6);
                                break;
                        }
                    }
                });
                editText3.setSingleLine(false);
                GroupSettingsActivity.ga(editText3, groupSettingsActivity.f31439t.f31560c, groupSettingsActivity.getString(R.string.lbl_enter_group_description));
                editText3.setFilters(new InputFilter[]{new InputFilter.LengthFilter(200), groupSettingsActivity.f31421a});
                eVarDa3.getWindow().setSoftInputMode(4);
                eVarDa3.show();
                break;
            case 13:
                int i36 = GroupSettingsActivity.f31420z;
                String string4 = groupSettingsActivity.getString(R.string.lbl_location);
                View viewCa4 = groupSettingsActivity.ca();
                final EditText editText4 = (EditText) viewCa4.findViewById(R.id.dialog_edit_text);
                androidx.appcompat.app.e eVarDa4 = groupSettingsActivity.da(string4, viewCa4, new DialogInterface.OnClickListener() { // from class: j10.k
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i210) {
                        String str3;
                        int i211 = i18;
                        EditText editText5 = editText4;
                        GroupSettingsActivity groupSettingsActivity2 = groupSettingsActivity;
                        switch (i211) {
                            case 0:
                                int i212 = GroupSettingsActivity.f31420z;
                                String string5 = editText5.getText().toString();
                                str3 = TextUtils.isEmpty(string5) ? null : string5;
                                groupSettingsActivity2.f31439t.f31560c = str3;
                                groupSettingsActivity2.f31429i.setButtonBottomLeftLabel(str3);
                                break;
                            case 1:
                                int i37 = GroupSettingsActivity.f31420z;
                                o13.p<Boolean, String> pVarM = jm0.e.m(editText5.getText().toString());
                                Boolean bool = pVarM.f128594a;
                                String str4 = pVarM.f128595b;
                                if (!bool.booleanValue()) {
                                    dialogInterface.dismiss();
                                    androidx.appcompat.app.e.a aVar3 = new androidx.appcompat.app.e.a(groupSettingsActivity2);
                                    aVar3.setTitle(R.string.social_invalid_fb_url_title);
                                    aVar3.setMessage(R.string.social_invalid_fb_url_message);
                                    aVar3.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
                                    aVar3.create().show();
                                } else {
                                    groupSettingsActivity2.f31439t.f31571n = str4;
                                    groupSettingsActivity2.f31431k.setButtonBottomLeftLabel(str4);
                                }
                                break;
                            case 2:
                                int i38 = GroupSettingsActivity.f31420z;
                                String string6 = editText5.getText().toString();
                                str3 = TextUtils.isEmpty(string6) ? null : string6;
                                groupSettingsActivity2.f31439t.f31569l = str3;
                                groupSettingsActivity2.f31430j.setButtonBottomLeftLabel(str3);
                                break;
                            case 3:
                                int i39 = GroupSettingsActivity.f31420z;
                                o13.p<Boolean, String> pVarN = jm0.e.n(editText5.getText().toString());
                                Boolean bool2 = pVarN.f128594a;
                                String str5 = pVarN.f128595b;
                                if (!bool2.booleanValue()) {
                                    Toast.makeText(groupSettingsActivity2, R.string.msg_error_invalid_name_x_former_twitter, 1).show();
                                } else {
                                    groupSettingsActivity2.f31439t.f31572o = str5;
                                    groupSettingsActivity2.f31432l.setButtonBottomLeftLabel(str5);
                                }
                                break;
                            case 4:
                                int i310 = GroupSettingsActivity.f31420z;
                                o13.p<Boolean, String> pVarO = jm0.e.o(editText5.getText().toString());
                                Boolean bool3 = pVarO.f128594a;
                                String str6 = pVarO.f128595b;
                                if (!bool3.booleanValue()) {
                                    Toast.makeText(groupSettingsActivity2, R.string.msg_valid_url, 1).show();
                                } else {
                                    groupSettingsActivity2.f31439t.f31570m = str6;
                                    groupSettingsActivity2.f31433m.setButtonBottomLeftLabel(str6);
                                }
                                break;
                            default:
                                int i311 = GroupSettingsActivity.f31420z;
                                String string7 = editText5.getText().toString();
                                groupSettingsActivity2.f31439t.f31559b = string7;
                                groupSettingsActivity2.f31428h.setButtonBottomLeftLabel(string7);
                                break;
                        }
                    }
                });
                GroupSettingsActivity.ga(editText4, groupSettingsActivity.f31439t.f31569l, groupSettingsActivity.getString(R.string.lbl_enter_group_location));
                editText4.setFilters(new InputFilter[]{new InputFilter.LengthFilter(70), new l0(4), groupSettingsActivity.f31421a});
                eVarDa4.getWindow().setSoftInputMode(4);
                eVarDa4.show();
                break;
            case 14:
                int i37 = GroupSettingsActivity.f31420z;
                String string5 = groupSettingsActivity.getString(R.string.facebook);
                View viewCa5 = groupSettingsActivity.ca();
                final EditText editText5 = (EditText) viewCa5.findViewById(R.id.dialog_edit_text);
                androidx.appcompat.app.e eVarDa5 = groupSettingsActivity.da(string5, viewCa5, new DialogInterface.OnClickListener() { // from class: j10.k
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i210) {
                        String str3;
                        int i211 = i24;
                        EditText editText6 = editText5;
                        GroupSettingsActivity groupSettingsActivity2 = groupSettingsActivity;
                        switch (i211) {
                            case 0:
                                int i212 = GroupSettingsActivity.f31420z;
                                String string6 = editText6.getText().toString();
                                str3 = TextUtils.isEmpty(string6) ? null : string6;
                                groupSettingsActivity2.f31439t.f31560c = str3;
                                groupSettingsActivity2.f31429i.setButtonBottomLeftLabel(str3);
                                break;
                            case 1:
                                int i38 = GroupSettingsActivity.f31420z;
                                o13.p<Boolean, String> pVarM = jm0.e.m(editText6.getText().toString());
                                Boolean bool = pVarM.f128594a;
                                String str4 = pVarM.f128595b;
                                if (!bool.booleanValue()) {
                                    dialogInterface.dismiss();
                                    androidx.appcompat.app.e.a aVar3 = new androidx.appcompat.app.e.a(groupSettingsActivity2);
                                    aVar3.setTitle(R.string.social_invalid_fb_url_title);
                                    aVar3.setMessage(R.string.social_invalid_fb_url_message);
                                    aVar3.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
                                    aVar3.create().show();
                                } else {
                                    groupSettingsActivity2.f31439t.f31571n = str4;
                                    groupSettingsActivity2.f31431k.setButtonBottomLeftLabel(str4);
                                }
                                break;
                            case 2:
                                int i39 = GroupSettingsActivity.f31420z;
                                String string7 = editText6.getText().toString();
                                str3 = TextUtils.isEmpty(string7) ? null : string7;
                                groupSettingsActivity2.f31439t.f31569l = str3;
                                groupSettingsActivity2.f31430j.setButtonBottomLeftLabel(str3);
                                break;
                            case 3:
                                int i310 = GroupSettingsActivity.f31420z;
                                o13.p<Boolean, String> pVarN = jm0.e.n(editText6.getText().toString());
                                Boolean bool2 = pVarN.f128594a;
                                String str5 = pVarN.f128595b;
                                if (!bool2.booleanValue()) {
                                    Toast.makeText(groupSettingsActivity2, R.string.msg_error_invalid_name_x_former_twitter, 1).show();
                                } else {
                                    groupSettingsActivity2.f31439t.f31572o = str5;
                                    groupSettingsActivity2.f31432l.setButtonBottomLeftLabel(str5);
                                }
                                break;
                            case 4:
                                int i311 = GroupSettingsActivity.f31420z;
                                o13.p<Boolean, String> pVarO = jm0.e.o(editText6.getText().toString());
                                Boolean bool3 = pVarO.f128594a;
                                String str6 = pVarO.f128595b;
                                if (!bool3.booleanValue()) {
                                    Toast.makeText(groupSettingsActivity2, R.string.msg_valid_url, 1).show();
                                } else {
                                    groupSettingsActivity2.f31439t.f31570m = str6;
                                    groupSettingsActivity2.f31433m.setButtonBottomLeftLabel(str6);
                                }
                                break;
                            default:
                                int i312 = GroupSettingsActivity.f31420z;
                                String string8 = editText6.getText().toString();
                                groupSettingsActivity2.f31439t.f31559b = string8;
                                groupSettingsActivity2.f31428h.setButtonBottomLeftLabel(string8);
                                break;
                        }
                    }
                });
                GroupSettingsActivity.ga(editText5, groupSettingsActivity.f31439t.f31571n, groupSettingsActivity.getString(R.string.lbl_enter_group_facebook));
                editText5.setFilters(new InputFilter[]{new InputFilter.LengthFilter(256), new l0(3), groupSettingsActivity.f31421a});
                eVarDa5.getWindow().setSoftInputMode(4);
                eVarDa5.show();
                break;
            default:
                int i38 = GroupSettingsActivity.f31420z;
                String string6 = groupSettingsActivity.getString(R.string.f28714x);
                View viewCa6 = groupSettingsActivity.ca();
                final EditText editText6 = (EditText) viewCa6.findViewById(R.id.dialog_edit_text);
                editText6.setInputType(524432);
                androidx.appcompat.app.e eVarDa6 = groupSettingsActivity.da(string6, viewCa6, new DialogInterface.OnClickListener() { // from class: j10.k
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i210) {
                        String str3;
                        int i211 = i16;
                        EditText editText7 = editText6;
                        GroupSettingsActivity groupSettingsActivity2 = groupSettingsActivity;
                        switch (i211) {
                            case 0:
                                int i212 = GroupSettingsActivity.f31420z;
                                String string7 = editText7.getText().toString();
                                str3 = TextUtils.isEmpty(string7) ? null : string7;
                                groupSettingsActivity2.f31439t.f31560c = str3;
                                groupSettingsActivity2.f31429i.setButtonBottomLeftLabel(str3);
                                break;
                            case 1:
                                int i39 = GroupSettingsActivity.f31420z;
                                o13.p<Boolean, String> pVarM = jm0.e.m(editText7.getText().toString());
                                Boolean bool = pVarM.f128594a;
                                String str4 = pVarM.f128595b;
                                if (!bool.booleanValue()) {
                                    dialogInterface.dismiss();
                                    androidx.appcompat.app.e.a aVar3 = new androidx.appcompat.app.e.a(groupSettingsActivity2);
                                    aVar3.setTitle(R.string.social_invalid_fb_url_title);
                                    aVar3.setMessage(R.string.social_invalid_fb_url_message);
                                    aVar3.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
                                    aVar3.create().show();
                                } else {
                                    groupSettingsActivity2.f31439t.f31571n = str4;
                                    groupSettingsActivity2.f31431k.setButtonBottomLeftLabel(str4);
                                }
                                break;
                            case 2:
                                int i310 = GroupSettingsActivity.f31420z;
                                String string8 = editText7.getText().toString();
                                str3 = TextUtils.isEmpty(string8) ? null : string8;
                                groupSettingsActivity2.f31439t.f31569l = str3;
                                groupSettingsActivity2.f31430j.setButtonBottomLeftLabel(str3);
                                break;
                            case 3:
                                int i311 = GroupSettingsActivity.f31420z;
                                o13.p<Boolean, String> pVarN = jm0.e.n(editText7.getText().toString());
                                Boolean bool2 = pVarN.f128594a;
                                String str5 = pVarN.f128595b;
                                if (!bool2.booleanValue()) {
                                    Toast.makeText(groupSettingsActivity2, R.string.msg_error_invalid_name_x_former_twitter, 1).show();
                                } else {
                                    groupSettingsActivity2.f31439t.f31572o = str5;
                                    groupSettingsActivity2.f31432l.setButtonBottomLeftLabel(str5);
                                }
                                break;
                            case 4:
                                int i312 = GroupSettingsActivity.f31420z;
                                o13.p<Boolean, String> pVarO = jm0.e.o(editText7.getText().toString());
                                Boolean bool3 = pVarO.f128594a;
                                String str6 = pVarO.f128595b;
                                if (!bool3.booleanValue()) {
                                    Toast.makeText(groupSettingsActivity2, R.string.msg_valid_url, 1).show();
                                } else {
                                    groupSettingsActivity2.f31439t.f31570m = str6;
                                    groupSettingsActivity2.f31433m.setButtonBottomLeftLabel(str6);
                                }
                                break;
                            default:
                                int i313 = GroupSettingsActivity.f31420z;
                                String string9 = editText7.getText().toString();
                                groupSettingsActivity2.f31439t.f31559b = string9;
                                groupSettingsActivity2.f31428h.setButtonBottomLeftLabel(string9);
                                break;
                        }
                    }
                });
                GroupSettingsActivity.ga(editText6, groupSettingsActivity.f31439t.f31572o, groupSettingsActivity.getString(R.string.lbl_enter_group_x));
                editText6.setFilters(new InputFilter[]{new InputFilter.LengthFilter(16), new l0(5), groupSettingsActivity.f31421a});
                eVarDa6.getWindow().setSoftInputMode(4);
                eVarDa6.show();
                break;
        }
    }
}
