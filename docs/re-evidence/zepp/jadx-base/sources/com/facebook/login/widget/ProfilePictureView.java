package com.facebook.login.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.Profile;
import com.facebook.ProfileTracker;
import com.facebook.internal.ImageDownloader;
import com.facebook.internal.ImageRequest;
import com.facebook.internal.ImageResponse;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.R;

/* JADX INFO: loaded from: classes2.dex */
public class ProfilePictureView extends FrameLayout {
    public static final int CUSTOM = -1;
    public static final int LARGE = -4;
    public static final int NORMAL = -3;
    public static final int SMALL = -2;
    public static final String TAG = ProfilePictureView.class.getSimpleName();
    private static final int l = 1;
    private static final boolean m = true;
    private static final String n = "ProfilePictureView_superState";
    private static final String o = "ProfilePictureView_profileId";
    private static final String p = "ProfilePictureView_presetSize";
    private static final String q = "ProfilePictureView_isCropped";
    private static final String r = "ProfilePictureView_bitmap";
    private static final String s = "ProfilePictureView_width";
    private static final String t = "ProfilePictureView_height";
    private static final String u = "ProfilePictureView_refresh";
    private String a;
    private int b;
    private int c;
    private boolean d;
    private Bitmap e;
    private ImageView f;
    private int g;
    private ImageRequest h;
    private OnErrorListener i;
    private Bitmap j;
    private ProfileTracker k;

    public interface OnErrorListener {
        void onError(FacebookException facebookException);
    }

    public class a extends ProfileTracker {
        public a() {
        }

        @Override // com.facebook.ProfileTracker
        public void onCurrentProfileChanged(Profile profile, Profile profile2) {
            ProfilePictureView.this.setProfileId(profile2 != null ? profile2.getId() : null);
            ProfilePictureView.this.g(true);
        }
    }

    public class b implements ImageRequest.Callback {
        public b() {
        }

        @Override // com.facebook.internal.ImageRequest.Callback
        public void onCompleted(ImageResponse imageResponse) {
            ProfilePictureView.this.f(imageResponse);
        }
    }

    public ProfilePictureView(Context context) {
        super(context);
        this.b = 0;
        this.c = 0;
        this.d = true;
        this.g = -1;
        this.j = null;
        d(context);
    }

    private int c(boolean z) {
        int i;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            int i2 = this.g;
            if (i2 == -4) {
                i = R.dimen.com_facebook_profilepictureview_preset_size_large;
            } else if (i2 == -3) {
                i = R.dimen.com_facebook_profilepictureview_preset_size_normal;
            } else if (i2 == -2) {
                i = R.dimen.com_facebook_profilepictureview_preset_size_small;
            } else {
                if (i2 != -1 || !z) {
                    return 0;
                }
                i = R.dimen.com_facebook_profilepictureview_preset_size_normal;
            }
            return getResources().getDimensionPixelSize(i);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    private void d(Context context) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            removeAllViews();
            this.f = new ImageView(context);
            this.f.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            addView(this.f);
            this.k = new a();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private void e(AttributeSet attributeSet) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.com_facebook_profile_picture_view);
            setPresetSize(typedArrayObtainStyledAttributes.getInt(R.styleable.com_facebook_profile_picture_view_com_facebook_preset_size, -1));
            this.d = typedArrayObtainStyledAttributes.getBoolean(R.styleable.com_facebook_profile_picture_view_com_facebook_is_cropped, true);
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(ImageResponse imageResponse) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (imageResponse.getRequest() == this.h) {
                this.h = null;
                Bitmap bitmap = imageResponse.getBitmap();
                Exception error = imageResponse.getError();
                if (error == null) {
                    if (bitmap != null) {
                        setImageBitmap(bitmap);
                        if (imageResponse.getIsCachedRedirect()) {
                            h(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                OnErrorListener onErrorListener = this.i;
                if (onErrorListener == null) {
                    Logger.log(LoggingBehavior.REQUESTS, 6, TAG, error.toString());
                    return;
                }
                onErrorListener.onError(new FacebookException("Error in downloading profile picture for profileId: " + getProfileId(), error));
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(boolean z) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            boolean zJ = j();
            String str = this.a;
            if (str != null && str.length() != 0 && (this.c != 0 || this.b != 0)) {
                if (zJ || z) {
                    h(true);
                    return;
                }
                return;
            }
            i();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private void h(boolean z) {
        Uri profilePictureUri;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Uri profilePictureUri2 = ImageRequest.getProfilePictureUri(this.a, this.c, this.b, AccessToken.isCurrentAccessTokenActive() ? AccessToken.getCurrentAccessToken().getToken() : "");
            Profile currentProfile = Profile.getCurrentProfile();
            if (AccessToken.isLoggedInWithInstagram() && currentProfile != null && (profilePictureUri = currentProfile.getProfilePictureUri(this.c, this.b)) != null) {
                profilePictureUri2 = profilePictureUri;
            }
            ImageRequest imageRequestBuild = new ImageRequest.Builder(getContext(), profilePictureUri2).setAllowCachedRedirects(z).setCallerTag(this).setCallback(new b()).build();
            ImageRequest imageRequest = this.h;
            if (imageRequest != null) {
                ImageDownloader.cancelRequest(imageRequest);
            }
            this.h = imageRequestBuild;
            ImageDownloader.downloadAsync(imageRequestBuild);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private void i() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            ImageRequest imageRequest = this.h;
            if (imageRequest != null) {
                ImageDownloader.cancelRequest(imageRequest);
            }
            if (this.j == null) {
                setImageBitmap(BitmapFactory.decodeResource(getResources(), isCropped() ? R.drawable.com_facebook_profile_picture_blank_square : R.drawable.com_facebook_profile_picture_blank_portrait));
            } else {
                j();
                setImageBitmap(Bitmap.createScaledBitmap(this.j, this.c, this.b, false));
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private boolean j() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            int height = getHeight();
            int width = getWidth();
            boolean z = true;
            if (width >= 1 && height >= 1) {
                int iC = c(false);
                if (iC != 0) {
                    height = iC;
                    width = height;
                }
                if (width <= height) {
                    height = isCropped() ? width : 0;
                } else {
                    width = isCropped() ? height : 0;
                }
                if (width == this.c && height == this.b) {
                    z = false;
                }
                this.c = width;
                this.b = height;
                return z;
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private void setImageBitmap(Bitmap bitmap) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            ImageView imageView = this.f;
            if (imageView == null || bitmap == null) {
                return;
            }
            this.e = bitmap;
            imageView.setImageBitmap(bitmap);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final OnErrorListener getOnErrorListener() {
        return this.i;
    }

    public final int getPresetSize() {
        return this.g;
    }

    public final String getProfileId() {
        return this.a;
    }

    public final boolean getShouldUpdateOnProfileChange() {
        return this.k.getIsTracking();
    }

    public final boolean isCropped() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h = null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        g(false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        boolean z2 = true;
        if (View.MeasureSpec.getMode(i2) == 1073741824 || layoutParams.height != -2) {
            z = false;
        } else {
            size = c(true);
            i2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            z = true;
        }
        if (View.MeasureSpec.getMode(i) == 1073741824 || layoutParams.width != -2) {
            z2 = z;
        } else {
            size2 = c(true);
            i = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
        }
        if (!z2) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(size2, size);
            measureChildren(i, i2);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable.getClass() != Bundle.class) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable(n));
        this.a = bundle.getString(o);
        this.g = bundle.getInt(p);
        this.d = bundle.getBoolean(q);
        this.c = bundle.getInt(s);
        this.b = bundle.getInt(t);
        g(true);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable(n, parcelableOnSaveInstanceState);
        bundle.putString(o, this.a);
        bundle.putInt(p, this.g);
        bundle.putBoolean(q, this.d);
        bundle.putInt(s, this.c);
        bundle.putInt(t, this.b);
        bundle.putBoolean(u, this.h != null);
        return bundle;
    }

    public final void setCropped(boolean z) {
        this.d = z;
        g(false);
    }

    public final void setDefaultProfilePicture(Bitmap bitmap) {
        this.j = bitmap;
    }

    public final void setOnErrorListener(OnErrorListener onErrorListener) {
        this.i = onErrorListener;
    }

    public final void setPresetSize(int i) {
        if (i != -4 && i != -3 && i != -2 && i != -1) {
            throw new IllegalArgumentException("Must use a predefined preset size");
        }
        this.g = i;
        requestLayout();
    }

    public final void setProfileId(@Nullable String str) {
        boolean z;
        if (Utility.isNullOrEmpty(this.a) || !this.a.equalsIgnoreCase(str)) {
            i();
            z = true;
        } else {
            z = false;
        }
        this.a = str;
        g(z);
    }

    public final void setShouldUpdateOnProfileChange(boolean z) {
        if (z) {
            this.k.startTracking();
        } else {
            this.k.stopTracking();
        }
    }

    public ProfilePictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.c = 0;
        this.d = true;
        this.g = -1;
        this.j = null;
        d(context);
        e(attributeSet);
    }

    public ProfilePictureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = 0;
        this.c = 0;
        this.d = true;
        this.g = -1;
        this.j = null;
        d(context);
        e(attributeSet);
    }
}
