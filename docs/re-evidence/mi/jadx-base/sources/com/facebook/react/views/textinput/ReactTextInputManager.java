package com.facebook.react.views.textinput;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.views.scroll.ScrollEventType;
import com.mi.fitness.checkupdate.ui.huami.HuamiUpgradeFragment;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.userinfo.utils.UserInfoConfigUtil;
import defpackage.bil;
import defpackage.cbe;
import defpackage.cfj;
import defpackage.cm8;
import defpackage.d8p;
import defpackage.e4f;
import defpackage.efj;
import defpackage.ex5;
import defpackage.exh;
import defpackage.ffj;
import defpackage.g9p;
import defpackage.gfj;
import defpackage.hdj;
import defpackage.hfj;
import defpackage.iej;
import defpackage.ii4;
import defpackage.j0s;
import defpackage.jej;
import defpackage.msl;
import defpackage.ndj;
import defpackage.nfj;
import defpackage.ni4;
import defpackage.ofj;
import defpackage.pd8;
import defpackage.pfj;
import defpackage.qfj;
import defpackage.rfj;
import defpackage.sk1;
import defpackage.ucj;
import defpackage.ufj;
import defpackage.vhl;
import defpackage.wqk;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.Map;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = ReactTextInputManager.REACT_CLASS)
public class ReactTextInputManager extends BaseViewManager<ReactEditText, cbe> {
    private static final int BLUR_TEXT_INPUT = 2;
    private static final int FOCUS_TEXT_INPUT = 1;
    private static final int IME_ACTION_ID = 1648;
    private static final int INPUT_TYPE_KEYBOARD_DECIMAL_PAD = 8194;
    private static final int INPUT_TYPE_KEYBOARD_NUMBERED = 12290;
    private static final int INPUT_TYPE_KEYBOARD_NUMBER_PAD = 2;
    private static final String KEYBOARD_TYPE_DECIMAL_PAD = "decimal-pad";
    private static final String KEYBOARD_TYPE_EMAIL_ADDRESS = "email-address";
    private static final int KEYBOARD_TYPE_FLAGS = 12339;
    private static final String KEYBOARD_TYPE_NUMBER_PAD = "number-pad";
    private static final String KEYBOARD_TYPE_NUMERIC = "numeric";
    private static final String KEYBOARD_TYPE_PHONE_PAD = "phone-pad";
    private static final String KEYBOARD_TYPE_VISIBLE_PASSWORD = "visible-password";
    private static final int PASSWORD_VISIBILITY_FLAG = 16;
    protected static final String REACT_CLASS = "AndroidTextInput";
    public static final String TAG = "ReactTextInputManager";
    private static final int UNSET = -1;
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private static final InputFilter[] EMPTY_FILTERS = new InputFilter[0];

    public class a implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f7573a;

        public a(boolean z) {
            this.f7573a = z;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            return this.f7573a;
        }
    }

    public class b implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g9p f7575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ReactEditText f7576b;

        public b(g9p g9pVar, ReactEditText reactEditText) {
            this.f7575a = g9pVar;
            this.f7576b = reactEditText;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            pd8 eventDispatcher = ((UIManagerModule) this.f7575a.getNativeModule(UIManagerModule.class)).getEventDispatcher();
            if (z) {
                eventDispatcher.dispatchEvent(new hfj(this.f7576b.getId()));
            } else {
                eventDispatcher.dispatchEvent(new efj(this.f7576b.getId()));
                eventDispatcher.dispatchEvent(new ffj(this.f7576b.getId(), this.f7576b.getText().toString()));
            }
        }
    }

    public class c implements TextView.OnEditorActionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ReactEditText f7577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g9p f7578b;

        public c(ReactEditText reactEditText, g9p g9pVar) {
            this.f7577a = reactEditText;
            this.f7578b = g9pVar;
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if ((i & 255) == 0 && i != 0) {
                return true;
            }
            boolean blurOnSubmit = this.f7577a.getBlurOnSubmit();
            boolean zJ = this.f7577a.j();
            ((UIManagerModule) this.f7578b.getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(new rfj(this.f7577a.getId(), this.f7577a.getText().toString()));
            if (blurOnSubmit) {
                this.f7577a.clearFocus();
            }
            return blurOnSubmit || !zJ || i == 5 || i == 7;
        }
    }

    public class d implements ii4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ReactEditText f7579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public pd8 f7580b;
        public int c = 0;
        public int d = 0;

        public d(ReactEditText reactEditText) {
            this.f7579a = reactEditText;
            this.f7580b = ((UIManagerModule) ((ReactContext) reactEditText.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher();
        }

        @Override // defpackage.ii4
        public void a() {
            int width = this.f7579a.getWidth();
            int height = this.f7579a.getHeight();
            if (this.f7579a.getLayout() != null) {
                width = this.f7579a.getCompoundPaddingLeft() + this.f7579a.getLayout().getWidth() + this.f7579a.getCompoundPaddingRight();
                height = this.f7579a.getCompoundPaddingTop() + this.f7579a.getLayout().getHeight() + this.f7579a.getCompoundPaddingBottom();
            }
            if (width == this.c && height == this.d) {
                return;
            }
            this.d = height;
            this.c = width;
            this.f7580b.dispatchEvent(new ucj(this.f7579a.getId(), exh.a(width), exh.a(height)));
        }
    }

    public class e implements bil {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ReactEditText f7581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public pd8 f7582b;
        public int c;
        public int d;

        public e(ReactEditText reactEditText) {
            this.f7581a = reactEditText;
            this.f7582b = ((UIManagerModule) ((ReactContext) reactEditText.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher();
        }

        @Override // defpackage.bil
        public void a(int i, int i2, int i3, int i4) {
            if (this.c == i && this.d == i2) {
                return;
            }
            this.f7582b.dispatchEvent(vhl.b(this.f7581a.getId(), ScrollEventType.SCROLL, i, i2, 0.0f, 0.0f, 0, 0, this.f7581a.getWidth(), this.f7581a.getHeight()));
            this.c = i;
            this.d = i2;
        }
    }

    public class f implements msl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ReactEditText f7583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public pd8 f7584b;
        public int c;
        public int d;

        public f(ReactEditText reactEditText) {
            this.f7583a = reactEditText;
            this.f7584b = ((UIManagerModule) ((ReactContext) reactEditText.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher();
        }

        @Override // defpackage.msl
        public void a(int i, int i2) {
            int iMin = Math.min(i, i2);
            int iMax = Math.max(i, i2);
            if (this.c == iMin && this.d == iMax) {
                return;
            }
            this.f7584b.dispatchEvent(new pfj(this.f7583a.getId(), iMin, iMax));
            this.c = iMin;
            this.d = iMax;
        }
    }

    public class g implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public pd8 f7585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ReactEditText f7586b;
        public String c = null;

        public g(ReactContext reactContext, ReactEditText reactEditText) {
            this.f7585a = ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher();
            this.f7586b = reactEditText;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.c = charSequence.toString();
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (i3 == 0 && i2 == 0) {
                return;
            }
            sk1.c(this.c);
            String strSubstring = charSequence.toString().substring(i, i + i3);
            int i4 = i + i2;
            String strSubstring2 = this.c.substring(i, i4);
            if (i3 == i2 && strSubstring.equals(strSubstring2)) {
                return;
            }
            this.f7585a.dispatchEvent(new cfj(this.f7586b.getId(), charSequence.toString(), this.f7586b.i()));
            this.f7585a.dispatchEvent(new gfj(this.f7586b.getId(), strSubstring, strSubstring2, i, i4));
        }
    }

    private static void checkPasswordType(ReactEditText reactEditText) {
        if ((reactEditText.getStagedInputType() & INPUT_TYPE_KEYBOARD_NUMBERED) == 0 || (reactEditText.getStagedInputType() & 128) == 0) {
            return;
        }
        updateStagedInputTypeFlag(reactEditText, 128, 16);
    }

    private static int parseNumericFontWeight(String str) {
        if (str.length() != 3 || !str.endsWith("00") || str.charAt(0) > '9' || str.charAt(0) < '1') {
            return -1;
        }
        return (str.charAt(0) - '0') * 100;
    }

    private void setAutofillHints(ReactEditText reactEditText, String... strArr) {
        reactEditText.setAutofillHints(strArr);
    }

    private static void updateStagedInputTypeFlag(ReactEditText reactEditText, int i, int i2) {
        reactEditText.setStagedInputType(((~i) & reactEditText.getStagedInputType()) | i2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return e4f.e("focusTextInput", 1, "blurTextInput", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return e4f.a().b("topSubmitEditing", e4f.d("phasedRegistrationNames", e4f.e("bubbled", "onSubmitEditing", "captured", "onSubmitEditingCapture"))).b("topEndEditing", e4f.d("phasedRegistrationNames", e4f.e("bubbled", "onEndEditing", "captured", "onEndEditingCapture"))).b("topTextInput", e4f.d("phasedRegistrationNames", e4f.e("bubbled", "onTextInput", "captured", "onTextInputCapture"))).b("topFocus", e4f.d("phasedRegistrationNames", e4f.e("bubbled", "onFocus", "captured", "onFocusCapture"))).b("topBlur", e4f.d("phasedRegistrationNames", e4f.e("bubbled", "onBlur", "captured", "onBlurCapture"))).b("topKeyPress", e4f.d("phasedRegistrationNames", e4f.e("bubbled", "onKeyPress", "captured", "onKeyPressCapture"))).a();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return e4f.a().b(ScrollEventType.getJSEventName(ScrollEventType.SCROLL), e4f.d("registrationName", "onScroll")).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedViewConstants() {
        return e4f.d("AutoCapitalizationType", e4f.g("none", 0, "characters", 4096, "words", 8192, "sentences", 16384));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends cbe> getShadowNodeClass() {
        return qfj.class;
    }

    @iej(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(ReactEditText reactEditText, boolean z) {
        reactEditText.setAllowFontScaling(z);
    }

    @iej(name = "autoCapitalize")
    public void setAutoCapitalize(ReactEditText reactEditText, Dynamic dynamic) {
        int iAsInt;
        if (dynamic.getType() == ReadableType.Number) {
            iAsInt = dynamic.asInt();
        } else if (dynamic.getType() == ReadableType.String) {
            String strAsString = dynamic.asString();
            if (strAsString.equals("none")) {
                iAsInt = 0;
            } else if (strAsString.equals("characters")) {
                iAsInt = 4096;
            } else if (strAsString.equals("words")) {
                iAsInt = 8192;
            } else {
                strAsString.equals("sentences");
                iAsInt = 16384;
            }
        } else {
            iAsInt = 16384;
        }
        updateStagedInputTypeFlag(reactEditText, 28672, iAsInt);
    }

    @iej(name = "autoCorrect")
    public void setAutoCorrect(ReactEditText reactEditText, Boolean bool) {
        int i;
        if (bool != null) {
            i = bool.booleanValue() ? 32768 : 524288;
        } else {
            i = 0;
        }
        updateStagedInputTypeFlag(reactEditText, 557056, i);
    }

    @iej(defaultBoolean = false, name = "autoFocus")
    public void setAutoFocus(ReactEditText reactEditText, boolean z) {
        reactEditText.setAutoFocus(z);
    }

    @iej(name = "blurOnSubmit")
    public void setBlurOnSubmit(ReactEditText reactEditText, Boolean bool) {
        reactEditText.setBlurOnSubmit(bool);
    }

    @jej(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(ReactEditText reactEditText, int i, Integer num) {
        reactEditText.r(SPACING_TYPES[i], num == null ? Float.NaN : num.intValue() & 16777215, num != null ? num.intValue() >>> 24 : Float.NaN);
    }

    @jej(defaultFloat = FloatCompanionObject.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(ReactEditText reactEditText, int i, float f2) {
        if (!j0s.a(f2)) {
            f2 = exh.c(f2);
        }
        if (i == 0) {
            reactEditText.setBorderRadius(f2);
        } else {
            reactEditText.s(f2, i - 1);
        }
    }

    @iej(name = "borderStyle")
    public void setBorderStyle(ReactEditText reactEditText, String str) {
        reactEditText.setBorderStyle(str);
    }

    @jej(defaultFloat = FloatCompanionObject.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(ReactEditText reactEditText, int i, float f2) {
        if (!j0s.a(f2)) {
            f2 = exh.c(f2);
        }
        reactEditText.t(SPACING_TYPES[i], f2);
    }

    @iej(defaultBoolean = false, name = "caretHidden")
    public void setCaretHidden(ReactEditText reactEditText, boolean z) {
        reactEditText.setCursorVisible(!z);
    }

    @iej(customType = "Color", name = "color")
    public void setColor(ReactEditText reactEditText, Integer num) {
        if (num == null) {
            reactEditText.setTextColor(ex5.b(reactEditText.getContext()));
        } else {
            reactEditText.setTextColor(num.intValue());
        }
    }

    @iej(defaultBoolean = false, name = "contextMenuHidden")
    public void setContextMenuHidden(ReactEditText reactEditText, boolean z) {
        reactEditText.setOnLongClickListener(new a(z));
    }

    @iej(customType = "Color", name = "cursorColor")
    public void setCursorColor(ReactEditText reactEditText, Integer num) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            Drawable textCursorDrawable = reactEditText.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                if (num != null) {
                    ofj.a();
                    textCursorDrawable.setColorFilter(nfj.a(num.intValue(), BlendMode.SRC_IN));
                } else {
                    textCursorDrawable.clearColorFilter();
                }
                reactEditText.setTextCursorDrawable(textCursorDrawable);
                return;
            }
            return;
        }
        if (i == 28) {
            return;
        }
        try {
            Field declaredField = reactEditText.getClass().getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i2 = declaredField.getInt(reactEditText);
            if (i2 == 0) {
                return;
            }
            Drawable drawableMutate = ni4.e(reactEditText.getContext(), i2).mutate();
            if (num != null) {
                drawableMutate.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            } else {
                drawableMutate.clearColorFilter();
            }
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(reactEditText);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            declaredField3.set(obj, new Drawable[]{drawableMutate, drawableMutate});
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
    }

    @iej(defaultBoolean = false, name = "disableFullscreenUI")
    public void setDisableFullscreenUI(ReactEditText reactEditText, boolean z) {
        reactEditText.setDisableFullscreenUI(z);
    }

    @iej(defaultBoolean = true, name = "editable")
    public void setEditable(ReactEditText reactEditText, boolean z) {
        reactEditText.setEnabled(z);
    }

    @iej(name = "fontFamily")
    public void setFontFamily(ReactEditText reactEditText, String str) {
        reactEditText.setTypeface(hdj.b().d(str, reactEditText.getTypeface() != null ? reactEditText.getTypeface().getStyle() : 0, reactEditText.getContext().getAssets()));
    }

    @iej(defaultFloat = UserInfoConfigUtil.TEXTVIEW_SIZE, name = "fontSize")
    public void setFontSize(ReactEditText reactEditText, float f2) {
        reactEditText.setFontSize(f2);
    }

    @iej(name = "fontStyle")
    public void setFontStyle(ReactEditText reactEditText, String str) {
        int i;
        if ("italic".equals(str)) {
            i = 2;
        } else {
            i = "normal".equals(str) ? 0 : -1;
        }
        Typeface typeface = reactEditText.getTypeface();
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        if (i != typeface.getStyle()) {
            reactEditText.setTypeface(typeface, i);
        }
    }

    @iej(name = "fontWeight")
    public void setFontWeight(ReactEditText reactEditText, String str) {
        int i = -1;
        int numericFontWeight = str != null ? parseNumericFontWeight(str) : -1;
        if (numericFontWeight >= 500 || "bold".equals(str)) {
            i = 1;
        } else if ("normal".equals(str) || (numericFontWeight != -1 && numericFontWeight < 500)) {
            i = 0;
        }
        Typeface typeface = reactEditText.getTypeface();
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        if (i != typeface.getStyle()) {
            reactEditText.setTypeface(typeface, i);
        }
    }

    @iej(name = "importantForAutofill")
    public void setImportantForAutofill(ReactEditText reactEditText, String str) {
        int i;
        if ("no".equals(str)) {
            i = 2;
        } else if ("noExcludeDescendants".equals(str)) {
            i = 8;
        } else if ("yes".equals(str)) {
            i = 1;
        } else {
            i = "yesExcludeDescendants".equals(str) ? 4 : 0;
        }
        setImportantForAutofill(reactEditText, i);
    }

    @iej(name = "inlineImageLeft")
    public void setInlineImageLeft(ReactEditText reactEditText, String str) {
        reactEditText.setCompoundDrawablesWithIntrinsicBounds(wqk.b().d(reactEditText.getContext(), str), 0, 0, 0);
    }

    @iej(name = "inlineImagePadding")
    public void setInlineImagePadding(ReactEditText reactEditText, int i) {
        reactEditText.setCompoundDrawablePadding(i);
    }

    @iej(name = "keyboardType")
    public void setKeyboardType(ReactEditText reactEditText, String str) {
        int i;
        if (KEYBOARD_TYPE_NUMERIC.equalsIgnoreCase(str)) {
            i = INPUT_TYPE_KEYBOARD_NUMBERED;
        } else if (KEYBOARD_TYPE_NUMBER_PAD.equalsIgnoreCase(str)) {
            i = 2;
        } else if (KEYBOARD_TYPE_DECIMAL_PAD.equalsIgnoreCase(str)) {
            i = INPUT_TYPE_KEYBOARD_DECIMAL_PAD;
        } else if (KEYBOARD_TYPE_EMAIL_ADDRESS.equalsIgnoreCase(str)) {
            i = 33;
        } else if (KEYBOARD_TYPE_PHONE_PAD.equalsIgnoreCase(str)) {
            i = 3;
        } else {
            i = KEYBOARD_TYPE_VISIBLE_PASSWORD.equalsIgnoreCase(str) ? 144 : 1;
        }
        updateStagedInputTypeFlag(reactEditText, KEYBOARD_TYPE_FLAGS, i);
        checkPasswordType(reactEditText);
    }

    @iej(defaultFloat = 0.0f, name = "letterSpacing")
    public void setLetterSpacing(ReactEditText reactEditText, float f2) {
        reactEditText.setLetterSpacingPt(f2);
    }

    @iej(defaultFloat = FloatCompanionObject.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(ReactEditText reactEditText, float f2) {
        reactEditText.setMaxFontSizeMultiplier(f2);
    }

    @iej(name = "maxLength")
    public void setMaxLength(ReactEditText reactEditText, Integer num) {
        InputFilter[] filters = reactEditText.getFilters();
        InputFilter[] inputFilterArr = EMPTY_FILTERS;
        if (num == null) {
            if (filters.length > 0) {
                LinkedList linkedList = new LinkedList();
                for (InputFilter inputFilter : filters) {
                    if (!(inputFilter instanceof InputFilter.LengthFilter)) {
                        linkedList.add(inputFilter);
                    }
                }
                if (!linkedList.isEmpty()) {
                    inputFilterArr = (InputFilter[]) linkedList.toArray(new InputFilter[linkedList.size()]);
                }
            }
        } else if (filters.length > 0) {
            boolean z = false;
            for (int i = 0; i < filters.length; i++) {
                if (filters[i] instanceof InputFilter.LengthFilter) {
                    filters[i] = new InputFilter.LengthFilter(num.intValue());
                    z = true;
                }
            }
            if (!z) {
                InputFilter[] inputFilterArr2 = new InputFilter[filters.length + 1];
                System.arraycopy(filters, 0, inputFilterArr2, 0, filters.length);
                filters[filters.length] = new InputFilter.LengthFilter(num.intValue());
                filters = inputFilterArr2;
            }
            inputFilterArr = filters;
        } else {
            inputFilterArr = new InputFilter[]{new InputFilter.LengthFilter(num.intValue())};
        }
        reactEditText.setFilters(inputFilterArr);
    }

    @iej(defaultInt = 0, name = "mostRecentEventCount")
    public void setMostRecentEventCount(ReactEditText reactEditText, int i) {
        reactEditText.setMostRecentEventCount(i);
    }

    @iej(defaultBoolean = false, name = "multiline")
    public void setMultiline(ReactEditText reactEditText, boolean z) {
        updateStagedInputTypeFlag(reactEditText, z ? 0 : 131072, z ? 131072 : 0);
    }

    @iej(defaultInt = 1, name = "numberOfLines")
    public void setNumLines(ReactEditText reactEditText, int i) {
        reactEditText.setLines(i);
    }

    @iej(defaultBoolean = false, name = "onContentSizeChange")
    public void setOnContentSizeChange(ReactEditText reactEditText, boolean z) {
        if (z) {
            reactEditText.setContentSizeWatcher(new d(reactEditText));
        } else {
            reactEditText.setContentSizeWatcher(null);
        }
    }

    @iej(defaultBoolean = false, name = "onKeyPress")
    public void setOnKeyPress(ReactEditText reactEditText, boolean z) {
        reactEditText.setOnKeyPress(z);
    }

    @iej(defaultBoolean = false, name = "onScroll")
    public void setOnScroll(ReactEditText reactEditText, boolean z) {
        if (z) {
            reactEditText.setScrollWatcher(new e(reactEditText));
        } else {
            reactEditText.setScrollWatcher(null);
        }
    }

    @iej(defaultBoolean = false, name = "onSelectionChange")
    public void setOnSelectionChange(ReactEditText reactEditText, boolean z) {
        if (z) {
            reactEditText.setSelectionWatcher(new f(reactEditText));
        } else {
            reactEditText.setSelectionWatcher(null);
        }
    }

    @iej(name = "placeholder")
    public void setPlaceholder(ReactEditText reactEditText, String str) {
        reactEditText.setHint(str);
    }

    @iej(customType = "Color", name = "placeholderTextColor")
    public void setPlaceholderTextColor(ReactEditText reactEditText, Integer num) {
        if (num == null) {
            reactEditText.setHintTextColor(ex5.d(reactEditText.getContext()));
        } else {
            reactEditText.setHintTextColor(num.intValue());
        }
    }

    @iej(name = "returnKeyLabel")
    public void setReturnKeyLabel(ReactEditText reactEditText, String str) {
        reactEditText.setImeActionLabel(str, IME_ACTION_ID);
    }

    @iej(name = "returnKeyType")
    public void setReturnKeyType(ReactEditText reactEditText, String str) {
        reactEditText.setReturnKeyType(str);
    }

    @iej(defaultBoolean = false, name = "secureTextEntry")
    public void setSecureTextEntry(ReactEditText reactEditText, boolean z) {
        updateStagedInputTypeFlag(reactEditText, z ? 0 : 144, z ? 128 : 0);
        checkPasswordType(reactEditText);
    }

    @iej(defaultBoolean = false, name = "selectTextOnFocus")
    public void setSelectTextOnFocus(ReactEditText reactEditText, boolean z) {
        reactEditText.setSelectAllOnFocus(z);
    }

    @iej(customType = "Color", name = "selectionColor")
    public void setSelectionColor(ReactEditText reactEditText, Integer num) {
        if (num == null) {
            reactEditText.setHighlightColor(ex5.c(reactEditText.getContext()));
        } else {
            reactEditText.setHighlightColor(num.intValue());
        }
        setCursorColor(reactEditText, num);
    }

    @iej(name = "textAlign")
    public void setTextAlign(ReactEditText reactEditText, String str) {
        if ("justify".equals(str)) {
            reactEditText.setJustificationMode(1);
            reactEditText.setGravityHorizontal(3);
            return;
        }
        reactEditText.setJustificationMode(0);
        if (str == null || "auto".equals(str)) {
            reactEditText.setGravityHorizontal(0);
            return;
        }
        if ("left".equals(str)) {
            reactEditText.setGravityHorizontal(3);
            return;
        }
        if (TSMAuthContants.PARAM_KEY_RIGHT.equals(str)) {
            reactEditText.setGravityHorizontal(5);
        } else {
            if ("center".equals(str)) {
                reactEditText.setGravityHorizontal(1);
                return;
            }
            throw new JSApplicationIllegalArgumentException("Invalid textAlign: " + str);
        }
    }

    @iej(name = "textAlignVertical")
    public void setTextAlignVertical(ReactEditText reactEditText, String str) {
        if (str == null || "auto".equals(str)) {
            reactEditText.setGravityVertical(0);
            return;
        }
        if ("top".equals(str)) {
            reactEditText.setGravityVertical(48);
            return;
        }
        if ("bottom".equals(str)) {
            reactEditText.setGravityVertical(80);
        } else {
            if ("center".equals(str)) {
                reactEditText.setGravityVertical(16);
                return;
            }
            throw new JSApplicationIllegalArgumentException("Invalid textAlignVertical: " + str);
        }
    }

    @iej(name = "autoCompleteType")
    public void setTextContentType(ReactEditText reactEditText, String str) {
        if (str == null) {
            setImportantForAutofill(reactEditText, 2);
            return;
        }
        if ("username".equals(str)) {
            setAutofillHints(reactEditText, "username");
            return;
        }
        if ("password".equals(str)) {
            setAutofillHints(reactEditText, "password");
            return;
        }
        if ("email".equals(str)) {
            setAutofillHints(reactEditText, "emailAddress");
            return;
        }
        if ("name".equals(str)) {
            setAutofillHints(reactEditText, "name");
            return;
        }
        if ("tel".equals(str)) {
            setAutofillHints(reactEditText, "phone");
            return;
        }
        if ("street-address".equals(str)) {
            setAutofillHints(reactEditText, "postalAddress");
            return;
        }
        if ("postal-code".equals(str)) {
            setAutofillHints(reactEditText, "postalCode");
            return;
        }
        if ("cc-number".equals(str)) {
            setAutofillHints(reactEditText, "creditCardNumber");
            return;
        }
        if ("cc-csc".equals(str)) {
            setAutofillHints(reactEditText, "creditCardSecurityCode");
            return;
        }
        if ("cc-exp".equals(str)) {
            setAutofillHints(reactEditText, "creditCardExpirationDate");
            return;
        }
        if ("cc-exp-month".equals(str)) {
            setAutofillHints(reactEditText, "creditCardExpirationMonth");
            return;
        }
        if ("cc-exp-year".equals(str)) {
            setAutofillHints(reactEditText, "creditCardExpirationYear");
        } else {
            if (DebugKt.DEBUG_PROPERTY_VALUE_OFF.equals(str)) {
                setImportantForAutofill(reactEditText, 2);
                return;
            }
            throw new JSApplicationIllegalArgumentException("Invalid autoCompleteType: " + str);
        }
    }

    @iej(customType = "Color", name = "underlineColorAndroid")
    public void setUnderlineColor(ReactEditText reactEditText, Integer num) {
        Drawable background = reactEditText.getBackground();
        if (background.getConstantState() != null) {
            try {
                background = background.mutate();
            } catch (NullPointerException e2) {
                cm8.j(TAG, "NullPointerException when setting underlineColorAndroid for TextInput", e2);
            }
        }
        if (num == null) {
            background.clearColorFilter();
        } else {
            background.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @iej(defaultBoolean = true, name = "showSoftInputOnFocus")
    public void showKeyboardOnFocus(ReactEditText reactEditText, boolean z) {
        reactEditText.setShowSoftInputOnFocus(z);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(g9p g9pVar, ReactEditText reactEditText) {
        reactEditText.addTextChangedListener(new g(g9pVar, reactEditText));
        reactEditText.setOnFocusChangeListener(new b(g9pVar, reactEditText));
        reactEditText.setOnEditorActionListener(new c(reactEditText, g9pVar));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public cbe createShadowNodeInstance() {
        return new qfj();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactEditText createViewInstance(g9p g9pVar) {
        ReactEditText reactEditText = new ReactEditText(g9pVar);
        reactEditText.setInputType(reactEditText.getInputType() & (-131073));
        reactEditText.setReturnKeyType(HuamiUpgradeFragment.DONE_TAG);
        return reactEditText;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(ReactEditText reactEditText) {
        super.onAfterUpdateTransaction(reactEditText);
        reactEditText.g();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(ReactEditText reactEditText, Object obj) {
        if (obj instanceof ufj) {
            ufj ufjVar = (ufj) obj;
            reactEditText.setPadding((int) ufjVar.e(), (int) ufjVar.g(), (int) ufjVar.f(), (int) ufjVar.d());
            if (ufjVar.a()) {
                d8p.g(ufjVar.j(), reactEditText);
            }
            reactEditText.m(ufjVar);
            if (ufjVar.i() == -1 || ufjVar.h() == -1) {
                return;
            }
            reactEditText.setSelection(ufjVar.i(), ufjVar.h());
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactEditText reactEditText, int i, ReadableArray readableArray) {
        if (i == 1) {
            reactEditText.o();
        } else {
            if (i != 2) {
                return;
            }
            reactEditText.f();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactEditText reactEditText, String str, ReadableArray readableArray) {
        str.hashCode();
        switch (str) {
            case "blurTextInput":
            case "blur":
                reactEditText.f();
                break;
            case "focus":
            case "focusTextInput":
                reactEditText.o();
                break;
        }
    }

    private void setImportantForAutofill(ReactEditText reactEditText, int i) {
        reactEditText.setImportantForAutofill(i);
    }
}
