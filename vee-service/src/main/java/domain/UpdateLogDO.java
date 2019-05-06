package domain;

/**
 * @author 张超 teavamc
 * @Description: 版本更新日志的实体
 * @ClassName UpdateLogDO
 * @date 2019/5/6 22:41
 **/
public class UpdateLogDO {

    private Integer id;
    private String nickname;
    private String logctx;
    private String gmt_create;
    private String gmt_modified;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getLogctx() {
        return logctx;
    }

    public void setLogctx(String logctx) {
        this.logctx = logctx;
    }

    public String getGmt_create() {
        return gmt_create;
    }

    public void setGmt_create(String gmt_create) {
        this.gmt_create = gmt_create;
    }

    public String getGmt_modified() {
        return gmt_modified;
    }

    public void setGmt_modified(String gmt_modified) {
        this.gmt_modified = gmt_modified;
    }

    @Override
    public String toString() {
        return "UpdateLogDO{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", logctx='" + logctx + '\'' +
                ", gmt_create='" + gmt_create + '\'' +
                ", gmt_modified='" + gmt_modified + '\'' +
                '}';
    }
}
