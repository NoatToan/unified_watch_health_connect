package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.ThrowableProxyUtil;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes7.dex */
public class RootCauseFirstThrowableProxyConverter extends ExtendedThrowableProxyConverter {
    public void recursiveAppendRootCauseFirst(StringBuilder sb3, String str, int i14, IThrowableProxy iThrowableProxy) {
        if (iThrowableProxy.getCause() != null) {
            recursiveAppendRootCauseFirst(sb3, str, i14, iThrowableProxy.getCause());
            str = null;
        }
        ThrowableProxyUtil.indent(sb3, i14 - 1);
        if (str != null) {
            sb3.append(str);
        }
        ThrowableProxyUtil.subjoinFirstLineRootCauseFirst(sb3, iThrowableProxy);
        sb3.append(CoreConstants.LINE_SEPARATOR);
        subjoinSTEPArray(sb3, i14, iThrowableProxy);
        IThrowableProxy[] suppressed = iThrowableProxy.getSuppressed();
        if (suppressed != null) {
            for (IThrowableProxy iThrowableProxy2 : suppressed) {
                recursiveAppendRootCauseFirst(sb3, CoreConstants.SUPPRESSED, i14 + 1, iThrowableProxy2);
            }
        }
    }

    @Override // ch.qos.logback.classic.pattern.ThrowableProxyConverter
    public String throwableProxyToString(IThrowableProxy iThrowableProxy) {
        StringBuilder sb3 = new StringBuilder(2048);
        recursiveAppendRootCauseFirst(sb3, null, 1, iThrowableProxy);
        return sb3.toString();
    }
}
