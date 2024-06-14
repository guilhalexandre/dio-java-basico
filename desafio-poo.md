
    { classDiagram
    iPhone --|> ReprodutorMusical
    iPhone --|> AparelhoTelefonico
    iPhone --|> NavegadorInternet
    

    class iPhone {
    }

    class ReprodutorMusical {
      +selecionarMusica(musica: String): String
      +tocarMusica(): void
      +pausarMusica(): void
    }
    
    class AparelhoTelefonico {
      +ligar(numero: String): void
      +atender(): void
      +iniciarCorreioVoz(): void
    }

    class NavegadorInternet {
      +exibirPagina(url: String): void
      +adicionarNovaAba(): void
      +adicionaPagina(): void
    }

[![](https://mermaid.ink/img/pako:eNp1ks9OwzAMxl-lymmI7QV6QJrgwoFpYohTL17itRZpXLnJBIy9O-lfdQrk4iTfl_gXxxel2aDKlbbQtk8EpUBduCwO2lfsMNtsfh6yV2yETfAsL6ElDTa1bBsQtBW_ocUTO9KcenZwxhIMy7PzKA594QZTn32yXoa9662YIEy-LLtvY05N7GDUVnUf8uzghVx5N03mA5717I3qmcnMWgOh_Vu8DmFJlb56gWWpBFm5UKPwguUmG3h0BiWhoHgXgTyyCBK_83eCssRICrugwE86kuyhJAerIPZfEkNDDXd8hu0xLcxkGK-65VFrFZ9ZA5nYTH3yQvkKayxUHqcG5KNQhet8ED_x8OW0yr0EXCvhUFYqP4Ft4yo0JtZk7MR5Fw11Pz_2aheuvze05Vg?type=png)](https://mermaid.live/edit#pako:eNp1ks9OwzAMxl-lymmI7QV6QJrgwoFpYohTL17itRZpXLnJBIy9O-lfdQrk4iTfl_gXxxel2aDKlbbQtk8EpUBduCwO2lfsMNtsfh6yV2yETfAsL6ElDTa1bBsQtBW_ocUTO9KcenZwxhIMy7PzKA594QZTn32yXoa9662YIEy-LLtvY05N7GDUVnUf8uzghVx5N03mA5717I3qmcnMWgOh_Vu8DmFJlb56gWWpBFm5UKPwguUmG3h0BiWhoHgXgTyyCBK_83eCssRICrugwE86kuyhJAerIPZfEkNDDXd8hu0xLcxkGK-65VFrFZ9ZA5nYTH3yQvkKayxUHqcG5KNQhet8ED_x8OW0yr0EXCvhUFYqP4Ft4yo0JtZk7MR5Fw11Pz_2aheuvze05Vg)
