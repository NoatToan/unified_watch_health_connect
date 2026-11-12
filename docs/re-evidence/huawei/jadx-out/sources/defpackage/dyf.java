package defpackage;

import android.content.Context;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindevice.R;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class dyf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private EditText f32521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Keyboard f32522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f32523c;
    private Keyboard e;
    private Keyboard f;
    private KeyboardView h;
    private LinearLayout i;
    private Keyboard j;
    private boolean d = false;
    private KeyboardView.OnKeyboardActionListener g = new KeyboardView.OnKeyboardActionListener() { // from class: dyf.3
        @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
        public void onPress(int i) {
        }

        @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
        public void onRelease(int i) {
        }

        @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
        public void onText(CharSequence charSequence) {
        }

        @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
        public void swipeDown() {
        }

        @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
        public void swipeLeft() {
        }

        @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
        public void swipeRight() {
        }

        @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
        public void swipeUp() {
        }

        @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
        public void onKey(int i, int[] iArr) {
            dyf.this.b(i);
        }
    };

    public dyf(Context context, EditText editText, KeyboardView keyboardView, LinearLayout linearLayout, boolean z) {
        this.f32523c = false;
        this.f32521a = editText;
        this.e = new Keyboard(context, R.xml.qwerty);
        this.f = new Keyboard(context, R.xml.digit);
        this.j = new Keyboard(context, R.xml.symbol_simple);
        this.f32522b = new Keyboard(context, R.xml.symbol_complex);
        this.h = keyboardView;
        this.i = linearLayout;
        if (z) {
            d();
        } else {
            this.f32523c = true;
            b();
        }
        KeyboardView keyboardView2 = this.h;
        if (keyboardView2 != null) {
            keyboardView2.setEnabled(true);
            this.h.setPreviewEnabled(false);
            this.h.setOnKeyboardActionListener(this.g);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        EditText editText = this.f32521a;
        if (editText == null || this.h == null) {
            LogUtil.j("KeyboardUtil", "editText or keyboardView is null");
            return;
        }
        Editable text = editText.getText();
        int selectionStart = this.f32521a.getSelectionStart();
        if (i == -5) {
            if (TextUtils.isEmpty(text) || selectionStart <= 0) {
                return;
            }
            text.delete(selectionStart - 1, selectionStart);
            return;
        }
        if (i == 210) {
            this.h.setKeyboard(this.j);
            return;
        }
        if (i == 220) {
            this.h.setKeyboard(this.f32522b);
            return;
        }
        if (i == -3) {
            a();
            return;
        }
        if (i != -2) {
            if (i == -1) {
                c();
                this.h.setKeyboard(this.e);
                return;
            } else {
                text.insert(selectionStart, Character.toString((char) i));
                return;
            }
        }
        if (this.f32523c) {
            this.f32523c = false;
            d();
        } else {
            this.f32523c = true;
            b();
        }
    }

    private void c() {
        List<Keyboard.Key> keys = this.e.getKeys();
        if (this.d) {
            this.d = false;
            LogUtil.a("KeyboardUtil", "changeKey Lower");
            for (Keyboard.Key key : keys) {
                if (key.label != null && d(key.label.toString())) {
                    key.label = key.label.toString().toLowerCase(Locale.ENGLISH);
                    key.codes[0] = key.label.charAt(0);
                }
            }
            return;
        }
        this.d = true;
        LogUtil.a("KeyboardUtil", "changeKey Upper");
        for (Keyboard.Key key2 : keys) {
            if (key2.label != null && d(key2.label.toString())) {
                key2.label = key2.label.toString().toUpperCase(Locale.ENGLISH);
                key2.codes[0] = key2.label.charAt(0);
            }
        }
    }

    public void e() {
        KeyboardView keyboardView = this.h;
        if (keyboardView != null) {
            keyboardView.setVisibility(0);
        }
        LinearLayout linearLayout = this.i;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
    }

    public void a() {
        KeyboardView keyboardView = this.h;
        if (keyboardView == null) {
            LogUtil.j("KeyboardUtil", "keyboardView si null");
            return;
        }
        if (keyboardView.getVisibility() == 0) {
            this.h.setVisibility(8);
            LinearLayout linearLayout = this.i;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
        }
    }

    private boolean c(String str) {
        return "0123456789".indexOf(str) > -1;
    }

    private boolean d(String str) {
        return "abcdefghijklmnopqrstuvwxyz".indexOf(str.toLowerCase(Locale.ENGLISH)) > -1;
    }

    private void b() {
        List<Keyboard.Key> keys = this.f.getKeys();
        ArrayList arrayList = new ArrayList(10);
        for (int i = 0; i < keys.size(); i++) {
            if (keys.get(i).label != null && c(keys.get(i).label.toString())) {
                arrayList.add(keys.get(i));
            }
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(10);
        LinkedList linkedList = new LinkedList();
        for (int i2 = 0; i2 < size; i2++) {
            linkedList.add(new dyi(i2 + 48, i2 + ""));
        }
        SecureRandom secureRandomB = qrf.b();
        for (int i3 = 0; i3 < size; i3++) {
            int iNextInt = secureRandomB.nextInt(size - i3);
            arrayList2.add(new dyi(((dyi) linkedList.get(iNextInt)).a(), ((dyi) linkedList.get(iNextInt)).c()));
            linkedList.remove(iNextInt);
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            ((Keyboard.Key) arrayList.get(i4)).label = ((dyi) arrayList2.get(i4)).c();
            ((Keyboard.Key) arrayList.get(i4)).codes[0] = ((dyi) arrayList2.get(i4)).a();
        }
        KeyboardView keyboardView = this.h;
        if (keyboardView != null) {
            keyboardView.setKeyboard(this.f);
        }
    }

    private void d() {
        this.d = false;
        List<Keyboard.Key> keys = this.e.getKeys();
        ArrayList arrayList = new ArrayList(10);
        for (int i = 0; i < keys.size(); i++) {
            if (keys.get(i).label != null && d(keys.get(i).label.toString())) {
                arrayList.add(keys.get(i));
            }
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(10);
        LinkedList linkedList = new LinkedList();
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = i2 + 97;
            linkedList.add(new dyi(i3, "" + ((char) i3)));
        }
        SecureRandom secureRandomB = qrf.b();
        for (int i4 = 0; i4 < size; i4++) {
            int iNextInt = secureRandomB.nextInt(size - i4);
            arrayList2.add(new dyi(((dyi) linkedList.get(iNextInt)).a(), ((dyi) linkedList.get(iNextInt)).c()));
            linkedList.remove(iNextInt);
        }
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            ((Keyboard.Key) arrayList.get(i5)).label = ((dyi) arrayList2.get(i5)).c();
            ((Keyboard.Key) arrayList.get(i5)).codes[0] = ((dyi) arrayList2.get(i5)).a();
        }
        KeyboardView keyboardView = this.h;
        if (keyboardView != null) {
            keyboardView.setKeyboard(this.e);
        }
    }
}
