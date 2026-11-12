package com.kogitune.activity_transition.core;

import android.content.Context;
import android.os.Bundle;
import com.kogitune.activity_transition.BuildConfigUtils;

/* JADX INFO: loaded from: classes18.dex */
public class TransitionData {
    public static final String EXTRA_IMAGE_HEIGHT = ".height";
    public static final String EXTRA_IMAGE_LEFT = ".left";
    public static final String EXTRA_IMAGE_PATH = ".imageFilePath";
    public static final String EXTRA_IMAGE_TOP = ".top";
    public static final String EXTRA_IMAGE_WIDTH = ".width";
    private String a;
    public final String imageFilePath;
    public final int thumbnailHeight;
    public final int thumbnailLeft;
    public final int thumbnailTop;
    public final int thumbnailWidth;

    public TransitionData(Context context, int i, int i2, int i3, int i4, String str) {
        a(context);
        this.thumbnailLeft = i;
        this.thumbnailTop = i2;
        this.thumbnailWidth = i3;
        this.thumbnailHeight = i4;
        this.imageFilePath = str;
    }

    private void a(Context context) {
        this.a = (String) BuildConfigUtils.getBuildConfigValue(context, "APPLICATION_ID");
    }

    public Bundle getBundle() {
        Bundle bundle = new Bundle();
        if (this.imageFilePath != null) {
            bundle.putString(this.a + EXTRA_IMAGE_PATH, this.imageFilePath);
        }
        bundle.putInt(this.a + EXTRA_IMAGE_LEFT, this.thumbnailLeft);
        bundle.putInt(this.a + EXTRA_IMAGE_TOP, this.thumbnailTop);
        bundle.putInt(this.a + EXTRA_IMAGE_WIDTH, this.thumbnailWidth);
        bundle.putInt(this.a + EXTRA_IMAGE_HEIGHT, this.thumbnailHeight);
        return bundle;
    }

    public TransitionData(Context context, Bundle bundle) {
        a(context);
        this.thumbnailTop = bundle.getInt(this.a + EXTRA_IMAGE_TOP);
        this.thumbnailLeft = bundle.getInt(this.a + EXTRA_IMAGE_LEFT);
        this.thumbnailWidth = bundle.getInt(this.a + EXTRA_IMAGE_WIDTH);
        this.thumbnailHeight = bundle.getInt(this.a + EXTRA_IMAGE_HEIGHT);
        this.imageFilePath = bundle.getString(this.a + EXTRA_IMAGE_PATH);
    }
}
