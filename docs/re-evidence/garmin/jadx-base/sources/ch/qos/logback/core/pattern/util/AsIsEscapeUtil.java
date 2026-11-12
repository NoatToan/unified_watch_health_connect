package ch.qos.logback.core.pattern.util;

/* JADX INFO: loaded from: classes7.dex */
public class AsIsEscapeUtil implements IEscapeUtil {
    @Override // ch.qos.logback.core.pattern.util.IEscapeUtil
    public void escape(String str, StringBuffer stringBuffer, char c14, int i14) {
        stringBuffer.append("\\");
        stringBuffer.append(c14);
    }
}
