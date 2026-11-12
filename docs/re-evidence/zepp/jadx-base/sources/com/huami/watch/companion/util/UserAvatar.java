package com.huami.watch.companion.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.huami.watch.companion.account.UserInfo;
import com.huami.watch.companion.account.UserInfoManager;
import com.huami.watch.companionlib.R;
import com.huami.watch.util.DensityUtil;
import com.huami.watch.util.Log;
import java.io.File;

/* JADX INFO: loaded from: classes16.dex */
public class UserAvatar {
    private static final String a = "Util-UserAvatar";

    public class a extends SimpleTarget<File> {
        public final /* synthetic */ UserInfo d;

        public a(UserInfo userInfo) {
            this.d = userInfo;
        }

        @Override // com.bumptech.glide.request.target.Target
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResourceReady(@NonNull File file, @Nullable Transition<? super File> transition) {
            Log.d(UserAvatar.a, "Download Avatar, Save To : " + file, new Object[0]);
            if (file.exists()) {
                this.d.setAvatarLocalUri(Uri.fromFile(file).toString());
                UserInfoManager.save(this.d);
            }
        }
    }

    private static int a(@NonNull UserInfo userInfo) {
        return userInfo.getGender() == 0 ? R.drawable.ic_gender_female : R.drawable.ic_gender_male;
    }

    private static int b(Context context) {
        if (context == null) {
            return 0;
        }
        return (int) DensityUtil.dpToPx(context, 66.0f);
    }

    private static String c(@NonNull UserInfo userInfo) {
        String avatarLocalUri = userInfo.getAvatarLocalUri();
        return (TextUtils.isEmpty(avatarLocalUri) || !new File(Uri.parse(avatarLocalUri).getPath()).exists()) ? userInfo.getAvatar() : avatarLocalUri;
    }

    private static boolean d(@NonNull UserInfo userInfo) {
        return !TextUtils.isEmpty(userInfo.getAvatar()) && TextUtils.isEmpty(userInfo.getAvatarLocalUri());
    }

    public static void download(Context context, @NonNull UserInfo userInfo) {
        if (d(userInfo)) {
            ImageLoader.download(context, userInfo.getAvatar(), new a(userInfo));
        }
    }

    public static void loadRectTo(Activity activity, ImageView imageView) {
        loadRectTo(activity, UserInfoManager.get(), imageView);
    }

    public static void loadTo(Activity activity, ImageView imageView) {
        loadTo(activity, UserInfoManager.get(), imageView);
    }

    public static void preload(Activity activity, @NonNull UserInfo userInfo) {
        if (d(userInfo) || TextUtils.isEmpty(userInfo.getAvatarLocalUri())) {
            return;
        }
        ImageLoader.preload(activity, userInfo.getAvatarLocalUri());
    }

    public static void loadRectTo(Activity activity, UserInfo userInfo, ImageView imageView) {
        ImageLoader.load(activity, c(userInfo), imageView, false, a(userInfo), b(activity));
    }

    public static void loadTo(Fragment fragment, UserInfo userInfo, ImageView imageView) {
        ImageLoader.load(fragment, c(userInfo), imageView, true, a(userInfo), b(fragment.getActivity()));
    }

    public static void loadTo(Activity activity, UserInfo userInfo, ImageView imageView) {
        ImageLoader.load(activity, c(userInfo), imageView, true, a(userInfo), b(activity));
    }
}
