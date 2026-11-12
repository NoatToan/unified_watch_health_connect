package com.chenenyu.router;

import com.chenenyu.router.matcher.AbsExplicitMatcher;
import com.chenenyu.router.matcher.AbsImplicitMatcher;
import com.chenenyu.router.matcher.AbsMatcher;
import com.chenenyu.router.matcher.BrowserMatcher;
import com.chenenyu.router.matcher.DirectMatcher;
import com.chenenyu.router.matcher.ImplicitMatcher;
import com.chenenyu.router.matcher.SchemeMatcher;
import com.chenenyu.router.util.RLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class MatcherRegistry {
    private static final List<AbsMatcher> a;
    private static final List<AbsExplicitMatcher> b;
    private static final List<AbsImplicitMatcher> c;

    static {
        ArrayList arrayList = new ArrayList();
        a = arrayList;
        b = new ArrayList();
        c = new ArrayList();
        arrayList.add(new DirectMatcher(4096));
        arrayList.add(new SchemeMatcher(256));
        arrayList.add(new ImplicitMatcher(16));
        arrayList.add(new BrowserMatcher(0));
        Collections.sort(arrayList);
        a();
    }

    private static void a() {
        b.clear();
        c.clear();
        for (AbsMatcher absMatcher : a) {
            if (absMatcher instanceof AbsExplicitMatcher) {
                b.add((AbsExplicitMatcher) absMatcher);
            } else if (absMatcher instanceof AbsImplicitMatcher) {
                c.add((AbsImplicitMatcher) absMatcher);
            }
        }
    }

    public static void clear() {
        a.clear();
        b.clear();
        c.clear();
    }

    public static List<AbsExplicitMatcher> getExplicitMatcher() {
        return b;
    }

    public static List<AbsImplicitMatcher> getImplicitMatcher() {
        return c;
    }

    public static List<AbsMatcher> getMatcher() {
        return a;
    }

    public static void register(AbsMatcher absMatcher) {
        if (!(absMatcher instanceof AbsExplicitMatcher) && !(absMatcher instanceof AbsImplicitMatcher)) {
            RLog.e(String.format("%s must be a subclass of AbsExplicitMatcher or AbsImplicitMatcher", absMatcher.getClass().getSimpleName()));
            return;
        }
        List<AbsMatcher> list = a;
        list.add(absMatcher);
        Collections.sort(list);
        a();
    }
}
