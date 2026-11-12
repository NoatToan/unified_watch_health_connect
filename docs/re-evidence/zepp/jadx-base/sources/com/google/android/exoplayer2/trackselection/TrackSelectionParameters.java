package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.accessibility.CaptioningManager;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class TrackSelectionParameters implements Parcelable {
    public static final Parcelable.Creator<TrackSelectionParameters> CREATOR;

    @Deprecated
    public static final TrackSelectionParameters DEFAULT;
    public static final TrackSelectionParameters DEFAULT_WITHOUT_CONTEXT;
    public final boolean forceHighestSupportedBitrate;
    public final boolean forceLowestBitrate;
    public final int maxAudioBitrate;
    public final int maxAudioChannelCount;
    public final int maxVideoBitrate;
    public final int maxVideoFrameRate;
    public final int maxVideoHeight;
    public final int maxVideoWidth;
    public final int minVideoBitrate;
    public final int minVideoFrameRate;
    public final int minVideoHeight;
    public final int minVideoWidth;
    public final ImmutableList<String> preferredAudioLanguages;
    public final ImmutableList<String> preferredAudioMimeTypes;
    public final int preferredAudioRoleFlags;
    public final ImmutableList<String> preferredTextLanguages;
    public final int preferredTextRoleFlags;
    public final ImmutableList<String> preferredVideoMimeTypes;
    public final boolean selectUndeterminedTextLanguage;
    public final int viewportHeight;
    public final boolean viewportOrientationMayChange;
    public final int viewportWidth;

    public class a implements Parcelable.Creator<TrackSelectionParameters> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrackSelectionParameters createFromParcel(Parcel in) {
            return new TrackSelectionParameters(in);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TrackSelectionParameters[] newArray(int size) {
            return new TrackSelectionParameters[size];
        }
    }

    static {
        TrackSelectionParameters trackSelectionParametersBuild = new Builder().build();
        DEFAULT_WITHOUT_CONTEXT = trackSelectionParametersBuild;
        DEFAULT = trackSelectionParametersBuild;
        CREATOR = new a();
    }

    public TrackSelectionParameters(Builder builder) {
        this.maxVideoWidth = builder.a;
        this.maxVideoHeight = builder.b;
        this.maxVideoFrameRate = builder.c;
        this.maxVideoBitrate = builder.d;
        this.minVideoWidth = builder.e;
        this.minVideoHeight = builder.f;
        this.minVideoFrameRate = builder.g;
        this.minVideoBitrate = builder.h;
        this.viewportWidth = builder.i;
        this.viewportHeight = builder.j;
        this.viewportOrientationMayChange = builder.k;
        this.preferredVideoMimeTypes = builder.l;
        this.preferredAudioLanguages = builder.m;
        this.preferredAudioRoleFlags = builder.n;
        this.maxAudioChannelCount = builder.o;
        this.maxAudioBitrate = builder.p;
        this.preferredAudioMimeTypes = builder.q;
        this.preferredTextLanguages = builder.r;
        this.preferredTextRoleFlags = builder.s;
        this.selectUndeterminedTextLanguage = builder.t;
        this.forceLowestBitrate = builder.u;
        this.forceHighestSupportedBitrate = builder.v;
    }

    public static TrackSelectionParameters getDefaults(Context context) {
        return new Builder(context).build();
    }

    public Builder buildUpon() {
        return new Builder(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrackSelectionParameters trackSelectionParameters = (TrackSelectionParameters) obj;
        return this.maxVideoWidth == trackSelectionParameters.maxVideoWidth && this.maxVideoHeight == trackSelectionParameters.maxVideoHeight && this.maxVideoFrameRate == trackSelectionParameters.maxVideoFrameRate && this.maxVideoBitrate == trackSelectionParameters.maxVideoBitrate && this.minVideoWidth == trackSelectionParameters.minVideoWidth && this.minVideoHeight == trackSelectionParameters.minVideoHeight && this.minVideoFrameRate == trackSelectionParameters.minVideoFrameRate && this.minVideoBitrate == trackSelectionParameters.minVideoBitrate && this.viewportOrientationMayChange == trackSelectionParameters.viewportOrientationMayChange && this.viewportWidth == trackSelectionParameters.viewportWidth && this.viewportHeight == trackSelectionParameters.viewportHeight && this.preferredVideoMimeTypes.equals(trackSelectionParameters.preferredVideoMimeTypes) && this.preferredAudioLanguages.equals(trackSelectionParameters.preferredAudioLanguages) && this.preferredAudioRoleFlags == trackSelectionParameters.preferredAudioRoleFlags && this.maxAudioChannelCount == trackSelectionParameters.maxAudioChannelCount && this.maxAudioBitrate == trackSelectionParameters.maxAudioBitrate && this.preferredAudioMimeTypes.equals(trackSelectionParameters.preferredAudioMimeTypes) && this.preferredTextLanguages.equals(trackSelectionParameters.preferredTextLanguages) && this.preferredTextRoleFlags == trackSelectionParameters.preferredTextRoleFlags && this.selectUndeterminedTextLanguage == trackSelectionParameters.selectUndeterminedTextLanguage && this.forceLowestBitrate == trackSelectionParameters.forceLowestBitrate && this.forceHighestSupportedBitrate == trackSelectionParameters.forceHighestSupportedBitrate;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((this.maxVideoWidth + 31) * 31) + this.maxVideoHeight) * 31) + this.maxVideoFrameRate) * 31) + this.maxVideoBitrate) * 31) + this.minVideoWidth) * 31) + this.minVideoHeight) * 31) + this.minVideoFrameRate) * 31) + this.minVideoBitrate) * 31) + (this.viewportOrientationMayChange ? 1 : 0)) * 31) + this.viewportWidth) * 31) + this.viewportHeight) * 31) + this.preferredVideoMimeTypes.hashCode()) * 31) + this.preferredAudioLanguages.hashCode()) * 31) + this.preferredAudioRoleFlags) * 31) + this.maxAudioChannelCount) * 31) + this.maxAudioBitrate) * 31) + this.preferredAudioMimeTypes.hashCode()) * 31) + this.preferredTextLanguages.hashCode()) * 31) + this.preferredTextRoleFlags) * 31) + (this.selectUndeterminedTextLanguage ? 1 : 0)) * 31) + (this.forceLowestBitrate ? 1 : 0)) * 31) + (this.forceHighestSupportedBitrate ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.preferredAudioLanguages);
        dest.writeInt(this.preferredAudioRoleFlags);
        dest.writeList(this.preferredTextLanguages);
        dest.writeInt(this.preferredTextRoleFlags);
        Util.writeBoolean(dest, this.selectUndeterminedTextLanguage);
        dest.writeInt(this.maxVideoWidth);
        dest.writeInt(this.maxVideoHeight);
        dest.writeInt(this.maxVideoFrameRate);
        dest.writeInt(this.maxVideoBitrate);
        dest.writeInt(this.minVideoWidth);
        dest.writeInt(this.minVideoHeight);
        dest.writeInt(this.minVideoFrameRate);
        dest.writeInt(this.minVideoBitrate);
        dest.writeInt(this.viewportWidth);
        dest.writeInt(this.viewportHeight);
        Util.writeBoolean(dest, this.viewportOrientationMayChange);
        dest.writeList(this.preferredVideoMimeTypes);
        dest.writeInt(this.maxAudioChannelCount);
        dest.writeInt(this.maxAudioBitrate);
        dest.writeList(this.preferredAudioMimeTypes);
        Util.writeBoolean(dest, this.forceLowestBitrate);
        Util.writeBoolean(dest, this.forceHighestSupportedBitrate);
    }

    public static class Builder {
        private int a;
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;
        private int j;
        private boolean k;
        private ImmutableList<String> l;
        private ImmutableList<String> m;
        private int n;
        private int o;
        private int p;
        private ImmutableList<String> q;
        private ImmutableList<String> r;
        private int s;
        private boolean t;
        private boolean u;
        private boolean v;

        @Deprecated
        public Builder() {
            this.a = Integer.MAX_VALUE;
            this.b = Integer.MAX_VALUE;
            this.c = Integer.MAX_VALUE;
            this.d = Integer.MAX_VALUE;
            this.i = Integer.MAX_VALUE;
            this.j = Integer.MAX_VALUE;
            this.k = true;
            this.l = ImmutableList.of();
            this.m = ImmutableList.of();
            this.n = 0;
            this.o = Integer.MAX_VALUE;
            this.p = Integer.MAX_VALUE;
            this.q = ImmutableList.of();
            this.r = ImmutableList.of();
            this.s = 0;
            this.t = false;
            this.u = false;
            this.v = false;
        }

        @RequiresApi(19)
        private void w(Context context) {
            CaptioningManager captioningManager;
            if ((Util.SDK_INT >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.s = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.r = ImmutableList.of(Util.getLocaleLanguageTag(locale));
                }
            }
        }

        public TrackSelectionParameters build() {
            return new TrackSelectionParameters(this);
        }

        public Builder clearVideoSizeConstraints() {
            return setMaxVideoSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }

        public Builder clearViewportSizeConstraints() {
            return setViewportSize(Integer.MAX_VALUE, Integer.MAX_VALUE, true);
        }

        public Builder setForceHighestSupportedBitrate(boolean forceHighestSupportedBitrate) {
            this.v = forceHighestSupportedBitrate;
            return this;
        }

        public Builder setForceLowestBitrate(boolean forceLowestBitrate) {
            this.u = forceLowestBitrate;
            return this;
        }

        public Builder setMaxAudioBitrate(int maxAudioBitrate) {
            this.p = maxAudioBitrate;
            return this;
        }

        public Builder setMaxAudioChannelCount(int maxAudioChannelCount) {
            this.o = maxAudioChannelCount;
            return this;
        }

        public Builder setMaxVideoBitrate(int maxVideoBitrate) {
            this.d = maxVideoBitrate;
            return this;
        }

        public Builder setMaxVideoFrameRate(int maxVideoFrameRate) {
            this.c = maxVideoFrameRate;
            return this;
        }

        public Builder setMaxVideoSize(int maxVideoWidth, int maxVideoHeight) {
            this.a = maxVideoWidth;
            this.b = maxVideoHeight;
            return this;
        }

        public Builder setMaxVideoSizeSd() {
            return setMaxVideoSize(1279, 719);
        }

        public Builder setMinVideoBitrate(int minVideoBitrate) {
            this.h = minVideoBitrate;
            return this;
        }

        public Builder setMinVideoFrameRate(int minVideoFrameRate) {
            this.g = minVideoFrameRate;
            return this;
        }

        public Builder setMinVideoSize(int minVideoWidth, int minVideoHeight) {
            this.e = minVideoWidth;
            this.f = minVideoHeight;
            return this;
        }

        public Builder setPreferredAudioLanguage(@Nullable String preferredAudioLanguage) {
            return preferredAudioLanguage == null ? setPreferredAudioLanguages(new String[0]) : setPreferredAudioLanguages(preferredAudioLanguage);
        }

        public Builder setPreferredAudioLanguages(String... preferredAudioLanguages) {
            ImmutableList.Builder builder = ImmutableList.builder();
            for (String str : (String[]) Assertions.checkNotNull(preferredAudioLanguages)) {
                builder.add(Util.normalizeLanguageCode((String) Assertions.checkNotNull(str)));
            }
            this.m = builder.build();
            return this;
        }

        public Builder setPreferredAudioMimeType(@Nullable String mimeType) {
            return mimeType == null ? setPreferredAudioMimeTypes(new String[0]) : setPreferredAudioMimeTypes(mimeType);
        }

        public Builder setPreferredAudioMimeTypes(String... mimeTypes) {
            this.q = ImmutableList.copyOf(mimeTypes);
            return this;
        }

        public Builder setPreferredAudioRoleFlags(int preferredAudioRoleFlags) {
            this.n = preferredAudioRoleFlags;
            return this;
        }

        public Builder setPreferredTextLanguage(@Nullable String preferredTextLanguage) {
            return preferredTextLanguage == null ? setPreferredTextLanguages(new String[0]) : setPreferredTextLanguages(preferredTextLanguage);
        }

        public Builder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
            if (Util.SDK_INT >= 19) {
                w(context);
            }
            return this;
        }

        public Builder setPreferredTextLanguages(String... preferredTextLanguages) {
            ImmutableList.Builder builder = ImmutableList.builder();
            for (String str : (String[]) Assertions.checkNotNull(preferredTextLanguages)) {
                builder.add(Util.normalizeLanguageCode((String) Assertions.checkNotNull(str)));
            }
            this.r = builder.build();
            return this;
        }

        public Builder setPreferredTextRoleFlags(int preferredTextRoleFlags) {
            this.s = preferredTextRoleFlags;
            return this;
        }

        public Builder setPreferredVideoMimeType(@Nullable String mimeType) {
            return mimeType == null ? setPreferredVideoMimeTypes(new String[0]) : setPreferredVideoMimeTypes(mimeType);
        }

        public Builder setPreferredVideoMimeTypes(String... mimeTypes) {
            this.l = ImmutableList.copyOf(mimeTypes);
            return this;
        }

        public Builder setSelectUndeterminedTextLanguage(boolean selectUndeterminedTextLanguage) {
            this.t = selectUndeterminedTextLanguage;
            return this;
        }

        public Builder setViewportSize(int viewportWidth, int viewportHeight, boolean viewportOrientationMayChange) {
            this.i = viewportWidth;
            this.j = viewportHeight;
            this.k = viewportOrientationMayChange;
            return this;
        }

        public Builder setViewportSizeToPhysicalDisplaySize(Context context, boolean viewportOrientationMayChange) {
            Point currentDisplayModeSize = Util.getCurrentDisplayModeSize(context);
            return setViewportSize(currentDisplayModeSize.x, currentDisplayModeSize.y, viewportOrientationMayChange);
        }

        public Builder(Context context) {
            this();
            setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
            setViewportSizeToPhysicalDisplaySize(context, true);
        }

        public Builder(TrackSelectionParameters initialValues) {
            this.a = initialValues.maxVideoWidth;
            this.b = initialValues.maxVideoHeight;
            this.c = initialValues.maxVideoFrameRate;
            this.d = initialValues.maxVideoBitrate;
            this.e = initialValues.minVideoWidth;
            this.f = initialValues.minVideoHeight;
            this.g = initialValues.minVideoFrameRate;
            this.h = initialValues.minVideoBitrate;
            this.i = initialValues.viewportWidth;
            this.j = initialValues.viewportHeight;
            this.k = initialValues.viewportOrientationMayChange;
            this.l = initialValues.preferredVideoMimeTypes;
            this.m = initialValues.preferredAudioLanguages;
            this.n = initialValues.preferredAudioRoleFlags;
            this.o = initialValues.maxAudioChannelCount;
            this.p = initialValues.maxAudioBitrate;
            this.q = initialValues.preferredAudioMimeTypes;
            this.r = initialValues.preferredTextLanguages;
            this.s = initialValues.preferredTextRoleFlags;
            this.t = initialValues.selectUndeterminedTextLanguage;
            this.u = initialValues.forceLowestBitrate;
            this.v = initialValues.forceHighestSupportedBitrate;
        }
    }

    public TrackSelectionParameters(Parcel in) {
        ArrayList arrayList = new ArrayList();
        in.readList(arrayList, null);
        this.preferredAudioLanguages = ImmutableList.copyOf((Collection) arrayList);
        this.preferredAudioRoleFlags = in.readInt();
        ArrayList arrayList2 = new ArrayList();
        in.readList(arrayList2, null);
        this.preferredTextLanguages = ImmutableList.copyOf((Collection) arrayList2);
        this.preferredTextRoleFlags = in.readInt();
        this.selectUndeterminedTextLanguage = Util.readBoolean(in);
        this.maxVideoWidth = in.readInt();
        this.maxVideoHeight = in.readInt();
        this.maxVideoFrameRate = in.readInt();
        this.maxVideoBitrate = in.readInt();
        this.minVideoWidth = in.readInt();
        this.minVideoHeight = in.readInt();
        this.minVideoFrameRate = in.readInt();
        this.minVideoBitrate = in.readInt();
        this.viewportWidth = in.readInt();
        this.viewportHeight = in.readInt();
        this.viewportOrientationMayChange = Util.readBoolean(in);
        ArrayList arrayList3 = new ArrayList();
        in.readList(arrayList3, null);
        this.preferredVideoMimeTypes = ImmutableList.copyOf((Collection) arrayList3);
        this.maxAudioChannelCount = in.readInt();
        this.maxAudioBitrate = in.readInt();
        ArrayList arrayList4 = new ArrayList();
        in.readList(arrayList4, null);
        this.preferredAudioMimeTypes = ImmutableList.copyOf((Collection) arrayList4);
        this.forceLowestBitrate = Util.readBoolean(in);
        this.forceHighestSupportedBitrate = Util.readBoolean(in);
    }
}
