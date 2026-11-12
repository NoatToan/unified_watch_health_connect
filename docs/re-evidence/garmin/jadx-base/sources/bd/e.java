package bd;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreference;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class<?>[] f17482e = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap<String, Constructor<?>> f17483f = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17484a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f17486c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f17485b = new Object[2];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f17487d = {Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."};

    public e(Context context, f fVar) {
        this.f17484a = context;
        this.f17486c = fVar;
    }

    public final Preference a(String str, String[] strArr, AttributeSet attributeSet) throws ClassNotFoundException {
        Class<?> cls;
        HashMap<String, Constructor<?>> map = f17483f;
        Constructor<?> constructor = map.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.f17484a.getClassLoader();
                    if (strArr == null || strArr.length == 0) {
                        cls = Class.forName(str, false, classLoader);
                    } else {
                        cls = null;
                        ClassNotFoundException e4 = null;
                        for (String str2 : strArr) {
                            try {
                                cls = Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e14) {
                                e4 = e14;
                            }
                        }
                        if (cls == null) {
                            if (e4 != null) {
                                throw e4;
                            }
                            throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                        }
                    }
                    constructor = cls.getConstructor(f17482e);
                    constructor.setAccessible(true);
                    map.put(str, constructor);
                } catch (Exception e15) {
                    InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                    inflateException.initCause(e15);
                    throw inflateException;
                }
            } catch (ClassNotFoundException e16) {
                throw e16;
            }
        }
        Object[] objArr = this.f17485b;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    public final Preference b(String str, AttributeSet attributeSet) {
        try {
            return -1 == str.indexOf(46) ? a(str, this.f17487d, attributeSet) : a(str, null, attributeSet);
        } catch (InflateException e4) {
            throw e4;
        } catch (ClassNotFoundException e14) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e14);
            throw inflateException;
        } catch (Exception e15) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e15);
            throw inflateException2;
        }
    }

    public final PreferenceGroup c(XmlResourceParser xmlResourceParser, PreferenceGroup preferenceGroup) {
        int next;
        synchronized (this.f17485b) {
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
            this.f17485b[0] = this.f17484a;
            do {
                try {
                    try {
                        try {
                            next = xmlResourceParser.next();
                            if (next == 2) {
                                break;
                            }
                        } catch (IOException e4) {
                            InflateException inflateException = new InflateException(xmlResourceParser.getPositionDescription() + ": " + e4.getMessage());
                            inflateException.initCause(e4);
                            throw inflateException;
                        }
                    } catch (InflateException e14) {
                        throw e14;
                    }
                } catch (XmlPullParserException e15) {
                    InflateException inflateException2 = new InflateException(e15.getMessage());
                    inflateException2.initCause(e15);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next != 2) {
                throw new InflateException(xmlResourceParser.getPositionDescription() + ": No start tag found!");
            }
            PreferenceGroup preferenceGroup2 = (PreferenceGroup) b(xmlResourceParser.getName(), attributeSetAsAttributeSet);
            if (preferenceGroup == null) {
                preferenceGroup2.l(this.f17486c);
                preferenceGroup = preferenceGroup2;
            }
            d(xmlResourceParser, preferenceGroup, attributeSetAsAttributeSet);
        }
        return preferenceGroup;
    }

    public final void d(XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                boolean zEquals = "intent".equals(name);
                Context context = this.f17484a;
                if (zEquals) {
                    try {
                        preference.f10160m = Intent.parseIntent(context.getResources(), xmlPullParser, attributeSet);
                    } catch (IOException e4) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e4);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    Resources resources = context.getResources();
                    if (preference.f10162o == null) {
                        preference.f10162o = new Bundle();
                    }
                    resources.parseBundleExtra("extra", attributeSet, preference.f10162o);
                    try {
                        int depth2 = xmlPullParser.getDepth();
                        while (true) {
                            int next2 = xmlPullParser.next();
                            if (next2 == 1 || (next2 == 3 && xmlPullParser.getDepth() <= depth2)) {
                                break;
                            }
                        }
                    } catch (IOException e14) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e14);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference preferenceB = b(name, attributeSet);
                    ((PreferenceGroup) preference).E(preferenceB);
                    d(xmlPullParser, preferenceB, attributeSet);
                }
            }
        }
    }
}
