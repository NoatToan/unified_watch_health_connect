package com.huawei.health.suggestion.ui.fitness.helper;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import com.huawei.health.suggestion.h5pro.AudioConstant;
import com.huawei.health.suggestion.ui.fitness.helper.inter.VideoInterface;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class MediaHelper extends PlayerHelper implements VideoInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f9338a;
    protected String d;
    protected MediaPlayer e;

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.VideoInterface
    public VideoInterface stop() {
        return this;
    }

    public MediaHelper(Context context) {
        super(context);
        this.f9338a = AudioConstant.WOMAN;
        this.e = p().getPlayer();
    }

    public MediaHelper(int i) {
        super(i);
        this.f9338a = AudioConstant.WOMAN;
        this.e = p().getPlayer();
    }

    public MediaHelper() {
        this.f9338a = AudioConstant.WOMAN;
        this.e = p().getPlayer();
    }

    public int j() {
        return p().getCurrentPosition();
    }

    public void b(int i) {
        p().setCurrent(i);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.VideoInterface
    public VideoInterface start() {
        p().start();
        return this;
    }

    public void e(float f) {
        p().setPlayerSpeed(f);
    }

    public void a(boolean z) {
        p().setLooper(z);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.VideoInterface
    public VideoInterface setMediaSources(Uri... uriArr) {
        p().setMediaSources(uriArr);
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.VideoInterface
    public VideoInterface setAssetSources(String... strArr) {
        p().setAssetSources(strArr);
        return this;
    }

    public int h() {
        return p().getDarkAreaWidth();
    }

    public int i() {
        return p().getDarkAreaHeight();
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.VideoInterface
    public VideoInterface setAudioAssetSources(List<String> list) {
        p().setAudioAssetSources(list);
        return this;
    }

    public void d(String str) {
        p().setSdSourcesBackground(str);
    }

    public VideoInterface setSdSources(String... strArr) {
        p().setSdSources(strArr);
        return this;
    }

    public VideoInterface c(List<String> list) {
        p().setSdSources(list);
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.VideoInterface
    public VideoInterface setRawSources(Integer... numArr) {
        p().setRawSources(numArr);
        return this;
    }

    public void b(SurfaceHolder surfaceHolder) {
        p().setDisplay(surfaceHolder);
    }

    public void c(SurfaceView surfaceView) {
        p().setSurfaceDisplay(surfaceView);
    }

    public void c(ViewGroup viewGroup) {
        p().setSurfaceParentGlobalLayoutListener(viewGroup);
    }

    public VideoInterface d(Surface surface) {
        p().setSurface(surface);
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.VideoInterface
    public VideoInterface pause() {
        p().pause();
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.VideoInterface
    public VideoInterface repeat() {
        p().repeat();
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.VideoInterface
    public VideoInterface pre() {
        p().pre();
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.VideoInterface
    public VideoInterface next() {
        p().next();
        return this;
    }

    public VideoInterface videoContinue() {
        p().videoContinue();
        return this;
    }

    public MediaHelper b(boolean z) {
        p().setLooping(z);
        return this;
    }

    public VideoInterface release() {
        p().release();
        return this;
    }

    public String f() {
        return p().getCurrentName();
    }

    public int k() {
        return p().getSourceNum();
    }

    public int l() {
        return p().getVideoWidth();
    }

    public int m() {
        return p().getVideoHeight();
    }

    public void b(float f) {
        p().setVolume(f);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.VideoInterface
    public void saveCurrent(int i) {
        p().saveCurrent(i);
    }

    public void c(int i) {
        if (i == 1) {
            this.f9338a = AudioConstant.WOMAN;
        } else {
            this.f9338a = "M";
        }
        p().setGender(i);
    }

    public boolean o() {
        return p().isPlaying();
    }

    public int g() {
        return p().getDuration();
    }

    public void n() {
        p().reset();
    }

    public List<String> d(int i) {
        return p().getNumberPaths(i);
    }

    public void b(String str) {
        this.d = str;
        p().saveFitnessType(str);
    }

    public void r() {
        p().setVideoScalingMode();
    }
}
