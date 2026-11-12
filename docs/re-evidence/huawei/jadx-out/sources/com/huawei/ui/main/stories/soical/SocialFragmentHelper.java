package com.huawei.ui.main.stories.soical;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.webkit.ProxyConfig;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.health.operationbundle.R;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.lmf;
import defpackage.njy;
import defpackage.qqf;
import defpackage.tsr;
import defpackage.woo;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes43.dex */
public class SocialFragmentHelper {
    private final Context e;

    public SocialFragmentHelper(Context context) {
        this.e = context;
    }

    public void d(MessageObject messageObject, int[] iArr, Handler handler) {
        String imgUri;
        int i;
        LogUtil.a("UIDV_SocialFragmentHelper", "downloadPic");
        if (!TextUtils.isEmpty(messageObject.getHarmonyImgUrl())) {
            imgUri = messageObject.getHarmonyImgUrl();
        } else if (!TextUtils.isEmpty(messageObject.getImgBigUri())) {
            imgUri = messageObject.getImgBigUri();
        } else if (!TextUtils.isEmpty(messageObject.getImgUri())) {
            imgUri = messageObject.getImgUri();
        } else {
            imgUri = "";
        }
        String str = imgUri;
        String msgId = messageObject.getMsgId();
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(msgId)) {
            LogUtil.j("UIDV_SocialFragmentHelper", "downloadPic() msgId or url is empty.");
            return;
        }
        String scheme = Uri.parse(str).getScheme();
        ImageView imageView = new ImageView(this.e);
        int iA = woo.a(this.e);
        if (woo.e(iArr)) {
            i = (iArr[1] * iA) / iArr[0];
        } else {
            i = (iA * 9) / 21;
        }
        imageView.setLayoutParams(new FrameLayout.LayoutParams(iA, i));
        if ("http".equalsIgnoreCase(scheme) || ProxyConfig.MATCH_HTTPS.equalsIgnoreCase(scheme)) {
            LogUtil.a("UIDV_SocialFragmentHelper", "HTTP scheme = ", scheme);
            c(str, imageView, messageObject, iArr, handler);
        } else {
            LogUtil.a("UIDV_SocialFragmentHelper", "scheme is not http or https，scheme = ", scheme);
        }
    }

    private void c(String str, final ImageView imageView, final MessageObject messageObject, final int[] iArr, final Handler handler) {
        if (a(this.e)) {
            qqf.b(str, new CustomTarget<Drawable>() { // from class: com.huawei.ui.main.stories.soical.SocialFragmentHelper.2
                @Override // com.bumptech.glide.request.target.Target
                public void onLoadCleared(Drawable drawable) {
                }

                @Override // com.bumptech.glide.request.target.Target
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onResourceReady(Drawable drawable, Transition<? super Drawable> transition) {
                    SocialFragmentHelper.this.a(drawable, imageView, messageObject, iArr, handler);
                }

                @Override // com.bumptech.glide.request.target.CustomTarget, com.bumptech.glide.request.target.Target
                public void onLoadFailed(Drawable drawable) {
                    super.onLoadFailed(drawable);
                    LogUtil.a("UIDV_SocialFragmentHelper", "picture download failture，msgId = ", messageObject.getMsgId());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Drawable drawable, ImageView imageView, MessageObject messageObject, int[] iArr, Handler handler) {
        Bitmap bitmapE = qqf.e(R.drawable.message_ad, this.e);
        String string = this.e.getResources().getString(R.string.IDS_messageCenter_ad_logo);
        if (!(drawable instanceof BitmapDrawable)) {
            LogUtil.j("UIDV_SocialFragmentHelper", "loadPic onResourceReady drawable is not BitmapDrawable");
            return;
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        if (bitmap == null || bitmap.isRecycled()) {
            LogUtil.j("UIDV_SocialFragmentHelper", "loadPic onResourceReady bitmap is null");
            return;
        }
        Bitmap bitmapE2 = qqf.e(bitmap, imageView);
        if (bitmapE2 == null || bitmapE2.isRecycled()) {
            LogUtil.j("UIDV_SocialFragmentHelper", "loadPic onResourceReady zoomBitmap is null");
            return;
        }
        Bitmap bitmapA = qqf.a(bitmapE2, imageView, 3);
        if (bitmapA == null || bitmapA.isRecycled()) {
            LogUtil.j("UIDV_SocialFragmentHelper", "loadPic onResourceReady cropBitmap is null");
            return;
        }
        int[] iArr2 = {0, 0};
        if (qqf.b(imageView, iArr2)) {
            bitmapA = qqf.d(bitmapA, iArr2[0], iArr2[1], (int) this.e.getResources().getDimension(R.dimen.cardCornerRadius));
        }
        if (bitmapA == null || bitmapA.isRecycled()) {
            LogUtil.j("UIDV_SocialFragmentHelper", "loadPic onResourceReady roundRectangleBitmap is null");
            return;
        }
        a aVar = new a();
        imageView.setImageBitmap(bitmapA);
        if ("2".equals(messageObject.getModule())) {
            LogUtil.a("UIDV_SocialFragmentHelper", "getModule is ad");
            Bitmap bitmapC = qqf.c(bitmapA, bitmapE, string, this.e);
            if (bitmapC != null && !bitmapC.isRecycled()) {
                imageView.setImageBitmap(bitmapC);
            }
        }
        aVar.b(imageView);
        aVar.b(messageObject);
        aVar.d(iArr);
        handler.sendMessage(handler.obtainMessage(23, 0, 0, aVar));
    }

    private boolean a(Context context) {
        if (context == null) {
            return false;
        }
        if (context instanceof Activity) {
            return !((Activity) context).isDestroyed();
        }
        return true;
    }

    public static void b(Context context, String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("type", str);
        map.put("title", str2);
        map.put("module", str3);
        lmf.d().c(context, AnalyticsValue.SOCIAL_1070004.value(), map, 0);
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MessageObject f28867a;
        private ImageView d;
        private int[] e;

        public ImageView b() {
            return this.d;
        }

        public void b(ImageView imageView) {
            this.d = imageView;
        }

        public MessageObject c() {
            return this.f28867a;
        }

        public void b(MessageObject messageObject) {
            this.f28867a = messageObject;
        }

        public int[] a() {
            int[] iArr = this.e;
            return iArr != null ? Arrays.copyOf(iArr, iArr.length) : new int[0];
        }

        public void d(int[] iArr) {
            if (iArr != null) {
                this.e = Arrays.copyOf(iArr, iArr.length);
            }
        }
    }

    public boolean a(List<MessageObject> list, List<MessageObject> list2) {
        boolean z = false;
        for (int i = 0; i < list.size(); i++) {
            z = false;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (c(list.get(i), list2.get(i2))) {
                    z = true;
                }
            }
            LogUtil.a("UIDV_SocialFragmentHelper", "isContains = ", Boolean.valueOf(z));
            if (!z) {
                return z;
            }
        }
        return z;
    }

    public static boolean c(MessageObject messageObject, MessageObject messageObject2) {
        if (messageObject != null && messageObject2 != null) {
            boolean z = messageObject instanceof tsr;
            boolean z2 = messageObject2 instanceof tsr;
            if (!z && !z2) {
                return Objects.equals(messageObject.getMsgId(), messageObject2.getMsgId()) && messageObject.getCreateTime() == messageObject2.getCreateTime();
            }
            if (z && z2) {
                return Objects.equals(messageObject, messageObject2);
            }
        }
        return false;
    }

    public void c(List<MessageObject> list, Handler handler) {
        if (njy.e(list)) {
            LogUtil.j("UIDV_SocialFragmentHelper", "checkDownPic() adDisplayList is empty. no Ad message");
            return;
        }
        LogUtil.a("UIDV_SocialFragmentHelper", "checkDownPic bannerMessageSize = ", Integer.valueOf(list.size()));
        int[] iArrB = woo.b(list);
        for (MessageObject messageObject : list) {
            if (messageObject == null) {
                LogUtil.j("UIDV_SocialFragmentHelper", "checkDownPic() messageObject is null.");
            } else {
                LogUtil.a("UIDV_SocialFragmentHelper", "checkDownPic messageId = ", messageObject.getMsgId());
                d(messageObject, iArrB, handler);
            }
        }
    }

    public void c(List<MessageObject> list, MessageObject messageObject, List<ImageView> list2, ImageView imageView) {
        boolean z = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null && messageObject.getMsgId().equals(list.get(i).getMsgId())) {
                list.set(i, messageObject);
                list2.set(i, imageView);
                z = true;
            }
        }
        if (!z) {
            list.add(messageObject);
            list2.add(imageView);
        }
        LogUtil.a("UIDV_SocialFragmentHelper", "adMessageDownloadList.size() = ", Integer.valueOf(list.size()));
    }
}
