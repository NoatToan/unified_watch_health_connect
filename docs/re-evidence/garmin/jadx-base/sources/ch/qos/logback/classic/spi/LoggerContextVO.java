package ch.qos.logback.classic.spi;

import androidx.room.a0;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class LoggerContextVO implements Serializable {
    private static final long serialVersionUID = 5488023392483144387L;
    final long birthTime;
    final String name;
    final Map<String, String> propertyMap;

    public LoggerContextVO(LoggerContext loggerContext) {
        this.name = loggerContext.getName();
        this.propertyMap = loggerContext.getCopyOfPropertyMap();
        this.birthTime = loggerContext.getBirthTime();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoggerContextVO)) {
            return false;
        }
        LoggerContextVO loggerContextVO = (LoggerContextVO) obj;
        if (this.birthTime != loggerContextVO.birthTime) {
            return false;
        }
        String str = this.name;
        String str2 = loggerContextVO.name;
        if (str == null ? str2 != null : !str.equals(str2)) {
            return false;
        }
        Map<String, String> map = this.propertyMap;
        Map<String, String> map2 = loggerContextVO.propertyMap;
        return map == null ? map2 == null : map.equals(map2);
    }

    public long getBirthTime() {
        return this.birthTime;
    }

    public String getName() {
        return this.name;
    }

    public Map<String, String> getPropertyMap() {
        return this.propertyMap;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, String> map = this.propertyMap;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        long j8 = this.birthTime;
        return iHashCode2 + ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("LoggerContextVO{name='");
        sb3.append(this.name);
        sb3.append("', propertyMap=");
        sb3.append(this.propertyMap);
        sb3.append(", birthTime=");
        return a0.l(sb3, this.birthTime, CoreConstants.CURLY_RIGHT);
    }

    public LoggerContextVO(String str, Map<String, String> map, long j8) {
        this.name = str;
        this.propertyMap = map;
        this.birthTime = j8;
    }
}
