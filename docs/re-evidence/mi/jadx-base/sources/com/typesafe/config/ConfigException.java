package com.typesafe.config;

import defpackage.jc4;
import defpackage.wb4;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ConfigException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = 1;
    private final transient jc4 origin;

    public static class BugOrBroken extends ConfigException {
        private static final long serialVersionUID = 1;

        public BugOrBroken(String str, Throwable th) {
            super(str, th);
        }

        public BugOrBroken(String str) {
            this(str, null);
        }
    }

    public static class Generic extends ConfigException {
        private static final long serialVersionUID = 1;

        public Generic(String str, Throwable th) {
            super(str, th);
        }

        public Generic(String str) {
            this(str, null);
        }
    }

    public static class NotResolved extends BugOrBroken {
        private static final long serialVersionUID = 1;

        public NotResolved(String str, Throwable th) {
            super(str, th);
        }

        public NotResolved(String str) {
            this(str, null);
        }
    }

    public static class ValidationFailed extends ConfigException {
        private static final long serialVersionUID = 1;
        private final Iterable<a> problems;

        public ValidationFailed(Iterable<a> iterable) {
            super(makeMessage(iterable), (Throwable) null);
            this.problems = iterable;
        }

        private static String makeMessage(Iterable<a> iterable) {
            StringBuilder sb = new StringBuilder();
            for (a aVar : iterable) {
                sb.append(aVar.a().a());
                sb.append(": ");
                sb.append(aVar.b());
                sb.append(": ");
                sb.append(aVar.c());
                sb.append(", ");
            }
            if (sb.length() == 0) {
                throw new BugOrBroken("ValidationFailed must have a non-empty list of problems");
            }
            sb.setLength(sb.length() - 2);
            return sb.toString();
        }

        public Iterable<a> problems() {
            return this.problems;
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final jc4 f10730b;
        public final String c;

        public jc4 a() {
            return this.f10730b;
        }

        public String b() {
            return this.f10729a;
        }

        public String c() {
            return this.c;
        }

        public String toString() {
            return "ValidationProblem(" + this.f10729a + "," + this.f10730b + "," + this.c + ")";
        }
    }

    public ConfigException(jc4 jc4Var, String str, Throwable th) {
        super(jc4Var.a() + ": " + str, th);
        this.origin = jc4Var;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        jc4 jc4VarD = wb4.d(objectInputStream);
        try {
            Field declaredField = ConfigException.class.getDeclaredField("origin");
            declaredField.setAccessible(true);
            try {
                declaredField.set(this, jc4VarD);
            } catch (IllegalAccessException e) {
                throw new IOException("unable to set origin field", e);
            } catch (IllegalArgumentException e2) {
                throw new IOException("unable to set origin field", e2);
            }
        } catch (NoSuchFieldException e3) {
            throw new IOException("ConfigException has no origin field?", e3);
        } catch (SecurityException e4) {
            throw new IOException("unable to fill out origin field in ConfigException", e4);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        wb4.i(objectOutputStream, this.origin);
    }

    public jc4 origin() {
        return this.origin;
    }

    public static class BadPath extends ConfigException {
        private static final long serialVersionUID = 1;

        public BadPath(jc4 jc4Var, String str) {
            this(jc4Var, (String) null, str);
        }

        public BadPath(jc4 jc4Var, String str, String str2) {
            this(jc4Var, str, str2, null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public BadPath(jc4 jc4Var, String str, String str2, Throwable th) {
            if (str != null) {
                str2 = "Invalid path '" + str + "': " + str2;
            }
            super(jc4Var, str2, th);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public BadPath(String str, String str2, Throwable th) {
            if (str != null) {
                str2 = "Invalid path '" + str + "': " + str2;
            }
            super(str2, th);
        }

        public BadPath(String str, String str2) {
            this(str, str2, (Throwable) null);
        }
    }

    public static class BadValue extends ConfigException {
        private static final long serialVersionUID = 1;

        public BadValue(jc4 jc4Var, String str, String str2) {
            this(jc4Var, str, str2, null);
        }

        public BadValue(jc4 jc4Var, String str, String str2, Throwable th) {
            super(jc4Var, "Invalid value at '" + str + "': " + str2, th);
        }

        public BadValue(String str, String str2, Throwable th) {
            super("Invalid value at '" + str + "': " + str2, th);
        }

        public BadValue(String str, String str2) {
            this(str, str2, (Throwable) null);
        }
    }

    public static class IO extends ConfigException {
        private static final long serialVersionUID = 1;

        public IO(jc4 jc4Var, String str) {
            this(jc4Var, str, null);
        }

        public IO(jc4 jc4Var, String str, Throwable th) {
            super(jc4Var, str, th);
        }
    }

    public static class Missing extends ConfigException {
        private static final long serialVersionUID = 1;

        public Missing(jc4 jc4Var, String str) {
            this(jc4Var, str, null);
        }

        public Missing(String str, Throwable th) {
            super("No configuration setting found for key '" + str + "'", th);
        }

        public Missing(String str) {
            this(str, (Throwable) null);
        }

        public Missing(jc4 jc4Var, String str, Throwable th) {
            super(jc4Var, str, th);
        }
    }

    public static class Null extends Missing {
        private static final long serialVersionUID = 1;

        public Null(jc4 jc4Var, String str, String str2) {
            this(jc4Var, str, str2, null);
        }

        private static String makeMessage(String str, String str2) {
            if (str2 == null) {
                return "Configuration key '" + str + "' is null";
            }
            return "Configuration key '" + str + "' is set to null but expected " + str2;
        }

        public Null(jc4 jc4Var, String str, String str2, Throwable th) {
            super(jc4Var, makeMessage(str, str2), th);
        }
    }

    public static class Parse extends ConfigException {
        private static final long serialVersionUID = 1;

        public Parse(jc4 jc4Var, String str) {
            this(jc4Var, str, null);
        }

        public Parse(jc4 jc4Var, String str, Throwable th) {
            super(jc4Var, str, th);
        }
    }

    public static class UnresolvedSubstitution extends Parse {
        private static final long serialVersionUID = 1;

        public UnresolvedSubstitution(jc4 jc4Var, String str) {
            this(jc4Var, str, null);
        }

        public UnresolvedSubstitution(jc4 jc4Var, String str, Throwable th) {
            super(jc4Var, "Could not resolve substitution to a value: " + str, th);
        }
    }

    public static class WrongType extends ConfigException {
        private static final long serialVersionUID = 1;

        public WrongType(jc4 jc4Var, String str) {
            super(jc4Var, str, null);
        }

        public WrongType(jc4 jc4Var, String str, String str2, String str3) {
            this(jc4Var, str, str2, str3, null);
        }

        public WrongType(jc4 jc4Var, String str, String str2, String str3, Throwable th) {
            super(jc4Var, str + " has type " + str3 + " rather than " + str2, th);
        }

        public WrongType(jc4 jc4Var, String str, Throwable th) {
            super(jc4Var, str, th);
        }
    }

    public ConfigException(jc4 jc4Var, String str) {
        this(jc4Var.a() + ": " + str, (Throwable) null);
    }

    public ConfigException(String str, Throwable th) {
        super(str, th);
        this.origin = null;
    }

    public ConfigException(String str) {
        this(str, (Throwable) null);
    }
}
