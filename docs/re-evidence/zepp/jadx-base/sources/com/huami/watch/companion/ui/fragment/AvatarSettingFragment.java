package com.huami.watch.companion.ui.fragment;

import android.app.DialogFragment;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.huami.devicerecorder.UriGetter;
import com.huami.watch.companion.R;
import com.huami.watch.companion.util.AvatarTools;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.AndroidPermissions;

/* JADX INFO: loaded from: classes16.dex */
public class AvatarSettingFragment extends Fragment {
    private static final int f = 0;
    private static final int g = 1;
    private static final int h = 2;
    private View a;
    private View b;
    private View c;
    private View d;
    private View e;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!AndroidPermissions.checkGranted(AvatarSettingFragment.this.getActivity(), "android.permission.CAMERA")) {
                AndroidPermissions.request(AvatarSettingFragment.this, new String[]{"android.permission.CAMERA"}, 2);
                return;
            }
            ((TextView) AvatarSettingFragment.this.d).setTextColor(AvatarSettingFragment.this.getResources().getColor(R.color.dark_red_text));
            AvatarSettingFragment.this.a.findViewById(R.id.arrow1).setSelected(true);
            AvatarSettingFragment.this.h();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((TextView) AvatarSettingFragment.this.e).setTextColor(AvatarSettingFragment.this.getResources().getColor(R.color.dark_grey_text));
            AvatarSettingFragment.this.a.findViewById(R.id.arrow2).setSelected(true);
            AvatarSettingFragment.this.g();
        }
    }

    private void f() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null || !(parentFragment instanceof DialogFragment)) {
            return;
        }
        ((DialogFragment) parentFragment).dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        f();
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(UriGetter.ShareContentType.IMAGE);
        getActivity().startActivityForResult(intent, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        f();
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.addFlags(1);
        intent.putExtra("output", AvatarTools.getImageUri(getActivity()));
        intent.putExtra("android.intent.extra.videoQuality", 1);
        if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
            getActivity().startActivityForResult(intent, 1);
        }
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_avatar_setting, viewGroup, false);
        this.a = viewInflate;
        this.b = viewInflate.findViewById(R.id.takephoto);
        this.c = this.a.findViewById(R.id.choose);
        this.d = this.a.findViewById(R.id.take_photo);
        this.e = this.a.findViewById(R.id.select_from_gallery);
        this.b.setOnClickListener(new a());
        this.c.setOnClickListener(new b());
        return this.a;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        Analytics.endPage("AvatarSettingFragment");
    }

    @Override // android.app.Fragment
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (i == 2 && iArr[0] == 0) {
            h();
        }
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        Analytics.startPage("AvatarSettingFragment");
    }
}
