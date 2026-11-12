package com.airbnb.lottie.model;

import am.j;
import ch.qos.logback.core.CoreConstants;
import com.airbnb.lottie.animation.keyframe.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class KeyPath {
    public static final KeyPath COMPOSITION = new KeyPath("COMPOSITION");
    private final List<String> keys;
    private KeyPathElement resolvedElement;

    private KeyPath(KeyPath keyPath) {
        this.keys = new ArrayList(keyPath.keys);
        this.resolvedElement = keyPath.resolvedElement;
    }

    private boolean endsWithGlobstar() {
        return ((String) a.c(1, this.keys)).equals("**");
    }

    private boolean isContainer(String str) {
        return "__container".equals(str);
    }

    public KeyPath addKey(String str) {
        KeyPath keyPath = new KeyPath(this);
        keyPath.keys.add(str);
        return keyPath;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            KeyPath keyPath = (KeyPath) obj;
            if (!this.keys.equals(keyPath.keys)) {
                return false;
            }
            KeyPathElement keyPathElement = this.resolvedElement;
            KeyPathElement keyPathElement2 = keyPath.resolvedElement;
            if (keyPathElement != null) {
                return keyPathElement.equals(keyPathElement2);
            }
            if (keyPathElement2 == null) {
                return true;
            }
        }
        return false;
    }

    public boolean fullyResolvesTo(String str, int i14) {
        if (i14 >= this.keys.size()) {
            return false;
        }
        boolean z14 = i14 == this.keys.size() - 1;
        String str2 = this.keys.get(i14);
        if (!str2.equals("**")) {
            return (z14 || (i14 == this.keys.size() + (-2) && endsWithGlobstar())) && (str2.equals(str) || str2.equals(org.slf4j.Marker.ANY_MARKER));
        }
        if (!z14 && this.keys.get(i14 + 1).equals(str)) {
            return i14 == this.keys.size() + (-2) || (i14 == this.keys.size() + (-3) && endsWithGlobstar());
        }
        if (z14) {
            return true;
        }
        int i15 = i14 + 1;
        if (i15 < this.keys.size() - 1) {
            return false;
        }
        return this.keys.get(i15).equals(str);
    }

    public KeyPathElement getResolvedElement() {
        return this.resolvedElement;
    }

    public int hashCode() {
        int iHashCode = this.keys.hashCode() * 31;
        KeyPathElement keyPathElement = this.resolvedElement;
        return iHashCode + (keyPathElement != null ? keyPathElement.hashCode() : 0);
    }

    public int incrementDepthBy(String str, int i14) {
        if (isContainer(str)) {
            return 0;
        }
        if (this.keys.get(i14).equals("**")) {
            return (i14 != this.keys.size() - 1 && this.keys.get(i14 + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public String keysToString() {
        return this.keys.toString();
    }

    public boolean matches(String str, int i14) {
        if (isContainer(str)) {
            return true;
        }
        if (i14 >= this.keys.size()) {
            return false;
        }
        return this.keys.get(i14).equals(str) || this.keys.get(i14).equals("**") || this.keys.get(i14).equals(org.slf4j.Marker.ANY_MARKER);
    }

    public boolean propagateToChildren(String str, int i14) {
        return "__container".equals(str) || i14 < this.keys.size() - 1 || this.keys.get(i14).equals("**");
    }

    public KeyPath resolve(KeyPathElement keyPathElement) {
        KeyPath keyPath = new KeyPath(this);
        keyPath.resolvedElement = keyPathElement;
        return keyPath;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("KeyPath{keys=");
        sb3.append(this.keys);
        sb3.append(",resolved=");
        return j.t(sb3, this.resolvedElement != null, CoreConstants.CURLY_RIGHT);
    }

    public KeyPath(String... strArr) {
        this.keys = Arrays.asList(strArr);
    }
}
