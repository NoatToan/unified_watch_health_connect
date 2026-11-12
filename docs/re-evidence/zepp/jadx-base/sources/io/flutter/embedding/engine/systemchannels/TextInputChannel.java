package io.flutter.embedding.engine.systemchannels;

import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.autofill.HintConstants;
import com.facebook.GraphRequest;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.xiaomi.hm.health.bt.model.HMDisplaySetting;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.JSONMethodCodec;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class TextInputChannel {
    private static final String TAG = "TextInputChannel";

    @NonNull
    public final MethodChannel channel;
    private final MethodChannel.MethodCallHandler parsingMethodHandler;

    @Nullable
    private TextInputMethodHandler textInputMethodHandler;

    public static class Configuration {

        @Nullable
        public final String actionLabel;
        public final boolean autocorrect;

        @Nullable
        public final Autofill autofill;
        public final boolean enableIMEPersonalizedLearning;
        public final boolean enableSuggestions;

        @Nullable
        public final Configuration[] fields;

        @Nullable
        public final Integer inputAction;

        @NonNull
        public final InputType inputType;
        public final boolean obscureText;

        @NonNull
        public final TextCapitalization textCapitalization;

        public static class Autofill {
            public final TextEditState editState;
            public final String[] hints;
            public final String uniqueIdentifier;

            public Autofill(@NonNull String str, @NonNull String[] strArr, @NonNull TextEditState textEditState) {
                this.uniqueIdentifier = str;
                this.hints = strArr;
                this.editState = textEditState;
            }

            public static Autofill fromJson(@NonNull JSONObject jSONObject) throws JSONException, NoSuchFieldException {
                String string = jSONObject.getString("uniqueIdentifier");
                JSONArray jSONArray = jSONObject.getJSONArray("hints");
                JSONObject jSONObject2 = jSONObject.getJSONObject("editingValue");
                int length = jSONArray.length();
                String[] strArr = new String[length];
                for (int i = 0; i < length; i++) {
                    strArr[i] = translateAutofillHint(jSONArray.getString(i));
                }
                return new Autofill(string, strArr, TextEditState.fromJson(jSONObject2));
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code duplicated, block: B:7:0x002d  */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @NonNull
            private static String translateAutofillHint(@NonNull String str) {
                byte b = 26;
                if (Build.VERSION.SDK_INT < 26) {
                    return str;
                }
                str.hashCode();
                switch (str.hashCode()) {
                    case -2058889126:
                        if (!str.equals("birthdayYear")) {
                            b = -1;
                        } else {
                            b = 0;
                        }
                        break;
                    case -1917283616:
                        if (!str.equals("oneTimeCode")) {
                            b = -1;
                        } else {
                            b = 1;
                        }
                        break;
                    case -1844815832:
                        if (!str.equals(HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_MONTH)) {
                            b = -1;
                        } else {
                            b = 2;
                        }
                        break;
                    case -1825589953:
                        if (!str.equals("telephoneNumberNational")) {
                            b = -1;
                        } else {
                            b = 3;
                        }
                        break;
                    case -1821235109:
                        if (!str.equals(HintConstants.AUTOFILL_HINT_NEW_PASSWORD)) {
                            b = -1;
                        } else {
                            b = 4;
                        }
                        break;
                    case -1757573738:
                        if (!str.equals(HintConstants.AUTOFILL_HINT_CREDIT_CARD_SECURITY_CODE)) {
                            b = -1;
                        } else {
                            b = 5;
                        }
                        break;
                    case -1682373820:
                        if (!str.equals(HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DAY)) {
                            b = -1;
                        } else {
                            b = 6;
                        }
                        break;
                    case -1658955742:
                        if (!str.equals("fullStreetAddress")) {
                            b = -1;
                        } else {
                            b = 7;
                        }
                        break;
                    case -1567118045:
                        if (!str.equals("telephoneNumberDevice")) {
                            b = -1;
                        } else {
                            b = 8;
                        }
                        break;
                    case -1476752575:
                        if (!str.equals("countryName")) {
                            b = -1;
                        } else {
                            b = 9;
                        }
                        break;
                    case -1413737489:
                        if (!str.equals("middleInitial")) {
                            b = -1;
                        } else {
                            b = 10;
                        }
                        break;
                    case -1377792129:
                        if (!str.equals("addressCity")) {
                            b = -1;
                        } else {
                            b = 11;
                        }
                        break;
                    case -1249512767:
                        if (!str.equals("gender")) {
                            b = -1;
                        } else {
                            b = 12;
                        }
                        break;
                    case -1186060294:
                        if (!str.equals("postalAddressExtendedPostalCode")) {
                            b = -1;
                        } else {
                            b = 13;
                        }
                        break;
                    case -1151034798:
                        if (!str.equals(HintConstants.AUTOFILL_HINT_CREDIT_CARD_NUMBER)) {
                            b = -1;
                        } else {
                            b = 14;
                        }
                        break;
                    case -835992323:
                        if (!str.equals("namePrefix")) {
                            b = -1;
                        } else {
                            b = 15;
                        }
                        break;
                    case -818219584:
                        if (!str.equals("middleName")) {
                            b = -1;
                        } else {
                            b = 16;
                        }
                        break;
                    case -747304516:
                        if (!str.equals("nameSuffix")) {
                            b = -1;
                        } else {
                            b = 17;
                        }
                        break;
                    case -613980922:
                        if (!str.equals(HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DATE)) {
                            b = -1;
                        } else {
                            b = 18;
                        }
                        break;
                    case -613352043:
                        if (!str.equals(HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_YEAR)) {
                            b = -1;
                        } else {
                            b = 19;
                        }
                        break;
                    case -549230602:
                        if (!str.equals("telephoneNumberCountryCode")) {
                            b = -1;
                        } else {
                            b = 20;
                        }
                        break;
                    case -265713450:
                        if (!str.equals("username")) {
                            b = -1;
                        } else {
                            b = 21;
                        }
                        break;
                    case 3373707:
                        if (!str.equals("name")) {
                            b = -1;
                        } else {
                            b = 22;
                        }
                        break;
                    case 96619420:
                        if (!str.equals("email")) {
                            b = -1;
                        } else {
                            b = 23;
                        }
                        break;
                    case 253202685:
                        if (!str.equals("addressState")) {
                            b = -1;
                        } else {
                            b = 24;
                        }
                        break;
                    case 588174851:
                        if (!str.equals("birthdayMonth")) {
                            b = -1;
                        } else {
                            b = 25;
                        }
                        break;
                    case 798554127:
                        if (!str.equals("familyName")) {
                            b = -1;
                        }
                        break;
                    case 892233837:
                        if (!str.equals("telephoneNumber")) {
                            b = -1;
                        } else {
                            b = 27;
                        }
                        break;
                    case 991032982:
                        if (!str.equals(HintConstants.AUTOFILL_HINT_NEW_USERNAME)) {
                            b = -1;
                        } else {
                            b = 28;
                        }
                        break;
                    case 1069376125:
                        if (!str.equals("birthday")) {
                            b = -1;
                        } else {
                            b = 29;
                        }
                        break;
                    case 1216985755:
                        if (!str.equals("password")) {
                            b = -1;
                        } else {
                            b = 30;
                        }
                        break;
                    case 1469046696:
                        if (!str.equals("givenName")) {
                            b = -1;
                        } else {
                            b = 31;
                        }
                        break;
                    case 1662667945:
                        if (!str.equals(HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS)) {
                            b = -1;
                        } else {
                            b = 32;
                        }
                        break;
                    case 1921869058:
                        if (!str.equals("postalAddressExtended")) {
                            b = -1;
                        } else {
                            b = 33;
                        }
                        break;
                    case 2011152728:
                        if (!str.equals(HintConstants.AUTOFILL_HINT_POSTAL_CODE)) {
                            b = -1;
                        } else {
                            b = HMDisplaySetting.TYPE_HAWK_SWK;
                        }
                        break;
                    case 2011773919:
                        if (!str.equals("birthdayDay")) {
                            b = -1;
                        } else {
                            b = 35;
                        }
                        break;
                    default:
                        b = -1;
                        break;
                }
                switch (b) {
                    case 0:
                        return HintConstants.AUTOFILL_HINT_BIRTH_DATE_YEAR;
                    case 1:
                        return HintConstants.AUTOFILL_HINT_SMS_OTP;
                    case 2:
                        return HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_MONTH;
                    case 3:
                        return HintConstants.AUTOFILL_HINT_PHONE_NATIONAL;
                    case 4:
                        return HintConstants.AUTOFILL_HINT_NEW_PASSWORD;
                    case 5:
                        return HintConstants.AUTOFILL_HINT_CREDIT_CARD_SECURITY_CODE;
                    case 6:
                        return HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DAY;
                    case 7:
                        return HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_STREET_ADDRESS;
                    case 8:
                        return HintConstants.AUTOFILL_HINT_PHONE_NUMBER_DEVICE;
                    case 9:
                        return HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_COUNTRY;
                    case 10:
                        return HintConstants.AUTOFILL_HINT_PERSON_NAME_MIDDLE_INITIAL;
                    case 11:
                        return HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_LOCALITY;
                    case 12:
                        return "gender";
                    case 13:
                        return HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_EXTENDED_POSTAL_CODE;
                    case 14:
                        return HintConstants.AUTOFILL_HINT_CREDIT_CARD_NUMBER;
                    case 15:
                        return HintConstants.AUTOFILL_HINT_PERSON_NAME_PREFIX;
                    case 16:
                        return HintConstants.AUTOFILL_HINT_PERSON_NAME_MIDDLE;
                    case 17:
                        return HintConstants.AUTOFILL_HINT_PERSON_NAME_SUFFIX;
                    case 18:
                        return HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DATE;
                    case 19:
                        return HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_YEAR;
                    case 20:
                        return HintConstants.AUTOFILL_HINT_PHONE_COUNTRY_CODE;
                    case 21:
                        return "username";
                    case 22:
                        return HintConstants.AUTOFILL_HINT_PERSON_NAME;
                    case 23:
                        return HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS;
                    case 24:
                        return HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_REGION;
                    case 25:
                        return HintConstants.AUTOFILL_HINT_BIRTH_DATE_MONTH;
                    case 26:
                        return HintConstants.AUTOFILL_HINT_PERSON_NAME_FAMILY;
                    case 27:
                        return HintConstants.AUTOFILL_HINT_PHONE_NUMBER;
                    case 28:
                        return HintConstants.AUTOFILL_HINT_NEW_USERNAME;
                    case 29:
                        return HintConstants.AUTOFILL_HINT_BIRTH_DATE_FULL;
                    case 30:
                        return "password";
                    case 31:
                        return HintConstants.AUTOFILL_HINT_PERSON_NAME_GIVEN;
                    case 32:
                        return HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS;
                    case 33:
                        return HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_EXTENDED_ADDRESS;
                    case 34:
                        return HintConstants.AUTOFILL_HINT_POSTAL_CODE;
                    case 35:
                        return HintConstants.AUTOFILL_HINT_BIRTH_DATE_DAY;
                    default:
                        return str;
                }
            }
        }

        public Configuration(boolean z, boolean z2, boolean z3, boolean z4, @NonNull TextCapitalization textCapitalization, @NonNull InputType inputType, @Nullable Integer num, @Nullable String str, @Nullable Autofill autofill, @Nullable Configuration[] configurationArr) {
            this.obscureText = z;
            this.autocorrect = z2;
            this.enableSuggestions = z3;
            this.enableIMEPersonalizedLearning = z4;
            this.textCapitalization = textCapitalization;
            this.inputType = inputType;
            this.inputAction = num;
            this.actionLabel = str;
            this.autofill = autofill;
            this.fields = configurationArr;
        }

        public static Configuration fromJson(@NonNull JSONObject jSONObject) throws JSONException, NoSuchFieldException {
            Configuration[] configurationArr;
            String string = jSONObject.getString("inputAction");
            if (string == null) {
                throw new JSONException("Configuration JSON missing 'inputAction' property.");
            }
            if (jSONObject.isNull(GraphRequest.FIELDS_PARAM)) {
                configurationArr = null;
            } else {
                JSONArray jSONArray = jSONObject.getJSONArray(GraphRequest.FIELDS_PARAM);
                int length = jSONArray.length();
                Configuration[] configurationArr2 = new Configuration[length];
                for (int i = 0; i < length; i++) {
                    configurationArr2[i] = fromJson(jSONArray.getJSONObject(i));
                }
                configurationArr = configurationArr2;
            }
            return new Configuration(jSONObject.optBoolean("obscureText"), jSONObject.optBoolean("autocorrect", true), jSONObject.optBoolean("enableSuggestions"), jSONObject.optBoolean("enableIMEPersonalizedLearning"), TextCapitalization.fromValue(jSONObject.getString("textCapitalization")), InputType.fromJson(jSONObject.getJSONObject("inputType")), inputActionFromTextInputAction(string), jSONObject.isNull("actionLabel") ? null : jSONObject.getString("actionLabel"), jSONObject.isNull("autofill") ? null : Autofill.fromJson(jSONObject.getJSONObject("autofill")), configurationArr);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:4:0x001b  */
        @NonNull
        private static Integer inputActionFromTextInputAction(@NonNull String str) {
            str.hashCode();
            switch (str) {
                case "TextInputAction.unspecified":
                    return 0;
                case "TextInputAction.done":
                    return 6;
                case "TextInputAction.next":
                    return 5;
                case "TextInputAction.none":
                    return 1;
                case "TextInputAction.send":
                    return 4;
                case "TextInputAction.search":
                    return 3;
                case "TextInputAction.go":
                    return 2;
                case "TextInputAction.newline":
                    return 1;
                case "TextInputAction.previous":
                    return 7;
                default:
                    return 0;
            }
        }
    }

    public static class InputType {
        public final boolean isDecimal;
        public final boolean isSigned;

        @NonNull
        public final TextInputType type;

        public InputType(@NonNull TextInputType textInputType, boolean z, boolean z2) {
            this.type = textInputType;
            this.isSigned = z;
            this.isDecimal = z2;
        }

        @NonNull
        public static InputType fromJson(@NonNull JSONObject jSONObject) throws JSONException, NoSuchFieldException {
            return new InputType(TextInputType.fromValue(jSONObject.getString("name")), jSONObject.optBoolean("signed", false), jSONObject.optBoolean("decimal", false));
        }
    }

    public enum TextCapitalization {
        CHARACTERS("TextCapitalization.characters"),
        WORDS("TextCapitalization.words"),
        SENTENCES("TextCapitalization.sentences"),
        NONE("TextCapitalization.none");


        @NonNull
        private final String encodedName;

        TextCapitalization(String str) {
            this.encodedName = str;
        }

        public static TextCapitalization fromValue(@NonNull String str) throws NoSuchFieldException {
            for (TextCapitalization textCapitalization : values()) {
                if (textCapitalization.encodedName.equals(str)) {
                    return textCapitalization;
                }
            }
            throw new NoSuchFieldException("No such TextCapitalization: " + str);
        }
    }

    public static class TextEditState {
        public final int composingEnd;
        public final int composingStart;
        public final int selectionEnd;
        public final int selectionStart;

        @NonNull
        public final String text;

        public TextEditState(@NonNull String str, int i, int i2, int i3, int i4) throws IndexOutOfBoundsException {
            if (!(i == -1 && i2 == -1) && (i < 0 || i2 < 0)) {
                throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i) + ", " + String.valueOf(i2) + ")");
            }
            if (!(i3 == -1 && i4 == -1) && (i3 < 0 || i3 > i4)) {
                throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i3) + ", " + String.valueOf(i4) + ")");
            }
            if (i4 > str.length()) {
                throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i3));
            }
            if (i > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i));
            }
            if (i2 > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i2));
            }
            this.text = str;
            this.selectionStart = i;
            this.selectionEnd = i2;
            this.composingStart = i3;
            this.composingEnd = i4;
        }

        public static TextEditState fromJson(@NonNull JSONObject jSONObject) throws JSONException {
            return new TextEditState(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
        }

        public boolean hasComposing() {
            int i = this.composingStart;
            return i >= 0 && this.composingEnd > i;
        }

        public boolean hasSelection() {
            return this.selectionStart >= 0;
        }
    }

    public interface TextInputMethodHandler {
        void clearClient();

        void finishAutofillContext(boolean z);

        void hide();

        void requestAutofill();

        void sendAppPrivateCommand(String str, Bundle bundle);

        void setClient(int i, @NonNull Configuration configuration);

        void setEditableSizeAndTransform(double d, double d2, double[] dArr);

        void setEditingState(@NonNull TextEditState textEditState);

        void setPlatformViewClient(int i, boolean z);

        void show();
    }

    public enum TextInputType {
        TEXT("TextInputType.text"),
        DATETIME("TextInputType.datetime"),
        NAME("TextInputType.name"),
        POSTAL_ADDRESS("TextInputType.address"),
        NUMBER("TextInputType.number"),
        PHONE("TextInputType.phone"),
        MULTILINE("TextInputType.multiline"),
        EMAIL_ADDRESS("TextInputType.emailAddress"),
        URL("TextInputType.url"),
        VISIBLE_PASSWORD("TextInputType.visiblePassword"),
        NONE("TextInputType.none");


        @NonNull
        private final String encodedName;

        TextInputType(String str) {
            this.encodedName = str;
        }

        public static TextInputType fromValue(@NonNull String str) throws NoSuchFieldException {
            for (TextInputType textInputType : values()) {
                if (textInputType.encodedName.equals(str)) {
                    return textInputType;
                }
            }
            throw new NoSuchFieldException("No such TextInputType: " + str);
        }
    }

    public TextInputChannel(@NonNull DartExecutor dartExecutor) {
        MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.TextInputChannel.1
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result result) {
                Bundle bundle;
                if (TextInputChannel.this.textInputMethodHandler == null) {
                }
                String str = methodCall.method;
                Object obj = methodCall.arguments;
                Log.v(TextInputChannel.TAG, "Received '" + str + "' message.");
                str.hashCode();
                switch (str) {
                    case "TextInput.setPlatformViewClient":
                        try {
                            JSONObject jSONObject = (JSONObject) obj;
                            TextInputChannel.this.textInputMethodHandler.setPlatformViewClient(jSONObject.getInt("platformViewId"), jSONObject.optBoolean("usesVirtualDisplay", false));
                            result.success(null);
                            break;
                        } catch (JSONException e) {
                            result.error("error", e.getMessage(), null);
                            return;
                        }
                        break;
                    case "TextInput.setEditingState":
                        try {
                            TextInputChannel.this.textInputMethodHandler.setEditingState(TextEditState.fromJson((JSONObject) obj));
                            result.success(null);
                            break;
                        } catch (JSONException e2) {
                            result.error("error", e2.getMessage(), null);
                            return;
                        }
                        break;
                    case "TextInput.setClient":
                        try {
                            JSONArray jSONArray = (JSONArray) obj;
                            TextInputChannel.this.textInputMethodHandler.setClient(jSONArray.getInt(0), Configuration.fromJson(jSONArray.getJSONObject(1)));
                            result.success(null);
                            break;
                        } catch (NoSuchFieldException | JSONException e3) {
                            result.error("error", e3.getMessage(), null);
                            return;
                        }
                        break;
                    case "TextInput.hide":
                        TextInputChannel.this.textInputMethodHandler.hide();
                        result.success(null);
                        break;
                    case "TextInput.show":
                        TextInputChannel.this.textInputMethodHandler.show();
                        result.success(null);
                        break;
                    case "TextInput.sendAppPrivateCommand":
                        try {
                            JSONObject jSONObject2 = (JSONObject) obj;
                            String string = jSONObject2.getString("action");
                            String string2 = jSONObject2.getString("data");
                            if (string2 == null || string2.isEmpty()) {
                                bundle = null;
                            } else {
                                bundle = new Bundle();
                                bundle.putString("data", string2);
                            }
                            TextInputChannel.this.textInputMethodHandler.sendAppPrivateCommand(string, bundle);
                            result.success(null);
                            break;
                        } catch (JSONException e4) {
                            result.error("error", e4.getMessage(), null);
                            return;
                        }
                        break;
                    case "TextInput.setEditableSizeAndTransform":
                        try {
                            JSONObject jSONObject3 = (JSONObject) obj;
                            double d = jSONObject3.getDouble(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
                            double d2 = jSONObject3.getDouble("height");
                            JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                            double[] dArr = new double[16];
                            for (int i = 0; i < 16; i++) {
                                dArr[i] = jSONArray2.getDouble(i);
                            }
                            TextInputChannel.this.textInputMethodHandler.setEditableSizeAndTransform(d, d2, dArr);
                            break;
                        } catch (JSONException e5) {
                            result.error("error", e5.getMessage(), null);
                            return;
                        }
                        break;
                    case "TextInput.finishAutofillContext":
                        TextInputChannel.this.textInputMethodHandler.finishAutofillContext(((Boolean) obj).booleanValue());
                        result.success(null);
                        break;
                    case "TextInput.clearClient":
                        TextInputChannel.this.textInputMethodHandler.clearClient();
                        result.success(null);
                        break;
                    case "TextInput.requestAutofill":
                        TextInputChannel.this.textInputMethodHandler.requestAutofill();
                        result.success(null);
                        break;
                    default:
                        result.notImplemented();
                        break;
                }
            }
        };
        this.parsingMethodHandler = methodCallHandler;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/textinput", JSONMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }

    private static HashMap<Object, Object> createEditingStateJSON(String str, int i, int i2, int i3, int i4) {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("text", str);
        map.put("selectionBase", Integer.valueOf(i));
        map.put("selectionExtent", Integer.valueOf(i2));
        map.put("composingBase", Integer.valueOf(i3));
        map.put("composingExtent", Integer.valueOf(i4));
        return map;
    }

    public void done(int i) {
        Log.v(TAG, "Sending 'done' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.done"));
    }

    public void go(int i) {
        Log.v(TAG, "Sending 'go' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.go"));
    }

    public void newline(int i) {
        Log.v(TAG, "Sending 'newline' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.newline"));
    }

    public void next(int i) {
        Log.v(TAG, "Sending 'next' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.next"));
    }

    public void performPrivateCommand(int i, String str, Bundle bundle) {
        HashMap map = new HashMap();
        map.put("action", str);
        if (bundle != null) {
            HashMap map2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    map2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    map2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    map2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    map2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    map2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    map2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    map2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    map2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            map.put("data", map2);
        }
        this.channel.invokeMethod("TextInputClient.performPrivateCommand", Arrays.asList(Integer.valueOf(i), map));
    }

    public void previous(int i) {
        Log.v(TAG, "Sending 'previous' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.previous"));
    }

    public void requestExistingInputState() {
        this.channel.invokeMethod("TextInputClient.requestExistingInputState", null);
    }

    public void search(int i) {
        Log.v(TAG, "Sending 'search' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.search"));
    }

    public void send(int i) {
        Log.v(TAG, "Sending 'send' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.send"));
    }

    public void setTextInputMethodHandler(@Nullable TextInputMethodHandler textInputMethodHandler) {
        this.textInputMethodHandler = textInputMethodHandler;
    }

    public void unspecifiedAction(int i) {
        Log.v(TAG, "Sending 'unspecified' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.unspecified"));
    }

    public void updateEditingState(int i, String str, int i2, int i3, int i4, int i5) {
        Log.v(TAG, "Sending message to update editing state: \nText: " + str + "\nSelection start: " + i2 + "\nSelection end: " + i3 + "\nComposing start: " + i4 + "\nComposing end: " + i5);
        this.channel.invokeMethod("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i), createEditingStateJSON(str, i2, i3, i4, i5)));
    }

    public void updateEditingStateWithTag(int i, HashMap<String, TextEditState> map) {
        Log.v(TAG, "Sending message to update editing state for " + String.valueOf(map.size()) + " field(s).");
        HashMap map2 = new HashMap();
        for (Map.Entry<String, TextEditState> entry : map.entrySet()) {
            TextEditState value = entry.getValue();
            map2.put(entry.getKey(), createEditingStateJSON(value.text, value.selectionStart, value.selectionEnd, -1, -1));
        }
        this.channel.invokeMethod("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i), map2));
    }
}
