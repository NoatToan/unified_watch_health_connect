package com.garmin.analytics.firebase.eventValidators;

import am.j;
import com.garmin.analytics.EventValidationException;
import com.garmin.android.gncs.NotificationConstants;
import d53.u;
import d53.y;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p6.b;
import tn.k;
import v.e0;
import zk.a;
import zk.e;
import zk.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/analytics/firebase/eventValidators/FirebaseEventValidator;", "Lzk/g;", "<init>", "()V", "FirebaseEventValidationException", "analytics-firebase_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FirebaseEventValidator implements g {
    public static void b(String str) throws FirebaseEventValidationException {
        if (str.length() == 0) {
            throw new FirebaseEventValidationException(FirebaseEventValidationException.a.EmptyName, "Name was: ".concat(str));
        }
        if (str.length() > 40) {
            throw new FirebaseEventValidationException(FirebaseEventValidationException.a.NameLengthViolation, j.h(str.length(), "Name was of length: "));
        }
        if (u.y(str, "firebase_", true) || u.y(str, "google_", true) || u.y(str, "ga_", true)) {
            throw new FirebaseEventValidationException(FirebaseEventValidationException.a.InvalidPrefix, "Name was ".concat(str));
        }
        if (!Character.isLetter(str.charAt(0))) {
            throw new FirebaseEventValidationException(FirebaseEventValidationException.a.InvalidPrefix, k.f("Name started with ", y.p0(str)));
        }
        for (int i14 = 0; i14 < str.length(); i14++) {
            char cCharAt = str.charAt(i14);
            if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '_') {
                throw new FirebaseEventValidationException(FirebaseEventValidationException.a.InvalidNameCharacters, "Name contained invalid characters ".concat(str));
            }
        }
    }

    @Override // zk.g
    public final boolean a(a aVar) throws FirebaseEventValidationException {
        aVar.getClass();
        b(aVar.f205029a);
        List<e> list = aVar.f205030b;
        if (list.size() > 25) {
            throw new FirebaseEventValidationException(FirebaseEventValidationException.a.InvalidNumberOfParameters, e0.f(list.size(), "event had ", " parameters"));
        }
        if (list.isEmpty()) {
            return true;
        }
        for (e eVar : list) {
            String str = eVar.f205040a;
            Object obj = eVar.f205041b;
            if (!(obj instanceof Boolean) && !(obj instanceof Double) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof String)) {
                throw new FirebaseEventValidationException(FirebaseEventValidationException.a.InvalidParameterType, b.e("Parameter is of type ", s0.f105811a.b(obj.getClass())));
            }
            if (obj instanceof String) {
                String str2 = (String) obj;
                if (str2.length() > 100) {
                    throw new FirebaseEventValidationException(FirebaseEventValidationException.a.ParameterLengthViolation, j.h(str2.length(), "String parameter is of length "));
                }
            }
            try {
                b(str);
            } catch (Exception e4) {
                throw new FirebaseEventValidationException(FirebaseEventValidationException.a.ParameterError, e4.getMessage());
            }
        }
        return true;
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\fB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/garmin/analytics/firebase/eventValidators/FirebaseEventValidator$FirebaseEventValidationException;", "Lcom/garmin/analytics/EventValidationException;", "", "message", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", "Lcom/garmin/analytics/firebase/eventValidators/FirebaseEventValidator$FirebaseEventValidationException$a;", NotificationConstants.KEY_DATA_MIME_TYPE, "(Lcom/garmin/analytics/firebase/eventValidators/FirebaseEventValidator$FirebaseEventValidationException$a;Ljava/lang/String;)V", "a", "analytics-firebase_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FirebaseEventValidationException extends EventValidationException {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/analytics/firebase/eventValidators/FirebaseEventValidator$FirebaseEventValidationException$a;", "", "", "message", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "analytics-firebase_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum a {
            ParameterError("Parameter was invalid"),
            /* JADX INFO: Fake field, exist only in values array */
            EventError("Event was invalid"),
            InvalidParameterType("Parameters must be of type Boolean, Double, Int, Long, or String"),
            EmptyName("Parameter key and event names cannot be empty"),
            InvalidPrefix("Parameter keys and event names must start with a letter cannot start with \"firebase_\", \"_\", \"google_\", or \"ga_\""),
            InvalidNumberOfParameters("Must have fewer than 25 parameters"),
            ParameterLengthViolation("String parameters cannot be greater than 100 characters"),
            NameLengthViolation("Parameter keys and event names cannot be greater than 40 characters"),
            InvalidNameCharacters("Parameter keys and event names must only contain alphanumerics or an \"+\" character.");


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f28613a;

            a(String str) {
                this.f28613a = str;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FirebaseEventValidationException(a aVar, String str) {
            this(k.g(aVar.f28613a, str != null ? ": ".concat(str) : ""), null, 2, 0 == true ? 1 : 0);
            aVar.getClass();
        }

        public /* synthetic */ FirebaseEventValidationException(String str, Exception exc, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, (i14 & 2) != 0 ? null : exc);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FirebaseEventValidationException(String str, Exception exc) {
            super(str, exc);
            str.getClass();
        }
    }
}
