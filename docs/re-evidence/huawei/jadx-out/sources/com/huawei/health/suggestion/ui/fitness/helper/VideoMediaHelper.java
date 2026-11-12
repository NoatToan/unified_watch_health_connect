package com.huawei.health.suggestion.ui.fitness.helper;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.health.suggestion.ui.fitness.helper.inter.VideoInterface;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class VideoMediaHelper extends MediaHelper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9344c;

    public VideoMediaHelper(Context context) {
        super(context);
        this.f9344c = 0;
    }

    public VideoMediaHelper(int i) {
        super(i);
        this.f9344c = 0;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.MediaHelper, com.huawei.health.suggestion.ui.fitness.helper.inter.VideoInterface
    public VideoInterface start() {
        this.f9344c = 0;
        return super.start();
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.MediaHelper, com.huawei.health.suggestion.ui.fitness.helper.inter.VideoInterface
    public VideoInterface setMediaSources(Uri... uriArr) {
        this.f9344c = 0;
        return super.setMediaSources(uriArr);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.MediaHelper, com.huawei.health.suggestion.ui.fitness.helper.inter.VideoInterface
    public VideoInterface setAssetSources(String... strArr) {
        this.f9344c = 0;
        return super.setAssetSources(strArr);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.MediaHelper, com.huawei.health.suggestion.ui.fitness.helper.inter.VideoInterface
    public VideoInterface setAudioAssetSources(List<String> list) {
        this.f9344c = 0;
        return super.setAudioAssetSources(list);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.MediaHelper, com.huawei.health.suggestion.ui.fitness.helper.inter.VideoInterface
    public VideoInterface setSdSources(String... strArr) {
        this.f9344c = 0;
        return super.setSdSources(strArr);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.MediaHelper
    public VideoInterface c(List<String> list) {
        this.f9344c = 0;
        return super.c(list);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.MediaHelper, com.huawei.health.suggestion.ui.fitness.helper.inter.VideoInterface
    public VideoInterface setRawSources(Integer... numArr) {
        this.f9344c = 0;
        return super.setRawSources(numArr);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.MediaHelper, com.huawei.health.suggestion.ui.fitness.helper.inter.VideoInterface
    public VideoInterface stop() {
        this.f9344c = 0;
        return super.stop();
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.MediaHelper, com.huawei.health.suggestion.ui.fitness.helper.inter.VideoInterface
    public VideoInterface pause() {
        if (p() != null && p().isPlaying()) {
            p().pause();
            this.f9344c = p().getCurrentPosition();
        }
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.MediaHelper, com.huawei.health.suggestion.ui.fitness.helper.inter.VideoInterface
    public VideoInterface videoContinue() {
        LogUtil.a("Suggestion_VideoMediaHelper", "Continue");
        if (this.e != null) {
            try {
                String strF = f();
                LogUtil.a("Suggestion_VideoMediaHelper", "Continue  currentName = ", strF);
                if (!TextUtils.isEmpty(strF)) {
                    this.e.reset();
                    this.e.setDataSource(strF);
                    this.e.setLooping(true);
                    this.e.prepare();
                    LogUtil.a("Suggestion_VideoMediaHelper", "Continue  mCurrentPosition = ", Integer.valueOf(this.f9344c));
                    if (this.f9344c != 0) {
                        this.e.seekTo(this.f9344c);
                    }
                    this.f9344c = 0;
                    r();
                    this.e.start();
                }
            } catch (IOException | IllegalArgumentException | IllegalStateException | SecurityException e) {
                LogUtil.e("Suggestion_VideoMediaHelper", "setDataSource fail -- ", e.getMessage());
            }
        }
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.MediaHelper, com.huawei.health.suggestion.ui.fitness.helper.inter.VideoInterface
    public VideoInterface release() {
        this.f9344c = 0;
        return super.release();
    }
}
