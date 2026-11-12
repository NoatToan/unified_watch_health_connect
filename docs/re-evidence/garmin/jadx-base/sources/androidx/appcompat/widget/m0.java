package androidx.appcompat.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class m0 extends Resources {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f5177a;

    public m0(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f5177a = resources;
    }

    public final Drawable a(int i14) {
        return super.getDrawable(i14);
    }

    @Override // android.content.res.Resources
    public final XmlResourceParser getAnimation(int i14) {
        return this.f5177a.getAnimation(i14);
    }

    @Override // android.content.res.Resources
    public final boolean getBoolean(int i14) {
        return this.f5177a.getBoolean(i14);
    }

    @Override // android.content.res.Resources
    public final int getColor(int i14) {
        return this.f5177a.getColor(i14);
    }

    @Override // android.content.res.Resources
    public final ColorStateList getColorStateList(int i14) {
        return this.f5177a.getColorStateList(i14);
    }

    @Override // android.content.res.Resources
    public final Configuration getConfiguration() {
        return this.f5177a.getConfiguration();
    }

    @Override // android.content.res.Resources
    public final float getDimension(int i14) {
        return this.f5177a.getDimension(i14);
    }

    @Override // android.content.res.Resources
    public final int getDimensionPixelOffset(int i14) {
        return this.f5177a.getDimensionPixelOffset(i14);
    }

    @Override // android.content.res.Resources
    public final int getDimensionPixelSize(int i14) {
        return this.f5177a.getDimensionPixelSize(i14);
    }

    @Override // android.content.res.Resources
    public final DisplayMetrics getDisplayMetrics() {
        return this.f5177a.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public final Drawable getDrawable(int i14, Resources.Theme theme) {
        ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
        return this.f5177a.getDrawable(i14, theme);
    }

    @Override // android.content.res.Resources
    public final Drawable getDrawableForDensity(int i14, int i15) {
        ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
        return this.f5177a.getDrawableForDensity(i14, i15, null);
    }

    @Override // android.content.res.Resources
    public final float getFraction(int i14, int i15, int i16) {
        return this.f5177a.getFraction(i14, i15, i16);
    }

    @Override // android.content.res.Resources
    public final int getIdentifier(String str, String str2, String str3) {
        return this.f5177a.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public final int[] getIntArray(int i14) {
        return this.f5177a.getIntArray(i14);
    }

    @Override // android.content.res.Resources
    public final int getInteger(int i14) {
        return this.f5177a.getInteger(i14);
    }

    @Override // android.content.res.Resources
    public final XmlResourceParser getLayout(int i14) {
        return this.f5177a.getLayout(i14);
    }

    @Override // android.content.res.Resources
    public final Movie getMovie(int i14) {
        return this.f5177a.getMovie(i14);
    }

    @Override // android.content.res.Resources
    public final String getQuantityString(int i14, int i15, Object... objArr) {
        return this.f5177a.getQuantityString(i14, i15, objArr);
    }

    @Override // android.content.res.Resources
    public final CharSequence getQuantityText(int i14, int i15) {
        return this.f5177a.getQuantityText(i14, i15);
    }

    @Override // android.content.res.Resources
    public final String getResourceEntryName(int i14) {
        return this.f5177a.getResourceEntryName(i14);
    }

    @Override // android.content.res.Resources
    public final String getResourceName(int i14) {
        return this.f5177a.getResourceName(i14);
    }

    @Override // android.content.res.Resources
    public final String getResourcePackageName(int i14) {
        return this.f5177a.getResourcePackageName(i14);
    }

    @Override // android.content.res.Resources
    public final String getResourceTypeName(int i14) {
        return this.f5177a.getResourceTypeName(i14);
    }

    @Override // android.content.res.Resources
    public final String getString(int i14) {
        return this.f5177a.getString(i14);
    }

    @Override // android.content.res.Resources
    public final String[] getStringArray(int i14) {
        return this.f5177a.getStringArray(i14);
    }

    @Override // android.content.res.Resources
    public final CharSequence getText(int i14) {
        return this.f5177a.getText(i14);
    }

    @Override // android.content.res.Resources
    public final CharSequence[] getTextArray(int i14) {
        return this.f5177a.getTextArray(i14);
    }

    @Override // android.content.res.Resources
    public final void getValue(int i14, TypedValue typedValue, boolean z14) {
        this.f5177a.getValue(i14, typedValue, z14);
    }

    @Override // android.content.res.Resources
    public final void getValueForDensity(int i14, int i15, TypedValue typedValue, boolean z14) {
        this.f5177a.getValueForDensity(i14, i15, typedValue, z14);
    }

    @Override // android.content.res.Resources
    public final XmlResourceParser getXml(int i14) {
        return this.f5177a.getXml(i14);
    }

    @Override // android.content.res.Resources
    public final TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f5177a.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public final TypedArray obtainTypedArray(int i14) {
        return this.f5177a.obtainTypedArray(i14);
    }

    @Override // android.content.res.Resources
    public final InputStream openRawResource(int i14) {
        return this.f5177a.openRawResource(i14);
    }

    @Override // android.content.res.Resources
    public final AssetFileDescriptor openRawResourceFd(int i14) {
        return this.f5177a.openRawResourceFd(i14);
    }

    @Override // android.content.res.Resources
    public final void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        this.f5177a.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public final void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        this.f5177a.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public final void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f5177a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override // android.content.res.Resources
    public final void getValue(String str, TypedValue typedValue, boolean z14) {
        this.f5177a.getValue(str, typedValue, z14);
    }

    @Override // android.content.res.Resources
    public final String getQuantityString(int i14, int i15) {
        return this.f5177a.getQuantityString(i14, i15);
    }

    @Override // android.content.res.Resources
    public final String getString(int i14, Object... objArr) {
        return this.f5177a.getString(i14, objArr);
    }

    @Override // android.content.res.Resources
    public final CharSequence getText(int i14, CharSequence charSequence) {
        return this.f5177a.getText(i14, charSequence);
    }

    @Override // android.content.res.Resources
    public final InputStream openRawResource(int i14, TypedValue typedValue) {
        return this.f5177a.openRawResource(i14, typedValue);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i14) {
        return this.f5177a.getDrawable(i14);
    }

    @Override // android.content.res.Resources
    public final Drawable getDrawableForDensity(int i14, int i15, Resources.Theme theme) {
        ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
        return this.f5177a.getDrawableForDensity(i14, i15, theme);
    }
}
