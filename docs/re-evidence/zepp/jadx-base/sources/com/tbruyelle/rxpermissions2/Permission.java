package com.tbruyelle.rxpermissions2;

import io.reactivex.Observable;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class Permission {
    public final boolean granted;
    public final String name;
    public final boolean shouldShowRequestPermissionRationale;

    public class a implements BiConsumer<StringBuilder, String> {
        public a() {
        }

        @Override // io.reactivex.functions.BiConsumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(StringBuilder sb, String str) throws Exception {
            if (sb.length() == 0) {
                sb.append(str);
            } else {
                sb.append(", ");
                sb.append(str);
            }
        }
    }

    public class b implements Function<Permission, String> {
        public b() {
        }

        @Override // io.reactivex.functions.Function
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String apply(Permission permission) throws Exception {
            return permission.name;
        }
    }

    public class c implements Predicate<Permission> {
        public c() {
        }

        @Override // io.reactivex.functions.Predicate
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean test(Permission permission) throws Exception {
            return permission.granted;
        }
    }

    public class d implements Predicate<Permission> {
        public d() {
        }

        @Override // io.reactivex.functions.Predicate
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean test(Permission permission) throws Exception {
            return permission.shouldShowRequestPermissionRationale;
        }
    }

    public Permission(String str, boolean z) {
        this(str, z, false);
    }

    private Boolean a(List<Permission> list) {
        return Observable.fromIterable(list).all(new c()).blockingGet();
    }

    private String b(List<Permission> list) {
        return ((StringBuilder) Observable.fromIterable(list).map(new b()).collectInto(new StringBuilder(), new a()).blockingGet()).toString();
    }

    private Boolean c(List<Permission> list) {
        return Observable.fromIterable(list).any(new d()).blockingGet();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Permission permission = (Permission) obj;
        if (this.granted == permission.granted && this.shouldShowRequestPermissionRationale == permission.shouldShowRequestPermissionRationale) {
            return this.name.equals(permission.name);
        }
        return false;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + (this.granted ? 1 : 0)) * 31) + (this.shouldShowRequestPermissionRationale ? 1 : 0);
    }

    public String toString() {
        return "Permission{name='" + this.name + "', granted=" + this.granted + ", shouldShowRequestPermissionRationale=" + this.shouldShowRequestPermissionRationale + '}';
    }

    public Permission(String str, boolean z, boolean z2) {
        this.name = str;
        this.granted = z;
        this.shouldShowRequestPermissionRationale = z2;
    }

    public Permission(List<Permission> list) {
        this.name = b(list);
        this.granted = a(list).booleanValue();
        this.shouldShowRequestPermissionRationale = c(list).booleanValue();
    }
}
