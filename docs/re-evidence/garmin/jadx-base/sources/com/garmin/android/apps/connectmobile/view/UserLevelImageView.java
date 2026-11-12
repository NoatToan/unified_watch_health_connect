package com.garmin.android.apps.connectmobile.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.y0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import r22.g2;
import z3.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015²\u0006\u000e\u0010\u0014\u001a\u0004\u0018\u00010\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/UserLevelImageView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "imageUrl", "", "setImageUrl", "(Ljava/lang/String;)V", "Lb12/b;", "userProfileImageData", "setProfileImageData", "(Lb12/b;)V", "a", "imageSize", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class UserLevelImageView extends FrameLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f47555c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0<Integer> f47556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComposeView f47557b;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserLevelImageView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        this.f47556a = new y0<>();
        LayoutInflater.from(context).inflate(R.layout.user_level_image, (ViewGroup) this, true);
        this.f47557b = (ComposeView) findViewById(R.id.user_profile_image_compose_view);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i14, int i15) {
        this.f47556a.m(Integer.valueOf((View.MeasureSpec.getSize(i14) - getPaddingLeft()) - getPaddingRight()));
        super.onMeasure(i14, i15);
    }

    public final void setImageUrl(String imageUrl) {
        setProfileImageData(new b12.b(imageUrl, null, null, null, null, 30, null));
    }

    public final void setProfileImageData(b12.b userProfileImageData) {
        userProfileImageData.getClass();
        ComposeView composeView = this.f47557b;
        if (composeView != null) {
            composeView.setVisibility(0);
        }
        ComposeView composeView2 = this.f47557b;
        if (composeView2 != null) {
            composeView2.setContent(new e(-1607245628, true, new g2(this, userProfileImageData, 0)));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/UserLevelImageView$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserLevelImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserLevelImageView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ UserLevelImageView(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
