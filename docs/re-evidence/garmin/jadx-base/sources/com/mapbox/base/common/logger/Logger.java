package com.mapbox.base.common.logger;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.mapbox.base.common.logger.model.Message;
import com.mapbox.base.common.logger.model.Tag;
import com.nimbusds.jose.HeaderParameterNames;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH&J(\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH&J(\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH&J(\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH&J(\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\u000e"}, d2 = {"Lcom/mapbox/base/common/logger/Logger;", "", "d", "", HeaderParameterNames.AUTHENTICATION_TAG, "Lcom/mapbox/base/common/logger/model/Tag;", "msg", "Lcom/mapbox/base/common/logger/model/Message;", "tr", "", JWKParameterNames.RSA_EXPONENT, IntegerTokenConverter.CONVERTER_KEY, "v", "w", "common-android"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface Logger {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void d$default(Logger logger, Tag tag, Message message, Throwable th3, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: d");
                return;
            }
            if ((i14 & 1) != 0) {
                tag = null;
            }
            if ((i14 & 4) != 0) {
                th3 = null;
            }
            logger.d(tag, message, th3);
        }

        public static /* synthetic */ void e$default(Logger logger, Tag tag, Message message, Throwable th3, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: e");
                return;
            }
            if ((i14 & 1) != 0) {
                tag = null;
            }
            if ((i14 & 4) != 0) {
                th3 = null;
            }
            logger.e(tag, message, th3);
        }

        public static /* synthetic */ void i$default(Logger logger, Tag tag, Message message, Throwable th3, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: i");
                return;
            }
            if ((i14 & 1) != 0) {
                tag = null;
            }
            if ((i14 & 4) != 0) {
                th3 = null;
            }
            logger.i(tag, message, th3);
        }

        public static /* synthetic */ void v$default(Logger logger, Tag tag, Message message, Throwable th3, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: v");
                return;
            }
            if ((i14 & 1) != 0) {
                tag = null;
            }
            if ((i14 & 4) != 0) {
                th3 = null;
            }
            logger.v(tag, message, th3);
        }

        public static /* synthetic */ void w$default(Logger logger, Tag tag, Message message, Throwable th3, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: w");
                return;
            }
            if ((i14 & 1) != 0) {
                tag = null;
            }
            if ((i14 & 4) != 0) {
                th3 = null;
            }
            logger.w(tag, message, th3);
        }
    }

    void d(Tag tag, Message msg, Throwable tr3);

    void e(Tag tag, Message msg, Throwable tr3);

    void i(Tag tag, Message msg, Throwable tr3);

    void v(Tag tag, Message msg, Throwable tr3);

    void w(Tag tag, Message msg, Throwable tr3);
}
