package com.huawei.phoneservice.feedback.mvp.base;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.media.MediaQueryHelper;
import com.huawei.operation.utils.Constants;
import com.huawei.phoneservice.faq.base.util.IntentCheckUtils;
import com.huawei.phoneservice.faq.base.util.l;
import com.huawei.phoneservice.feedback.R;
import com.huawei.phoneservice.feedback.entity.FeedbackBean;
import com.huawei.phoneservice.feedback.mvp.base.f;
import com.huawei.phoneservice.feedback.ui.FeedBaseActivity;
import com.huawei.phoneservice.feedbackcommon.photolibrary.MimeType;
import com.huawei.phoneservice.feedbackcommon.photolibrary.internal.entity.MediaItem;
import com.huawei.secure.android.common.intent.SafeIntent;
import com.huawei.uikit.hwcolumnsystem.widget.HwColumnSystem;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class FeedbackBaseActivity<P extends f> extends FeedBaseActivity {
    private P e;

    protected abstract P y();

    public void z() {
        Intent intentCreateGalleryIntent = IntentCheckUtils.createGalleryIntent(getApplicationContext());
        if (intentCreateGalleryIntent == null) {
            com.huawei.phoneservice.faq.base.util.g.c("FeedbackBaseActivity", "GalleryIntent is null");
            d("onShowFileChooserFail");
        }
        try {
            startActivityForResult(intentCreateGalleryIntent, 100);
        } catch (ActivityNotFoundException e) {
            com.huawei.phoneservice.faq.base.util.g.c("FeedbackBaseActivity", e.getMessage());
        }
    }

    public int x() {
        int iJ = new HwColumnSystem(this).j();
        if (!com.huawei.phoneservice.feedback.media.impl.utils.c.c()) {
            if (iJ < 4) {
                return 4;
            }
            return iJ;
        }
        if (iJ <= 4) {
            iJ = 6;
        }
        int i = getResources().getConfiguration().orientation;
        int i2 = (i != 1 || iJ < 8) ? iJ : 6;
        if (i != 2 || i2 < 12) {
            return i2;
        }
        return 10;
    }

    public void w() {
        AlertDialog alertDialog = this.d;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedBaseActivity, com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        P p = this.e;
        if (p != null) {
            p.b();
        }
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedBaseActivity, com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (this.e == null) {
            this.e = (P) y();
        }
        this.e.a();
        super.onCreate(bundle);
    }

    public void a(MediaItem mediaItem) {
        Uri uriForFile;
        if (mediaItem == null || mediaItem.getFilePath() == null) {
            return;
        }
        File file = new File(mediaItem.getFilePath());
        String strB = com.huawei.phoneservice.feedbackcommon.utils.e.b();
        try {
            if (TextUtils.isEmpty(strB)) {
                strB = getPackageName() + ".fileprovider";
            }
            uriForFile = FileProvider.getUriForFile(this, strB, file);
        } catch (IllegalArgumentException e) {
            com.huawei.phoneservice.faq.base.util.g.c("FeedbackBaseActivity", e.getMessage());
            uriForFile = null;
        }
        if (uriForFile == null) {
            return;
        }
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
        intent.addFlags(1);
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setDataAndType(uriForFile, MimeType.isVideo(mediaItem.getMimeType()) ? MediaQueryHelper.VideoType.TYPE_ALL : Constants.IMAGE_TYPE);
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            com.huawei.phoneservice.faq.base.util.g.c("FeedbackBaseActivity", e2.getMessage());
        }
    }

    public void a(FeedbackBean feedbackBean, int i) {
        MediaItem mediaItem;
        String filePath;
        if (feedbackBean == null || feedbackBean.getMedias() == null) {
            return;
        }
        List<MediaItem> medias = feedbackBean.getMedias();
        if (i < 0 || i >= medias.size() || (mediaItem = medias.get(i)) == null || (filePath = mediaItem.getFilePath()) == null) {
            return;
        }
        File file = new File(filePath);
        if (file.exists()) {
            file.delete();
        }
    }

    public void a(FeedbackBean feedbackBean) {
        if (feedbackBean == null || feedbackBean.getMedias() == null) {
            return;
        }
        Iterator<MediaItem> it = feedbackBean.getMedias().iterator();
        while (it.hasNext()) {
            String filePath = it.next().getFilePath();
            if (filePath != null) {
                File file = new File(filePath);
                if (file.exists()) {
                    file.delete();
                }
            }
        }
    }

    public List<MediaItem> a(SafeIntent safeIntent, FeedbackBean feedbackBean) throws Throwable {
        boolean z;
        String string;
        if (safeIntent == null || safeIntent.getData() == null || feedbackBean == null) {
            return null;
        }
        Uri data = safeIntent.getData();
        List<MediaItem> medias = feedbackBean.getMedias();
        if (medias == null) {
            medias = new ArrayList<>();
        }
        Iterator<MediaItem> it = medias.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (MimeType.isVideo(it.next().getMimeType())) {
                z = true;
                break;
            }
        }
        File fileC = com.huawei.phoneservice.feedbackcommon.utils.a.c(this, data, String.valueOf(System.currentTimeMillis()));
        if (!fileC.exists()) {
            return null;
        }
        String path = fileC.getPath();
        String mimeType = MimeType.getMimeType(path);
        long length = fileC.length();
        if (MimeType.isVideo(mimeType)) {
            if (z) {
                string = getString(R.string.feedback_sdk_upload_video_count_remind);
            } else if (length > ((long) com.huawei.phoneservice.feedbackcommon.utils.e.c()) * 1048576) {
                string = getString(R.string.feedback_sdk_upload_video_remind, new Object[]{Integer.valueOf(com.huawei.phoneservice.feedbackcommon.utils.e.c())});
            }
            l.e(this, string);
            fileC.delete();
            return null;
        }
        medias.add(new MediaItem(data.toString(), path, mimeType, length));
        return medias;
    }
}
