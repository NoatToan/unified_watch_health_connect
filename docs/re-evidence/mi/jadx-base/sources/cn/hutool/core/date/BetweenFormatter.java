package cn.hutool.core.date;

import com.xiaomi.smarthome.library.common.util.DateTimeHelper;
import defpackage.tt3;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class BetweenFormatter implements Serializable {
    private static final long serialVersionUID = 1;
    private long betweenMs;
    private Level level;
    private final int levelMaxCount;

    public enum Level {
        DAY("天"),
        HOUR("小时"),
        MINUTE("分"),
        SECOND("秒"),
        MILLISECOND("毫秒");

        private final String name;

        Level(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }
    }

    public BetweenFormatter(long j, Level level) {
        this(j, level, 0);
    }

    private boolean isLevelCountValid(int i) {
        int i2 = this.levelMaxCount;
        return i2 <= 0 || i < i2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0074  */
    public String format() {
        int i;
        StringBuilder sb = new StringBuilder();
        long j = this.betweenMs;
        if (j > 0) {
            long millis = j / DateUnit.DAY.getMillis();
            long j2 = 24 * millis;
            long millis2 = (this.betweenMs / DateUnit.HOUR.getMillis()) - j2;
            long millis3 = ((this.betweenMs / DateUnit.MINUTE.getMillis()) - (DateTimeHelper.sDayInMinutes * millis)) - (millis2 * 60);
            long j3 = (((j2 + millis2) * 60) + millis3) * 60;
            long millis4 = (this.betweenMs / DateUnit.SECOND.getMillis()) - j3;
            long j4 = this.betweenMs - ((j3 + millis4) * 1000);
            int iOrdinal = this.level.ordinal();
            if (!isLevelCountValid(0) || 0 == millis) {
                i = 0;
            } else {
                Level level = Level.DAY;
                if (iOrdinal >= level.ordinal()) {
                    sb.append(millis);
                    sb.append(level.name);
                    i = 1;
                } else {
                    i = 0;
                }
            }
            if (isLevelCountValid(i) && 0 != millis2) {
                Level level2 = Level.HOUR;
                if (iOrdinal >= level2.ordinal()) {
                    sb.append(millis2);
                    sb.append(level2.name);
                    i++;
                }
            }
            if (isLevelCountValid(i) && 0 != millis3) {
                Level level3 = Level.MINUTE;
                if (iOrdinal >= level3.ordinal()) {
                    sb.append(millis3);
                    sb.append(level3.name);
                    i++;
                }
            }
            if (isLevelCountValid(i) && 0 != millis4) {
                Level level4 = Level.SECOND;
                if (iOrdinal >= level4.ordinal()) {
                    sb.append(millis4);
                    sb.append(level4.name);
                    i++;
                }
            }
            if (isLevelCountValid(i) && 0 != j4) {
                Level level5 = Level.MILLISECOND;
                if (iOrdinal >= level5.ordinal()) {
                    sb.append(j4);
                    sb.append(level5.name);
                }
            }
        }
        if (tt3.G(sb)) {
            sb.append(0);
            sb.append(this.level.name);
        }
        return sb.toString();
    }

    public long getBetweenMs() {
        return this.betweenMs;
    }

    public Level getLevel() {
        return this.level;
    }

    public void setBetweenMs(long j) {
        this.betweenMs = j;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String toString() {
        return format();
    }

    public BetweenFormatter(long j, Level level, int i) {
        this.betweenMs = j;
        this.level = level;
        this.levelMaxCount = i;
    }
}
