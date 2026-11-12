package defpackage;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.TypedValue;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.views.view.ReactViewGroup;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;

/* JADX INFO: loaded from: classes4.dex */
public class adj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TypedValue f904a = new TypedValue();

    @TargetApi(21)
    public static Drawable a(ReactViewGroup reactViewGroup, ReadableMap readableMap) {
        int color;
        Context context = reactViewGroup.getContext();
        String string = readableMap.getString("type");
        if (!"ThemeAttrAndroid".equals(string)) {
            if (!"RippleAndroid".equals(string)) {
                throw new JSApplicationIllegalArgumentException("Invalid type for android drawable: " + string);
            }
            if (!readableMap.hasKey("color") || readableMap.isNull("color")) {
                Resources.Theme theme = context.getTheme();
                TypedValue typedValue = f904a;
                if (!theme.resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                    throw new JSApplicationIllegalArgumentException("Attribute colorControlHighlight couldn't be resolved into a drawable");
                }
                color = context.getResources().getColor(typedValue.resourceId);
            } else {
                color = readableMap.getInt("color");
            }
            return new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{color}), null, (readableMap.hasKey("borderless") && !readableMap.isNull("borderless") && readableMap.getBoolean("borderless")) ? null : reactViewGroup.getBorderRadiusMask());
        }
        String string2 = readableMap.getString("attribute");
        SoftAssertions.assertNotNull(string2);
        int identifier = context.getResources().getIdentifier(string2, "attr", PluginPackageConstant.RN_DIR_A);
        if (identifier == 0) {
            throw new JSApplicationIllegalArgumentException("Attribute " + string2 + " couldn't be found in the resource list");
        }
        Resources.Theme theme2 = context.getTheme();
        TypedValue typedValue2 = f904a;
        if (theme2.resolveAttribute(identifier, typedValue2, true)) {
            return context.getResources().getDrawable(typedValue2.resourceId, context.getTheme());
        }
        throw new JSApplicationIllegalArgumentException("Attribute " + string2 + " couldn't be resolved into a drawable");
    }
}
